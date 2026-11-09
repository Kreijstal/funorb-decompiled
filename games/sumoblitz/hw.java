/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hw {
    static boolean[] field_b;
    static ResourceArchive field_a;

    final static void registerNativeLibraryFile(File file, String libraryName, int guard) {
        try {
          if (guard != 23295) {
            field_b = (boolean[]) null;
          }
          TextureCombineSource.field_b.put(libraryName, file);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hw.B(" + (file != null ? "{...}" : "null") + ',' + (libraryName != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1, int param2, byte param3, boolean param4, MusicCrossfadeStream param5, PlatformTaskDispatcher param6, int param7) {
        try {
          AudioOutput.configure(param1, param4, 10);
          EmailCredentials.field_f = AudioOutput.create(param6, param0, 0, param2);
          LegacyOpenGlEffectManager.field_a = AudioOutput.create(param6, param0, 1, param7);
          sj.field_c = new PcmStreamMixer();
          IntrusiveDequeCursor.field_c = param7;
          LegacyOpenGlEffectManager.field_a.setStream(sj.field_c);
          AccountConnectionPhase.field_b = param5;
          if (param3 <= 103) {
            PlatformTaskDispatcher var9 = (PlatformTaskDispatcher) null;
            hw.a((java.awt.Component) null, -65, -27, (byte) 49, true, (MusicCrossfadeStream) null, (PlatformTaskDispatcher) null, -58);
          }
          AccountConnectionPhase.field_b.setVolume((byte) -43, tt.field_l);
          EmailCredentials.field_f.setStream(AccountConnectionPhase.field_b);
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
