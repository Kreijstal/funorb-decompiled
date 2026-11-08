/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static ValidationState field_f;
    static AccountRegistrationPanel field_d;
    static String field_a;
    static ResourceArchive field_b;
    static String field_e;
    static int field_c;

    final static void playMusicTrack(MusicTrack param0, boolean param1, byte param2) {
        try {
          if (param2 != -119) {
            field_a = (String) null;
          }
          sb.changeMusicTrack(param1, (byte) -33, param0, 256);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "da.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void clipToRectangle(int param0, int param1, int param2, int param3, int param4) {
        if (param2 >= 115) {
          ec.pushClipState(65280);
          SoftwareRasterizer.intersectClip(param3, param4, param0, param1);
          return;
        }
        field_d = (AccountRegistrationPanel) null;
        ec.pushClipState(65280);
        SoftwareRasterizer.intersectClip(param3, param4, param0, param1);
    }

    final static void insertBefore(IntrusiveNode param0, int param1, IntrusiveNode param2) {
        if (param1 != 20) {
          return;
        }
        try {
          if (param2.previous != null) {
            param2.unlink(true);
          }
          param2.previous = param0.previous;
          param2.next = param0;
          param2.previous.next = param2;
          param2.next.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "da.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        int var1 = -45 % ((-64 - param0) / 54);
        field_b = null;
        field_e = null;
        field_a = null;
        field_f = null;
    }

    final static void measureCaptionWidths(byte param0) {
        ff.field_c = CachedArchiveProvider.field_t.textWidth(ce.field_g[20]);
        int var1 = CachedArchiveProvider.field_t.textWidth(ce.field_g[21]);
        if (param0 != -101) {
          da.releaseStatics(6);
          if (ff.field_c < var1) {
            ff.field_c = var1;
            return;
          }
          return;
        }
        if (ff.field_c >= var1) {
          return;
        }
        ff.field_c = var1;
    }

    static {
        field_a = "Rankings";
        field_f = new ValidationState();
        field_e = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
