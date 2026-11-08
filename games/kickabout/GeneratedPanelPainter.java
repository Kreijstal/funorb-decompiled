/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GeneratedPanelPainter extends NineSlicePanelPainter {
    static String field_i;
    private int field_h;
    private Sprite field_k;
    static String field_j;
    static Trinket[] field_g;

    public static void releaseStatics(byte param0) {
        field_j = null;
        field_g = null;
        field_i = null;
        if (param0 <= 100) {
          field_i = (String) null;
        }
    }

    final static void a(IntrusiveNode param0, IntrusiveNode param1, byte param2) {
        try {
          if (param0.field_b != null) {
            param0.c((byte) -109);
          }
          param0.field_d = param1.field_d;
          param0.field_b = param1;
          param0.field_b.field_d = param0;
          param0.field_d.field_b = param0;
          int var3_int = -56 % ((84 - param2) / 35);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void drawPanel(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 3) {
          IntrusiveNode var7 = (IntrusiveNode) null;
          GeneratedPanelPainter.a((IntrusiveNode) null, (IntrusiveNode) null, (byte) 126);
          if (null == this.field_k) {
            AccountRegistrationPanel.createButtonStateSprite(false, (byte) -52, this.field_h, param3, 13386922).draw(param0, param2);
            return;
          }
          if (this.field_k.field_o != param3) {
            AccountRegistrationPanel.createButtonStateSprite(false, (byte) -52, this.field_h, param3, 13386922).draw(param0, param2);
            return;
          }
          return;
        }
        if (null == this.field_k) {
          AccountRegistrationPanel.createButtonStateSprite(false, (byte) -52, this.field_h, param3, 13386922).draw(param0, param2);
          return;
        }
        if (this.field_k.field_o != param3) {
          AccountRegistrationPanel.createButtonStateSprite(false, (byte) -52, this.field_h, param3, 13386922).draw(param0, param2);
          return;
        }
    }

    GeneratedPanelPainter(boolean param0) {
        this.field_h = param0 ? 1 : 0;
    }

    final static void b(byte param0) {
        int var1 = (ColorQuantizationBox.field_a - 640) / 2;
        int var2 = TextPromptDialog.field_Bb * TextPromptDialog.field_Bb;
        int var3 = var2 - NotificationPanelPositionSupport.field_a * NotificationPanelPositionSupport.field_a;
        if (param0 > 81) {
          UiKeyRoutingSupport.field_c.setBounds(true, 199, var1 - 199 * var3 / var2, 90, -90 + (SoftwareRasterizer.field_f - 124));
          AuctionPriceLimits.field_d.setBounds(true, 438, 202 + var1 + 438 * var3 / var2, 0, -4 + (-120 + SoftwareRasterizer.field_f));
          return;
        }
        field_j = (String) null;
        UiKeyRoutingSupport.field_c.setBounds(true, 199, var1 - 199 * var3 / var2, 90, -90 + (SoftwareRasterizer.field_f - 124));
        AuctionPriceLimits.field_d.setBounds(true, 438, 202 + var1 + 438 * var3 / var2, 0, -4 + (-120 + SoftwareRasterizer.field_f));
    }

    static {
        field_i = "Click to turn off the buyout for this auction";
        field_j = "Off";
    }
}
