/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dd extends DefaultTextWidgetRenderer {
    static int field_o;
    static String field_p;

    public final void paintWidget(int param0, UiWidget param1, int param2, boolean param3, int param4) {
        try {
          if (param3) {
            IntrusiveNode.a(param1.field_x, param2 + param1.field_m, param1.field_u, (byte) -22, param1.field_p + param4);
          }
          super.paintWidget(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "dd.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    dd(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static boolean c(byte param0) {
        if (param0 < 6) {
          dd.clearStaticReferences(30);
          return ij.field_d.a(-119);
        }
        return ij.field_d.a(-119);
    }

    final static AccountServiceResult pollAccountCreationResult(byte param0) {
        if (DiskArchiveStore.field_f == IndexedSpriteState.field_h) {
          throw new IllegalStateException();
        }
        if (param0 <= 82) {
          return (AccountServiceResult) null;
        }
        if (IndexedSpriteState.field_h == RichTextLayout.field_e) {
          IndexedSpriteState.field_h = DiskArchiveStore.field_f;
          return MouseWheelInput.field_c;
        }
        return null;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != -3674) {
          field_p = (String) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    dd(int param0) {
        this(gk.field_c, param0);
    }

    static {
        field_o = 0;
    }
}
