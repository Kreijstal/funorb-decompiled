/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static SoundSampleCache gameSoundSampleCache;
    static char currentKeyboardEventCharacter;
    static MusicScore germsMusicTrack;
    private static String field_z;

    public static void a(int param0) {
        gameSoundSampleCache = null;
        if (param0 != -8297) {
            gameSoundSampleCache = (SoundSampleCache) null;
            germsMusicTrack = null;
            return;
        }
        germsMusicTrack = null;
    }

    static {
        field_z = "te.A(";
    }
}
