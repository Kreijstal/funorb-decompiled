/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class TabbedOverlayPanel {
    TabbedPane field_c;
    static int field_e;
    static String field_d;
    static String field_b;
    static boolean field_a;
    static MeshMaterial[] field_f;

    final void layoutSocialPanel(int param0, int param1, int param2, byte param3, int param4) {
        int var7 = 0;
        int var6 = 24;
        if (param3 == -74) {
          var7 = 5;
          this.field_c.setTabbedPaneBounds(9736, param0, param1, var7, var6, param4, param2);
          DisplayNameRequestHelpers.field_b.setBounds(UpgradeAccessHelpers.field_f, 0, SimUnit.field_O.field_zb, 0, -3344);
          AccountTextGlobals.field_f.setBounds(18, 2 + UpgradeAccessHelpers.field_f, -80 + SimUnit.field_O.field_zb - DualLinkNode.field_o - 4, 0, -3344);
          PlayerContextMenu.field_c.setBounds(18, UpgradeAccessHelpers.field_f + 2, DualLinkNode.field_o + 82, -80 + (SimUnit.field_O.field_zb - (DualLinkNode.field_o + 2)), param3 ^ 3398);
          StrongCacheEntry.field_B.setPaneFooterBounds(param3 + 74, DualLinkNode.field_o, SimUnit.field_O.field_z + (-UpgradeAccessHelpers.field_f - 22), SimUnit.field_O.field_zb, 2, 0, 2 + (UpgradeAccessHelpers.field_f + 20), 20);
          UsernameSuggestionsPanel.field_L.layoutPaneFooter(2, (byte) 123, DualLinkNode.field_o, 20);
          return;
        }
    }

    final static void drawAbilityCard(int param0, int param1, PlayerProfile param2, int param3, int param4, int param5) {
        BinaryBitmapFont var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var10 = null;
        LightningBolt var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        try {
          var6 = MatchingTextValidator.field_w;
          var7 = param2.field_t[param0];
          var8 = PendingStatusRequest.getMaxResearchLevel(param0, param1 ^ 30026);
          InstructionsScreen.field_n.drawBlended(param4, param3, param5);
          BirthDateValidator.field_p.drawAlpha(param4 + 71, param3 + 17, param5);
          if (param5 < 255) {
            BirthDateInputWidget.field_X.drawAlpha(22 + param4, param3 + 77, param5);
          } else {
            BirthDateInputWidget.field_X.drawFadedToColour(param4 + 22, param3 + 77, 150 + (ValidatedTextInputWidget.sine(PowerupEvent.field_m * 128, -18924) >> 11), 65535);
          }
          if (MenuInputState.field_h == null) {
            MenuInputState.field_h = new Sprite(12, 32);
            RasterEffectHelpers.pushSpriteTarget(MenuInputState.field_h);
            SoftwareRasterizer.fillRectGradient(0, 0, 12, 16, 65280, 16776960);
            SoftwareRasterizer.fillRectGradient(0, 16, 12, 17, 16776960, 16711680);
            RasterEffectHelpers.popRaster();
          }
          if (param1 != -29990) {
            TabbedOverlayPanel.releaseStatics(-92);
          }
          MenuInputState.field_h.drawBlended(param4 + 80, 36 + param3, param5);
          var9 = var7 * 31 / var8;
          SoftwareRasterizer.fillRectAlpha(param4 + 80, param3 + 36, 12, 31 - var9, 1, param5);
          MarkerSliderPainter.field_b[-44 + param0 + 26].drawBlended(18 + param4, param3 + 44, param5);
          ((BitmapFont) ((Object) var6)).drawParagraphAlpha(AccountServerResult.field_f[param0], param4 + 4, -7 + param3, 54, 90, 16777215, 1, param5, 1, 1, ((BitmapFont) ((Object) var6)).maxAscent + ((BitmapFont) ((Object) var6)).maxDescent);
          var10 = new Random();
          if (var7 >= var8) {
            if (RandomHelpers.nextBoundedInt((byte) -98, var10, 7) != 0) {
              return;
            }
            var11 = new LightningBolt(85 + param4, param3 + 18, 8, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
            var11.field_k = 39 * param4 + (PowerupEvent.field_m + param3 * 17);
            var12 = 200 * param5 >> 8;
            var13 = 128 * var12;
            var14 = var12 * 64;
            var13 = var13 >> 8;
            var15 = 255 * var12;
            var14 = var14 >> 8;
            var13 = var13 << 16;
            var15 = var15 >> 8;
            var14 = var14 << 8;
            var11.draw(var15 | (var13 | var14), 85 + param4, true, 18 + param3, 16777215, -1963);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qh.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        if (param0 != -22) {
          PlayerProfile var2 = (PlayerProfile) null;
          TabbedOverlayPanel.drawAbilityCard(-33, -32, (PlayerProfile) null, 92, -111, -115);
        }
    }

    TabbedOverlayPanel(String param0, UiComponent param1) {
        String[] var3 = null;
        UiComponent[] var4 = null;
        try {
          var3 = new String[]{param0, BufferedFile.field_p, LobbyDrawHelpers.field_e};
          var4 = new UiComponent[]{param1, SimUnit.field_O, (UiComponent) ((Object) UsernameSuggestionsPanel.field_L)};
          this.field_c = new TabbedPane(0L, ProxySocketConnector.field_i, var3, NanoTickClock.field_l, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "<%0> has withdrawn the request to join.";
        field_a = true;
        field_d = "Remove name";
    }
}
