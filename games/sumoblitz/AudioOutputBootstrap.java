/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class AudioOutputBootstrap {
    static boolean[] field_b;
    static ResourceArchive field_a;

    final static void registerNativeLibraryFile(File file, String libraryName, int guard) {
        try {
          if (guard != 23295) {
            field_b = (boolean[]) null;
          }
          TextureCombineSource.extractedNativeLibraryFiles.put(libraryName, file);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hw.B(" + (file != null ? "{...}" : "null") + ',' + (libraryName != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static void initializeAudioOutputs(java.awt.Component component, int sampleRate, int musicBufferSize, byte guard, boolean stereo, MusicCrossfadeStream music, PlatformTaskDispatcher dispatcher, int effectsBufferSize) {
        try {
          AudioOutput.configure(sampleRate, stereo, 10);
          EmailCredentials.field_f = AudioOutput.create(dispatcher, component, 0, musicBufferSize);
          LegacyOpenGlEffectManager.field_a = AudioOutput.create(dispatcher, component, 1, effectsBufferSize);
          DisplayPromptRenderer.field_c = new PcmStreamMixer();
          IntrusiveDequeCursor.field_c = effectsBufferSize;
          LegacyOpenGlEffectManager.field_a.setStream(DisplayPromptRenderer.field_c);
          AccountConnectionPhase.field_b = music;
          if (guard <= 103) {
            PlatformTaskDispatcher var9 = (PlatformTaskDispatcher) null;
            AudioOutputBootstrap.initializeAudioOutputs((java.awt.Component) null, -65, -27, (byte) 49, true, (MusicCrossfadeStream) null, (PlatformTaskDispatcher) null, -58);
          }
          AccountConnectionPhase.field_b.setVolume((byte) -43, TextureGeneratorNode.musicVolume);
          EmailCredentials.field_f.setStream(AccountConnectionPhase.field_b);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hw.A(" + (component != null ? "{...}" : "null") + ',' + sampleRate + ',' + musicBufferSize + ',' + guard + ',' + stereo + ',' + (music != null ? "{...}" : "null") + ',' + (dispatcher != null ? "{...}" : "null") + ',' + effectsBufferSize + ')');
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
