/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateUsernameCredentials extends UsernameCredentials {
    static String field_s;
    static int field_t;
    static BitmapFont field_u;
    static long field_r;

    AlternateUsernameCredentials(long param0, String param1) {
        super(param0, param1);
    }

    public static void releaseStatics(boolean param0) {
        field_s = null;
        if (!param0) {
          AlternateUsernameCredentials.cosine(-112, -101);
          field_u = null;
          return;
        }
        field_u = null;
    }

    final static int cosine(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 <= -122) {
          if (param1 < 4096) {
            if (param1 >= 2048) {
              stackIn_19_0 = -PortalView.field_K[param1 - 2048];
            } else {
              stackIn_19_0 = PortalView.field_K[2048 - param1];
            }
            return stackIn_19_0;
          }
          if (param1 < 6144) {
            stackIn_15_0 = -PortalView.field_K[6144 - param1];
          } else {
            stackIn_15_0 = PortalView.field_K[-6144 + param1];
          }
          return stackIn_15_0;
        }
        field_s = (String) null;
        if (param1 < 4096) {
          if (param1 >= 2048) {
            stackIn_9_0 = -PortalView.field_K[param1 - 2048];
          } else {
            stackIn_9_0 = PortalView.field_K[2048 - param1];
          }
          return stackIn_9_0;
        }
        if (param1 < 6144) {
          stackIn_5_0 = -PortalView.field_K[6144 - param1];
        } else {
          stackIn_5_0 = PortalView.field_K[-6144 + param1];
        }
        return stackIn_5_0;
    }

    final static void layoutLobbyWidgets(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        LobbyPlayer.field_Qb = SoftwareRasterizer.height;
        MessageMenuScreen.field_l = SoftwareRasterizer.width;
        LobbySlideLayout.positionSlidingPanels(param0 ^ 196);
        AwtEventPumpHelpers.field_b.layoutSocialPanel(0, GameHud.field_k.field_zb, 0, (byte) -74, -40 + (GameHud.field_k.field_z - 2));
        RasterStackHelpers.field_b.setBounds(UpgradeAccessHelpers.field_f, 0, BitPackedArrayHelpers.field_g.field_zb, 0, param0 - 3347);
        int var1 = UpgradeAccessHelpers.field_f + 2;
        FramePainter.field_b.setBounds(BitPackedArrayHelpers.field_g.field_z - (!GradientOutlineTextPainter.field_u ? 0 : var1), GradientOutlineTextPainter.field_u ? var1 : 0, BitPackedArrayHelpers.field_g.field_zb, 0, -3344);
        NodeHashTableIterator.layoutLobbySocialPanels(false);
        FriendListHelpers.field_u.setBounds(40, GameHud.field_k.field_z - 40, GameHud.field_k.field_zb, 0, -3344);
        if (param0 != 3) {
          field_t = -52;
          LocalGameWorld.field_O.setBounds(30, 0, LobbyRequestHelpers.field_a.field_zb, 0, -3344);
          SocialListRow.field_Lb.setBounds(-30 + (-40 + LobbyRequestHelpers.field_a.field_z - 2), 30, LobbyRequestHelpers.field_a.field_zb, 0, -3344);
          PacketBuffer.field_g.setBounds(30, 5, 68, 5, -3344);
          DialSelectorWidget.field_M.setBounds(30, 5, 78, 75, -3344);
          LaboratoryScreen.field_l.setBounds(30, 5, 48, 155, param0 ^ -3341);
          DualLinkNodeHashTable.field_d.setBounds(30, 5, 48, 205, -3344);
          var2 = !GradientOutlineTextPainter.field_u ? 200 : 250;
          InflaterDecompressor.field_h.setBounds(30, 5, -var2 + 363, var2 + 5, -3344);
          AgeValidator.field_w.setBounds(30, 5, LobbyRequestHelpers.field_a.field_zb - 5 - 5 - 365, 370, -3344);
          SimEntity.field_H.setBoundsAndLayout(DualLinkNode.field_o, 2, -10 + SocialListRow.field_Lb.field_zb, 5, -37 + SocialListRow.field_Lb.field_z - 5, param0 ^ -31468, 37);
          var3 = (2 + LobbyRequestHelpers.field_a.field_zb) / 2;
          PasswordValidator.field_t.setBounds(40, -40 + LobbyRequestHelpers.field_a.field_z, var3 - 2, 0, param0 - 3347);
          if (!GradientOutlineTextPainter.field_u) {
            var3 = 0;
          }
          ArrayWidgetGroup.field_L.setBounds(40, -40 + LobbyRequestHelpers.field_a.field_z, -var3 + LobbyRequestHelpers.field_a.field_zb, var3, -3344);
          return;
        }
        LocalGameWorld.field_O.setBounds(30, 0, LobbyRequestHelpers.field_a.field_zb, 0, -3344);
        SocialListRow.field_Lb.setBounds(-30 + (-40 + LobbyRequestHelpers.field_a.field_z - 2), 30, LobbyRequestHelpers.field_a.field_zb, 0, -3344);
        PacketBuffer.field_g.setBounds(30, 5, 68, 5, -3344);
        DialSelectorWidget.field_M.setBounds(30, 5, 78, 75, -3344);
        LaboratoryScreen.field_l.setBounds(30, 5, 48, 155, param0 ^ -3341);
        DualLinkNodeHashTable.field_d.setBounds(30, 5, 48, 205, -3344);
        var2Lifetime1 = !GradientOutlineTextPainter.field_u ? 200 : 250;
        InflaterDecompressor.field_h.setBounds(30, 5, -var2Lifetime1 + 363, var2Lifetime1 + 5, -3344);
        AgeValidator.field_w.setBounds(30, 5, LobbyRequestHelpers.field_a.field_zb - 5 - 5 - 365, 370, -3344);
        SimEntity.field_H.setBoundsAndLayout(DualLinkNode.field_o, 2, -10 + SocialListRow.field_Lb.field_zb, 5, -37 + SocialListRow.field_Lb.field_z - 5, param0 ^ -31468, 37);
        var3Lifetime1 = (2 + LobbyRequestHelpers.field_a.field_zb) / 2;
        PasswordValidator.field_t.setBounds(40, -40 + LobbyRequestHelpers.field_a.field_z, var3Lifetime1 - 2, 0, param0 - 3347);
        if (!GradientOutlineTextPainter.field_u) {
          var3Lifetime1 = 0;
        }
        ArrayWidgetGroup.field_L.setBounds(40, -40 + LobbyRequestHelpers.field_a.field_z, -var3Lifetime1 + LobbyRequestHelpers.field_a.field_zb, var3Lifetime1, -3344);
    }

    final CredentialKind getCredentialKind(int param0) {
        if (param0 != 7) {
          return (CredentialKind) null;
        }
        return FontPaletteHelpers.field_f;
    }

    static {
        field_s = "Focused";
        field_t = (int)(Math.sqrt(2.0) * 9.0) + 1;
    }
}
