/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hw {
    static boolean[] field_b;
    static ResourceArchive field_a;

    final static void a(File param0, String param1, int param2) {
        try {
          if (param2 != 23295) {
            field_b = (boolean[]) null;
          }
          mi.field_b.put(param1, param0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hw.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1, int param2, byte param3, boolean param4, MusicCrossfadeStream param5, PlatformTaskDispatcher param6, int param7) {
        try {
          AudioOutput.a(param1, param4, 10);
          wd.field_f = AudioOutput.a(param6, param0, 0, param2);
          LegacyOpenGlEffectManager.field_a = AudioOutput.a(param6, param0, 1, param7);
          sj.field_c = new PcmStreamMixer();
          IntrusiveDequeCursor.field_c = param7;
          LegacyOpenGlEffectManager.field_a.a(sj.field_c);
          qr.field_b = param5;
          if (param3 <= 103) {
            PlatformTaskDispatcher var9 = (PlatformTaskDispatcher) null;
            hw.a((java.awt.Component) null, -65, -27, (byte) 49, true, (MusicCrossfadeStream) null, (PlatformTaskDispatcher) null, -58);
          }
          qr.field_b.a((byte) -43, tt.field_l);
          wd.field_f.a(qr.field_b);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hw.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 5460) {
          field_b = (boolean[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_b = new boolean[112];
    }
}
