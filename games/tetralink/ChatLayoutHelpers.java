/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatLayoutHelpers {
    static String field_f;
    static int field_c;
    static int field_e;
    static UiComponent field_d;
    static String field_b;
    static int field_a;

    public static void releaseStatics(int param0) {
        field_f = null;
        field_d = null;
        int var1 = -42 / ((param0 - 68) / 41);
        field_b = null;
    }

    final static void updateReportAbuseDialog(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param1 != -1) {
          java.awt.Component var5 = (java.awt.Component) null;
          ChatLayoutHelpers.detachKeyboardListeners((java.awt.Component) null, true);
        }
        if (PasswordValidator.field_y != null) {
          var3 = PasswordValidator.field_y.updateAndPollReason(param0, false);
          if (var3 != -2) {
            if (var3 != -1) {
              var4 = PasswordValidator.field_y.isMuteSelected((byte) 121) ? 1 : 0;
              SocialTabsPanel.sendAbuseReport(-117, PasswordValidator.field_y.getEnteredText((byte) 26), var3, var4 != 0, PasswordValidator.field_y.field_Ob, param2);
            }
            PasswordValidator.field_y = null;
            PasswordLoginCredentials.closePlayerContextMenu((byte) 43);
          }
        }
    }

    final static DisplayMode[] queryDisplayModes(PlatformTaskDispatcher param0, int param1) {
        int var5 = 0;
        DisplayMode[] stackIn_3_0 = null;
        DisplayMode[] stackIn_10_0 = null;
        DisplayMode[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        DisplayMode[] var4 = null;
        DisplayMode var6 = null;
        int var7 = 0;
        AsyncRequest var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = TetraLink.field_J;
        try {
          if (!param0.supportsFullscreen((byte) -84)) {
            stackIn_3_0 = new DisplayMode[]{};
            return stackIn_3_0;
          }
          var8 = param0.requestDisplayModes(false);
          while (var8.field_d == 0) {
            AnimationSequence.sleepMillis(false, 10L);
          }
          if (var8.field_d == 2) {
            stackIn_10_0 = new DisplayMode[]{};
            return stackIn_10_0;
          }
          var10 = (int[]) (var8.field_f);
          var9 = var10;
          var3 = var9;
          var4 = new DisplayMode[var10.length >> 2];
          if (param1 != 37956674) {
            ChatLayoutHelpers.releaseStatics(-102);
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new DisplayMode();
            var4[var5] = var6;
            var6.field_k = var3[var5 << 2];
            var6.field_e = var3[(var5 << 2) + 1];
            var6.field_h = var3[(var5 << 2) + 2];
            var6.field_i = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("mn.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void detachKeyboardListeners(java.awt.Component param0, boolean param1) {
        if (!param1) {
          return;
        }
        try {
          param0.removeKeyListener(LoadingStatusHelpers.field_a);
          param0.removeFocusListener(LoadingStatusHelpers.field_a);
          GameRoomPanelHelpers.field_b = -1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void layoutChatAndSidePanels(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = TetraLink.field_J;
        try {
          var6_int = 485 + param2 + 8 - (-2 - param1 - 8);
          IterableNodeHashTable.field_f.setBounds((byte) -104, -6 + var6_int, 3, IsaacCipher.field_a.field_R - 6, 3);
          var7 = -5 + IterableNodeHashTable.field_f.field_R;
          TopLevelContainerHelpers.field_d.setBounds((byte) -109, param1 + param2 + 487, var7 - param3, param3, 5);
          PageReloadHelpers.field_g.setBounds((byte) -112, -param2 + (TopLevelContainerHelpers.field_d.field_Hb - MessageDialogContent.field_L.field_Hb), 0, param3, param2);
          MessageDialogContent.field_L.setBounds((byte) -96, MessageDialogContent.field_L.field_Hb, 0, param3, param2 + PageReloadHelpers.field_g.field_Hb);
          var7 = var7 - (2 + param3);
          TriangleMesh.field_M.setBoundsAndLayout(485 + (param2 - (-2 - param1)), param1, var7 - 5, true, 5, 5, 2);
          if (null != TextLayoutLine.field_e) {
            TextLayoutLine.field_e.setBounds(TriangleMesh.field_M.field_R, TriangleMesh.field_M.field_yb, -124, TriangleMesh.field_M.field_M, TriangleMesh.field_M.field_Hb);
          }
          var8 = -var6_int + IsaacCipher.field_a.field_Hb - param2;
          var9 = var8 / 2;
          var10 = param4 + var9 + param2;
          var11 = 0;
          if (param0 != -7) {
            return;
          }
          for (var12 = 0; var12 < 6; var12++) {
            if (5 <= var12 ||
              null != KeyEventHelpers.field_f[var12]) {
              var13 = 3 + (2 + IsaacCipher.field_a.field_R - 6) * var11 / (QueuedListRequest.field_r + 1);
              var11++;
              var7Lifetime1 = (-6 + (IsaacCipher.field_a.field_R + 2)) * var11 / (QueuedListRequest.field_r + 1) + 3 + (-2 - var13);
              if (var12 >= 5) {
                NameAlphabetTable.field_e.setBounds((byte) -88, var8, var13, var7Lifetime1, var6_int);
              } else {
                KeyEventHelpers.field_f[var12].setBounds((byte) -111, var8, var13, var7Lifetime1, var6_int);
                LobbyGame.field_oc[var12].setBounds((byte) -103, -param2 + var9, 0, var7Lifetime1, param2);
                HuffmanCodec.field_f[var12].setBounds((byte) -93, param4, param5, -param5 + var7Lifetime1 - param5, var9);
                CheckboxPainter.field_o[var12].setBounds((byte) -108, -var10 - param2 + var8, param5, var7Lifetime1 - param5 - param5, var10);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var6), "mn.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_f = "Message lobby";
        field_e = 5;
        field_b = "The game options are not all set.";
    }
}
