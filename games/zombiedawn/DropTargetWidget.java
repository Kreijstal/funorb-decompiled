/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
    static int field_D;

    final static int cosine(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (4096 <= param1) {
            if (param1 < 6144) {
              stackIn_19_0 = -SavedDataRequest.field_q[-4096 + param1];
            } else {
              stackIn_19_0 = -SavedDataRequest.field_q[8192 - param1];
            }
            return stackIn_19_0;
          }
          if (param1 < 2048) {
            stackIn_15_0 = SavedDataRequest.field_q[param1];
          } else {
            stackIn_15_0 = SavedDataRequest.field_q[4096 - param1];
          }
          return stackIn_15_0;
        }
        DropTargetWidget.cosine(false, 94);
        param1 = param1 & 8191;
        if (4096 <= param1) {
          if (param1 < 6144) {
            stackIn_9_0 = -SavedDataRequest.field_q[-4096 + param1];
          } else {
            stackIn_9_0 = -SavedDataRequest.field_q[8192 - param1];
          }
          return stackIn_9_0;
        }
        if (param1 < 2048) {
          stackIn_5_0 = SavedDataRequest.field_q[param1];
        } else {
          stackIn_5_0 = SavedDataRequest.field_q[4096 - param1];
        }
        return stackIn_5_0;
    }

    final void handlePointerRelease(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        DraggableWidget var7 = null;
        try {
          if (param1 < 1) {
            field_D = 107;
          }
          super.handlePointerRelease(param0, 5, param2, param3, param4, param5);
          var7 = ValidationStatusIcon.field_H;
          if (var7 != null &&
            this.containsPoint(param3, 21224, param4, param0, param2)) {
            if (this.field_v instanceof DropTargetListener) {
              ((DropTargetListener) (this.field_v)).onWidgetDropped(-12156, this, var7);
              ValidationStatusIcon.field_H = null;
              return;
            }
            if (var7.field_v instanceof DropTargetListener) {
              ((DropTargetListener) (var7.field_v)).onWidgetDropped(-12156, this, var7);
              ValidationStatusIcon.field_H = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rd.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private DropTargetWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_z = param6;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void decodeChatFilters(int param0, int param1) {
        GlowAreaSupport.field_b = (58 & param1) >> 4;
        LoginUiHelpers.field_c = (param1 & 13) >> 2;
        if (2 < GlowAreaSupport.field_b) {
          GlowAreaSupport.field_b = 2;
          if (!(2 >= LoginUiHelpers.field_c)) {
            LoginUiHelpers.field_c = 2;
          }
          LoginAndPacketHelpers.field_c = param1 & 3;
          if (param0 == 20348) {
            if (LoginAndPacketHelpers.field_c > 2) {
              LoginAndPacketHelpers.field_c = 2;
            }
            return;
          }
          return;
        }
        if (!(2 >= LoginUiHelpers.field_c)) {
          LoginUiHelpers.field_c = 2;
        }
        LoginAndPacketHelpers.field_c = param1 & 3;
        if (param0 == 20348) {
          if (LoginAndPacketHelpers.field_c > 2) {
            LoginAndPacketHelpers.field_c = 2;
          }
          return;
        }
    }

    static int bitXor(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        field_D = 68;
    }
}
