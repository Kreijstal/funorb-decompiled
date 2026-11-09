/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteMask {
    static String arcadeModeUnlockedText;
    static char[] queuedKeyCharacters;
    static Drone[] drones;
    static int[] field_d;

    protected SpriteMask() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(boolean param0) {
        arcadeModeUnlockedText = null;
        drones = null;
        queuedKeyCharacters = null;
        field_d = null;
        if (param0) {
          SpriteMask.releaseStatics(true);
        }
    }

    final static void initializeAudioOutputs(PlatformTaskDispatcher dispatcher, boolean stereo, MusicCrossfadeStream music, byte guard, int sampleRate, java.awt.Component component) {
        if (guard > -104) {
          return;
        }
        try {
          AudioOutputBootstrap.initializeAudioOutputs(component, sampleRate, sampleRate, (byte) 123, stereo, music, dispatcher, 1024);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "aa.B(" + (dispatcher != null ? "{...}" : "null") + ',' + stereo + ',' + (music != null ? "{...}" : "null") + ',' + guard + ',' + sampleRate + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    static {
        arcadeModeUnlockedText = "Arcade Mode unlocked!";
        queuedKeyCharacters = new char[128];
        field_d = new int[8192];
        MenuSelectionController discarded$0 = new MenuSelectionController(1);
    }
}
