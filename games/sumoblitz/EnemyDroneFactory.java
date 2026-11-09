/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EnemyDroneFactory {
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

    final static void setMusicTrack(byte guard, int volume, boolean loop, MusicTrack track) {
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
            DisplayModeErrorDialog.a(track, volume, (byte) -87, 1048576, loop);
          }
          if (null != DroneIntroductionOverlay.field_e) {
            var4_ref = EmailCredentials.field_f;
            synchronized (var4_ref) {
              DroneIntroductionOverlay.field_e.setChannelVolumeScale((byte) -91, -1, volume);
              if (GridWidgetContainer.field_B == track) {
                return;
              }
              DroneIntroductionOverlay.field_e.stop(0);
              EmailCredentials.field_f.flush();
              GridWidgetContainer.field_B = track;
              if (null != GridWidgetContainer.field_B) {
                DroneIntroductionOverlay.field_e.playTrack(loop, GridWidgetContainer.field_B, 91);
              }
            }
          }
          var4_int = -69 % ((guard + 78) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref2;
          stackIn_19_1 = new StringBuilder().append("uj.A(").append(guard).append(',').append(volume).append(',').append(loop).append(',');
          if (track == null) {
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
