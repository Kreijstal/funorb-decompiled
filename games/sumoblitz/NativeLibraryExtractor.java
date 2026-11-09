/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class NativeLibraryExtractor {
    static IntrusiveDeque hudMessages;
    static IsaacPacketBuffer incomingPacket;

    final static boolean spawnNextWaveGroup(int guard) {
        int var5 = 0;
        Drone[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var11 = 0;
        DroneWave var12 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        Drone var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (Bzip2State.field_J == null) {
            return false;
          }
          if (AccountServiceResult.waveIndex == -1) {
            return false;
          }
          if (Bzip2State.field_J.length <= AccountServiceResult.waveIndex) {
            return false;
          }
          var12 = Bzip2State.field_J[AccountServiceResult.waveIndex];
          var2 = var12.drones;
          var3 = 0;
          var4 = 26 / ((67 - guard) / 42);
          for (var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != null &&
              var2[var5].field_F == SocketConnector.field_c) {
              var6 = var2[var5];
              var7 = var6.xQ8;
              var8 = var6.yQ8;
              var9 = var6.droneType;
              var10 = var6.variant;
              var3 = 1;
              HardwareUnlitEffect.a(EnemyDroneFactory.createEnemyDrone(var9, var7, var10, (byte) 84, var8), false);
            }
          }
          SocketConnector.field_c = SocketConnector.field_c + 1;
          if (var3 != 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "ig.A(" + guard + ')');
        }
    }

    final static void restoreMusicVolume(int guard) {
        if (guard != 22075) {
          NativeLibraryExtractor.restoreMusicVolume(66);
        }
        LegacyOpenGlRenderBufferSet.setMusicVolume(0, 256);
    }

    final static int prepareNativeLibrary(String libraryName, boolean guard) {
        int var8_int = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!guard) {
            hudMessages = (IntrusiveDeque) null;
          }
          if (!NineSlicePanel.field_e.field_f) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (TextureCombineSource.field_b.containsKey(libraryName)) {
            stackIn_10_0 = 100;
            return stackIn_10_0;
          }
          var10 = OpenGlBuffer.a((byte) 53, libraryName);
          if (var10 == null) {
            stackIn_14_0 = -1;
            return stackIn_14_0;
          }
          var3 = OpenGlUnderwaterEffect.field_n + var10;
          if (!GraphicsToolkit.field_e.hasFileName("", var3, -1)) {
            stackIn_17_0 = -1;
            return stackIn_17_0;
          }
          if (!GraphicsToolkit.field_e.tryLoadNamedGroup(var3, 100)) {
            stackIn_20_0 = GraphicsToolkit.field_e.namedGroupLoadPercent(var3, (byte) 33);
            return stackIn_20_0;
          }
          var15 = GraphicsToolkit.field_e.fetchNamedFile("", var3, -1);
          var13 = var15;
          var4 = var13;
          var5 = null;
          try {
            var11 = CacheFileLocator.getCacheFile(var10, (byte) -8);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          if (var4 != null &&
            var11 != null) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var6 = 1;
            var14 = DirectByteArrayStorage.readEntireFile(var11, (byte) -23);
            var12 = var14;
            var7 = var12;
            if (var7 != null &&
              var14.length == var15.length) {
              for (var8_int = 0; var14.length > var8_int; var8_int++) {
                if (var14[var8_int] != var15[var8_int]) {
                  var6 = 0;
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              var6 = 0;
            }
            try {
              if (var6 == 0) {
                NineSlicePanel.field_e.a(var15, -31357, var11);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var8 = decompiledCaughtException;
              stackIn_42_0 = -1;
              return stackIn_42_0;
            }
            AudioOutputBootstrap.registerNativeLibraryFile(var11, libraryName, 23295);
            stackIn_44_0 = 100;
            return stackIn_44_0;
          }
          stackIn_46_0 = -1;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_49_0 = var2;
          stackIn_49_1 = new StringBuilder().append("ig.C(");
          if (libraryName == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          incomingPacket = (IsaacPacketBuffer) null;
        }
        hudMessages = null;
        incomingPacket = null;
    }

    static {
        hudMessages = new IntrusiveDeque();
    }
}
