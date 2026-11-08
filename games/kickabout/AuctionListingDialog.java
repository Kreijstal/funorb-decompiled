/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AuctionListingDialog extends MessageDialog {
    static IntrusiveNodeHashTable[] field_L;
    AuctionListing field_J;
    static String field_K;
    private boolean field_G;
    static int field_I;
    static r field_H;
    static String field_F;

    AuctionListingDialog(AuctionListing param0, boolean param1) {
        super(21, !param0.getPlayerStats(-73).isEmpty(-2) ? param0.getPlayerStats(-128) : null);
        String var6 = null;
        UiLayoutNode dupTemp$0 = null;
        String var4 = null;
        int var5 = 0;
        try {
          this.field_G = param1 ? true : false;
          this.field_J = param0;
          var6 = AccountMessagePanel.a(this.field_J.getListingType((byte) 37), false, this.field_J.b(6));
          this.a(var6, this.field_t, this.field_D, -87, this.field_u);
          dupTemp$0 = this.field_i[0];
          dupTemp$0.field_s = dupTemp$0.field_s - 30;
          var4 = pg.a(false, 21)[1];
          var5 = 20 + un.field_d.a(var4);
          this.field_i[1] = eo.createRenderedButton(var4, 7126504, un.field_d, var5, false);
          this.field_i[1].field_J = this.field_i[0].field_J;
          this.field_i[1].field_s = this.field_i[0].field_s + (this.field_i[0].field_q + 20);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void handleResult(int param0, int param1) {
        if (param0 < 60) {
          return;
        }
        super.handleResult(62, param1);
        if (!PlayArea.a(100) &&
          this.field_G) {
          or.field_d.b(60, (byte) 104);
          this.field_J.writeToPacket(or.field_d, 5);
        }
        BuyPlayerDialog.field_K.addLast(this.field_J, 3);
        ((AuctionsScreen) (VertexNormal.getMenuScreen(-104, 16))).field_H = -1L;
        if (param1 == 1) {
          DelayedServerPacket.a(16, true, -2);
        }
    }

    final int dialogWidth(int param0) {
        if (param0 != -1379118556) {
          AuctionListingDialog.d(true);
          return 400;
        }
        return 400;
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_F = null;
          field_H = null;
          field_L = null;
          field_K = null;
          return;
        }
        AuctionListingDialog.d(false);
        field_F = null;
        field_H = null;
        field_L = null;
        field_K = null;
    }

    static {
        int var0 = 0;
        field_L = new IntrusiveNodeHashTable[7];
        for (var0 = 0; var0 < 7; var0++) {
          field_L[var0] = new IntrusiveNodeHashTable(256);
        }
        field_K = "Waiting to receive the game state...";
        field_H = new r();
        field_F = "Find opponents";
    }
}
