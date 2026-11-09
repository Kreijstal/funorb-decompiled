/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static ToolkitSprite[] field_b;
    static SpriteData[] field_c;
    static ToolkitSprite field_a;

    final static Drone createEnemyDrone(int droneType, int xQ8, int variant, byte guard, int yQ8) {
        if (guard != 84) {
          return (Drone) null;
        }
        return (Drone) ((Object) new EnemyDrone(droneType, variant, xQ8, yQ8));
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        if (!param0) {
          field_c = (SpriteData[]) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, int param1, boolean param2, MusicTrack param3) {
        Object var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          if (AccountConnectionPhase.field_b != null) {
            DisplayModeErrorDialog.a(param3, param1, (byte) -87, 1048576, param2);
          }
          if (null != DroneIntroductionOverlay.field_e) {
            var4_ref = EmailCredentials.field_f;
            synchronized (var4_ref) {
              DroneIntroductionOverlay.field_e.setChannelVolumeScale((byte) -91, -1, param1);
              if (GridWidgetContainer.field_B == param3) {
                return;
              }
              DroneIntroductionOverlay.field_e.stop(0);
              EmailCredentials.field_f.flush();
              GridWidgetContainer.field_B = param3;
              if (null != GridWidgetContainer.field_B) {
                DroneIntroductionOverlay.field_e.playTrack(param2, GridWidgetContainer.field_B, 91);
              }
            }
          }
          var4_int = -69 % ((param0 + 78) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref2;
          stackIn_19_1 = new StringBuilder().append("uj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
    }
}
