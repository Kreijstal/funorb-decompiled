/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
    static int fullscreenDialogButtonPaddingY;
    static String field_G;
    static int[] field_I;

    final void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        DraggableWidget var7 = null;
        try {
          super.handlePointerRelease(pointerY, pointerX, parentY, focusRoot, obfuscationGuard, parentX);
          var7 = ByteArrayPoolHelpers.draggedWidget;
          if (var7 != null &&
            this.containsPoint(pointerY, parentY, parentX, 3, pointerX)) {
            if (this.listener instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.listener)).onDrop(-24178, var7, this);
              ByteArrayPoolHelpers.draggedWidget = null;
              return;
            }
            if (var7.listener instanceof WidgetDropListener) {
              ((WidgetDropListener) (var7.listener)).onDrop(-24178, var7, this);
              ByteArrayPoolHelpers.draggedWidget = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jb.GA(" + pointerY + ',' + pointerX + ',' + parentY + ',' + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ')');
        }
    }

    private DropTargetWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener, Widget child) {
        super(x, y, width, height, renderer, listener);
        try {
          this.child = child;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jb.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + (child != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(byte param0) {
        field_I = null;
        field_G = null;
        if (param0 >= -47) {
          DropTargetWidget.requestJoinGame(-87, 55, -124);
        }
    }

    final static void requestJoinGame(int gameId, int opcode, int obfuscationGuard) {
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.writeByte(-115, 3);
        if (obfuscationGuard == 11912) {
          packet.writeByte(-113, 8);
          packet.writeShort((byte) 109, gameId);
          return;
        }
    }

    static {
        field_I = new int[]{2, 3, 4, 5};
        field_G = "Checking";
    }
}
