/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SineTableHelpers {
    static String[] field_a;
    static Sprite field_c;
    static boolean field_b;
    static boolean field_e;
    static int field_d;

    final static int sine(byte param0, int param1) {
        int var2 = 106 / ((param0 - 18) / 56);
        return TriangleRasterizer.field_k[param1 & 2047];
    }

    final static void openPublicQuickChat(int param0) {
        if (param0 != 13151) {
          return;
        }
        UrlLaunchHelpers.field_a = 0;
        ReflectionCheckRequest.showDefaultQuickChatMenu((byte) 48);
    }

    final static void closePlayerContextMenu(int param0) {
        if (ContextMenuHolder.field_b == null) {
          KeyMapHelpers.field_d = null;
          if (param0 >= 25) {
            ContextMenuHolder.field_b = null;
            return;
          }
          return;
        }
        if (ContextMenuHolder.field_b.field_e == null) {
          KeyMapHelpers.field_d = null;
          if (param0 >= 25) {
            ContextMenuHolder.field_b = null;
            return;
          }
          return;
        }
        ContextMenuHolder.field_b.field_e.field_Ab = false;
        KeyMapHelpers.field_d = null;
        if (param0 >= 25) {
          ContextMenuHolder.field_b = null;
          return;
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -109) {
          field_b = true;
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int sine(int param0, int param1) {
        int var2 = 106 / ((param0 - 18) / 56);
        return TriangleRasterizer.field_k[param1 & 2047];
    }
}
