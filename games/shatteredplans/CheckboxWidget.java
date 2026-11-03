/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxWidget extends FocusableWidget {
    static String field_D;

    CheckboxWidget(String param0, WidgetListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        StandardMapReader.field_g = null;
        SolVictoryChecker.field_p = nm.field_a;
        if (param0 != -15365) {
          CheckboxWidget.h(-36);
        }
    }

    private CheckboxWidget(String param0, WidgetListener param1) {
        this(param0, MusicVoice.field_I.field_q, param1);
        try {
          this.field_p = MusicVoice.field_I.field_a;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private CheckboxWidget(String param0, WidgetPainter param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
          this.field_p = MusicVoice.field_I.field_a;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        this.field_z = !this.field_z ? true : false;
        super.a(param0, param1, param2, param3);
    }

    public static void h(int param0) {
        if (param0 != -22429) {
          field_D = (String) null;
          field_D = null;
          return;
        }
        field_D = null;
    }

    static {
        field_D = "Maximum total production";
    }
}
