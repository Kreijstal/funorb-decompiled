/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static GameApplet field_a;
    static SpriteData[] field_c;
    static byte[][] field_b;
    static int field_d;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_a = (GameApplet) null;
          field_c = null;
          field_b = (byte[][]) null;
          return;
        }
        field_c = null;
        field_b = (byte[][]) null;
    }

    final static byte[] fetchGameDataFile(byte guard, String fileName) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 87) {
            field_a = (GameApplet) null;
          }
          stackIn_3_0 = Drone.field_J.fetchNamedFile(fileName, "", -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ke.A(").append(guard).append(',');
          if (fileName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void beginCurrentWave(boolean guard) {
        if (guard) {
          field_d = -5;
        }
        if (null == Bzip2State.field_J) {
          return;
        }
        if (-1 == OpenGlShaderProgram.levelIndex) {
          return;
        }
        if (AccountServiceResult.waveIndex == -1) {
          return;
        }
        if (AccountServiceResult.waveIndex < Bzip2State.field_J.length) {
          SocketConnector.field_c = 0;
          NativeLibraryExtractor.spawnNextWaveGroup(120);
          IntroductionOverlaySupport.field_f = TextureFormat.elapsedTicks;
          StatisticsSubmissionSupport.field_a = false;
          DroneDebris.field_C = false;
        }
    }

    static {
        field_a = null;
        field_b = new byte[50][];
    }
}
