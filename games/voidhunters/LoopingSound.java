/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoopingSound extends IntrusiveNode {
    SoundPlayback playback;
    boolean refreshed;
    boolean positional;
    int sampleId;
    int y;
    int x;
    static float field_n;
    static TextureProvider field_e;
    int key;
    static int field_m;
    static String field_j;

    final static void setSoundEffectVolume(int param0, int param1) {
        SoundPlayback var2 = null;
        int var3 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        SoundPlayback var2Lifetime1;
        var3 = VoidHunters.field_G;
        try {
          kt.soundEffectVolume = param0;
          var2 = (SoundPlayback) (GetToggledScoreboard.field_p.first(param1 + 13205));
          if (param1 != -13205) {
            LoopingSound.clearSharedReferences(-88);
          }
          while (var2 != null) {
            if (var2.lifetimeNode.isLinked((byte) -63)) {
              var2.stream.setGain(128 + kt.soundEffectVolume * var2.baseGain >> 8);
            } else {
              var2.unlink(-3846);
            }
            var2 = (SoundPlayback) (GetToggledScoreboard.field_p.next((byte) 61));
          }
          if (null != GetSniperCannonReload.field_o) {
            var2Lifetime1 = (SoundPlayback) (GetSniperCannonReload.field_o.first(0));
            while (var2Lifetime1 != null) {
              stackIn_13_0 = var2Lifetime1.lifetimeNode.isLinked((byte) -63);
              if (!stackIn_13_0) {
                var2Lifetime1.unlink(param1 ^ 15505);
              } else {
                var2Lifetime1.stream.setGain(kt.soundEffectVolume * var2Lifetime1.baseGain + 128 >> 8);
              }
              var2Lifetime1 = (SoundPlayback) (GetSniperCannonReload.field_o.next((byte) 100));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2_ref), "nl.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 2128263208) {
          field_n = -0.17532885074615479f;
          field_e = null;
          field_j = null;
          return;
        }
        field_e = null;
        field_j = null;
    }

    LoopingSound() {
    }

    static {
        field_n = 0.20000000298023224f;
        field_j = "No";
    }
}
