/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PendingHighscoreRequest extends IntrusiveNode {
    static String[] field_i;
    static String field_p;
    int field_j;
    static int field_h;
    static ModelMesh field_x;
    static int field_q;
    int[] field_o;
    static String field_u;
    int field_l;
    int field_k;
    static String field_s;
    int field_r;
    int field_m;
    static int field_w;
    static String field_n;
    int field_t;
    int field_g;
    static int[][] field_v;

    final static void drawLobbyScreen(int param0, boolean param1) {
        SpriteWidget stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        SpriteWidget stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        SpriteWidget stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        SpriteWidget stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        SpriteWidget stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        SpriteWidget stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        SpriteWidget stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        SpriteWidget stackIn_46_0 = null;
        boolean stackIn_47_1 = false;
        SpriteWidget stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        SpriteWidget stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        GameApplet.pushClipRect(Rasterizer.field_f, 6, -640 + Rasterizer.field_e >> 1, Rasterizer.field_e + 640 >> 1, 0);
        if (param0 != -1781) {
          return;
        }
        if (ClientServiceHelpers.field_d > 0) {
          if (TextEncodingHelpers.lobbyIcon != null) {
            TextEncodingHelpers.lobbyIcon.drawOpaque(WidgetContainer.field_y.field_tb, 0);
          }
          stackIn_9_0 = WidgetContainer.field_y;
          stackIn_10_1 = (param1) && (!ScrollPaneWithFooter.field_Gb);
          ((SpriteWidget) (Object) stackIn_9_0).drawRoot(stackIn_10_1, 24960);
          stackIn_13_0 = CipherPacketBuffer.field_p;
          stackIn_14_1 = (param1) && (!ScrollPaneWithFooter.field_Gb);
          ((SpriteWidget) (Object) stackIn_13_0).drawRoot(stackIn_14_1, 24960);
        }
        if (0 < field_h) {
          if (TextEncodingHelpers.lobbyIcon == null) {
            stackIn_20_0 = ScrollPaneWithFooter.field_Eb;
            stackIn_21_1 = (param1) && (!QuickChatPhraseRegistry.field_h);
            ((SpriteWidget) (Object) stackIn_20_0).drawRoot(stackIn_21_1, 24960);
            stackIn_24_0 = CacheReference.field_r;
            stackIn_25_1 = (param1) && (!QuickChatPhraseRegistry.field_h);
            ((SpriteWidget) (Object) stackIn_24_0).drawRoot(stackIn_25_1, 24960);
          } else {
            TextEncodingHelpers.lobbyIcon.drawOpaque(ScrollPaneWithFooter.field_Eb.field_tb, 0);
            stackIn_29_0 = ScrollPaneWithFooter.field_Eb;
            stackIn_30_1 = (param1) && (!QuickChatPhraseRegistry.field_h);
            ((SpriteWidget) (Object) stackIn_29_0).drawRoot(stackIn_30_1, 24960);
            stackIn_33_0 = CacheReference.field_r;
            stackIn_34_1 = (param1) && (!QuickChatPhraseRegistry.field_h);
            ((SpriteWidget) (Object) stackIn_33_0).drawRoot(stackIn_34_1, 24960);
          }
        } else {
          if (QuickChatPhraseDefinition.field_z > 0) {
            if (TextEncodingHelpers.lobbyIcon == null) {
              stackIn_42_0 = ScrollPaneWithFooter.field_Eb;
              stackIn_43_1 = (param1) && (!QuickChatPhraseRegistry.field_h);
              ((SpriteWidget) (Object) stackIn_42_0).drawRoot(stackIn_43_1, 24960);
              stackIn_46_0 = CacheReference.field_r;
              stackIn_47_1 = (param1) && (!QuickChatPhraseRegistry.field_h);
              ((SpriteWidget) (Object) stackIn_46_0).drawRoot(stackIn_47_1, 24960);
            } else {
              TextEncodingHelpers.lobbyIcon.drawOpaque(ScrollPaneWithFooter.field_Eb.field_tb, 0);
              stackIn_51_0 = ScrollPaneWithFooter.field_Eb;
              stackIn_52_1 = (param1) && (!QuickChatPhraseRegistry.field_h);
              ((SpriteWidget) (Object) stackIn_51_0).drawRoot(stackIn_52_1, 24960);
              stackIn_55_0 = CacheReference.field_r;
              stackIn_56_1 = (param1) && (!QuickChatPhraseRegistry.field_h);
              ((SpriteWidget) (Object) stackIn_55_0).drawRoot(stackIn_56_1, 24960);
            }
          }
        }
        ContextMenuHelpers.popRasterTarget(true);
    }

    public static void releaseStatics(byte param0) {
        field_v = (int[][]) null;
        field_x = null;
        field_p = null;
        if (param0 == -9) {
          field_u = null;
          field_i = null;
          field_n = null;
          field_s = null;
          return;
        }
        PendingHighscoreRequest.getCurrentYear(true);
        field_u = null;
        field_i = null;
        field_n = null;
        field_s = null;
    }

    final static int getCurrentYear(boolean param0) {
        if (!param0) {
          return 1900 + new Date().getYear();
        }
        field_p = (String) null;
        return 1900 + new Date().getYear();
    }

    final static boolean decodeSpriteSheetFromArchive(Js5Archive param0, int param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 109) {
            PendingHighscoreRequest.getCurrentYear(false);
          }
          var5 = param0.getFile(param1, param2, 0);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          TabbedPanel.decodeSpriteSheet((byte) -47, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("hn.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private PendingHighscoreRequest() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new String[3];
        field_p = "Click or press F10 to open Quick Chat";
        field_u = "Unpacking sound effects";
        field_s = "Respect";
    }
}
