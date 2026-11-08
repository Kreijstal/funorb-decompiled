/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundMixerHelpers {
    static float field_e;
    static String field_b;
    static AnimationFrameSet field_c;
    static int[] field_d;
    static String field_a;

    final static PcmStreamMixer getSoundMixer(int param0) {
        if (param0 != 28357) {
          SoundMixerHelpers.releaseStatics((byte) 91);
          return QuickChatPhraseCache.field_g;
        }
        return QuickChatPhraseCache.field_g;
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 > -105) {
          field_c = (AnimationFrameSet) null;
        }
    }

    static {
        field_b = "Private";
        field_a = "<%0> has been removed.";
    }
}
