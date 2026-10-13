/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk extends rb implements EditableTextWidgetListener {
    private EditableTextWidget field_g;
    static String field_f;
    static String field_d;
    static int currentThemeId;
    static String field_i;
    static boolean field_h;

    public final boolean b(int param0) {
        if (param0 < 12) {
          return true;
        }
        if (null == this.field_g.text) {
          return true;
        }
        if (this.field_g.text.length() != 0) {
          return false;
        }
        return true;
    }

    abstract gu a(int param0, String param1);

    public final void textChanged(EditableTextWidget widget, int obfuscationGuard) {
        try {
          this.a(126);
          int var3_int = 59 % ((-80 - obfuscationGuard) / 33);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mk.FA(" + (widget != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    mk(EditableTextWidget param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String a(byte param0, String param1);

    final String b(byte param0) {
        if (param0 == -71) {
          return this.a((byte) 115, this.field_g.text);
        }
        field_h = false;
        return this.a((byte) 115, this.field_g.text);
    }

    final gu c(int param0) {
        int var2 = 85 / ((56 - param0) / 32);
        return this.a(-3137, this.field_g.text);
    }

    public final void textSubmitted(EditableTextWidget widget, int obfuscationGuard) {
        try {
          if (obfuscationGuard != 80) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mk.EA(" + (widget != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void f(int param0) {
        field_d = null;
        if (param0 != -1) {
          field_i = (String) null;
          field_f = null;
          field_i = null;
          return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        field_f = null;
        field_d = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        currentThemeId = -1;
        field_i = "STRENGTH";
        field_h = true;
    }
}
