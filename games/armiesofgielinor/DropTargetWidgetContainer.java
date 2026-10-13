/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static String[][] field_L;
    static volatile boolean pointerChanged;
    static int field_K;
    static RgbSprite field_J;

    public static void k(int param0) {
        if (param0 <= 43) {
          return;
        }
        field_L = (String[][]) null;
        field_J = null;
    }

    final static CampaignQuicksave getStoredQuicksave(int obfuscationGuard) {
        if (obfuscationGuard <= 78) {
          DropTargetWidgetContainer.k(-59);
          if (null != bu.storedQuicksave) {
            return bu.storedQuicksave;
          }
          return null;
        }
        if (null != bu.storedQuicksave) {
          return bu.storedQuicksave;
        }
        return null;
    }

    final void pointerReleased(int originY, Widget rootWidget, int pointerX, byte obfuscationGuard, int pointerY, int originX) {
        DraggableWidgetContainer draggedWidget = null;
        try {
          super.pointerReleased(originY, rootWidget, pointerX, (byte) 42, pointerY, originX);
          int guardRemainder = -111 % ((-58 - obfuscationGuard) / 53);
          draggedWidget = bn.draggedWidget;
          if (draggedWidget != null &&
            this.containsPointer(1, originX, pointerY, pointerX, originY)) {
            if (!(this.listener instanceof WidgetDropListener)) {
              if (!(draggedWidget.listener instanceof WidgetDropListener)) {
                return;
              }
              ((WidgetDropListener) (draggedWidget.listener)).widgetDropped(draggedWidget, -14486, this);
              bn.draggedWidget = null;
              return;
            }
            ((WidgetDropListener) (this.listener)).widgetDropped(draggedWidget, -14486, this);
            bn.draggedWidget = null;
            return;
          }
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ku.JA(" + originY + ',' + (rootWidget != null ? "{...}" : "null") + ',' + pointerX + ',' + obfuscationGuard + ',' + pointerY + ',' + originX + ')');
        }
    }

    final static void a(byte param0, boolean param1, MusicTrack param2) {
        try {
          MusicCrossfadeStream.setMusicTrack(param2, param1, 256, (byte) 41);
          if (param0 >= -28) {
            field_K = -125;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ku.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private DropTargetWidgetContainer(int x, int y, int width, int height, WidgetPainter painter, WidgetListener listener, Widget child) {
        super(x, y, width, height, painter, listener);
        try {
          this.child = child;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ku.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (painter != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + (child != null ? "{...}" : "null") + ')');
        }
    }

    static {
        pointerChanged = false;
        field_L = new String[][]{new String[]{"240", "180", "150", "120", "90", "60", "30"}, new String[]{"Small", "Medium", "Large", "Epic"}, new String[]{"Regular", "Double", "Triple", "Quadruple"}, new String[]{null, null, null, null, null}, new String[]{"Free For All", "Team Game"}, new String[]{"Off", "25", "75", "150", "No limit"}};
        field_J = new RgbSprite(224, 224);
    }
}
