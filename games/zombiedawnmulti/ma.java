/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static int field_d;
    static CipherPacketBuffer field_a;
    static AlignedIconLabel[][] field_b;
    static String field_c;

    public static void releaseStatics(int param0) {
        field_b = (AlignedIconLabel[][]) null;
        field_a = null;
        field_c = null;
        if (param0 != 64) {
          ma.releaseStatics(-89);
        }
    }

    final static void a(UiComponent param0, UiComponent param1, boolean param2) {
        if (param0.field_Cb == null) {
          param0.field_Cb = new IntrusiveDeque();
        }
        if (null == param1.field_Cb) {
          param1.field_Cb = new IntrusiveDeque();
        }
        if (ol.field_o == null) {
          ol.field_o = new sc(64);
        }
        if (null == bh.field_f) {
          bh.field_f = new sc(64);
        }
        if (!param2) {
          return;
        }
        try {
          jf.field_d = param1.field_Cb;
          ro.field_M = param0.field_Cb;
          UiWidget.d(-8328);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ma.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = "Show chat (1 unread message)";
    }
}
