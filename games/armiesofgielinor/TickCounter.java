/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TickCounter {
    static String field_e;
    static String field_c;
    int limit;
    static String field_b;
    int elapsedTicks;
    static String field_d;

    final boolean advanceAndCheck(int obfuscationGuard) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < ~this.limit) {
            return false;
          }
          this.elapsedTicks = this.elapsedTicks + 1;
          if (this.limit <= this.elapsedTicks) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "em.D(" + obfuscationGuard + ')');
        }
    }

    final void reset(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != 17) {
            field_c = (String) null;
          }
          this.elapsedTicks = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "em.F(" + obfuscationGuard + ')');
        }
    }

    final static void loadClientAssets(ResourceArchive archive, int obfuscationGuard) {
        class GameTextLoadingState {
            RuntimeException stackIn_4826_0;
            StringBuilder stackIn_4826_1;
            String stackIn_4827_2;
            boolean stackIn_4835_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            ResourceArchive param0;
            int param1;
            boolean finished;
            GameTextLoadingState(ResourceArchive initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_4826_0 = null;
                this.stackIn_4826_1 = null;
                this.stackIn_4827_2 = null;
                this.stackIn_4835_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void loadAchievementsAndGameOptionsText() throws java.lang.RuntimeException {
                DateOfBirthValidator.field_e = param0;
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "player_config_login_free");
                if (var2 != null) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 73);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,0");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 48);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,1");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 32);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,2");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,3");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,4");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,5");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,6");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 76);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,7");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,8");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,9");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,10");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,11");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,12");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,13");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,14");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 49);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,15");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,16");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,17");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,18");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 74);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,19");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,20");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,21");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,22");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,23");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,24");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 58);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,25");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,26");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,27");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,28");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 44);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,29");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[29] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,30");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[30] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,31");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[31] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,32");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[32] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 9);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,33");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[33] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,34");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[34] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,35");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[35] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 74);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,36");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[36] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 14);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,37");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[37] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,38");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[38] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,39");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[39] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,40");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[40] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 2);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,41");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[41] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,42");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[42] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 73);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,43");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[43] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,44");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[44] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 77);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,45");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[45] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,46");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[46] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,47");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[47] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,48");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[48] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 47);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,49");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[49] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,50");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[50] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,51");
                if (var2 != null) {
                  FixedSquareRootSupport.field_a[51] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,52");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[52] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,53");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[53] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,54");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[54] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_names,55");
                if (null != var2) {
                  FixedSquareRootSupport.field_a[55] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,0");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,1");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 39);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,2");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 64);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,3");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,4");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,5");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,6");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 47);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,7");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,8");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,9");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 37);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,10");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,11");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 62);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,12");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,13");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 68);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,14");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 55);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,15");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 14);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,16");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,17");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,18");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,19");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,20");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 2);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,21");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,22");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,23");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,24");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,25");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,26");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 38);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,27");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,28");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,29");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[29] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,30");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[30] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,31");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[31] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 30);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,32");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[32] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 77);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,33");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[33] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 65);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,34");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[34] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 84);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,35");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[35] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,36");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[36] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 3);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,37");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[37] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,38");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[38] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 34);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,39");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[39] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,40");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[40] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,41");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[41] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,42");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[42] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,43");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[43] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 81);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,44");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[44] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,45");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[45] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 15);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,46");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[46] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,47");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[47] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,48");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[48] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,49");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[49] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,50");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[50] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,51");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[51] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,52");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[52] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 7);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,53");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[53] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,54");
                if (null != var2) {
                  CheckMarkWidgetPainter.field_a[54] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 65);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "achievement_criteria,55");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_a[55] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 19);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "text_config_pleaselogin_free");
                if (var2 != null) {
                  SpriteDropdownControl.field_G = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 19);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "text_campaign_pleaselogin_free");
                if (null != var2) {
                  RasterImageSurface.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 4);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_REQUIRES");
                if (null != var2) {
                  BattlefieldTheme.field_s = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_REQUIRESPRESTIGE");
                if (var2 != null) {
                  VerticalScrollbar.field_Jb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_AND");
                if (var2 != null) {
                  ModalDialogHost.field_L = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PANTHEON_REQUIRED");
                if (var2 != null) {
                  QuickChatMenuDisplaySupport.field_i = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 31);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "maptypes,0");
                if (null != var2) {
                  TextSplitSupport.field_c[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 29);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "maptypes,1");
                if (null != var2) {
                  TextSplitSupport.field_c[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "maptypes,2");
                if (var2 != null) {
                  TextSplitSupport.field_c[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "maptypes,3");
                if (null != var2) {
                  TextSplitSupport.field_c[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "maptypes,4");
                if (var2 != null) {
                  TextSplitSupport.field_c[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptlabels,0");
                if (var2 != null) {
                  LoginMethod.field_a[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptlabels,1");
                if (var2 != null) {
                  LoginMethod.field_a[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptlabels,2");
                if (null != var2) {
                  LoginMethod.field_a[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 68);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptlabels,3");
                if (var2 != null) {
                  LoginMethod.field_a[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 51);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptlabels,4");
                if (null != var2) {
                  LoginMethod.field_a[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 76);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptlabels,5");
                if (null != var2) {
                  LoginMethod.field_a[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,0,0");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 56);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,0,1");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[0][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,0,2");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[0][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 64);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,0,3");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[0][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,0,4");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[0][4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,0,5");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[0][5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,0,6");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[0][6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,1,0");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 39);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,1,1");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[1][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 51);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,1,2");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[1][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,1,3");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[1][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,2,0");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,2,1");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[2][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,2,2");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[2][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,2,3");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[2][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,4,0");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,4,1");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[4][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,5,0");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[5][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,5,1");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[5][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 87);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,5,2");
                if (var2 != null) {
                  DropTargetWidgetContainer.field_L[5][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,5,3");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[5][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameoptnames,5,4");
                if (null != var2) {
                  DropTargetWidgetContainer.field_L[5][4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,0,0");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,0,1");
                if (null != var2) {
                  QuinticFadeSupport.field_d[0][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,0,2");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[0][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,0,3");
                if (null != var2) {
                  QuinticFadeSupport.field_d[0][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,0,4");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[0][4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,0,5");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[0][5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,0,6");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[0][6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 56);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,1,0");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 31);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,1,1");
                if (null != var2) {
                  QuinticFadeSupport.field_d[1][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,1,2");
                if (null != var2) {
                  QuinticFadeSupport.field_d[1][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 76);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,1,3");
                if (null != var2) {
                  QuinticFadeSupport.field_d[1][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 24);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,2,0");
                if (null != var2) {
                  QuinticFadeSupport.field_d[2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,2,1");
                if (null != var2) {
                  QuinticFadeSupport.field_d[2][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,2,2");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[2][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,2,3");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[2][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,3,0");
                if (null != var2) {
                  QuinticFadeSupport.field_d[3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,3,1");
                if (null != var2) {
                  QuinticFadeSupport.field_d[3][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 30);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,3,2");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[3][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,3,3");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[3][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 64);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,3,4");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[3][4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,4,0");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,4,1");
                if (null != var2) {
                  QuinticFadeSupport.field_d[4][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,5,0");
                if (null != var2) {
                  QuinticFadeSupport.field_d[5][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,5,1");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[5][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,5,2");
                if (null != var2) {
                  QuinticFadeSupport.field_d[5][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 24);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,5,3");
                if (var2 != null) {
                  QuinticFadeSupport.field_d[5][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "gameopttooltips,5,4");
                if (null != var2) {
                  QuinticFadeSupport.field_d[5][4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 20);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,5,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[5][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 53);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,6,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[6][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,7,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[7][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 78);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,8,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[8][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,9,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[9][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,9,1");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[9][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,11,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[11][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,12,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[12][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,14,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[14][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,15,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[15][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_titles,16,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[16][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 8);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 7);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,6,0,1");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[6][0][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,6,0,2");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[6][0][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,6,0,3");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[6][0][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 13);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,7,0,1");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[7][0][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,7,0,2");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[7][0][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,7,0,3");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[7][0][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,8,0,3");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[8][0][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,9,0,1");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[9][0][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
            }
            void loadInstructionsCampaignAndActionText() throws java.lang.RuntimeException {
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,9,0,2");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[9][0][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,9,0,3");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[9][0][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,9,0,4");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[9][0][4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 20);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,11,0,1");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[11][0][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 59);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,11,0,2");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[11][0][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,11,0,3");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[11][0][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,14,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[14][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,14,0,1");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[14][0][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_subtitles,14,0,2");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[14][0][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 27);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,0,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[0][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,0,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[0][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 46);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,0,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[0][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,1,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[1][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,1,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[1][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 19);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,1,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[1][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,1,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[1][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,2,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[2][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,2,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[2][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,2,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[2][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,3,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[3][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,3,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[3][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 15);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,3,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[3][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,3,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[3][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,3,0,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[3][0][4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,4,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 81);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,4,0,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,4,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,4,0,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,4,0,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,5,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[5][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,5,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[5][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,5,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[5][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,5,0,5,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[5][0][5][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 84);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,6,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[6][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 32);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,6,0,4,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[6][0][4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,6,0,5,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[6][0][5][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,7,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[7][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,7,0,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[7][0][4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,8,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[8][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 67);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,8,0,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[8][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 8);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,8,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[8][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,9,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[9][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,9,1,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[9][1][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,9,1,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[9][1][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,9,1,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[9][1][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,9,1,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[9][1][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 33);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,10,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[10][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,10,0,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[10][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,10,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[10][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,10,0,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[10][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,10,0,4,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[10][0][4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,10,0,5,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[10][0][5][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 29);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,11,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[11][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,11,0,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[11][0][4][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 63);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,11,0,5,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[11][0][5][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 25);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,11,0,6,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[11][0][6][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,12,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[12][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,12,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[12][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,12,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[12][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,12,0,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[12][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,13,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[13][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,13,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[13][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,13,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[13][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 56);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,13,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[13][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 66);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,14,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[14][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,14,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[14][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,14,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[14][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,15,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[15][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,15,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[15][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,15,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[15][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,15,0,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[15][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,16,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[16][0][0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 72);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,16,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[16][0][1][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,16,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[16][0][2][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 71);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "instructions_paragraphs,16,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[16][0][3][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TEXT_SKIP");
                if (var2 != null) {
                  field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 33);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_BUILDINGS");
                if (null != var2) {
                  ClientContextMenu.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_FIRSTTOWERS");
                if (var2 != null) {
                  ModalDialogHost.field_N = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 59);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_FIRSTHOUSES");
                if (null != var2) {
                  ContentTransitionStage.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_FIRSTPORTALS");
                if (null != var2) {
                  ContentTransitionStage.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 85);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_KILLS");
                if (null != var2) {
                  CombatSandbox.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_SUMMONS");
                if (null != var2) {
                  ScrollContainer.field_Kb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 28);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_UNITBEATUP");
                if (null != var2) {
                  DelayedPacket.field_r = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 38);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_UNITBULLY");
                if (null != var2) {
                  SpriteDropdownControl.field_I = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_UNITTOUGHEST");
                if (null != var2) {
                  ArchiveLoadStep.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_KBDSUMMONER");
                if (null != var2) {
                  AccountRegistrationForm.field_Q = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 54);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_MANASPEND");
                if (var2 != null) {
                  ConsoleExpression.field_t = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_HEALTHLOST");
                if (null != var2) {
                  ByteStorage.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_HEALTHGAINED");
                if (null != var2) {
                  RasterState.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_MOSTUNITS");
                if (null != var2) {
                  MarkerSliderWidget.field_P = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 5);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_MOSTHONOURABLE");
                if (var2 != null) {
                  StateChangeEvent.field_H = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 85);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_AWARD_MOSTCRUEL");
                if (null != var2) {
                  DisplaySettingsDialog.field_ib = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 63);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BONUS_MANA_DESCRIPTION");
                if (null != var2) {
                  SummonRequest.field_D = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BONUS_MANA_TITLE");
                if (var2 != null) {
                  ClientStateChecksumSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "DIFFICULTY");
                if (null != var2) {
                  AccountNameNormalizer.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 66);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BESTSCORE");
                if (null != var2) {
                  CoatOfArmsOverlaySupport.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "START_MISSION");
                if (var2 != null) {
                  LineOfSightGrid.field_j = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "REPLAY_MISSION");
                if (var2 != null) {
                  GradientFrame.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "REWARD");
                if (null != var2) {
                  IntPair.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "REWARD_TITLE");
                if (null != var2) {
                  InstructionsPanel.field_gb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "QUICKSAVE_TITLE");
                if (var2 != null) {
                  SummonAction.field_A = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "QUICKSAVE_PROGRESS");
                if (var2 != null) {
                  AccountRequestResult.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "QUICKSAVING");
                if (var2 != null) {
                  PacketBuffer.field_p = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SAVE_AND_QUIT");
                if (null != var2) {
                  GradientSpanBlendSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PLAY_CAMPAIGN");
                if (null != var2) {
                  MusicPatch.field_o = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LOAD_QUICKSAVE");
                if (var2 != null) {
                  ConsoleTokenCursor.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 87);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "COMING_SOON");
                if (null != var2) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 43);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CAMPAIGNS");
                if (var2 != null) {
                  ScrollWidgetContainer.field_V = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BACK");
                if (null != var2) {
                  ResourceClientErrorSupport.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "INPROGRESS");
                if (var2 != null) {
                  ResourceClientSetupSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "OVERWRITE");
                if (var2 != null) {
                  BufferedSocket.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HAVEONGOINGMISSION");
                if (null != var2) {
                  DateOfBirthValidator.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 30);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CONTINUEMISSION");
                if (var2 != null) {
                  AccountRegistrationForm.field_Y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "RESTARTMISSION");
                if (null != var2) {
                  PacketBuffer.field_r = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 66);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STALEMATEWARNIGN");
                if (null != var2) {
                  DeployRequest.field_x = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 33);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "mapsizes,0");
                if (var2 != null) {
                  LoginKind.field_e[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 64);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "mapsizes,1");
                if (var2 != null) {
                  LoginKind.field_e[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 16);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "mapsizes,2");
                if (null != var2) {
                  LoginKind.field_e[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 87);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "mapsizes,3");
                if (var2 != null) {
                  LoginKind.field_e[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "godnames,0");
                if (null != var2) {
                  NetworkGameShell.field_q[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 5);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "godnames,1");
                if (null != var2) {
                  NetworkGameShell.field_q[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "godnames,2");
                if (null != var2) {
                  NetworkGameShell.field_q[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "godnames,3");
                if (null != var2) {
                  NetworkGameShell.field_q[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "godnames,4");
                if (var2 != null) {
                  NetworkGameShell.field_q[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "godnames,5");
                if (var2 != null) {
                  NetworkGameShell.field_q[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "godnames,6");
                if (var2 != null) {
                  NetworkGameShell.field_q[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "goddescriptions,0");
                if (var2 != null) {
                  GlobalSpell.field_l[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 22);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "goddescriptions,1");
                if (var2 != null) {
                  GlobalSpell.field_l[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 60);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "goddescriptions,2");
                if (null != var2) {
                  GlobalSpell.field_l[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 6);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "goddescriptions,3");
                if (var2 != null) {
                  GlobalSpell.field_l[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "goddescriptions,4");
                if (var2 != null) {
                  GlobalSpell.field_l[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "goddescriptions,5");
                if (var2 != null) {
                  GlobalSpell.field_l[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "goddescriptions,6");
                if (var2 != null) {
                  GlobalSpell.field_l[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_VINE");
                if (null != var2) {
                  EditableTextWidget.field_S = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_CANNON");
                if (null != var2) {
                  IntegerPowerSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_PRIEST");
                if (null != var2) {
                  SpellCastErrorSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 23);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_BARRIER");
                if (var2 != null) {
                  ScoreSubmissionRequest.field_p = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_PORTAL");
                if (var2 != null) {
                  SpellConfirmationDialog.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_SPHINX");
                if (null != var2) {
                  ContextActionMenu.field_Ob = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_PORTALMAGE");
                if (var2 != null) {
                  IconLabelControl.field_Ib = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 76);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_MOVE");
                if (var2 != null) {
                  AdaptiveMidiPcmStream.field_gb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_TOOFAR");
                if (var2 != null) {
                  EmailCheckResult.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_ATTACK");
                if (null != var2) {
                  NetworkGameShell.field_A = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_NEEDMOVEFIRST");
                if (null != var2) {
                  FriendRequestSupport.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_NOATTACK");
                if (var2 != null) {
                  DualNodeDeque.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_SUMMON");
                if (null != var2) {
                  RadialSummonMenu.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 45);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_TIRED");
                if (null != var2) {
                  BattleCameraTargetTransform.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_NONE");
                if (null != var2) {
                  NameSuggestionList.field_J = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 34);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_NOTYOURS");
                if (null != var2) {
                  IndexedSpriteBase.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 77);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ACTION_FIXED");
                if (null != var2) {
                  DualNodeDeque.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WRONG_GROUND_PORTAL");
                if (var2 != null) {
                  StatefulWidgetPainter.field_x = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WRONG_GROUND_CANNON");
                if (null != var2) {
                  SoundPanSupport.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GROUND_TIP_PORTAL");
                if (var2 != null) {
                  AnimationFrameSet.field_F = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GROUND_TIP_TOWER");
                if (var2 != null) {
                  ConsoleExpression.field_n = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 47);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GROUND_TIP_TEMPLE");
                if (null != var2) {
                  BattleGraphicsAssets.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GROUND_TIP_VILLAGE");
                if (var2 != null) {
                  TerrainScatterSupport.field_p = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 60);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "EMPTY_TILE_ERROR");
                if (null != var2) {
                  DebugConsole.field_A = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_NORANGE");
                if (var2 != null) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_RANGE");
                if (null != var2) {
                  FullscreenStatusDialog.field_Y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_RANGES");
                if (null != var2) {
                  AttackRangeOverlaySupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUSTEXT,0");
                if (var2 != null) {
                  GrowableIntArray.field_f[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUSTEXT,1");
                if (null != var2) {
                  GrowableIntArray.field_f[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUSTEXT,2");
                if (var2 != null) {
                  GrowableIntArray.field_f[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUSTEXT,3");
                if (var2 != null) {
                  GrowableIntArray.field_f[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUSTEXT,4");
                if (var2 != null) {
                  GrowableIntArray.field_f[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUSTEXT,5");
                if (var2 != null) {
                  GrowableIntArray.field_f[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 80);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUSTEXT,6");
                if (var2 != null) {
                  GrowableIntArray.field_f[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUSTEXT,7");
                if (null != var2) {
                  GrowableIntArray.field_f[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 85);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ARMOUR,0");
                if (var2 != null) {
                  PaletteRegionMap.field_a[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ARMOUR,1");
                if (null != var2) {
                  PaletteRegionMap.field_a[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 80);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ARMOUR,2");
                if (null != var2) {
                  PaletteRegionMap.field_a[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ARMOUR,3");
                if (var2 != null) {
                  PaletteRegionMap.field_a[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 83);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ARMOUR,4");
                if (null != var2) {
                  PaletteRegionMap.field_a[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ARMOUR,5");
                if (null != var2) {
                  PaletteRegionMap.field_a[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ARMOUR,6");
                if (var2 != null) {
                  PaletteRegionMap.field_a[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 14);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ARMOUR,7");
                if (null != var2) {
                  PaletteRegionMap.field_a[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_STUN,0");
                if (null != var2) {
                  PrintCoatConsoleCommand.field_E[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 57);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_STUN,1");
                if (null != var2) {
                  PrintCoatConsoleCommand.field_E[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 63);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_EFFECTEXPAND");
                if (var2 != null) {
                  GameClock.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_VAMPIRE");
                if (var2 != null) {
                  UnitAirAttackSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_MITOSE");
                if (var2 != null) {
                  LinkButtonPainter.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 82);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ACCESSORY,0");
                if (var2 != null) {
                  DropdownArrowPainter.field_c[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ACCESSORY,1");
                if (var2 != null) {
                  DropdownArrowPainter.field_c[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ACCESSORY,2");
                if (null != var2) {
                  DropdownArrowPainter.field_c[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ACCESSORY,3");
                if (null != var2) {
                  DropdownArrowPainter.field_c[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ACCESSORY,4");
                if (null != var2) {
                  DropdownArrowPainter.field_c[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 91);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATUS_ACCESSORY,5");
                if (var2 != null) {
                  DropdownArrowPainter.field_c[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_TYPES,0");
                if (null != var2) {
                  UnitAnimationSelectionSupport.field_b[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 44);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_TYPES,1");
                if (null != var2) {
                  UnitAnimationSelectionSupport.field_b[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_TYPES,2");
                if (null != var2) {
                  UnitAnimationSelectionSupport.field_b[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_TYPES,3");
                if (null != var2) {
                  UnitAnimationSelectionSupport.field_b[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_TYPES,4");
                if (var2 != null) {
                  UnitAnimationSelectionSupport.field_b[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_CLASSES,0");
                if (null != var2) {
                  ManaEvent.field_y[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_CLASSES,1");
                if (null != var2) {
                  ManaEvent.field_y[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 5);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_CLASSES,2");
                if (var2 != null) {
                  ManaEvent.field_y[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_CLASSES,3");
                if (var2 != null) {
                  ManaEvent.field_y[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 28);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_CLASSES,4");
                if (var2 != null) {
                  ManaEvent.field_y[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 9);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_CLASSES,5");
                if (null != var2) {
                  ManaEvent.field_y[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "WEAPON_CLASSES,6");
                if (null != var2) {
                  ManaEvent.field_y[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BUTTON_CHATTAB");
                if (null != var2) {
                  PointerInputHandler.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BUTTON_ENDTURN");
                if (null != var2) {
                  RasterState.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 11);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BUTTON_TOGGLEMAP");
            }
            void loadTerrainAndUnitNames() throws java.lang.RuntimeException {
                if (var2 != null) {
                  IntroSequence.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 73);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BUTTON_ANNOUNCE");
                if (null != var2) {
                  ChatMessage.field_o = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 37);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BUTTON_TEAMCHATON");
                if (var2 != null) {
                  DialWidgetPainter.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BUTTON_TEAMCHATOFF");
                if (var2 != null) {
                  AccountRegistrationForm.field_E = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 34);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BUTTON_EQUIPMENT");
                if (null != var2) {
                  MatchSetupPanel.field_x = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOVER_GOD");
                if (var2 != null) {
                  PointerInputHandler.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 82);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOVER_ANNOUNCE");
                if (null != var2) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOVER_ANNOUNCEYOU");
                if (var2 != null) {
                  GuestPlayConfirmationForm.field_H = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 50);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ANNOUNCE_WINNER");
                if (var2 != null) {
                  SoundCache.field_i = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ANNOUNCE_WINNERYOU");
                if (var2 != null) {
                  DeployEvent.field_y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 89);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ANNOUNCE_DRAW");
                if (var2 != null) {
                  SpriteDropdownControl.field_J = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GAME_STATS,0");
                if (null != var2) {
                  DiskCacheWorker.field_f[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GAME_STATS,1");
                if (null != var2) {
                  DiskCacheWorker.field_f[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GAME_STATS,2");
                if (null != var2) {
                  DiskCacheWorker.field_f[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 48);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GAME_STATS,3");
                if (var2 != null) {
                  DiskCacheWorker.field_f[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GAME_STATS,5");
                if (var2 != null) {
                  DiskCacheWorker.field_f[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GAME_STATS,6");
                if (null != var2) {
                  DiskCacheWorker.field_f[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GAME_STATS,7");
                if (var2 != null) {
                  DiskCacheWorker.field_f[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GAME_STATS,8");
                if (null != var2) {
                  DiskCacheWorker.field_f[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 57);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MANA_INCREASE");
                if (null != var2) {
                  ConsoleCommand.field_w = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MANA_COUNTER");
                if (var2 != null) {
                  TextEntryWidgetPainter.field_v = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MANA_COUNTER_VICTORY");
                if (var2 != null) {
                  ProgressDialog.field_bb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MANA_COUNTER_VICTORY2");
                if (null != var2) {
                  TutorialLayout.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERRAIN_BONUS");
                if (null != var2) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLASSES,0");
                if (null != var2) {
                  BufferedSocket.field_m[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 65);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLASSES,1");
                if (null != var2) {
                  BufferedSocket.field_m[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLASSES,2");
                if (null != var2) {
                  BufferedSocket.field_m[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLASSES,3");
                if (null != var2) {
                  BufferedSocket.field_m[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLASSES,4");
                if (null != var2) {
                  BufferedSocket.field_m[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 53);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLASSES,5");
                if (null != var2) {
                  BufferedSocket.field_m[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLASSES,6");
                if (var2 != null) {
                  BufferedSocket.field_m[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLASSES,7");
                if (null != var2) {
                  BufferedSocket.field_m[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "BARBARIAN_CHIEF");
                if (null != var2) {
                  SpectateRoomRequestSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,0");
                if (var2 != null) {
                  FriendLookupSupport.field_a[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,1");
                if (null != var2) {
                  FriendLookupSupport.field_a[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,2");
                if (null != var2) {
                  FriendLookupSupport.field_a[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,3");
                if (null != var2) {
                  FriendLookupSupport.field_a[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 43);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,4");
                if (var2 != null) {
                  FriendLookupSupport.field_a[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,5");
                if (null != var2) {
                  FriendLookupSupport.field_a[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 34);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,6");
                if (null != var2) {
                  FriendLookupSupport.field_a[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,7");
                if (null != var2) {
                  FriendLookupSupport.field_a[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 52);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,8");
                if (var2 != null) {
                  FriendLookupSupport.field_a[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,9");
                if (var2 != null) {
                  FriendLookupSupport.field_a[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 51);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,10");
                if (null != var2) {
                  FriendLookupSupport.field_a[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,11");
                if (null != var2) {
                  FriendLookupSupport.field_a[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 22);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,12");
                if (var2 != null) {
                  FriendLookupSupport.field_a[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 43);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,13");
                if (var2 != null) {
                  FriendLookupSupport.field_a[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 79);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,14");
                if (null != var2) {
                  FriendLookupSupport.field_a[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "groundnames,15");
                if (null != var2) {
                  FriendLookupSupport.field_a[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "burntgroundnames,4");
                if (var2 != null) {
                  TextSplitSupport.field_d[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "burntgroundnames,6");
                if (null != var2) {
                  TextSplitSupport.field_d[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 83);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LEADER");
                if (var2 != null) {
                  ConsoleExpression.field_r = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "GUARD");
                if (null != var2) {
                  BoundedUrlRequest.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "EXIT");
                if (null != var2) {
                  GuestPlayConfirmationForm.field_P = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "UN_OWNED");
                if (var2 != null) {
                  ProceduralMapSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 65);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "UN_OWNABLE");
                if (null != var2) {
                  GlobalSpell.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "OWNED_BY");
                if (null != var2) {
                  IterableNodeHashTable.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "OWNED_BY_YOU");
                if (null != var2) {
                  GlobalSpell.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MANA_SCORE");
                if (null != var2) {
                  PreferencesReadRequest.field_t = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "NO_MANA");
                if (null != var2) {
                  DisplayModeOptionPainter.field_x = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,0");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 52);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,1");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 46);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,2");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,3");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,4");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 68);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,5");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,6");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,7");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 58);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,8");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,9");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,10");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,11");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 17);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,12");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,13");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,14");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[0][14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,15");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,16");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,0,17");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[0][17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,1");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[1][1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,2");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[1][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 91);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,4");
                if (var2 != null) {
                  AccountNameSelectionSupport.field_b[1][4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,5");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[1][5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,6");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[1][6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 77);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,7");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[1][7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,8");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[1][8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,9");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[1][9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,1,17");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[1][17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "terrainicontext,2,2");
                if (null != var2) {
                  AccountNameSelectionSupport.field_b[2][2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 35);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,0");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,1");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,2");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,3");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,4");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,5");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,6");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,7");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,8");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,9");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,10");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 23);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,11");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 32);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,12");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,13");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,14");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,15");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,16");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,17");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,18");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 59);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,19");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,20");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,21");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,22");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,23");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,24");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,25");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,26");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,27");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,28");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,29");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[29] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 20);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,30");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[30] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,31");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[31] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,32");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[32] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,33");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[33] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,34");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[34] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,35");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[35] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,36");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[36] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,37");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[37] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 11);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,38");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[38] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,39");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[39] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,40");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[40] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,41");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[41] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 63);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,42");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[42] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 90);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,43");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[43] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,44");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[44] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,45");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[45] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 62);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,46");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[46] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,47");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[47] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 35);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,48");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[48] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,49");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[49] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,50");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[50] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,51");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[51] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 54);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,52");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[52] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,53");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[53] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 18);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,54");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[54] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 18);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,55");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[55] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,56");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[56] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,57");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[57] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,58");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[58] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,59");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[59] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,60");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[60] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,61");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[61] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,62");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[62] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,63");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[63] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,64");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[64] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,65");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[65] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,66");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[66] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 35);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,67");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[67] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 56);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,68");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[68] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,69");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[69] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,70");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[70] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,71");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[71] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,72");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[72] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 19);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,73");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[73] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,74");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[74] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,75");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[75] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 14);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,76");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[76] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,77");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[77] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 72);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,78");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[78] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,79");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[79] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,80");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[80] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,81");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[81] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,82");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[82] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 63);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,83");
                if (null != var2) {
                  ScrollContainer.unitDisplayNames[83] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,84");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[84] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 31);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,85");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[85] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 69);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,86");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[86] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,87");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[87] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitnames,88");
                if (var2 != null) {
                  ScrollContainer.unitDisplayNames[88] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATS_MULTIRANGE");
                if (var2 != null) {
                  ContextualRuntimeException.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 67);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATS_SINGLERANGE");
                if (var2 != null) {
                  Unit.field_y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "STATS_CANNONRANGE");
                if (null != var2) {
                  EmailValidator.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_RANGES");
                if (var2 != null) {
                  LinkButtonPainter.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_RANGES2");
                if (null != var2) {
                  AiPlanningStrategy.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 78);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_RANGE");
                if (null != var2) {
                  ChannelGainProfile.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_STRENGTH");
                if (var2 != null) {
                  TextFieldValidator.field_i = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_SPEED");
                if (var2 != null) {
                  IntegerPowerSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_LEVEL");
                if (var2 != null) {
                  UiSelectionState.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_MANA");
                if (var2 != null) {
                  LoginAndTutorialSetupSupport.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_ENDTURN");
                if (var2 != null) {
                  GrowthEvent.field_I = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_ALIGNMENTS");
                if (var2 != null) {
                  SummonAction.field_F = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ROLLOVER_MANA");
                if (null != var2) {
                  QuickChatMenuDisplaySupport.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ROLLOVER_CHAT");
                if (var2 != null) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 59);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ROLLOVER_STRENGTH");
                if (null != var2) {
                  CoatOfArms.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 14);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ROLLOVER_BONUS");
                if (var2 != null) {
                  QuinticFadeSupport.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 68);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CAMPAIGN_PROGRESS");
                if (var2 != null) {
                  ConsoleExpression.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOTSEAT_NAMES,0");
                if (var2 != null) {
                  ArchiveIndex.field_w[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 13);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOTSEAT_NAMES,1");
                if (var2 != null) {
                  ArchiveIndex.field_w[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 21);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOTSEAT_NAMES,2");
                if (var2 != null) {
                  ArchiveIndex.field_w[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 17);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOTSEAT_NAMES,3");
                if (null != var2) {
                  ArchiveIndex.field_w[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 49);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOTSEAT_NAMES,4");
                if (var2 != null) {
                  ArchiveIndex.field_w[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 55);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOTSEAT_NAMES,5");
                if (var2 != null) {
                  ArchiveIndex.field_w[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOTSEAT_NAMES,6");
                if (null != var2) {
                  ArchiveIndex.field_w[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "HOTSEAT_NAMES,7");
                if (var2 != null) {
                  ArchiveIndex.field_w[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_PLAYER");
                if (var2 != null) {
                  BoundedFile.field_i = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 4);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_ENEMY");
                if (null != var2) {
                  QuickChatMenuDisplaySupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TEAM_RED");
                if (var2 != null) {
                  AnimationPlayer.field_n = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 34);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TEAM_BLUE");
                if (null != var2) {
                  CampaignMission.field_p = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SPACE");
                if (null != var2) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 22);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "KBD_SUMMON_DESCRIPTION");
                if (null != var2) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,0");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,3");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,4");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,6");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,7");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 59);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,10");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,17");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,18");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 28);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,20");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,21");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,27");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,28");
            }
            void loadUnitDescriptionsAndMenuText() throws java.lang.RuntimeException {
                if (null != var2) {
                  AlphaWidgetContainer.field_M[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,29");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[29] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,32");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[32] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,34");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[34] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,39");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[39] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,40");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[40] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,43");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[43] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,51");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[51] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,53");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[53] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,56");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[56] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,57");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[57] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,58");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[58] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,59");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[59] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 43);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,62");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[62] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 80);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,63");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[63] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 89);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,65");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[65] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 43);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,66");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[66] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,70");
                if (null != var2) {
                  AlphaWidgetContainer.field_M[70] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,71");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[71] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,72");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[72] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,73");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[73] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,74");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[74] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 33);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "unitspecials,81");
                if (var2 != null) {
                  AlphaWidgetContainer.field_M[81] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,0");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,1");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,2");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,3");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,4");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 45);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,5");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,6");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 45);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,7");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 61);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,8");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,9");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,10");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,11");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 85);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,12");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,13");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,14");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,15");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,16");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,17");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,18");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 30);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,19");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,20");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,21");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,22");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 86);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,23");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 86);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,24");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,25");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 49);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,26");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 68);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,27");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 21);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,28");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,29");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[29] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,30");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[30] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,31");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[31] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,32");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[32] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 38);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,33");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[33] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,34");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[34] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,35");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[35] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,36");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[36] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 91);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,37");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[37] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,38");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[38] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,39");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[39] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 15);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,40");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[40] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,41");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[41] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 84);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,42");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[42] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,43");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[43] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 32);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,44");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[44] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,45");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[45] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,46");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[46] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 46);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,47");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[47] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 2);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,48");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[48] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,49");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[49] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 24);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,50");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[50] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,51");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[51] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,52");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[52] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,53");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[53] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 5);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,54");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[54] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,55");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[55] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 90);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,56");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[56] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,57");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[57] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,58");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[58] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,59");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[59] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,60");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[60] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,61");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[61] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 22);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,62");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[62] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,63");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[63] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,64");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[64] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,65");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[65] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,66");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[66] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,67");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[67] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,68");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[68] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,69");
                if (var2 != null) {
                  DisplaySettingsDialog.field_cb[69] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,70");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[70] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,71");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[71] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,72");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[72] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,73");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[73] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 87);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "descriptions,74");
                if (null != var2) {
                  DisplaySettingsDialog.field_cb[74] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "NO_PASSIVE");
                if (null != var2) {
                  SocketFactory.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,0");
                if (var2 != null) {
                  DirectByteStorage.field_n[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,1");
                if (var2 != null) {
                  DirectByteStorage.field_n[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 74);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,2");
                if (null != var2) {
                  DirectByteStorage.field_n[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,3");
                if (var2 != null) {
                  DirectByteStorage.field_n[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,4");
                if (var2 != null) {
                  DirectByteStorage.field_n[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,5");
                if (null != var2) {
                  DirectByteStorage.field_n[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,6");
                if (null != var2) {
                  DirectByteStorage.field_n[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,7");
                if (null != var2) {
                  DirectByteStorage.field_n[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 48);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,8");
                if (null != var2) {
                  DirectByteStorage.field_n[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 13);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,9");
                if (var2 != null) {
                  DirectByteStorage.field_n[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,10");
                if (var2 != null) {
                  DirectByteStorage.field_n[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 51);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,11");
                if (var2 != null) {
                  DirectByteStorage.field_n[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 45);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,12");
                if (var2 != null) {
                  DirectByteStorage.field_n[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,13");
                if (null != var2) {
                  DirectByteStorage.field_n[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,14");
                if (var2 != null) {
                  DirectByteStorage.field_n[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,15");
                if (var2 != null) {
                  DirectByteStorage.field_n[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,16");
                if (var2 != null) {
                  DirectByteStorage.field_n[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,17");
                if (null != var2) {
                  DirectByteStorage.field_n[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 63);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,18");
                if (null != var2) {
                  DirectByteStorage.field_n[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 25);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,19");
                if (null != var2) {
                  DirectByteStorage.field_n[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 32);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,20");
                if (null != var2) {
                  DirectByteStorage.field_n[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,21");
                if (var2 != null) {
                  DirectByteStorage.field_n[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "passivespecials,22");
                if (var2 != null) {
                  DirectByteStorage.field_n[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SUMMON_ERRORS,0");
                if (null != var2) {
                  TeamRoster.field_c[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SUMMON_ERRORS,1");
                if (null != var2) {
                  TeamRoster.field_c[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SUMMON_ERRORS,2");
                if (var2 != null) {
                  TeamRoster.field_c[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SUMMON_ERRORS,3");
                if (null != var2) {
                  TeamRoster.field_c[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SUMMON_ERRORS,4");
                if (null != var2) {
                  TeamRoster.field_c[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "directions,0");
                if (null != var2) {
                  AccountNameNormalizer.field_a[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 82);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "directions,1");
                if (null != var2) {
                  AccountNameNormalizer.field_a[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "directions,2");
                if (var2 != null) {
                  AccountNameNormalizer.field_a[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 8);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "directions,3");
                if (var2 != null) {
                  AccountNameNormalizer.field_a[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 48);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SLASH");
                if (var2 != null) {
                  ArrayWidgetContainer.field_I = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "QUIT_MULTI");
                if (var2 != null) {
                  IntrusiveNode.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "QUIT_HOTSEAT");
                if (var2 != null) {
                  SelectionMenuLayoutSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 17);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "QUIT_MISSION");
                if (null != var2) {
                  AccountNameFoldingSupport.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PLACE_FIRST");
                if (var2 != null) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PLACE_SECOND");
                if (var2 != null) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PLACE_THIRD");
                if (null != var2) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PLACE_OTHERS");
                if (var2 != null) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placedrawn");
                if (null != var2) {
                  DualNodeIterator.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placenames,0");
                if (var2 != null) {
                  AccountNameCharacterSupport.field_b[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 69);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placenames,1");
                if (var2 != null) {
                  AccountNameCharacterSupport.field_b[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placenames,2");
                if (null != var2) {
                  AccountNameCharacterSupport.field_b[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 23);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placenames,3");
                if (null != var2) {
                  AccountNameCharacterSupport.field_b[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placenames,4");
                if (null != var2) {
                  AccountNameCharacterSupport.field_b[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 56);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placenames,5");
                if (var2 != null) {
                  AccountNameCharacterSupport.field_b[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placenames,6");
                if (var2 != null) {
                  AccountNameCharacterSupport.field_b[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "placenames,7");
                if (null != var2) {
                  AccountNameCharacterSupport.field_b[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 23);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "QUALITY_HIGH");
                if (var2 != null) {
                  ReflectionCheckRequest.field_s = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "QUALITY_LOW");
                if (null != var2) {
                  NanoGameClock.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 26);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SKIP_ON");
                if (var2 != null) {
                  CombatPresentation.field_N = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SKIP_OFF");
                if (null != var2) {
                  DropdownSelectorPainter.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_CAMPAIGNS");
                if (var2 != null) {
                  PaginationTextSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 14);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_NEWGAME");
                if (var2 != null) {
                  ByteArrayPoolSupport.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_UNITS");
                if (var2 != null) {
                  ValidatedTextWidget.field_Y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_CONFIG");
                if (null != var2) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 54);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_TUTORIAL");
                if (null != var2) {
                  AnimationSkeleton.field_m = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_SANDBOX");
                if (null != var2) {
                  AlphaDecodedSpriteSupport.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_STARTGAME");
                if (null != var2) {
                  NodeHashTable.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_PLAYERS");
                if (null != var2) {
                  NetworkGameShell.field_s = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 89);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_NUM_AI_PLAYERS");
                if (var2 != null) {
                  UnitModelViewer.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 87);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_MAPTYPE");
                if (var2 != null) {
                  field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 33);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_MAPSIZE");
                if (null != var2) {
                  ClippedWidgetContainer.field_I = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_MODEL_VIEWER");
                if (var2 != null) {
                  DebugConsole.field_C = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_BATTLE_VIEWER");
                if (null != var2) {
                  ActionRequest.field_r = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_FOG_SELECT");
                if (null != var2) {
                  DecodedSpriteSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_COATOFARMS");
                if (null != var2) {
                  LoginMethod.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_OPTIONS");
                if (var2 != null) {
                  AccountRequestResult.field_j = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_QUALITY");
                if (null != var2) {
                  StripedProgressWidget.field_G = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_SKIPBATTLES");
                if (null != var2) {
                  GzipDecoder.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_WALKSPEED");
                if (var2 != null) {
                  PortalLossCondition.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_MORE_OPTIONS");
                if (var2 != null) {
                  FaceNormal.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_SLOW");
                if (null != var2) {
                  TerrainScatterSupport.field_o = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_MEDIUM");
                if (var2 != null) {
                  CoatOfArmsOverlaySupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_FAST");
                if (null != var2) {
                  CacheEntry.field_v = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_INGAME_SINGLE");
                if (var2 != null) {
                  ConsoleEvaluationException.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 81);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_INGAME_MULTI");
                if (var2 != null) {
                  AttackRangeOverlaySupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_INGAME_MULTI_FINISHED");
                if (null != var2) {
                  QuickChatCategoryMenuSupport.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_INGAME_MULTI_SPECTATING");
                if (var2 != null) {
                  PrintVictoryConditionsConsoleCommand.field_H = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 82);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_MISSION_SELECTION");
                if (var2 != null) {
                  MeshObject.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 84);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_CAMPAIGN_SELECTION");
                if (var2 != null) {
                  ConsoleExpression.field_u = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_HOTSEAT");
                if (null != var2) {
                  SingleChildWidgetContainer.field_F = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_INSTRUCTIONS");
                if (var2 != null) {
                  ValidationStatusIcon.field_N = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 8);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_ACHIEVEMENTS");
                if (var2 != null) {
                  LogoMesh.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 7);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_GAME_ACHIEVEMENTS");
                if (null != var2) {
                  GradientSpanBlendSupport.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_INVITE_LOGIN");
                if (var2 != null) {
                  DamageEvent.field_z = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_ERROR");
                if (var2 != null) {
                  DiskCacheRequest.field_J = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_SPELLBOOK");
                if (null != var2) {
                  MusicTrackSelectionSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 11);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_COA");
                if (null != var2) {
                  QuickChatPhrase.field_y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_SETTINGS");
                if (var2 != null) {
                  SpectateRoomRequestSupport.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_BENEFITS");
                if (var2 != null) {
                  UnitModelViewer.field_w = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_SETTINGS_INGAME");
                if (null != var2) {
                  SoundEffectPreloadSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 24);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_TRINKETS");
                if (null != var2) {
                  ArchiveMasterIndex.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_RETURN_COFNIRM");
                if (null != var2) {
                  PlayerProfile.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 26);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_RETURN_QUESTION");
                if (var2 != null) {
                  QuickChatSetupSupport.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_RESTART_QUESTION");
                if (null != var2) {
                  AccountRsaBufferSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_PRESTIGE");
                if (null != var2) {
                  CorpseConditionMarker.field_x = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 7);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_MEMBERS");
                if (null != var2) {
                  ByteArrayPoolSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_NONMEMBERS");
                if (null != var2) {
                  PreferencesReadRequest.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_YES");
                if (null != var2) {
                  RatingLeaderboardRequest.field_p = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_NO");
                if (null != var2) {
                  ToggleTurnSkipConsoleCommand.field_G = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_STATS");
                if (var2 != null) {
                  StandardContentDialog.field_lb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_ZAMORAK_HIGHSCORE");
                if (var2 != null) {
                  ResourceClientErrorSupport.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_SARADOMIN_HIGHSCORE");
                if (null != var2) {
                  ModalDialogHost.field_P = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_GUTHIX_HIGHSCORE");
                if (null != var2) {
                  EffectsGainSupport.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 73);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "RESULTS_PERFORMANCE");
                if (null != var2) {
                  FullscreenConfirmationDialog.field_eb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "RESULTS_TURNSUSED");
                if (null != var2) {
                  RasterState.field_m = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "RESULTS_DAMAGETAKEN");
                if (null != var2) {
                  OwnerChangeEvent.field_y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 91);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "RESULTS_FINALSCORE");
                if (var2 != null) {
                  ResourceClientSetupSupport.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "INTRO_0");
                if (var2 != null) {
                  TextLineLayout.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "INTRO_1");
                if (null != var2) {
                  VertexNormal.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 7);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "INTRO_2");
                if (null != var2) {
                  QuickChatPhraseRepository.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "INTRO_3");
                if (null != var2) {
                  ClientUiComponent.field_lb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 55);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "INTRO_4");
                if (var2 != null) {
                  GridWidgetContainer.field_P = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TEXT_ON");
                if (var2 != null) {
                  ScrollContainer.field_Mb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 78);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TEXT_OFF");
                if (var2 != null) {
                  RegistrationAgreementPane.field_J = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,0");
                if (null != var2) {
                  TutorialController.field_f[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,1");
                if (null != var2) {
                  TutorialController.field_f[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
            }
            void loadTutorialObjectivesAndTrinketNames() throws java.lang.RuntimeException {
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,2");
                if (var2 != null) {
                  TutorialController.field_f[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,3");
                if (null != var2) {
                  TutorialController.field_f[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,4");
                if (null != var2) {
                  TutorialController.field_f[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 83);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,5");
                if (null != var2) {
                  TutorialController.field_f[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 80);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,6");
                if (var2 != null) {
                  TutorialController.field_f[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,7");
                if (var2 != null) {
                  TutorialController.field_f[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,8");
                if (var2 != null) {
                  TutorialController.field_f[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,9");
                if (var2 != null) {
                  TutorialController.field_f[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,10");
                if (var2 != null) {
                  TutorialController.field_f[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 35);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,11");
                if (var2 != null) {
                  TutorialController.field_f[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,12");
                if (null != var2) {
                  TutorialController.field_f[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,13");
                if (null != var2) {
                  TutorialController.field_f[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,14");
                if (var2 != null) {
                  TutorialController.field_f[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 28);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,15");
                if (var2 != null) {
                  TutorialController.field_f[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 13);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,16");
                if (var2 != null) {
                  TutorialController.field_f[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,17");
                if (null != var2) {
                  TutorialController.field_f[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,18");
                if (var2 != null) {
                  TutorialController.field_f[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 48);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,19");
                if (var2 != null) {
                  TutorialController.field_f[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,20");
                if (var2 != null) {
                  TutorialController.field_f[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 69);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,21");
                if (null != var2) {
                  TutorialController.field_f[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,22");
                if (null != var2) {
                  TutorialController.field_f[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 26);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,23");
                if (var2 != null) {
                  TutorialController.field_f[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,24");
                if (var2 != null) {
                  TutorialController.field_f[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,25");
                if (null != var2) {
                  TutorialController.field_f[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 62);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,26");
                if (var2 != null) {
                  TutorialController.field_f[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUT_TEXT,27");
                if (null != var2) {
                  TutorialController.field_f[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 15);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "DEFEATLEADER");
                if (null != var2) {
                  BitReversalSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CAPTUREGOAL");
                if (var2 != null) {
                  FriendLookupSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CAPTUREGOALORDEFEATLEADER");
                if (var2 != null) {
                  DropdownOptionList.field_Y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PREVENTSUMMONING");
                if (null != var2) {
                  MusicTrackSelectionSupport.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 9);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "DEFEATALLENEMIES");
                if (var2 != null) {
                  DeployAction.field_C = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 18);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ESCORTLEADER");
                if (var2 != null) {
                  BoundedUrlRequest.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 81);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CLOSE");
                if (var2 != null) {
                  GlobalSpell.field_m = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 73);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "CONTINUE");
                if (null != var2) {
                  ResourceClientSetupSupport.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "OBJHIDE");
                if (var2 != null) {
                  SkeletonLimitMarker.field_t = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 91);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "OBJSHOW");
                if (null != var2) {
                  PreferencesReadRequest.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 49);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUTHIDE");
                if (null != var2) {
                  ColourRampSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 53);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUTSHOW");
                if (var2 != null) {
                  DeployAction.field_z = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 79);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUTWAIT");
                if (null != var2) {
                  SectorCacheStore.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 82);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TUTEND");
                if (var2 != null) {
                  ManaStarParticle.field_u = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MANA_LOTS");
                if (var2 != null) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SPELLBOOK_PURCHASE");
                if (null != var2) {
                  KeyedLoginCredentials.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SPELLBOOK_OWNED");
                if (var2 != null) {
                  CampaignMenuButton.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 17);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SPELLBOOK_FREE");
                if (var2 != null) {
                  IntrusiveNode.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SPELLBOOK_RUNES");
                if (null != var2) {
                  LobbyControlResources.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SPELLBOOK_RUNE");
                if (null != var2) {
                  LoginAndTutorialSetupSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "SPELLBOOK_PURSE");
                if (var2 != null) {
                  SpectateRoomRequestSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 17);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_HAVE");
                if (var2 != null) {
                  QuickChatCommandDefinition.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MESSAGE_LOADING");
                if (var2 != null) {
                  ManaEvent.field_A = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 78);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MESSAGE_QUIT");
                if (null != var2) {
                  AccountRequestResult.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MESSAGE_DEAD");
                if (var2 != null) {
                  QuickChatMenu.field_Mb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MESSAGE_DRAW");
                if (null != var2) {
                  MusicTrackSelectionSupport.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MESSAGE_UNDRAW");
                if (null != var2) {
                  TelepopEvent.field_y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,0");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,1");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,2");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,3");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,4");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,5");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,6");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,7");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,8");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 43);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,9");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,10");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,11");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,12");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,13");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,14");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 11);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,15");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,16");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,17");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,18");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,19");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,20");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 16);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,21");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,22");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,23");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 16);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,24");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,25");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,26");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,27");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,28");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,29");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[29] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 89);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,30");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[30] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,31");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[31] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,32");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[32] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,33");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[33] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,34");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[34] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,35");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[35] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,36");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[36] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 60);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,37");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[37] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 9);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,38");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[38] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 28);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,39");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[39] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,40");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[40] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,41");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[41] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,42");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[42] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,43");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[43] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,44");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[44] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,45");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[45] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,46");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[46] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,47");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[47] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,48");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[48] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,49");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[49] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,50");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[50] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,51");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[51] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,52");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[52] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 4);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,53");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[53] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,54");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[54] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,55");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[55] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,56");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[56] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,57");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[57] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,58");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[58] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 43);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,59");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[59] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 17);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,60");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[60] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 20);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,61");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[61] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 7);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,62");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[62] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 14);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,63");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[63] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,64");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[64] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 62);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,65");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[65] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,66");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[66] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,67");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[67] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,68");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[68] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 56);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,69");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[69] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,70");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[70] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,71");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[71] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,72");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[72] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,73");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[73] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,74");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[74] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,75");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[75] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,76");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[76] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 61);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,77");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[77] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,78");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[78] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,79");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[79] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 8);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,80");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[80] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 3);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,81");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[81] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 67);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,82");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[82] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,83");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[83] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,84");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[84] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,85");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[85] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,86");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[86] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,87");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[87] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,88");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[88] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,89");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[89] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,90");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[90] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,91");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[91] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,92");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[92] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 20);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,93");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[93] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,94");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[94] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,95");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[95] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,96");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[96] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 76);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,97");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[97] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,98");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[98] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,99");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[99] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,100");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[100] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,101");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[101] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,102");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[102] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,103");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[103] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,104");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[104] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,105");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[105] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 16);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,106");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[106] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,107");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[107] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,108");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[108] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,109");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[109] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,110");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[110] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,111");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[111] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,112");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[112] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 66);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,113");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[113] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,114");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[114] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 61);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,115");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[115] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,116");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[116] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 18);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,117");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[117] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,118");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[118] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,119");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[119] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 75);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,120");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[120] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,121");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[121] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 85);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,122");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[122] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,123");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[123] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,124");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[124] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,125");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[125] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,126");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[126] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 69);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,127");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[127] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 38);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,128");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[128] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,129");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[129] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 19);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,130");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[130] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,131");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[131] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,132");
                if (null != var2) {
                  MusicPatchEnvelope.field_f[132] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,133");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[133] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketnames,134");
                if (var2 != null) {
                  MusicPatchEnvelope.field_f[134] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,0");
                if (var2 != null) {
                  ActionRequest.field_l[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,1");
                if (var2 != null) {
                  ActionRequest.field_l[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 46);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,2");
                if (var2 != null) {
                  ActionRequest.field_l[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 45);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,3");
                if (null != var2) {
                  ActionRequest.field_l[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,4");
                if (var2 != null) {
                  ActionRequest.field_l[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,5");
                if (null != var2) {
                  ActionRequest.field_l[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,6");
                if (null != var2) {
                  ActionRequest.field_l[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 80);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,7");
                if (null != var2) {
                  ActionRequest.field_l[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 27);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,8");
                if (var2 != null) {
                  ActionRequest.field_l[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,9");
                if (var2 != null) {
                  ActionRequest.field_l[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,10");
                if (null != var2) {
                  ActionRequest.field_l[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,11");
                if (var2 != null) {
                  ActionRequest.field_l[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,12");
                if (var2 != null) {
                  ActionRequest.field_l[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,13");
                if (var2 != null) {
                  ActionRequest.field_l[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,14");
                if (null != var2) {
                  ActionRequest.field_l[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 35);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,15");
                if (var2 != null) {
                  ActionRequest.field_l[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 28);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,16");
                if (null != var2) {
                  ActionRequest.field_l[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,17");
                if (null != var2) {
                  ActionRequest.field_l[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,18");
                if (var2 != null) {
                  ActionRequest.field_l[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,19");
                if (var2 != null) {
                  ActionRequest.field_l[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,20");
                if (null != var2) {
                  ActionRequest.field_l[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,21");
                if (null != var2) {
                  ActionRequest.field_l[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,22");
                if (null != var2) {
                  ActionRequest.field_l[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,23");
                if (null != var2) {
                  ActionRequest.field_l[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,24");
                if (null != var2) {
                  ActionRequest.field_l[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 45);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,25");
                if (null != var2) {
                  ActionRequest.field_l[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,26");
                if (var2 != null) {
                  ActionRequest.field_l[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
            }
            void loadTrinketDescriptionsAndSpellErrors() throws java.lang.RuntimeException {
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,27");
                if (null != var2) {
                  ActionRequest.field_l[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 82);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,28");
                if (var2 != null) {
                  ActionRequest.field_l[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,29");
                if (null != var2) {
                  ActionRequest.field_l[29] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,30");
                if (null != var2) {
                  ActionRequest.field_l[30] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 65);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,31");
                if (null != var2) {
                  ActionRequest.field_l[31] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,32");
                if (null != var2) {
                  ActionRequest.field_l[32] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 77);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,33");
                if (null != var2) {
                  ActionRequest.field_l[33] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,34");
                if (null != var2) {
                  ActionRequest.field_l[34] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,35");
                if (null != var2) {
                  ActionRequest.field_l[35] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,36");
                if (var2 != null) {
                  ActionRequest.field_l[36] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,37");
                if (var2 != null) {
                  ActionRequest.field_l[37] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,38");
                if (null != var2) {
                  ActionRequest.field_l[38] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,39");
                if (null != var2) {
                  ActionRequest.field_l[39] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 19);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,40");
                if (null != var2) {
                  ActionRequest.field_l[40] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 46);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,41");
                if (null != var2) {
                  ActionRequest.field_l[41] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,42");
                if (null != var2) {
                  ActionRequest.field_l[42] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,43");
                if (null != var2) {
                  ActionRequest.field_l[43] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 31);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,44");
                if (var2 != null) {
                  ActionRequest.field_l[44] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,45");
                if (var2 != null) {
                  ActionRequest.field_l[45] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 4);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,46");
                if (null != var2) {
                  ActionRequest.field_l[46] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,47");
                if (null != var2) {
                  ActionRequest.field_l[47] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,48");
                if (null != var2) {
                  ActionRequest.field_l[48] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,49");
                if (null != var2) {
                  ActionRequest.field_l[49] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,50");
                if (null != var2) {
                  ActionRequest.field_l[50] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,51");
                if (var2 != null) {
                  ActionRequest.field_l[51] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,52");
                if (null != var2) {
                  ActionRequest.field_l[52] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,53");
                if (var2 != null) {
                  ActionRequest.field_l[53] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,54");
                if (null != var2) {
                  ActionRequest.field_l[54] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,55");
                if (var2 != null) {
                  ActionRequest.field_l[55] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,56");
                if (null != var2) {
                  ActionRequest.field_l[56] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,57");
                if (null != var2) {
                  ActionRequest.field_l[57] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,58");
                if (null != var2) {
                  ActionRequest.field_l[58] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,59");
                if (var2 != null) {
                  ActionRequest.field_l[59] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,60");
                if (null != var2) {
                  ActionRequest.field_l[60] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,61");
                if (null != var2) {
                  ActionRequest.field_l[61] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,62");
                if (null != var2) {
                  ActionRequest.field_l[62] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 47);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,63");
                if (var2 != null) {
                  ActionRequest.field_l[63] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,64");
                if (null != var2) {
                  ActionRequest.field_l[64] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,65");
                if (var2 != null) {
                  ActionRequest.field_l[65] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 85);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,66");
                if (var2 != null) {
                  ActionRequest.field_l[66] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 34);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,67");
                if (null != var2) {
                  ActionRequest.field_l[67] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,68");
                if (null != var2) {
                  ActionRequest.field_l[68] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,69");
                if (var2 != null) {
                  ActionRequest.field_l[69] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,70");
                if (var2 != null) {
                  ActionRequest.field_l[70] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,71");
                if (null != var2) {
                  ActionRequest.field_l[71] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 73);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,72");
                if (var2 != null) {
                  ActionRequest.field_l[72] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 13);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,73");
                if (var2 != null) {
                  ActionRequest.field_l[73] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,74");
                if (null != var2) {
                  ActionRequest.field_l[74] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 59);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,75");
                if (null != var2) {
                  ActionRequest.field_l[75] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,76");
                if (var2 != null) {
                  ActionRequest.field_l[76] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,77");
                if (null != var2) {
                  ActionRequest.field_l[77] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,78");
                if (var2 != null) {
                  ActionRequest.field_l[78] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 14);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,79");
                if (null != var2) {
                  ActionRequest.field_l[79] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 30);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,80");
                if (null != var2) {
                  ActionRequest.field_l[80] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,81");
                if (var2 != null) {
                  ActionRequest.field_l[81] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 57);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,82");
                if (var2 != null) {
                  ActionRequest.field_l[82] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,83");
                if (null != var2) {
                  ActionRequest.field_l[83] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 60);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,84");
                if (var2 != null) {
                  ActionRequest.field_l[84] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,85");
                if (var2 != null) {
                  ActionRequest.field_l[85] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,86");
                if (var2 != null) {
                  ActionRequest.field_l[86] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 43);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,87");
                if (null != var2) {
                  ActionRequest.field_l[87] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 77);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,88");
                if (null != var2) {
                  ActionRequest.field_l[88] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,89");
                if (var2 != null) {
                  ActionRequest.field_l[89] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,90");
                if (null != var2) {
                  ActionRequest.field_l[90] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,91");
                if (null != var2) {
                  ActionRequest.field_l[91] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,92");
                if (null != var2) {
                  ActionRequest.field_l[92] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,93");
                if (var2 != null) {
                  ActionRequest.field_l[93] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,94");
                if (null != var2) {
                  ActionRequest.field_l[94] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 67);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,95");
                if (null != var2) {
                  ActionRequest.field_l[95] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,96");
                if (var2 != null) {
                  ActionRequest.field_l[96] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,97");
                if (null != var2) {
                  ActionRequest.field_l[97] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,98");
                if (null != var2) {
                  ActionRequest.field_l[98] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 44);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,99");
                if (var2 != null) {
                  ActionRequest.field_l[99] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 54);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,100");
                if (var2 != null) {
                  ActionRequest.field_l[100] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 69);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,101");
                if (var2 != null) {
                  ActionRequest.field_l[101] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,102");
                if (var2 != null) {
                  ActionRequest.field_l[102] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 30);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,103");
                if (null != var2) {
                  ActionRequest.field_l[103] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 79);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,104");
                if (null != var2) {
                  ActionRequest.field_l[104] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,105");
                if (null != var2) {
                  ActionRequest.field_l[105] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,106");
                if (var2 != null) {
                  ActionRequest.field_l[106] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,107");
                if (null != var2) {
                  ActionRequest.field_l[107] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,108");
                if (null != var2) {
                  ActionRequest.field_l[108] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,109");
                if (null != var2) {
                  ActionRequest.field_l[109] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,110");
                if (null != var2) {
                  ActionRequest.field_l[110] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,111");
                if (null != var2) {
                  ActionRequest.field_l[111] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,112");
                if (var2 != null) {
                  ActionRequest.field_l[112] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 58);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,113");
                if (var2 != null) {
                  ActionRequest.field_l[113] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,114");
                if (var2 != null) {
                  ActionRequest.field_l[114] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,115");
                if (var2 != null) {
                  ActionRequest.field_l[115] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,116");
                if (null != var2) {
                  ActionRequest.field_l[116] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,117");
                if (null != var2) {
                  ActionRequest.field_l[117] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,118");
                if (null != var2) {
                  ActionRequest.field_l[118] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,119");
                if (null != var2) {
                  ActionRequest.field_l[119] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,120");
                if (null != var2) {
                  ActionRequest.field_l[120] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,121");
                if (var2 != null) {
                  ActionRequest.field_l[121] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,122");
                if (var2 != null) {
                  ActionRequest.field_l[122] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,123");
                if (var2 != null) {
                  ActionRequest.field_l[123] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,124");
                if (null != var2) {
                  ActionRequest.field_l[124] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 84);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,125");
                if (var2 != null) {
                  ActionRequest.field_l[125] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,126");
                if (var2 != null) {
                  ActionRequest.field_l[126] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,127");
                if (null != var2) {
                  ActionRequest.field_l[127] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,128");
                if (null != var2) {
                  ActionRequest.field_l[128] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,129");
                if (var2 != null) {
                  ActionRequest.field_l[129] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,130");
                if (null != var2) {
                  ActionRequest.field_l[130] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,131");
                if (null != var2) {
                  ActionRequest.field_l[131] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,132");
                if (null != var2) {
                  ActionRequest.field_l[132] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,133");
                if (null != var2) {
                  ActionRequest.field_l[133] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 91);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketdescriptions,134");
                if (var2 != null) {
                  ActionRequest.field_l[134] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 27);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TXT_BACKTO");
                if (var2 != null) {
                  IndexedDecodedSpriteSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 12);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_INVENTORY");
                if (null != var2) {
                  DialWidgetPainter.field_j = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_EQUIPMENT");
                if (var2 != null) {
                  GameClock.field_i = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 60);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_SPELLS");
                if (null != var2) {
                  AccountNameSelectionForm.field_I = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 17);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_POTIONS");
                if (var2 != null) {
                  AnimationFrameSetCacheEntry.field_o = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 92);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_ARMOUR");
                if (var2 != null) {
                  ScrollContainer.field_Lb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_WEAPONS");
                if (null != var2) {
                  ClientConnectionState.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_ACCESSORIES");
                if (var2 != null) {
                  ArchiveIndex.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 19);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_PLATE");
                if (null != var2) {
                  SummonRequest.field_x = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_PADDED");
                if (var2 != null) {
                  TutorialController.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_ENCHANTED");
                if (null != var2) {
                  SpriteDropdownControl.field_w = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -103);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_DRAGONSCALE");
                if (null != var2) {
                  ChannelBaseVolumeConsoleCommand.field_F = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_CAMOUFLAGE");
                if (null != var2) {
                  DualLinkedNode.field_p = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_RUNIC");
                if (var2 != null) {
                  NodeHashIterator.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 29);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_SACRIFICIAL");
                if (null != var2) {
                  UnitInfoPopup.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 49);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_MELEE");
                if (var2 != null) {
                  TerrainScatterSupport.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 23);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_RANGED");
                if (null != var2) {
                  SocialListEntry.field_Lb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_MAGIC");
                if (null != var2) {
                  ClientStateChecksumSupport.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_AERIAL");
                if (null != var2) {
                  DualLinkedNode.field_n = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 59);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_FLAME");
                if (var2 != null) {
                  SingleChildWidgetContainer.field_D = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_HEALING");
                if (var2 != null) {
                  MusicPatchNode.field_C = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_HARMING");
                if (null != var2) {
                  SingleChildWidgetContainer.field_G = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_MOVES");
                if (var2 != null) {
                  ConsoleCommand.field_y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_INSTANTS");
                if (var2 != null) {
                  TeamRoster.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_LANDSCAPE");
                if (var2 != null) {
                  BattleCamera.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 77);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_INFLUENCE");
                if (null != var2) {
                  MusicPatchEnvelope.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_RAYS");
                if (null != var2) {
                  ConsoleTokenSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 55);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_AURAS");
                if (var2 != null) {
                  DebugConsole.field_v = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_BOLTS");
                if (null != var2) {
                  AnimationSequence.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_RAINS");
                if (var2 != null) {
                  ConsoleTokenSupport.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_CURSE");
                if (null != var2) {
                  GameAppletShell.field_m = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_SOURCERY");
                if (var2 != null) {
                  ConsolePanel.field_i = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_PRAYER");
                if (var2 != null) {
                  MarkerSliderPainter.field_j = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_TONICS");
                if (null != var2) {
                  UnitAirAttackSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_TOXINS");
                if (null != var2) {
                  TileableNoiseGenerator.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_POLYMORPHICS");
                if (var2 != null) {
                  SpectateRoomRequestSupport.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREEN_MUTAGENS");
                if (null != var2) {
                  SpellMenuGroup.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 50);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_INVENTORY");
                if (null != var2) {
                  StructureTerrainSupport.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 19);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_EQUIPMENT");
                if (null != var2) {
                  ValidatedTextWidget.field_X = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 25);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_SPELLS");
                if (null != var2) {
                  CommunityTabGroup.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 13);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_POTIONS");
                if (null != var2) {
                  SelectionMenuLayoutSupport.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_ARMOUR");
                if (var2 != null) {
                  DelayedPacket.field_n = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 25);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_WEAPONS");
                if (null != var2) {
                  SessionTransitionSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_ACCESSORIES");
                if (null != var2) {
                  HuffmanCodec.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_PLATE");
                if (null != var2) {
                  SharedUiLoadingSupport.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_PADDED");
                if (var2 != null) {
                  QuinticFadeSupport.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_ENCHANTED");
                if (var2 != null) {
                  DiskCacheRequest.field_H = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_DRAGONSCALE");
                if (null != var2) {
                  AiActionCandidate.field_n = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_CAMOUFLAGE");
                if (null != var2) {
                  ScrollWidgetContainer.field_J = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_RUNIC");
                if (var2 != null) {
                  VerticalScrollbar.field_Kb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_SACRIFICIAL");
                if (null != var2) {
                  UnitLossCondition.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_MELEE");
                if (var2 != null) {
                  ScrollControlWidget.field_J = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_RANGED");
                if (var2 != null) {
                  HuffmanCodec.field_j = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_MAGIC");
                if (null != var2) {
                  SpriteSliceAndBlendSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_AERIAL");
                if (var2 != null) {
                  QuickChatCategoryRepository.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 41);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_FLAME");
                if (null != var2) {
                  ActionRequest.field_q = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 24);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_HEALING");
                if (var2 != null) {
                  AlphaWidgetContainer.field_L = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_HARMING");
                if (var2 != null) {
                  ViewportManager.field_u = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 52);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_MOVES");
                if (var2 != null) {
                  KeyboardInputListener.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_INSTANTS");
                if (var2 != null) {
                  TurnEffectEvent.field_A = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -106);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_LANDSCAPE");
                if (null != var2) {
                  IconTextComponent.field_Pb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_INFLUENCE");
                if (var2 != null) {
                  FullscreenFocusCanvas.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 61);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_RAYS");
                if (var2 != null) {
                  OctaveNoiseMap.field_q = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 89);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_AURAS");
                if (var2 != null) {
                  OctaveNoiseMap.field_s = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_BOLTS");
                if (var2 != null) {
                  CameraOverviewTarget.field_o = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_RAINS");
                if (null != var2) {
                  SpriteDropdownMenu.field_s = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_CURSE");
                if (null != var2) {
                  IterableNodeHashTable.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 22);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_SOURCERY");
                if (null != var2) {
                  BattleCharacter.field_v = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_PRAYER");
                if (var2 != null) {
                  AiInfluenceMap.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_TONICS");
                if (var2 != null) {
                  StatefulWidgetPainter.field_u = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_TOXINS");
                if (var2 != null) {
                  AccountNameCheckStatusSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 91);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_POLYMORPHICS");
                if (null != var2) {
                  SoundCache.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TTREED_MUTAGENS");
                if (var2 != null) {
                  CampaignQuicksave.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTMYTURN");
                if (null != var2) {
                  TurnTimerDial.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 36);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTYET");
                if (var2 != null) {
                  NameSuggestionList.field_I = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTENOUGHRUNES");
                if (null != var2) {
                  MovementPlanner.field_v = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 63);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOGOD");
                if (var2 != null) {
                  RegionAnchor.field_n = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 49);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_GODMAXED");
                if (var2 != null) {
                  IndexedDecodedSpriteSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOKBD");
                if (var2 != null) {
                  DebugConsole.field_B = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTARGET");
                if (var2 != null) {
                  MoveAttackAction.field_G = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOPORTALS");
                if (null != var2) {
                  MarkerSliderPainter.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 60);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOUNIT");
                if (null != var2) {
                  ScrollWidgetContainer.field_N = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTALLY");
                if (var2 != null) {
                  GuestSavePrompts.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 11);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTMINE");
                if (var2 != null) {
                  AccountNameCheckSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 16);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTENEMY");
                if (null != var2) {
                  MovementPresentation.field_r = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 84);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTKQUEEN");
                if (var2 != null) {
                  PasswordLoginCredentials.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTSONGSTRESS");
                if (var2 != null) {
                  RasterState.field_n = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 16);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTCYCLOPS");
                if (var2 != null) {
                  SpellCastEvent.field_A = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTOGRE");
                if (var2 != null) {
                  GlobalSpell.field_i = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTGOBLIN");
                if (null != var2) {
                  FullscreenConfirmationDialog.field_X = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTMOVED");
                if (var2 != null) {
                  PasswordLoginCredentials.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_LOWLEVEL");
                if (var2 != null) {
                  ToastMessage.field_s = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 65);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTOTHER");
                if (var2 != null) {
                  AccountNameSelectionForm.field_N = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTFLAT");
                if (var2 != null) {
                  BitReversalSupport.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 83);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTVILLAGE");
                if (null != var2) {
                  TextCursor.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTYOURS");
                if (null != var2) {
                  ActionSpell.field_k = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 29);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOREVOLT");
                if (null != var2) {
                  ContentTransitionStage.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTOWNED");
                if (var2 != null) {
                  SpellDefinitionTable.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 70);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOTRINKET");
                if (null != var2) {
                  StateChangeEvent.field_A = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_GOTONE");
                if (var2 != null) {
                  TurnSkipToggleSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_CLONING");
                if (var2 != null) {
                  ResourceClientErrorSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_CLONEIMMOBILE");
                if (var2 != null) {
                  CampaignParticipant.field_l = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_CLONEJADEVINE");
                if (var2 != null) {
                  CheckMarkWidgetPainter.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 56);
                }
            }
            void loadBattleErrorsAndEquipmentTutorialText() throws java.lang.RuntimeException {
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_ACCESSORYFAIL");
                if (var2 != null) {
                  DualNodeIterator.field_d = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 44);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_IRREGULARMOVE");
                if (var2 != null) {
                  TaggedMapData.field_i = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -98);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_ALREADYMOVED");
                if (null != var2) {
                  PreferencesReadRequest.field_o = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_ALREADYUSED");
                if (null != var2) {
                  QuickChatShortcutSupport.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_NOSOULSTONELEADER");
                if (null != var2) {
                  AiUnitPlanner.field_w = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_BLADEFLYER");
                if (var2 != null) {
                  LocalCoatSupport.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_BLADEMAGE");
                if (var2 != null) {
                  ChannelFadeTimeConsoleCommand.field_E = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 48);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_BOWNORANGE");
                if (var2 != null) {
                  AdaptiveMidiPcmStream.field_bb = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_HATNOMAGIC");
                if (null != var2) {
                  HotspotTextWidget.field_O = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 68);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_TALONSGROUNDED");
                if (var2 != null) {
                  SectorCacheStore.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 22);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_FIRENOFLAME");
                if (var2 != null) {
                  CampaignParticipant.field_r = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_CANNONFIREONLY");
                if (null != var2) {
                  EmptyWidgetPainter.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -116);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_POISONWEAPON");
                if (null != var2) {
                  BattleTutorial.field_r = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -122);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TERROR_POISONED");
                if (var2 != null) {
                  Unit.field_T = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 73);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_WORTH");
                if (null != var2) {
                  BattleViewportResizeHandler.field_f = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,0");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -114);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,1");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,2");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,3");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,4");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,5");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 101);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,6");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                if (param1 != 10207) {
                  finished = true; return;
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,7");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,8");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,9");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -96);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,10");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,11");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,12");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -97);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,13");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,14");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -124);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,15");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,16");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,17");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,18");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,19");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 86);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,20");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 16);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,21");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,22");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,23");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 3);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,24");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,25");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 102);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,26");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,27");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 60);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,28");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -127);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,29");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[29] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -120);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,30");
                if (null != var2) {
                  SpriteDropdownControl.equipmentTutorialMessages[30] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,31");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[31] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,32");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[32] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -110);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRT_TEXT,33");
                if (var2 != null) {
                  SpriteDropdownControl.equipmentTutorialMessages[33] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,0");
                if (null != var2) {
                  AttackOverlaySupport.field_b[0] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -128);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,1");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[1] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 88);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,2");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[2] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,3");
                if (null != var2) {
                  AttackOverlaySupport.field_b[3] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,4");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[4] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,5");
                if (null != var2) {
                  AttackOverlaySupport.field_b[5] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 40);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,6");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[6] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,7");
                if (null != var2) {
                  AttackOverlaySupport.field_b[7] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 58);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,8");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[8] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 7);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,9");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[9] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,10");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[10] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 57);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,11");
                if (null != var2) {
                  AttackOverlaySupport.field_b[11] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 47);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,12");
                if (null != var2) {
                  AttackOverlaySupport.field_b[12] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -125);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,13");
                if (null != var2) {
                  AttackOverlaySupport.field_b[13] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 68);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,14");
                if (null != var2) {
                  AttackOverlaySupport.field_b[14] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,15");
                if (null != var2) {
                  AttackOverlaySupport.field_b[15] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -115);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,16");
                if (null != var2) {
                  AttackOverlaySupport.field_b[16] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 46);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,17");
                if (null != var2) {
                  AttackOverlaySupport.field_b[17] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,18");
                if (null != var2) {
                  AttackOverlaySupport.field_b[18] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 93);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,19");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[19] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,20");
                if (null != var2) {
                  AttackOverlaySupport.field_b[20] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 95);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,21");
                if (null != var2) {
                  AttackOverlaySupport.field_b[21] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 79);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,22");
                if (null != var2) {
                  AttackOverlaySupport.field_b[22] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -104);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,23");
                if (null != var2) {
                  AttackOverlaySupport.field_b[23] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,24");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[24] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -105);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,25");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[25] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 42);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,26");
                if (null != var2) {
                  AttackOverlaySupport.field_b[26] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -121);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,27");
                if (var2 != null) {
                  AttackOverlaySupport.field_b[27] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "trinketcongratulations,28");
                if (null != var2) {
                  AttackOverlaySupport.field_b[28] = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 31);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_EQUIPMENTSELECT");
                if (var2 != null) {
                  LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 58);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_EQUIPMENTNAVIGATE");
                if (var2 != null) {
                  SocketResourceClient.field_x = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_EQUIPMENTSTOCK");
                if (var2 != null) {
                  QuickChatPhrase.field_x = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 63);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_STOCK");
                if (null != var2) {
                  MapRepository.field_j = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 20);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_STORE");
                if (var2 != null) {
                  QuickChatCategoryMenuSupport.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 23);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_EQUIPPED");
                if (null != var2) {
                  EventPresenterFactory.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 30);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_STOCKBUTTON");
                if (null != var2) {
                  CampaignRewardPreview.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 94);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_STOREBUTTON");
                if (var2 != null) {
                  SpriteButtonPainter.field_w = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -113);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_EQUIP");
                if (var2 != null) {
                  VertexNormal.field_h = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -117);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "LABEL_DEQUIP");
                if (null != var2) {
                  MeshObject.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 45);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "caption1");
                if (null != var2) {
                  BufferedSocket.field_a = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -109);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "caption2");
                if (var2 != null) {
                  LeaderEscortCondition.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 119);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "caption3");
                if (null != var2) {
                  IntPair.field_o = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -112);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "caption4");
                if (var2 != null) {
                  DropdownOptionList.field_S = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 10);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "caption5");
                if (null != var2) {
                  AlphaDecodedSpriteSupport.field_q = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "membersExpanionTitle");
                if (null != var2) {
                  RasterImageSurface.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -99);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PRESTIGE_LEVEL");
                if (var2 != null) {
                  ClientStateChecksumSupport.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 30);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PRESTIGE_GOT");
                if (null != var2) {
                  LocalAccountNameSupport.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -100);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PRESTIGE_DETAILS");
                if (var2 != null) {
                  SummonRequest.field_w = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 66);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "PRESTIGE_REFUNDING");
                if (var2 != null) {
                  ResourceClientSetupSupport.field_b = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 47);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_USE_MESSAGE");
                if (null != var2) {
                  RadialSummonItem.field_e = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 67);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_ACCESSORY_CONFIRM");
                if (var2 != null) {
                  MusicPatch.field_u = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 11);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_ARMOUR_CONFIRM");
                if (null != var2) {
                  MembershipExpansionScreen.field_o = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -123);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_WEAPON_CONFIRM");
                if (null != var2) {
                  DebouncedValidator.field_c = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -108);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_TURN_LIMIT");
                if (var2 != null) {
                  SocketResourceClient.field_w = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) 118);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_EMPTY");
                if (null != var2) {
                  TurnEffectEvent.field_y = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "TRINKET_SCROLL");
                if (null != var2) {
                  HuffmanCodec.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -126);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "MEMBERS_ONLY");
                if (var2 != null) {
                  CalendarSupport.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -107);
                }
                var2 = DropdownSelectorPainter.loadGameTextBytes(false, "ZERO");
                if (var2 != null) {
                  ConsolePanel.field_g = LobbyRoomControlSupport.decodeTextBytes(var2, (byte) -111);
                }
                DateOfBirthValidator.field_e = null;
            }
            void run() {
                var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
                try {
                  loadAchievementsAndGameOptionsText();
                  if (finished) return;
                  loadInstructionsCampaignAndActionText();
                  if (finished) return;
                  loadTerrainAndUnitNames();
                  if (finished) return;
                  loadUnitDescriptionsAndMenuText();
                  if (finished) return;
                  loadTutorialObjectivesAndTrinketNames();
                  if (finished) return;
                  loadTrinketDescriptionsAndSpellErrors();
                  if (finished) return;
                  loadBattleErrorsAndEquipmentTutorialText();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_4826_0 = (RuntimeException) (var2_ref);
                  stackIn_4826_1 = new StringBuilder().append("em.C(");
                  if (param0 == null) {
                    stackIn_4827_2 = "null";
                  } else {
                    stackIn_4827_2 = "{...}";
                  }
                  throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4826_0), ((StringBuilder) (Object) stackIn_4826_1).append(stackIn_4827_2).append(',').append(param1).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_4835_0 = (!GameAppletShell.field_k);
                  GameAppletShell.field_k = stackIn_4835_0;
                }
            }
        }
        GameTextLoadingState decompiledBody = new GameTextLoadingState(archive, obfuscationGuard);
        decompiledBody.run();
    }

    final static void readCampaignUnitOverride(CampaignDefinition campaign, byte obfuscationGuard, CipherPacketBuffer packet) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        CampaignUnitOverride var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CampaignParticipant var7 = null;
        CampaignUnitOverride[] var8 = null;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = new CampaignUnitOverride();
          var3.unitType = packet.readUnsignedByte(0);
          var3.displayName = packet.readNullCircumfixedString((byte) 121);
          var3.strength = packet.readUnsignedShort((byte) -104);
          if (obfuscationGuard != -7) {
            return;
          }
          var4 = packet.readUnsignedByte(0);
          var5 = 0;
          while (var5 < var4) {
            var6 = packet.readUnsignedByte(obfuscationGuard + 7);
            var7 = campaign.participants[var6];
            fieldTemp$0 = var7.overrideCount;
            var7.overrideCount = var7.overrideCount + 1;
            var7.unitOverrides[fieldTemp$0] = var3;
            if (var9 != 0) {
              return;
            }
            if (~var7.overrideCount == ~var7.unitOverrides.length) {
              var8 = var7.unitOverrides;
              var7.unitOverrides = new CampaignUnitOverride[10 + var8.length];
              ArrayBlockSupport.copyObjects(var8, 0, var7.unitOverrides, 0, var8.length);
            }
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("em.A(");
          if (campaign == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void drawTileStructuresAndEffects(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (DropdownArrowPainter.field_a) {
            var9_int = param4 + ConsoleExpression.field_p[param4];
            if (QuickChatMenuDisplaySupport.field_e[param4].hasExplicitOwner((byte) -79)) {
              var10 = QuickChatMenuDisplaySupport.field_e[param4].getExplicitOwner((byte) -102);
              var11 = 0;
              if (param6 == 0 ||
                var10 != QuickChatMenuDisplaySupport.field_e[param4 - 1].getExplicitOwner((byte) -34)) {
                var11 = var11 | 1;
              }
              if (0 == param2 ||
                QuickChatMenuDisplaySupport.field_e[-ResourceRequest.field_y + param4].getExplicitOwner((byte) -96) != var10) {
                var11 = var11 | 2;
              }
              if (param6 == -1 + ResourceRequest.field_y ||
                ~QuickChatMenuDisplaySupport.field_e[param4 + 1].getExplicitOwner((byte) -95) != ~var10) {
                var11 = var11 | 4;
              }
              if (~(ConsoleParseException.field_c - 1) == ~param2 ||
                QuickChatMenuDisplaySupport.field_e[ResourceRequest.field_y + param4].getExplicitOwner((byte) -55) != var10) {
                var11 = var11 | 8;
              }
              MatchSetupPanel.drawTileOwnershipEdges(var10, false, 20 + param3, param7 + 40, var11, true);
            }
            regionExit1: {
              var10 = EditableTextWidget.field_Q[QuickChatMenuDisplaySupport.field_e[param4].terrainType];
              if (var10 > -1) {
                var11 = QuickChatMenuDisplaySupport.field_e[param4].ownerPlayer;
                if (CipherPacketBuffer.currentBattlefield != null) {
                  var11 = CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var11, -1);
                }
                if (var10 == 2) {
                  QuickChatCategoryMenuSupport.activeStructureSprites[17].drawFadedToColour(param7, -40 + param3, param0, param8);
                  StructureGlowRenderer.drawStructureGlow(param7 + 20, (byte) -95, ProxyAuthenticationRequiredException.field_b + param4, var11, param3);
                  if (var11 > -1) {
                    ResourceRequest.drawUnitModelPreview(ActionRequest.unitModels[76][var11], false, -40 + param3, PaletteRegionMap.field_g, 128, 150, param7, (MeshData) null, -10374);
                  }
                  QuickChatCategoryMenuSupport.activeStructureSprites[16].drawFadedToColour(param7, -40 + param3, param0, param8);
                }
                if (var10 == 3) {
                  if (var11 > -1) {
                    StructureGlowRenderer.drawStructureGlow(param7 + 20, (byte) -74, param4 + ProxyAuthenticationRequiredException.field_b, var11, param3);
                  }
                  ResourceRequest.drawUnitModelPreview(ActionRequest.unitModels[76][var11], false, param3 - 40, PaletteRegionMap.field_g, 128, 150, param7, (MeshData) null, -10374);
                }
                if ((var10 != 3 ||
                  var13 != 0) &&
                  (!param1)) {
                  if (var10 == 1) {
                    QuickChatCategoryMenuSupport.activeStructureSprites[8 + var9_int % 3].drawFadedToColour(param7, -50 + param3, param0, param8);
                    if (var11 <= -1) {
                      break regionExit1;
                    }
                    LoginCredentialStagingSupport.drawAnimatedPlayerFlag(7816226, 21 + param7, var11, param4 + ProxyAuthenticationRequiredException.field_b, param3 - 30);
                  }
                  if (var10 != 1 ||
                    var13 != 0) {
                    if (8 != var10) {
                      switch (var10) {
                        case 9:
                          QuickChatCategoryMenuSupport.activeStructureSprites[var9_int % 2 + 14].draw(param7, -40 + param3);
                          if (var13 == 0) {
                            break regionExit1;
                          }
                          break;
                        case 0:
                          QuickChatCategoryMenuSupport.activeStructureSprites[0 + var9_int % 8].drawFadedToColour(param7, param3 - 40, param0, param8);
                          if (var11 <= -1) {
                            break regionExit1;
                          }
                          LoginCredentialStagingSupport.drawAnimatedPlayerFlag(7816226, 20 + param7, var11, param4 + ProxyAuthenticationRequiredException.field_b, param3 + 10);
                          if (var13 == 0) {
                            break regionExit1;
                          }
                          break;
                        case 4:
                          UnitUnlockPreviewModel.drawFoliageCluster(param3 + 20, ConsoleExpression.field_p[param4] + param4, param8, 40 + param7, param0, false);
                          if (var13 == 0) {
                            break regionExit1;
                          }
                        default:
                          break regionExit1;
                        case 6:
                          DualNodeDeque.drawConnectedStructureSprites(param2, param7, (byte) -107, param6, param3);
                          if (var13 == 0) {
                            break regionExit1;
                          }
                          break;
                      }
                    }
                    var12 = -15;
                    if (LoginAndTutorialSetupSupport.field_f == 4) {
                      var12 -= 22;
                      if (var13 != 0) {
                        var12 -= 10;
                      }
                    } else {
                      var12 -= 10;
                    }
                    QuickChatCategoryMenuSupport.activeStructureSprites[var9_int % 2 + 11].drawFadedToColour(param7, -50 + param3, param0, param8);
                    if (var11 > -1) {
                      LoginCredentialStagingSupport.drawAnimatedPlayerFlag(7816226, param7 + 22, var11, param4 + ProxyAuthenticationRequiredException.field_b, param3 + var12);
                    }
                  }}}
            }
            if (QuickChatMenuDisplaySupport.field_e[param4].hasCorpse(-26)) {
              ConsoleTokenCursor.boneSprites[var9_int % 4].drawFadedToColour(param7, -25 + param3, param0, param8);
            }
            var11 = CipherPacketBuffer.currentBattlefield.getTileEffects(param5 + 31, param2, param6, -1);
            var12 = QuickChatMenuDisplaySupport.field_e[param4].terrainType;
            if (4 != var12 &&
              var12 != 6 &&
              var12 != 2 &&
              0 != (var11 & 1)) {
              RadialSummonItem.drawKalphiteSpriteCluster(var9_int, param5 ^ 117, param3, ProxyAuthenticationRequiredException.field_b, param7);
            }
          }
          if (param5 != 0) {
            TickCounter.readCampaignUnitOverride((CampaignDefinition) null, (byte) -46, (CipherPacketBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var9), "em.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void releaseTickCounterStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          if (param0 != 1) {
            field_c = (String) null;
          }
          field_e = null;
          field_c = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "em.B(" + param0 + ')');
        }
    }

    TickCounter(int limit) {
        try {
          this.limit = limit;
          this.elapsedTicks = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "em.<init>(" + limit + ')');
        }
    }

    static {
        field_e = "Theme: ";
        field_c = "Skip";
        field_d = "Invite players";
        field_b = "<%0> is not a member, and cannot play with the current options.";
    }
}
