/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
    static String field_E;
    static String[] field_J;
    static MidiPcmStream field_B;
    static BinaryBitmapFont smallFont;
    static String[] field_F;
    static GameSession field_I;

    public static void releaseStatics(int param0) {
        field_E = null;
        smallFont = null;
        if (param0 > -100) {
          return;
        }
        field_B = null;
        field_F = null;
        field_I = null;
        field_J = null;
    }

    private DropTargetWidget(int param0, int param1, int param2, int param3, WidgetListener param4, UiListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_x = param6;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "vg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void handlePointerRelease(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        DraggableWidget var7 = null;
        DraggableWidget var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 <= 73) {
            return;
          }
          super.handlePointerRelease(param0, param1, param2, param3, param4, 125);
          var8 = ScoreSubmissionHelpers.field_b;
          var7 = var8;
          if (var8 != null) {
            if (!this.containsPointer(param4, param1, param0, (byte) 46, param2)) {
              return;
            }
            if (this.field_o instanceof DropTargetListener) {
              ((DropTargetListener) (this.field_o)).onWidgetDropped(82, this, var8);
              ScoreSubmissionHelpers.field_b = null;
              return;
            }
            if (var8.field_o instanceof DropTargetListener) {
              ((DropTargetListener) (var8.field_o)).onWidgetDropped(120, this, var8);
              ScoreSubmissionHelpers.field_b = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("vg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_E = "Your turn";
        field_J = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
