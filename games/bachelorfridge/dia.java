/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dia extends InteractiveWidget {
    static volatile int field_A;
    static String field_D;

    private dia(String param0, WidgetRenderer param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
          this.renderer = fda.field_i.field_h;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "dia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_B = !this.field_B ? true : false;
        super.a(param0, param1, param2, param3);
    }

    dia(String param0, WidgetListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_B = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "dia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private dia(String param0, WidgetListener param1) {
        this(param0, fda.field_i.field_r, param1);
        try {
          this.renderer = fda.field_i.field_h;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "dia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_D = null;
        if (param0 != 14213) {
          dia.releaseStatics(-32);
        }
    }

    static {
        field_A = -1;
        field_D = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
