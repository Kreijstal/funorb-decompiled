/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameTrackPlayback {
    static ToolkitFont field_a;

    final static void playGameTrack(int trackIndex, int fadeStep) {
        AffineTransform3D.crossfadeMusicTrack(fadeStep, (byte) -55, TimedSceneEffect.field_m[trackIndex], true);
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        int var1 = 71 % ((-22 - param0) / 55);
    }

    static {
    }
}
