/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerGameDataFactory implements GameStateFactory {
    final static void a(boolean param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = VoidHunters.field_G;
        try {
          if (!SetReloadBarWidth.isCachedFrameAvailable((byte) -124)) {
            if (null != psb.field_b &&
              psb.field_b.focusLost) {
              spb.a((byte) -95);
              qn.field_h.a(false, new mr(qn.field_h, AdminMessageFactory.field_a));
            }
            return;
          }
          qn.field_h.processPointerInput((byte) -5, ata.field_H, SetOndamageParticleFadestart.field_o, param0);
          qn.field_h.h(19976);
          while (ata.e(127)) {
            qn.field_h.dispatchKey(-9445, SetBombletSprayProjectileDamage.field_o, SetClientSideDragging.field_r);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "csb.C(" + param0 + ')');
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -98 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new PlayerGameData());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          PlayerGameDataFactory.a(true);
          return (SerializableGameState[]) ((Object) new PlayerGameData[param1]);
        }
        return (SerializableGameState[]) ((Object) new PlayerGameData[param1]);
    }

    static {
    }
}
