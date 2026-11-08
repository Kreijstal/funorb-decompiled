/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenuFactory {
    static int[] field_a;
    static String field_b;

    final static void setLoginExtraText(boolean param0, String param1) {
        try {
          BroadcastServerCommand.field_A = param1;
          if (!param0) {
            QuickChatMenuFactory.createSolidPanelSprites(-69, -48, -126, true, -8);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "te.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          field_b = (String) null;
        }
    }

    final static void writeAchievementSubmission(int param0, AchievementSubmission param1, byte param2) {
        CipherPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = FootballerAiOverlaySupport.field_d;
          var5.writeIsaacByte(param0, (byte) 114);
          var5.field_n = var5.field_n + 1;
          var4 = var5.field_n;
          var5.writeByte(107, 1);
          var5.writeByte(param2 ^ -4, param1.field_g);
          var5.writeByte(param2 ^ -22, param1.field_f);
          var5.writeInt(-121, param1.field_e);
          var5.writeInt(-40, param1.field_k);
          var5.writeInt(-62, param1.field_i);
          var5.writeInt(-91, param1.field_j);
          if (param2 != -112) {
            field_b = (String) null;
          }
          var5.appendCrc32(var4, false);
          var5.backpatchByteLength(62, var5.field_n - var4);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "te.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static Sprite[] createSolidPanelSprites(int param0, int param1, int param2, boolean param3, int param4) {
        Sprite[] var6 = new Sprite[9];
        Sprite[] var5 = var6;
        if (param3) {
          return (Sprite[]) null;
        }
        Sprite dupTemp$0 = BroadcastServerCommand.createSolidSprite(param4, (byte) -96, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        Sprite dupTemp$1 = BroadcastServerCommand.createSolidSprite(param2, (byte) -96, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param1 != 0) {
          var6[4] = BroadcastServerCommand.createSolidSprite(param1, (byte) -96, 64);
        }
        return var5;
    }

    final static CascadingMenu createPhraseMenu(int param0, UiLayoutNode param1, int[] param2, UiLayoutNode param3, UiLayoutNode param4) {
        int var10_int = 0;
        Object stackIn_7_0 = null;
        CascadingMenu stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        CascadingMenu[] var8 = null;
        int var9 = 0;
        Exception var10 = null;
        QuickChatPhraseDefinition var11 = null;
        int var12 = 0;
        UiLayoutNode var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var12 = Kickabout.field_G;
        try {
          var5_int = param2.length;
          var6 = new String[var5_int];
          var15 = new char[var5_int];
          var14 = var15;
          var7 = var14;
          var8 = new CascadingMenu[var5_int];
          var9 = 49;
          try {
            for (var10_int = 0; var10_int < var5_int; var10_int++) {
              var11 = TournamentLobbyScreen.field_j.getPhrase(119, param2[var10_int]);
              var6[var10_int] = var11.getDisplayText((byte) -79);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = null;
            return (CascadingMenu) (stackIn_7_0);
          }
          if (param0 >= -91) {
            var13 = (UiLayoutNode) null;
            QuickChatMenuFactory.createPhraseMenu(-59, (UiLayoutNode) null, (int[]) null, (UiLayoutNode) null, (UiLayoutNode) null);
          }
          stackIn_11_0 = new CascadingMenu(0L, param1, param4, param3, var8, param2, var6, var15);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("te.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, boolean param5, int param6, boolean param7, int param8, boolean param9, int param10, boolean param11) {
        if (param1 > -64) {
          AchievementSubmission var13 = (AchievementSubmission) null;
          QuickChatMenuFactory.writeAchievementSubmission(80, (AchievementSubmission) null, (byte) -28);
        }
        RenderedFootballer.updateSharedInterface(-79, param4, param5, 16777215, param2, param8, param9, 16777215, param6, param3, param11, param7, param10, param0);
    }

    static {
        field_a = new int[]{250, 660, 1050, 1050};
        field_b = "Waiting for fonts";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$20586b1b86c8(int param0, int param1, int param2, boolean param3, int param4, boolean param5, int param6, boolean param7, int param8, boolean param9, int param10, boolean param11) {
        if (param1 > -64) {
          AchievementSubmission var13 = (AchievementSubmission) null;
          QuickChatMenuFactory.writeAchievementSubmission(80, (AchievementSubmission) null, (byte) -28);
        }
        RenderedFootballer.updateSharedInterface(-79, param4, param5, 16777215, param2, param8, param9, 16777215, param6, param3, param11, param7, param10, param0);
    }
}
