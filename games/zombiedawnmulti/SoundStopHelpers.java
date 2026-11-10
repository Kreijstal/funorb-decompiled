/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundStopHelpers {
    static String field_c;
    static String field_d;
    static String field_b;
    static boolean field_e;
    static boolean field_f;
    static String field_a;

    final static boolean isResizeAllowed(int param0) {
        if (param0 != -26966) {
          SoundStopHelpers.isResizeAllowed(17);
          if (ArchiveProvider.field_g == null) {
            return false;
          }
          if (ArchiveProvider.field_g.isResizeAllowed(0)) {
            return true;
          }
          return false;
        }
        if (ArchiveProvider.field_g == null) {
          return false;
        }
        if (ArchiveProvider.field_g.isResizeAllowed(0)) {
          return true;
        }
        return false;
    }

    final static void stopAllSounds(int param0) {
        IntrusiveNode var1 = null;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!FadingDialog.field_H) {
          return;
        }
        try {
          var1 = PropObject.field_M.last(54);
          while (var1 instanceof SoundEffectInstance) {
            NanoTickClock.removeSoundStream(true, ((SoundEffectInstance) (var1)).field_m);
            var1 = var1.previous;
          }
          var1 = UiComponentNode.field_q.last(53);
          while (var1 instanceof SoundEffectInstance) {
            NanoTickClock.removeSoundStream(true, ((SoundEffectInstance) (var1)).field_m);
            var1 = var1.previous;
          }
          if (param0 != 6962) {
            SoundStopHelpers.releaseStatics((byte) 105);
          }
          var1 = ChatPromptHelpers.field_c.last(83);
          while (var1 instanceof SoundEffectInstance) {
            NanoTickClock.removeSoundStream(true, ((SoundEffectInstance) (var1)).field_m);
            var1 = var1.previous;
          }
          PropObject.field_M.clear(-30986);
          UiComponentNode.field_q.clear(-30986);
          ChatPromptHelpers.field_c.clear(param0 ^ -25148);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "gj.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 == 91) {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
        SoundStopHelpers.releaseStatics((byte) -121);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_f = false;
        field_b = null;
        field_c = "Mobile";
        field_d = "Match by...";
        field_a = "Age:";
    }
}
