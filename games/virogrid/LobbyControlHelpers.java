/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyControlHelpers {
    static int field_a;
    static String field_c;
    static PcmSample field_b;

    final static void setSymmetricTableEntry(int param0, int param1, int param2, int param3) {
        if (0 > param2) {
          param2 = -param2;
        }
        if (param3 < 0) {
          param3 = -param3;
        }
        if (param3 < param2) {
          EmailValidator.field_x[(param2 + 1) * param2 / 2 + param3] = param1;
          if (param0 != 2) {
            LobbyControlHelpers.setSymmetricTableEntry(29, 120, 84, -51);
            return;
          }
          return;
        }
        EmailValidator.field_x[param2 + param3 * (param3 + 1) / 2] = param1;
        if (param0 != 2) {
          LobbyControlHelpers.setSymmetricTableEntry(29, 120, 84, -51);
          return;
        }
    }

    final static void updateLobbyControls(int param0, boolean param1, boolean param2, boolean param3) {
        SpriteWidget stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        SpriteWidget stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        SpriteWidget stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        SpriteWidget stackIn_49_0 = null;
        boolean stackIn_50_1 = false;
        SpriteWidget stackIn_56_0 = null;
        boolean stackIn_57_1 = false;
        SpriteWidget stackIn_61_0 = null;
        boolean stackIn_62_1 = false;
        WidgetLayerStack.layoutLobbySlidePanels(-17491);
        if (DiskCacheWorker.field_i >= 0) {
          MusicPatchEnvelope.field_f.field_V = MenuScreen.formatIndexedText(new String[]{Integer.toString(DiskCacheWorker.field_i)}, StatSubmission.field_m, 2);
          stackIn_7_0 = WidgetContainer.field_y;
          stackIn_8_1 = (param3) && (!param2) && (!ScrollPaneWithFooter.field_Gb) && (null == AudioSetupHelpers.field_d) && (QueuedRequest.field_h == null);
          ((SpriteWidget) (Object) stackIn_7_0).updateInputFullScreen(stackIn_8_1, (byte) 127);
          stackIn_14_0 = CipherPacketBuffer.field_p;
          stackIn_15_1 = (param3) && (!param2) && (!ScrollPaneWithFooter.field_Gb) && (null == AudioSetupHelpers.field_d) && (QueuedRequest.field_h == null);
          ((SpriteWidget) (Object) stackIn_14_0).updateInputFullScreen(stackIn_15_1, (byte) 121);
          stackIn_19_0 = WidgetStyleLayer.field_a;
          stackIn_20_1 = (param3) && (!param2) && (ScrollPaneWithFooter.field_Gb);
          ((SpriteWidget) (Object) stackIn_19_0).updateInputFullScreen(stackIn_20_1, (byte) 100);
        } else {
          MusicPatchEnvelope.field_f.field_V = null;
          stackIn_49_0 = WidgetContainer.field_y;
          stackIn_50_1 = (param3) && (!param2) && (!ScrollPaneWithFooter.field_Gb) && (null == AudioSetupHelpers.field_d) && (QueuedRequest.field_h == null);
          ((SpriteWidget) (Object) stackIn_49_0).updateInputFullScreen(stackIn_50_1, (byte) 127);
          stackIn_56_0 = CipherPacketBuffer.field_p;
          stackIn_57_1 = (param3) && (!param2) && (!ScrollPaneWithFooter.field_Gb) && (null == AudioSetupHelpers.field_d) && (QueuedRequest.field_h == null);
          ((SpriteWidget) (Object) stackIn_56_0).updateInputFullScreen(stackIn_57_1, (byte) 121);
          stackIn_61_0 = WidgetStyleLayer.field_a;
          stackIn_62_1 = (param3) && (!param2) && (ScrollPaneWithFooter.field_Gb);
          ((SpriteWidget) (Object) stackIn_61_0).updateInputFullScreen(stackIn_62_1, (byte) 100);
        }
        DecodedSpriteHelpers.field_b.field_c.processTabPresses(0);
        if (param1) {
          LobbyControlHelpers.setSymmetricTableEntry(-103, -19, 6, 22);
        }
        if (0 != InputSetupHelpers.field_b.field_nb) {
          AccountCreationSupport.field_c = true;
        }
        if (0 != GrowableIntList.field_a.field_nb) {
          if (ArchiveBytesHelpers.field_a) {
            ValidationIndicator.sendPlayRatedGameRequest(param0, -7093);
          } else {
            if (0 < NameCharacterHelpers.field_d) {
              ValidationIndicator.sendPlayRatedGameRequest(param0, -7093);
            } else {
              if (2 <= ReflectionCheckHelpers.field_d &&
                ResizableDialog.field_Y[12]) {
                ValidationIndicator.sendPlayRatedGameRequest(param0, -7093);
              }
            }
          }
        }
        if (ResizableDialog.field_R.field_nb != 0) {
          if (UiLayerInputHelpers.field_b.length == 1 &&
            UiLayerInputHelpers.field_b[0] != QuickChatMenu.field_Vb) {
            QuickChatMenu.field_Vb = UiLayerInputHelpers.field_b[0];
          }
          PacketRequestHelpers.sendBytesPacket((byte) 78, 0, IntrusiveDeque.field_e, param0, true, QuickChatMenu.field_Vb);
        }
        if (HotspotTextWidget.field_H.field_nb != 0) {
          ScrollPaneWithFooter.field_Gb = false;
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 != 110) {
          return;
        }
        field_b = null;
    }

    static {
        field_c = "Accept draw";
    }
}
