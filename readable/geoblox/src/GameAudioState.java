/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameAudioState {
    static SoundSampleCache gameSoundSampleCache;
    static char currentKeyboardEventCharacter;
    static MusicScore germsMusicTrack;
    private static String unusedDiagnosticPrefix;

    public static void releaseGameAudioResources(int methodGuard) {
        gameSoundSampleCache = null;
        if (methodGuard != -8297) {
            gameSoundSampleCache = (SoundSampleCache) null;
            germsMusicTrack = null;
            return;
        }
        germsMusicTrack = null;
    }

    static {
        unusedDiagnosticPrefix = "te.A(";
    }
}
