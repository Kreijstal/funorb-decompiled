/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyBuilderHelpers {
    static int field_b;
    static int[] field_d;
    static String field_a;
    static java.awt.Image field_e;
    static String[] field_c;

    final static RasterSetupHelpers parseDigits(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        RasterSetupHelpers stackIn_12_0 = null;
        RasterSetupHelpers stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          if (param0 == -58) {
            stackIn_14_0 = IntKeyLookup.field_b;
            return stackIn_14_0;
          }
          stackIn_12_0 = (RasterSetupHelpers) null;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ik.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void buildChatPanel(boolean param0, int param1) {
        SceneTabStrip.field_Ob = !param0 ? new ChatPanel(SpriteFrame.field_b, Checkbox.field_M) : new ChatPanel(CipherPacketBuffer.field_r, WidgetStyleLayer.field_c);
        BufferedMessage.field_m = new SceneWidget(0L, (SceneWidget) null);
        BufferedMessage.field_m.addChild(SceneTabStrip.field_Ob.field_c, 89);
        int var2 = 34 / ((param1 - 24) / 48);
        BufferedMessage.field_m.addChild(IntrusiveNodeHashTable.field_o, 55);
        IconTextSceneWidget.field_Fb = new SceneWidget(0L, EffectVolumeHelpers.field_d);
        Js5ArchiveManager.field_g = new SceneWidget(0L, (SceneWidget) null);
        IconTextSceneWidget.field_Fb.addChild(MembershipOfferScreen.field_t, 61);
        IconTextSceneWidget.field_Fb.addChild(Js5ArchiveManager.field_g, 89);
        Js5ArchiveManager.field_g.addChild(StatefulTextPainter.field_s, 25);
        Js5ArchiveManager.field_g.addChild(ScreenSwitchHelpers.field_d, 43);
        MusicCrossfadeStream.layoutZoomedLobby(125, param0);
    }

    final static void sendByteRequest(int param0, int param1) {
        CipherPacketBuffer var2 = StatusMessageHelpers.field_e;
        var2.writeOpcode((byte) -66, param0);
        var2.writeByte(1, (byte) -127);
        var2.writeByte(param1, (byte) -44);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_a = (String) null;
        }
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    final static void resetCurrentPlayer(int param0) {
        if (param0 != 0) {
          field_d = (int[]) null;
        }
        if (StatefulTextPainter.field_p < 6) {
          GradientBarButton.field_O.setCurrentPlayer(param0 ^ -4207, -1);
        }
    }

    final static void buildLobbyRoot(byte param0) {
        if (param0 != -85) {
          return;
        }
        DraggableWidget.field_H = new SceneWidget(0L, (SceneWidget) null);
        if (SpriteDecodeHelpers.field_a) {
          DraggableWidget.field_H.addChild(QuickChatCategoryCache.field_c, 14);
        }
        DraggableWidget.field_H.addChild(StatefulTextPainter.field_s, 39);
        GameOptionType.field_h = new ChatPanel(NanoFrameClock.field_p, DraggableWidget.field_H);
        BufferedSocket.field_d = new SceneWidget(0L, (SceneWidget) null);
        BufferedSocket.field_d.addChild(GameOptionType.field_h.field_c, param0 ^ -74);
        BufferedSocket.field_d.addChild(IconHighlightPainter.field_b, param0 ^ -54);
        LobbyLayoutHelpers.layoutLobby((byte) -120);
    }

    static {
        field_a = "Gives you and your minions extra damage resistance";
        field_d = new int[8192];
    }
}
