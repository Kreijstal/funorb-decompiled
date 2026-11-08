/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PatchNoteUsage extends IntrusiveNode {
    static String field_k;
    static long field_l;
    static String field_g;
    byte[] field_h;
    static int field_j;
    static IntrusiveDeque field_m;
    static int field_n;
    static float field_i;

    final static void handleLoginSuccess(int param0) {
        int var1;
        int var2;
        var2 = Virogrid.field_F ? 1 : 0;
        NameEntryPopup.field_Fb = false;
        ValidatedTextWidget.field_X = null;
        if (param0 == -2) {
          if (ChatPanelSetupHelpers.field_c) {
            ThreeSliceButtonPainter.field_w.showConnectionRestored(119);
            return;
          }
          var1 = NanoTickClock.field_h;
          if (0 < var1) {
            if (var1 == 1) {
              ValidatedTextWidget.field_X = BoundedUrlRequest.field_n;
            } else {
              ValidatedTextWidget.field_X = MenuScreen.formatIndexedText(new String[]{Integer.toString(var1)}, UsernameAvailabilityValidator.field_t, param0 + 4);
            }
            ValidatedTextWidget.field_X = TextJoinHelpers.joinTextParts((byte) 67, new CharSequence[]{(CharSequence) ((Object) ValidatedTextWidget.field_X), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) TextLayout.field_c)});
          }
          ThreeSliceButtonPainter.field_w.closeDialog(true);
          Js5Transport.showLoadingDialog(389);
          return;
        }
        PatchNoteUsage.releaseStatics(82);
        if (ChatPanelSetupHelpers.field_c) {
          ThreeSliceButtonPainter.field_w.showConnectionRestored(119);
        } else {
          var1 = NanoTickClock.field_h;
          if (0 < var1) {
            if (var1 == 1) {
              ValidatedTextWidget.field_X = BoundedUrlRequest.field_n;
            } else {
              ValidatedTextWidget.field_X = MenuScreen.formatIndexedText(new String[]{Integer.toString(var1)}, UsernameAvailabilityValidator.field_t, param0 + 4);
            }
            ValidatedTextWidget.field_X = TextJoinHelpers.joinTextParts((byte) 67, new CharSequence[]{(CharSequence) ((Object) ValidatedTextWidget.field_X), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) TextLayout.field_c)});
          }
          ThreeSliceButtonPainter.field_w.closeDialog(true);
          Js5Transport.showLoadingDialog(389);
        }
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        field_m = null;
        if (param0 != -2) {
          field_i = -0.09383044391870499f;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final static void openRootQuickChatMenu(int param0) {
        RasterEffectHelpers.openQuickChatMenu(ResizableDialog.field_V, (byte) -32);
        if (param0 != 0) {
          PatchNoteUsage.openRootQuickChatMenu(-27);
        }
    }

    PatchNoteUsage(byte[] param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "The '<%0>' setting needs to be changed.";
        field_g = "Email address is unavailable";
        field_m = new IntrusiveDeque();
    }
}
