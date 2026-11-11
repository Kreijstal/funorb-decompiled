/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static ToolkitCandidate[] field_a;
    static SpriteData[] field_b;

    final static void openLobbyPlayerContextMenu(int param0, int param1, LobbyPlayerEntry param2, byte param3, int param4, int param5, ScrollPanel param6) {
        PlayerContextMenu var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          DateInputWidget.openPlayerContextMenu(param6, -1, param2.field_vb, param2.field_yb, param3 - 11542, (int[]) null, param2, -1, param2.field_wb);
          hka.field_b.populateItems((byte) -22, true);
          hka.field_b.addSocialActions((int[]) null, 0, 19);
          if (param3 != -93) {
            field_b = (SpriteData[]) null;
          }
          hka.field_b.addMessageActions(0);
          var12 = hka.field_b;
          var8 = param0;
          var9 = param1;
          var10 = param5;
          var11 = param4;
          var12.field_f.openAt(var9, var11, -80, var10, var8);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "rc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          field_a = (ToolkitCandidate[]) null;
        }
    }

    static {
    }
}
