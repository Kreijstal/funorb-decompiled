/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteState {
    int field_b;
    int field_g;
    static String field_f;
    int field_i;
    int field_a;
    int field_c;
    int field_d;
    static QuickChatHelpPanel field_h;
    static long field_e;

    final static void a(int param0, Archive param1) {
        AnimatedPanel var5 = null;
        AnimatedPanel var6 = null;
        AnimatedPanel var3 = null;
        try {
          BufferedSocket.field_i = SpriteResourceSupport.loadSpriteByName(2, param1, "basic", "display_name_changed");
          ClientPacketFlushSupport.field_a = new SocialListPanel(0L, AccountNoticeKind.field_g, ByteArrayReadRequest.field_k, SocketArchiveNetworkClient.field_u);
          ClientLobbyResources.field_a = new SocialListPanel(0L, AccountNoticeKind.field_g, QuaternaryListSequence.field_f, TutorialVictoryChecker.field_o);
          OpacityWidget.field_A = new AnimatedPanel(0L, (AnimatedPanel) null);
          RecklessAi.field_p = new AnimatedPanel(0L, SpriteState.field_u);
          RecklessAi.field_p.field_y = 1;
          BattleSnapshot.field_t = new AnimatedPanel(0L, SliderWidget.field_N, IntroLoadingSupport.field_c);
          FleetMove.field_F = new AnimatedPanel(0L, QuickChatMenu.field_Cb, GalaxyMap.field_i);
          PlayerReportPanel.field_Ib = new AnimatedPanel(0L, StatefulWidgetTheme.field_w);
          OpacityWidget.field_A.addChild(4, RecklessAi.field_p);
          OpacityWidget.field_A.addChild(4, BattleSnapshot.field_t);
          OpacityWidget.field_A.addChild(4, FleetMove.field_F);
          OpacityWidget.field_A.addChild(param0 ^ 27774, ClientPacketFlushSupport.field_a);
          OpacityWidget.field_A.addChild(4, PlayerReportPanel.field_Ib);
          if (param0 != 27770) {
            field_h = (QuickChatHelpPanel) null;
          }
          ClientPacketFlushSupport.field_a.field_Db.field_zb.copyFrom(SpriteState.field_u, false);
          var5 = ClientPacketFlushSupport.field_a.field_Db.field_zb;
          var6 = var5;
          ClientPacketFlushSupport.field_a.field_Db.field_zb.field_G = 1;
          var6.field_y = 1;
          ClientLobbyResources.field_a.field_Db.field_zb.copyFrom(SpriteState.field_u, false);
          var3 = ClientLobbyResources.field_a.field_Db.field_zb;
          ClientLobbyResources.field_a.field_Db.field_zb.field_G = 1;
          var3.field_y = 1;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "bq.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1 = MouseInputHandler.field_f * MouseInputHandler.field_f;
        int var3 = 30 / ((param0 - 69) / 54);
        int var2 = var1 - LabeledChildWidget.field_J * LabeledChildWidget.field_J;
        int var4 = NodeHashTableIterator.field_f + var2 * (-NodeHashTableIterator.field_f + DerelictMapGenerator.field_m) / var1;
        DateValidationSupport.field_c.setTarget(640, 120, (byte) 121, var4, NotificationEntry.field_h);
        SocketArchiveNetworkClient.a(-24 + DerelictMapGenerator.field_m, 0, DateValidationSupport.field_a, 3, 640, 5, TextLayout.field_b);
    }

    public static void clearStatics(int param0) {
        field_f = null;
        if (param0 != 1) {
          Archive var2 = (Archive) null;
          IndexedSpriteState.a(30, (Archive) null);
          field_h = null;
          return;
        }
        field_h = null;
    }

    abstract void a(int param0, int param1);

    abstract void drawAlpha(int param0, int param1, int param2);

    static {
        field_f = "you lost 0 fleets in the attack";
    }
}
