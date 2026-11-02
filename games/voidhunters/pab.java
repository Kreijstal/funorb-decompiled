/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pab extends DualLinkNode {
    static kka[] field_k;
    static int field_m;
    byte[] field_l;

    final static void a(int param0, int param1, byte param2) {
        GetDebrisSurvives.field_p = param1;
        GetPhasedEnergyBeamFireForce.field_p = param1;
        if (param2 < -27) {
          SetPointDefenceLaserReload.field_p = param0;
          GetLoadingMissions.field_p = param0;
          GetDebrisSurvives.field_q = true;
          return;
        }
        field_k = (kka[]) null;
        SetPointDefenceLaserReload.field_p = param0;
        GetLoadingMissions.field_p = param0;
        GetDebrisSurvives.field_q = true;
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
          field_k = (kka[]) null;
        }
    }

    pab(byte[] param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 100;
    }
}
