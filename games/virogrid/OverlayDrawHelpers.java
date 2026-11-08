/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OverlayDrawHelpers {
    static char[] field_f;
    static String field_b;
    static String textEndgameNopieces;
    static PcmSample field_d;
    static String field_c;
    static String field_a;
    static String field_g;

    final static SpriteWidget getGameListContent(int param0) {
        if (param0 != 1463) {
          OverlayDrawHelpers.drawOverlayLayers(false, 127);
          return DisplayModeInfo.field_a.field_Jb;
        }
        return DisplayModeInfo.field_a.field_Jb;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        textEndgameNopieces = null;
        field_g = null;
        field_c = null;
        if (param0 < -24) {
          field_f = null;
          return;
        }
    }

    final static void setSharedAnimationFrameset(int param0, HuffmanCodec param1) {
        if (param0 != 8799) {
          return;
        }
        try {
          ProxySocketConnector.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "cg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawOverlayLayers(boolean param0, int param1) {
        if (null != QuickChatCategoryCache.field_g) {
          StateToken.drawTooltipBox((byte) -83, QuickChatCategoryCache.field_g);
        }
        if (IntKeyLookup.field_e != null) {
          IntKeyLookup.field_e.draw((byte) -22, param0);
          ScoreSubmissionHelpers.updateNameEntryDialog((byte) 3, param0);
          if (null != SpriteWidget.field_yb) {
            SpriteWidget.field_yb.drawRoot(param0, param1 + 18109);
          }
          CommonUiHelpers.drawQuickChatHelpOverlay((byte) -111, param0);
          if (param1 != 6851) {
            field_b = (String) null;
            return;
          }
          return;
        }
        ScoreSubmissionHelpers.updateNameEntryDialog((byte) 3, param0);
        if (null != SpriteWidget.field_yb) {
          SpriteWidget.field_yb.drawRoot(param0, param1 + 18109);
        }
        CommonUiHelpers.drawQuickChatHelpOverlay((byte) -111, param0);
        if (param1 == 6851) {
          return;
        }
        field_b = (String) null;
    }

    static {
        field_b = "<%0> might change the options - wait and see.";
        field_f = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_a = "No options available";
        field_c = "You must play 1 more rated game before playing with the current options.";
        field_g = "Solicitation";
        textEndgameNopieces = "<%0> has no pieces left";
    }
}
