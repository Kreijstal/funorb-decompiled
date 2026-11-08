/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PromotionDialog extends MessageDialog {
    static String field_H;
    static Sprite field_G;
    static int[] field_I;
    static String field_F;

    PromotionDialog(int param0) {
        super(10);
        String var6 = Integer.toString(LoginCredentials.field_d[param0]);
        String var2 = var6;
        String var3 = ConsoleTokenCursor.field_h[param0];
        String var4 = LoginDialog.substitutePlaceholders(-18, ListingRowCache.field_e[10], new String[]{var6, var3});
        Sprite var5 = WriteIntegersCommand.field_E[param0];
        this.setMessageContent(var4, this.field_t, var5, -110, this.field_u);
        this.open(ModelMaterialDecoder.messageButtonCount(this.field_y, 1), SharedPanelFactory.getMessageButtonLabels(false, 10), 1054928844);
    }

    final static void resendLookupRequests(int param0, byte param1) {
        int var3 = 0;
        LookupRecordUpdate var4 = null;
        LookupQuery var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          var4 = (LookupRecordUpdate) (NamedValueContainer.field_c.first(24009));
          while (var4 != null) {
            SocialTabsPanel.writeLookupRecordUpdate(var4, param0, true);
            var4 = (LookupRecordUpdate) (NamedValueContainer.field_c.next(33));
          }
          if (param1 >= -120) {
            PromotionDialog.releaseStatics(96);
          }
          var5 = (LookupQuery) (MidiPcmStream.field_M.first(24009));
          while (var5 != null) {
            ByteStorage.writeLookupQuery(param0, var5, (byte) -114);
            var5 = (LookupQuery) (MidiPcmStream.field_M.next(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "hg.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int pollAccountUiAction(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          RankingsRequest.field_l.processPointerFrame(AuctionLogEntry.field_n, 31947, PacketBuffer.field_i, true);
          var1_int = -43 % ((param0 + 39) / 43);
          RankingsRequest.field_l.advanceModalAnimations(2);
          while (TexturedPanelPainter.pollKeyEvent(-59)) {
            RankingsRequest.field_l.dispatchKeyInput(ClassDescriptorSupport.field_c, (byte) -88, FixedQuaternion.field_e);
          }
          if (BlackFadeScreen.field_j != -1) {
            var2 = BlackFadeScreen.field_j;
            IndexedSpriteState.setAccountMenuMode(38, -1);
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          if (DiagnosticsOverlaySupport.field_g) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (PitchAppearanceSupport.field_a == PlayerModelPreview.field_f) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!DualLinkDequeIterator.field_e.isComplete((byte) -80)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (ClubStateFactory.field_f != PlayerModelPreview.field_f) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_21_0 = 2;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "hg.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 22100) {
          field_F = null;
          field_G = null;
          field_I = null;
          field_H = null;
          return;
        }
        field_I = (int[]) null;
        field_F = null;
        field_G = null;
        field_I = null;
        field_H = null;
    }

    static {
        field_I = new int[8192];
        field_F = "total: <%0> ";
        field_H = "Class: ";
        field_G = new Sprite(32, 64);
    }
}
