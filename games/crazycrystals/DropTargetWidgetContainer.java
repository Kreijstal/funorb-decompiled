/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static String[] field_y;
    static int field_z;

    public static void clearStaticReferences(byte param0) {
        field_y = null;
        if (param0 != 87) {
          DropTargetWidgetContainer.clearStaticReferences((byte) 29);
        }
    }

    final void pointerReleased(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        DraggableWidgetContainer var7 = null;
        try {
          super.pointerReleased(param0, param1, param2, param3, param4, param5);
          var7 = ok.field_e;
          if (var7 != null) {
            if (!this.containsPointer(param0, param2, false, param1, param3)) {
              return;
            }
            if (this.field_l instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_l)).widgetDropped(this, -27167, var7);
              ok.field_e = null;
              return;
            }
            if (!(var7.field_l instanceof WidgetDropListener)) {
              return;
            }
            ((WidgetDropListener) (var7.field_l)).widgetDropped(this, -27167, var7);
            ok.field_e = null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ed.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_w = param6;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ed.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, sc param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = tp.field_f;
          var3.d(8, param1);
          var3.writeByte(true, param2.field_f);
          int var4 = -40 / ((param0 - 4) / 43);
          var3.writeShort(-161478600, param2.field_k);
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ed.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_z = 0;
    }
}
