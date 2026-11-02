/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ulb implements dja {
    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        wfb var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        var10 = VoidHunters.field_G;
        try {
          if (!GetPointDefenceLaserProjectileOndamageParticles.field_o) {
            return;
          }
          GetHealthBarWidth.field_p = new ka[hsb.field_a.length];
          if (param0 != 100) {
            ulb.a(-114);
          }
          for (var1_int = 0; var1_int < GetHealthBarWidth.field_p.length; var1_int++) {
            if (hsb.field_a[var1_int] != null) {
              GetHealthBarWidth.field_p[var1_int] = GetDebrisGroupColour.field_r.a(hsb.field_a[var1_int], -1, -1, 100, 100);
              if (!dm.field_b) {
                var2 = hab.field_g[var1_int];
                var14 = GetBombletSprayProjectileOndamageParticles.a((byte) -109, var2.field_v);
                var4 = -var14[0] + var14[1];
                var5 = var14[3] - var14[2];
                var6 = GetHealthBarWidth.field_p[var1_int].RA() - GetHealthBarWidth.field_p[var1_int].V();
                var7 = GetHealthBarWidth.field_p[var1_int].G() - GetHealthBarWidth.field_p[var1_int].HA();
                if (var2.field_b == 0 &&
                  0 == var2.field_i) {
                  var8 = var6 * var14[0] / var4;
                  GetHealthBarWidth.field_p[var1_int].H(var8, 0, 0);
                } else {
                  var8 = var2.field_b * var6 / var4;
                  var9 = -var2.field_i * var7 / var5;
                  GetHealthBarWidth.field_p[var1_int].H(var8, 0, var9);
                }
                GetHealthBarWidth.field_p[var1_int].O(144, 144, 144);
              }
            }
          }
          dm.field_b = true;
          GetDebrisThrowable.a(false, "Finished building models");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "ulb.C(" + param0 + ')');
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (tv[]) null;
        }
        return (tv[]) ((Object) new ShipSpawnedCondition[param1]);
    }

    public final tv a(byte param0) {
        int var2 = 34 % ((param0 + 64) / 50);
        return (tv) ((Object) new ShipSpawnedCondition());
    }

    static {
    }
}
