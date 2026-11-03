/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildContainer {
    static int[] field_B;

    private DropTargetWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_z = param6;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ln.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void handlePointerRelease(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        DraggableWidget var7 = null;
        try {
          super.handlePointerRelease(param0, param1, param2, param3, param4, param5);
          var7 = mp.field_g;
          if (var7 != null &&
            this.containsPointer((byte) -81, param5, param0, param2, param1)) {
            if (this.field_k instanceof co) {
              ((co) (this.field_k)).a(var7, this, param4 + 14579);
              mp.field_g = null;
              return;
            }
            if (var7.field_k instanceof co) {
              ((co) (var7.field_k)).a(var7, this, 14578);
              mp.field_g = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ln.T(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, UiLayoutNode param1, UiLayoutNode param2) {
        if (null == param1.field_jb) {
          param1.field_jb = new IntrusiveDeque();
        }
        if (param2.field_jb == null) {
          param2.field_jb = new IntrusiveDeque();
        }
        if (param0 != 64) {
          return;
        }
        try {
          if (null == kw.field_b) {
            kw.field_b = new DualLinkHashTable(64);
          }
          if (null == ni.field_m) {
            ni.field_m = new DualLinkHashTable(64);
          }
          GameplayHelpScreen.field_I = param1.field_jb;
          qn.field_b = param2.field_jb;
          RasterStateSnapshot.a(0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ln.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Canvas l(int param0) {
        if (param0 != 64) {
          field_B = (int[]) null;
          return SplashScreen.field_m == null ? ic.field_d : (java.awt.Canvas) ((Object) SplashScreen.field_m);
        }
        return SplashScreen.field_m == null ? ic.field_d : (java.awt.Canvas) ((Object) SplashScreen.field_m);
    }

    public static void k(int param0) {
        if (param0 != 31235) {
          DropTargetWidget.k(110);
          field_B = null;
          return;
        }
        field_B = null;
    }

    static {
    }
}
