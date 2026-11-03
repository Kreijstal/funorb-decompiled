/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static UiComponent field_b;
    static int field_a;

    public static void releaseStatics(int param0) {
        int var1 = 103 / ((0 - param0) / 53);
        field_b = null;
    }

    final static void loadLogoJingle(ResourceArchive param0, int param1) {
        VorbisSample var2 = null;
        try {
          if (param1 <= 4) {
            field_b = (UiComponent) null;
          }
          VorbisSample.decodeSetup(param0.getFileByName(false, "", "headers.packvorbis"));
          var2 = VorbisSample.loadByName(param0, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "q.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
