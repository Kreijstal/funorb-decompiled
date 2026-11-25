/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginRequestSupport {
    static String field_a;
    static String field_b;

    final static boolean passesPasswordChecks(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (NodeSequence.a(param0, -31654)) {
            return false;
          }
          if (IntrusiveDeque.a(param0, (byte) 24)) {
            return false;
          }
          if (OpacityWidget.a(-92, param0)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (GraphicsSettings.containsForwardOrReversed(param2, param1 + 12075, param0)) {
            return false;
          }
          if (param1 != -12076) {
            return true;
          }
          if (ChatMessage.a(param0, (byte) -53, param2)) {
            return false;
          }
          if (!Bzip2State.a(param0, 127, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("gi.B(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void updateTutorialSceneTransition(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        TutorialConditionalText[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2_int = 0;
        TutorialScene var2 = null;
        TutorialScene var3 = null;
        int var4 = 0;
        TutorialConditionalText[] var5 = null;
        int var6 = 0;
        int var2_intLifetime1;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (PanelNode.field_q == WeightedLruCache.field_g) {
            if (null != WeightedLruCache.field_g) {
              ChatAreaLayoutSupport.field_c = ChatAreaLayoutSupport.field_c + 16;
              var5 = WeightedLruCache.field_g.field_f;
              var1 = var5;
              if (var1 != null) {
                for (var2_int = 0; var5.length > var2_int; var2_int++) {
                  if (0 == ClientException.field_f[var2_int] &&
                    WidgetStyle.a(var5[var2_int].field_c, (byte) -125)) {
                    ClientException.field_f[var2_int] = 1;
                    BattleSnapshot.a(0);
                  }
                }
              }
            }
          } else {
            fieldTemp$0 = BufferedCacheFile.field_m + 1;
            BufferedCacheFile.field_m = BufferedCacheFile.field_m + 1;
            if (fieldTemp$0 >= 32) {
              LobbyOptionSupport.commitTutorialSceneTransition((byte) -10);
            }
          }
          if (param0) {
            return;
          }
          if (MeshData.hasTutorialFlag(0, "unplaced")) {
            if (SocketArchiveNetworkClient.markTutorialEventSeen("unplaced", -126)) {
              DefendTask.a(1, DiplomacyNotice.findTutorialSceneByTag("unplaced", -21502));
            }
          } else {
            if (MeshData.hasTutorialFlag(0, "losegame")) {
              DefendTask.a(1, DiplomacyNotice.findTutorialSceneByTag("lose", -21502));
            }
          }
          ClientContextMenuSupport.field_a.clear(0);
          if (WeightedLruCache.field_g == PanelNode.field_q) {
            LobbyUiSupport.field_e = TargetedChatMessage.field_j;
            AccountFieldValue.field_f = ArchiveRequest.field_r;
            ByteArrayNode.field_k = BytePayloadNode.field_h;
            AttackTask.field_o = DerelictMapGenerator.field_q;
          } else {
            AccountFieldValue.field_f = QuickChatPhraseRegistry.a(ArchiveRequest.field_r, 32, BufferedCacheFile.field_m, MenuButton.field_B, 0);
            ByteArrayNode.field_k = QuickChatPhraseRegistry.a(BytePayloadNode.field_h, 32, BufferedCacheFile.field_m, GameSpriteResources.field_a, 0);
            LobbyUiSupport.field_e = QuickChatPhraseRegistry.a(TargetedChatMessage.field_j, 32, BufferedCacheFile.field_m, ClientOverlayDrawSupport.field_d, 0);
            stackIn_28_0 = DerelictMapGenerator.field_q;
            stackIn_28_1 = 32;
            AttackTask.field_o = QuickChatPhraseRegistry.a(stackIn_28_0, stackIn_28_1, BufferedCacheFile.field_m, SliderPainter.field_b, 0);
          }
          if (null != GameSpriteResources.field_i) {
            var1_int = 1;
            var6 = 0;
            var2_intLifetime1 = var6;
            while (var6 < ClientException.field_f.length) {
              if (ClientException.field_f[var6] > 0) {
                ClientException.field_f[var6] = ClientException.field_f[var6] + 1;
              }
              if (ClientException.field_f[var6] < 48) {
                var1_int = 0;
              }
              var6++;
            }
            if (var1_int != 0) {
              var2 = WeightedLruCache.field_g.field_l;
              if (var2 == null &&
                ImageProducerRasterBuffer.field_i > 0) {
                fieldTemp$1 = ImageProducerRasterBuffer.field_i - 1;
                ImageProducerRasterBuffer.field_i = ImageProducerRasterBuffer.field_i - 1;
                var2 = LobbyOptionSupport.field_b[fieldTemp$1];
              }
              if (!ArchiveConnectionRetrySupport.field_b) {
                MenuList.a(1546006977, var2);
                return;
              }
              ArchiveConnectionRetrySupport.field_b = false;
              var3 = LobbyOptionSupport.field_b[ImageProducerRasterBuffer.field_i];
              if (var3 != null &&
                var3 != WeightedLruCache.field_g) {
                MenuList.a(1546006977, var3);
                return;
              }
              MenuList.a(1546006977, var2);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1_ref), "gi.C(" + param0 + ')');
        }
    }

    final static void writeLoginRequest(int param0, boolean param1, boolean param2, int param3, ChatMessage param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          IntroRenderSupport.field_b[0] = Bzip2State.field_u.nextInt();
          IntroRenderSupport.field_b[1] = Bzip2State.field_u.nextInt();
          ProgressDialog.field_cb.position = 0;
          IntroRenderSupport.field_b[3] = (int)Dialog.field_I;
          IntroRenderSupport.field_b[2] = (int)(Dialog.field_I >> 32);
          ProgressDialog.field_cb.writeInt(11135, IntroRenderSupport.field_b[0]);
          ProgressDialog.field_cb.writeInt(11135, IntroRenderSupport.field_b[1]);
          ProgressDialog.field_cb.writeInt(11135, IntroRenderSupport.field_b[2]);
          ProgressDialog.field_cb.writeInt(11135, IntroRenderSupport.field_b[3]);
          QuickChatCategoryRegistry.a(24, ProgressDialog.field_cb);
          if (param3 > -36) {
            return;
          }
          ProgressDialog.field_cb.writeShort(param0, 255);
          param4.write(ProgressDialog.field_cb, (byte) 118);
          LobbyOptionSupport.field_f.position = 0;
          if (param1) {
            LobbyOptionSupport.field_f.writeByte(18, (byte) -106);
          } else {
            LobbyOptionSupport.field_f.writeByte(16, (byte) -89);
          }
          LobbyOptionSupport.field_f.position = LobbyOptionSupport.field_f.position + 2;
          var5_int = LobbyOptionSupport.field_f.position;
          LobbyOptionSupport.field_f.writeInt(11135, AccountFieldValue.field_b);
          LobbyOptionSupport.field_f.writeLong(-16426, BytePayloadNode.field_l);
          var6 = 0;
          if (DualLinkDeque.field_b) {
            var6 = var6 | 1;
          }
          if (StandardAi.field_a) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (DraggableWidget.field_H != null) {
            var6 = var6 | 16;
          }
          LobbyOptionSupport.field_f.writeByte(var6, (byte) -93);
          var7 = GameAssetSetupSupport.readSettingsCookie((byte) 70, GameScreen.getHostApplet((byte) 125));
          if (var7 == null) {
            var7 = "";
          }
          LobbyOptionSupport.field_f.writeString(var7, (byte) 0);
          if (DraggableWidget.field_H != null) {
            LobbyOptionSupport.field_f.writeMarkedString((byte) 95, DraggableWidget.field_H);
          }
          GarrisonTask.a(25050, LobbyOptionSupport.field_f, ChatPanelLayoutSupport.field_a, ProgressDialog.field_cb, ResizingDialog.field_V);
          LobbyOptionSupport.field_f.patchLengthShort(-549342136, LobbyOptionSupport.field_f.position - var5_int);
          ClientPacketFlushSupport.flushOutboundPacketsFullInts(-1, 82);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("gi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void clearStatics(int param0) {
        if (param0 != 32) {
          String var2 = (String) null;
          LoginRequestSupport.passesPasswordChecks((String) null, -107, (String) null);
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Select destination system in the same territory or connected by hyperspace link.";
    }
}
