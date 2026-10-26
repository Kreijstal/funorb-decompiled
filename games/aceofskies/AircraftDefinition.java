/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AircraftDefinition {
    int heatReduction;
    int maximumHitPoints;
    double turnRate;
    static int field_k;
    int fireInterval;
    int aimSpread;
    int collisionRadius;
    double maximumSpeed;
    int gunPattern;
    double minimumSpeed;
    static long field_j;

    final PcmSample getEngineSample(byte obfuscationGuard) {
        if (gh.playerDefinition == this) {
          return lj.aircraftEngineSamples[0];
        }
        if (this == kk.field_N) {
          return lj.aircraftEngineSamples[1];
        }
        if (sl.field_p == this) {
          return lj.aircraftEngineSamples[2];
        }
        if (this == gm.field_y) {
          return lj.aircraftEngineSamples[3];
        }
        if (qq.field_g == this) {
          return lj.aircraftEngineSamples[4];
        }
        int var2 = -41 % ((obfuscationGuard + 5) / 58);
        if (id.field_f == this) {
          return lj.aircraftEngineSamples[4];
        }
        if (ju.field_k == this) {
          return lj.aircraftEngineSamples[5];
        }
        if (this != ro.field_u) {
          throw new RuntimeException();
        }
        return lj.aircraftEngineSamples[6];
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          return false;
        }
        return lq.a(bm.m(116), 61);
    }

    final RenderSprite[] getSprites(int obfuscationGuard) {
        if (gh.playerDefinition == this) {
          return hr.aircraftSprites[0];
        }
        if (this == kk.field_N) {
          return hr.aircraftSprites[1];
        }
        if (this == sl.field_p) {
          return hr.aircraftSprites[2];
        }
        if (obfuscationGuard != -32275) {
          this.toString();
          if (gm.field_y == this) {
            return hr.aircraftSprites[3];
          }
          if (this == qq.field_g) {
            return hr.aircraftSprites[4];
          }
          if (id.field_f == this) {
            return hr.aircraftSprites[7];
          }
          if (ju.field_k == this) {
            return hr.aircraftSprites[5];
          }
          if (this == ro.field_u) {
            return hr.aircraftSprites[6];
          }
          throw new RuntimeException();
        }
        if (gm.field_y == this) {
          return hr.aircraftSprites[3];
        }
        if (this == qq.field_g) {
          return hr.aircraftSprites[4];
        }
        if (id.field_f == this) {
          return hr.aircraftSprites[7];
        }
        if (ju.field_k == this) {
          return hr.aircraftSprites[5];
        }
        if (this == ro.field_u) {
          return hr.aircraftSprites[6];
        }
        throw new RuntimeException();
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    AircraftDefinition(double turnRate, int fireInterval, int heatReduction, int aimSpread, int maximumHitPoints, double nominalMinimumSpeed, double nominalMaximumSpeed, int collisionRadius, int gunPattern) {
        this.collisionRadius = collisionRadius;
        this.minimumSpeed = nominalMinimumSpeed / 2.0;
        this.heatReduction = heatReduction;
        this.maximumSpeed = nominalMaximumSpeed / 2.0;
        this.aimSpread = aimSpread;
        this.turnRate = turnRate;
        this.gunPattern = gunPattern;
        this.maximumHitPoints = maximumHitPoints;
        this.fireInterval = fireInterval;
    }

    static {
        field_k = 0;
    }
}
