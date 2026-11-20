/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedByteArray extends DualLinkNode {
    static MusicTrack[] musicTracks;
    static int field_m;
    byte[] bytes;

    final static void setGameCanvasSize(int param0, int param1, byte param2) {
        GetDebrisSurvives.field_p = param1;
        GetPhasedEnergyBeamFireForce.field_p = param1;
        if (param2 < -27) {
          SetPointDefenceLaserReload.field_p = param0;
          GetLoadingMissions.field_p = param0;
          GetDebrisSurvives.field_q = true;
          return;
        }
        musicTracks = (MusicTrack[]) null;
        SetPointDefenceLaserReload.field_p = param0;
        GetLoadingMissions.field_p = param0;
        GetDebrisSurvives.field_q = true;
    }

    public static void clearSharedReferences(boolean param0) {
        musicTracks = null;
        if (param0) {
          musicTracks = (MusicTrack[]) null;
        }
    }

    CachedByteArray(byte[] param0) {
        try {
          this.bytes = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "pab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 100;
    }
}
