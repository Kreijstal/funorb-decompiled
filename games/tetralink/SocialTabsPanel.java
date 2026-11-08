/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialTabsPanel {
    static String field_f;
    static int field_e;
    static String field_d;
    static QuickChatCommandType field_c;
    TabbedPanel field_g;
    static int field_h;
    static ClientProtocolStage field_a;
    static BinaryBitmapFont field_b;

    final static char decodeSingleByteCharacter(byte param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        var2 = 255 & param1;
        if (param0 != -13) {
          field_a = (ClientProtocolStage) null;
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (var2 < 128) {
            return (char)var2;
          }
          if (160 > var2) {
            var3 = PacketDiagnosticsHelpers.field_o[var2 - 128];
            if (var3 == 0) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (160 <= var2) {
          return (char)var2;
        }
        var3Lifetime1 = PacketDiagnosticsHelpers.field_o[var2 - 128];
        if (var3Lifetime1 == 0) {
          var3Lifetime1 = 63;
        }
        var2Lifetime1 = var3Lifetime1;
        return (char)var2Lifetime1;
    }

    final static void closeGameSocket(boolean param0) {
        if (null != TriangleSpanHelpers.field_e) {
          TriangleSpanHelpers.field_e.close(-15488);
          TriangleSpanHelpers.field_e = null;
          if (param0) {
            SocialTabsPanel.releaseStatics(-109);
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        SocialTabsPanel.releaseStatics(-109);
    }

    final static void sendAbuseReport(int param0, String param1, int param2, boolean param3, long param4, int param5) {
        int var7_int = 0;
        try {
          QuickChatHelpDialog.field_Lb.writeCipheredByte(param5, (byte) -92);
          QuickChatHelpDialog.field_Lb.position = QuickChatHelpDialog.field_Lb.position + 1;
          var7_int = QuickChatHelpDialog.field_Lb.position;
          QuickChatHelpDialog.field_Lb.writeLong(-1, param4);
          QuickChatHelpDialog.field_Lb.writeString(param1, 0);
          QuickChatHelpDialog.field_Lb.writeByte(param2, false);
          if (param0 >= -95) {
            field_c = (QuickChatCommandType) null;
          }
          QuickChatHelpDialog.field_Lb.writeByte(param3 ? 1 : 0, false);
          QuickChatHelpDialog.field_Lb.backpatchByteLength(-var7_int + QuickChatHelpDialog.field_Lb.position, -2);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "mk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void layoutPanel(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_g.setBoundsAndLayout(0, param2, param1, var7, param0, param4, var6);
        LabelPairWidget.field_Kb.setBounds((byte) -108, GzipDecompressor.field_d.field_Hb, 0, GameKeyHandler.field_d, 0);
        Js5Transport.field_i.setBounds((byte) -110, -2 + (-2 + GzipDecompressor.field_d.field_Hb) - MouseInputHandler.field_e - 80, GameKeyHandler.field_d + 2, 18, 0);
        CameraAndChatHelpers.field_b.setBounds((byte) -126, 82 + MouseInputHandler.field_e, GameKeyHandler.field_d + 2, 18, -80 + (GzipDecompressor.field_d.field_Hb - MouseInputHandler.field_e - 2));
        if (param3 > 52) {
          TopLevelContainerHelpers.field_f.setBoundsAndLayout(-2328, 0, 20, -20 + (-GameKeyHandler.field_d + (GzipDecompressor.field_d.field_R - 2)), GzipDecompressor.field_d.field_Hb, 2, 20 + (GameKeyHandler.field_d + 2), MouseInputHandler.field_e);
          BufferedSocket.field_n.layoutColumns(20, 2, MouseInputHandler.field_e, 2);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == -2) {
          field_f = null;
          field_d = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
        SocialTabsPanel.sendAbuseReport(-19, (String) null, -33, true, 19L, 86);
        field_f = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    SocialTabsPanel(String param0, UiComponent param1) {
        String[] var3 = null;
        UiComponent[] var4 = null;
        try {
          var3 = new String[]{param0, MiscTextGlobals.field_a, WeightedLruCache.field_g};
          var4 = new UiComponent[]{param1, GzipDecompressor.field_d, (UiComponent) ((Object) BufferedSocket.field_n)};
          this.field_g = new TabbedPanel(0L, DropTargetWidget.field_O, var3, CaptionedContainer.field_S, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Off";
        field_c = new QuickChatCommandType(7, 0, 1, 1);
        field_h = 20;
        field_a = new ClientProtocolStage();
    }
}
