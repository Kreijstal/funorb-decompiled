/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuVertexBufferOwner {
    private GpuVertexBuffer vertexBuffer;
    static String[] field_c;
    static String field_a;

    final static void updateSoundQueues(int param0) {
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        OneShotSound var1 = null;
        LoopingSound var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          if (param0 != 17043) {
            field_a = (String) null;
          }
          if (NetworkGameClient.activeOneShotSounds != null &&
            !NetworkGameClient.activeOneShotSounds.isEmpty(-42)) {
            var1 = (OneShotSound) (NetworkGameClient.activeOneShotSounds.first(0));
            while (var1 != null) {
              if (!var1.playback.isLinked((byte) -63)) {
                var1.unlink(-3846);
              }
              var1 = (OneShotSound) (NetworkGameClient.activeOneShotSounds.next((byte) 77));
            }
          }
          if (null != PlayerReady.activeLoopingSounds) {
            stackIn_13_0 = PlayerReady.activeLoopingSounds.isEmpty(-74);
            if (stackIn_13_0) {
              return;
            }
            var1_ref = (LoopingSound) (PlayerReady.activeLoopingSounds.first(0));
            while (var1_ref != null) {
              if (!var1_ref.refreshed) {
                SmoothedNanoTickClock.stopPlayback((byte) -91, var1_ref.playback);
                var1_ref.unlink(param0 ^ -19863);
              } else {
                if (var1_ref.positional) {
                  var2 = UiToggleButtonRenderer.computeSoundPan(param0 - 16915, var1_ref.x);
                  var3 = SpriteTextureOperation.computeSoundGain((byte) 119, var1_ref.x, var1_ref.y);
                  var1_ref.playback.setGainAndPan(param0 ^ 16915, var3, var2);
                }
                var1_ref.refreshed = false;
              }
              var1_ref = (LoopingSound) (PlayerReady.activeLoopingSounds.next((byte) 12));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1_ref2), "glb.C(" + param0 + ')');
        }
    }

    GpuVertexBufferOwner(boolean param0) {
    }

    final void release(int param0) {
        if (null != this.vertexBuffer) {
          this.vertexBuffer.release(param0 - 26459);
        }
        if (param0 == 26363) {
          return;
        }
        field_a = (String) null;
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -17471) {
          GpuVertexBufferOwner.updateSoundQueues(99);
        }
    }

    static {
        field_c = new String[]{"Blue", "Yellow", "Neutral"};
        field_a = "Spectate";
    }
}
