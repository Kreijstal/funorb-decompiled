/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EnemyDrone extends Drone {
    private int spawnedDroneType;
    static vl[] field_S;

    final static void o(int param0) {
        OpenGlVertexLayout.field_f.hide(-115);
        if (param0 != 250) {
          EnemyDrone.o(-9);
        }
    }

    EnemyDrone(int droneType, int variant, int xQ8, int yQ8) {
        super(droneType, variant, xQ8, yQ8);
        int var5;
        var5 = this.droneType;
        if (var5 == 6) {
          this.spawnedDroneType = 0;
        } else {
          if (var5 != 7) {
            this.spawnedDroneType = -1;
          } else {
            this.spawnedDroneType = 1;
          }
        }
    }

    final void update(int param0) {
        super.update(-104);
        if (-1 == this.spawnedDroneType) {
          if (param0 < -55) {
            return;
          }
          EnemyDrone.releaseStatics(true);
          return;
        }
        if ((this.spawnAgeTicks - 100) % 250 != 0) {
          if (param0 < -55) {
            return;
          }
          EnemyDrone.releaseStatics(true);
          return;
        }
        HardwareUnlitEffect.a(uj.createEnemyDrone(this.spawnedDroneType, this.xQ8 - this.velocityXQ8, 0, (byte) 84, this.yQ8 - this.velocityYQ8), false);
        if (param0 < -55) {
          return;
        }
        EnemyDrone.releaseStatics(true);
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_S = null;
    }

    static {
    }
}
