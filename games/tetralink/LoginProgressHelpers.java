/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginProgressHelpers {
    static PcmSample field_d;
    static int[] field_c;
    static int field_f;
    static String field_a;
    static boolean field_b;
    static BinaryBitmapFont field_g;
    static int field_e;

    final static void updateTextPromptDialog(boolean param0, int param1) {
        if (param1 < -116) {
          if (null != BevelFrameSpriteFactory.field_b) {
            BevelFrameSpriteFactory.field_b.drawFullScreen(param0, 256);
          }
          return;
        }
        field_d = (PcmSample) null;
        if (null != BevelFrameSpriteFactory.field_b) {
          BevelFrameSpriteFactory.field_b.drawFullScreen(param0, 256);
        }
    }

    final static void sendShortRequest(int param0, byte param1, int param2) {
        BitPacketBuffer var3 = null;
        BitPacketBuffer var3Lifetime1;
        if (param1 <= 94) {
          String var4 = (String) null;
          LoginProgressHelpers.openLoginProgress((String) null, false, false);
          var3 = QuickChatHelpDialog.field_Lb;
          var3.writeCipheredByte(param0, (byte) -92);
          var3.writeByte(3, false);
          var3.writeByte(8, false);
          var3.writeShort(param2, false);
          return;
        }
        var3Lifetime1 = QuickChatHelpDialog.field_Lb;
        var3Lifetime1.writeCipheredByte(param0, (byte) -92);
        var3Lifetime1.writeByte(3, false);
        var3Lifetime1.writeByte(8, false);
        var3Lifetime1.writeShort(param2, false);
    }

    final static void openPrivateTextChat(int param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
          SecondaryNodeDequeIterator.field_d = 2;
          LongAndTextCredentials.field_m = param1;
          var5 = (CharSequence) ((Object) param1);
          NineSliceFrameHelpers.field_a = DialWidgetPainter.normalizeDisplayName(var5, (byte) 101);
          PendingListRequest.field_o = param2;
          if (param0 >= -122) {
            LoginProgressHelpers.sendShortRequest(32, (byte) 33, -101);
          }
          TextLayout.openQuickChatRootMenu(97);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "uf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void openLoginProgress(String param0, boolean param1, boolean param2) {
        try {
          ErrorPrintHelpers.field_b = param2;
          MenuThemeHelpers.field_f = true;
          BufferedSocket.field_u = new ProgressMessageDialog(InsetTextPainter.field_s, ValidationStatusIcon.field_V, param0, QuickChatCategory.field_v, ErrorPrintHelpers.field_b);
          InsetTextPainter.field_s.pushLayer(BufferedSocket.field_u, param1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "uf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_a = null;
        field_g = null;
        if (param0 != -11535) {
          return;
        }
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "Unable to delete name - system busy";
        field_e = 0;
    }
}
