/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioPump implements Runnable {
    volatile boolean running;
    static boolean[] field_a;
    volatile AudioOutput[] outputs;
    PlatformService platform;
    volatile boolean stopRequested;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != -11954) {
          AudioPump.isCp1252Character('\021', false);
        }
    }

    final static void a(int param0, int param1, int param2) {
        LobbyGameEntry var6 = null;
        LobbyGameEntry var7 = null;
        IsaacPacketBuffer var4 = null;
        IsaacPacketBuffer var4Lifetime1;
        if (param1 != GetMachineGunPulsetime.field_q) {
          var6 = (LobbyGameEntry) (GetLaserReload.field_r.get(-1, (long)GetMachineGunPulsetime.field_q));
          var7 = var6;
          if (var7 != null) {
            var7.field_Ib = null;
          } else {
            GetMachineGunPulsetime.field_q = param1;
            var4 = RequestNewestBlackboxRecording.field_p;
            var4.writeIsaacByte(24335, param0);
            var4.writeByte(0, 3);
            var4.writeByte(0, 11);
            var4.writeShort(param1, true);
            if (param2 < 42) {
              field_a = (boolean[]) null;
              return;
            }
            return;
          }
          GetMachineGunPulsetime.field_q = param1;
          var4Lifetime1 = RequestNewestBlackboxRecording.field_p;
          var4Lifetime1.writeIsaacByte(24335, param0);
          var4Lifetime1.writeByte(0, 3);
          var4Lifetime1.writeByte(0, 11);
          var4Lifetime1.writeShort(param1, true);
          if (param2 < 42) {
            field_a = (boolean[]) null;
            return;
          }
          return;
        }
        if (param2 >= 42) {
          return;
        }
        field_a = (boolean[]) null;
    }

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = VoidHunters.field_G;
        this.running = true;
        try {
          try {
            while (!this.stopRequested) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.outputs[var1_int];
                if (var2 != null) {
                  var2.service();
                }
              }
              BufferedFile.sleep(-106, 10L);
              var5 = (Object) null;
              LegacyOpenGlShader.pumpEventQueue((byte) 97, this.platform, (Object) null);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var6 = (String) null;
            FractalNoiseVolumeGenerator.reportClientError((Throwable) ((Object) var1), (String) null, 0);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.running = false;
          throw AudioPump.<RuntimeException>rethrowUnchecked(var3);
        }
        this.running = false;
    }

    final static boolean isCp1252Character(char param0, boolean param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (!param1) {
            return false;
          }
          if (param0 > 0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = TextureFilterMode.field_c;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (var4 == param0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var2_ref), "mia.A(" + param0 + ',' + param1 + ')');
        }
    }

    AudioPump() {
        this.outputs = new AudioOutput[2];
        this.stopRequested = false;
        this.running = false;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
