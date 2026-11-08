/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FinalFrameHelpers {
    static String field_d;
    static String field_c;
    static boolean field_a;
    static String[] field_b;

    final static void handleNameCheckReply(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          SceneListPanel.field_Gb = DiskCacheWorker.field_g;
          if (param0 != 20657) {
            var6 = (String[]) null;
            FinalFrameHelpers.handleNameCheckReply(49, (String) null, (String[]) null, 7);
          }
          if (param3 != 255) {
            if (100 <= param3 &&
              param3 <= 105) {
              var8 = param2;
              LobbyLayoutHelpers.setNameSuggestions(var8, param0 ^ -20688);
              SecondaryNodeDequeIterator.field_i = ServerMessage.createWithLines((byte) 120, param2);
              return;
            }
            SecondaryNodeDequeIterator.field_i = CipherPacketBuffer.createMessage(param0 - 20657, param3, param1);
            return;
          }
          stackIn_6_0 = param0 ^ 12212;
          stackIn_7_1 = !(13 <= UiComponent.field_u);
          SecondaryNodeDequeIterator.field_i = LoginMethodHelpers.createMessageWithFlag(stackIn_6_0, stackIn_7_1);
          var7 = (String[]) null;
          LobbyLayoutHelpers.setNameSuggestions((String[]) null, -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("fl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
        FinalFrameHelpers.releaseStatics(false);
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void loadFinalFrameImage(int param0, ResourceArchive param1) {
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (param0 != -2389) {
            field_a = true;
          }
          var2 = new Sprite(param1.getNamedFile("", "final_frame.jpg", -1), (java.awt.Component) ((Object) LoginMessageTable.field_c));
          var3 = var2.field_q;
          var4 = var2.field_y;
          SpriteFrame.pushClipState(65280);
          SpellProjectile.field_E = new Sprite(var3, 3 * var4 / 4);
          SpellProjectile.field_E.makeRasterTarget();
          var2.drawOpaque(0, 0);
          LinkButtonPainter.field_l = new Sprite(var3, -SpellProjectile.field_E.field_y + var4);
          LinkButtonPainter.field_l.makeRasterTarget();
          var2.drawOpaque(0, -SpellProjectile.field_E.field_y);
          LinkButtonPainter.field_l.field_o = SpellProjectile.field_E.field_y;
          QuickChatCategory.popClipState(-15405);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "fl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_c = "Reading Book of Overlight";
    }
}
