/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr extends java.awt.Canvas {
    static String field_e;
    static String field_a;
    static boolean[][] field_b;
    private java.awt.Component field_d;
    static ee field_c;

    public static void a(boolean param0) {
        if (!param0) {
          field_a = (String) null;
          field_c = null;
          field_e = null;
          field_b = (boolean[][]) null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_b = (boolean[][]) null;
          field_a = null;
          return;
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_d.update(param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hr.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hr.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    hr(java.awt.Component param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Equipped Actions";
        field_e = "You have declined the invitation.";
    }
}
