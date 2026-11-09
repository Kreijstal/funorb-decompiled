/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextInputWidget extends TextFieldWidget implements ValidatableWidget {
    static String field_T;
    static String field_J;
    static String field_Y;
    static PlatformTaskDispatcher field_W;
    static String field_S;
    static int[][] field_Z;
    private ValidationSource field_V;
    private int field_U;
    static AnimatedPanel field_X;

    final void updateHover(int param0, int param1, UiWidget param2, byte param3) {
        try {
          super.updateHover(param0, param1, param2, param3);
          this.field_U = TertiaryListSequence.field_k - (this.field_m + param0);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "fa.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ValidatedTextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final String getTooltip(boolean param0) {
        if (!this.field_k) {
          return null;
        }
        if (this.field_v == null) {
          return null;
        }
        ScrollBar.a(bb.field_b, !param0 ? true : false, this.field_x - this.field_U + TertiaryListSequence.field_k);
        if (param0) {
          return this.field_v;
        }
        return (String) null;
    }

    final void notifyTextChanged(int param0) {
        super.notifyTextChanged(param0);
        if (this.field_V != null) {
          this.field_V.notifyChanged(-72);
        }
    }

    final void setValidationSource(ValidationSource param0, int param1) {
        try {
          if (param1 != 8945) {
            field_T = (String) null;
          }
          this.field_V = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "fa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final ValidationSource getValidationSource(byte param0) {
        if (param0 <= 58) {
          this.getValidationSource((byte) -52);
          return this.field_V;
        }
        return this.field_V;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        NodeHashTableIterator.field_f = param0;
        if (LabeledChildWidget.field_J != MouseInputHandler.field_f) {
          var2 = MouseInputHandler.field_f * MouseInputHandler.field_f;
          var3 = -(LabeledChildWidget.field_J * LabeledChildWidget.field_J) + var2;
          param0 = param0 + (-param0 + DerelictMapGenerator.field_m) * var3 / var2;
        }
        tg.field_c.setTarget(640, 120, (byte) 66, param0, tm.field_h);
        if (param1 <= -35) {
          SocketArchiveNetworkClient.a(DerelictMapGenerator.field_m - 24, 0, tg.field_a, 3, 640, 5, TextLayout.field_b);
          return;
        }
        ValidatedTextInputWidget.a(-2, (byte) -122);
        SocketArchiveNetworkClient.a(DerelictMapGenerator.field_m - 24, 0, tg.field_a, 3, 640, 5, TextLayout.field_b);
    }

    public static void clearStatics(int param0) {
        field_T = null;
        field_W = null;
        field_Y = null;
        field_X = null;
        field_Z = (int[][]) null;
        field_S = null;
        field_J = null;
        if (param0 != 5) {
          ValidatedTextInputWidget.a(-11, (byte) -25);
        }
    }

    static {
        field_Y = "<%0> has entered another game.";
        field_T = "Average rating";
        field_S = "<%0> points, 1 point per turn.";
        field_J = "Waiting for graphics";
    }
}
