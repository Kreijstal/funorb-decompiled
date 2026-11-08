/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PatchNoteUsage extends IntrusiveNode {
    static int[] field_s;
    static String field_o;
    static BufferedFile field_r;
    static AudioOutput field_q;
    byte[] field_p;
    static String field_n;

    final static void layoutLobbyPanels(boolean param0) {
        ChatPanelSlideHelpers.layoutAnimatedChatPanel((byte) 103);
        ChatLayoutHelpers.layoutChatAndSidePanels(-7, MouseInputHandler.field_e, DisplayNameForm.field_Q, GameKeyHandler.field_d, WeightedLruCache.field_n[0].field_t, StrongCacheEntry.field_J);
        if (param0) {
          field_o = (String) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        field_r = null;
        field_q = null;
        field_s = null;
        int var1 = -29 % ((64 - param0) / 43);
        field_o = null;
    }

    PatchNoteUsage(byte[] param0) {
        try {
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ch.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "<%0> is offering a rematch.";
        field_n = "Game options";
    }
}
