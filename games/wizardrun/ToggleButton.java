/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToggleButton extends TextButton {
    static String field_G;
    static Sprite field_H;
    static String field_F;

    public static void releaseStatics(int param0) {
        field_G = null;
        field_F = null;
        if (param0 != 19291) {
          ToggleButton.releaseStatics(61);
          field_H = null;
          return;
        }
        field_H = null;
    }

    final void fireButtonAction(int param0, int param1, int param2, int param3) {
        this.selected = !this.selected ? true : false;
        super.fireButtonAction(-108, param1, param2, param3);
        if (param0 <= -45) {
          return;
        }
        this.fireButtonAction(-80, 25, -112, 4);
    }

    ToggleButton(String param0, WidgetListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.selected = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private ToggleButton(String param0, WidgetListener param1) {
        this(param0, ValidationIndicator.field_H.field_c, param1);
        try {
          this.renderer = ValidationIndicator.field_H.field_a;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ToggleButton(String param0, WidgetRenderer param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
          this.renderer = ValidationIndicator.field_H.field_a;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "yet submitted scores in this game.";
        field_F = "Intro";
    }
}
