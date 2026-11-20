/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SoundCache {
    private NodeHashTable pendingMusicSamples;
    static String field_b;
    private ResourceArchive soundEffectArchive;
    private ResourceArchive musicSampleArchive;
    private NodeHashTable decodedSamples;

    private final PcmSample loadMusicSample(byte param0, int param1, int[] param2, int param3) {
        PcmSample discarded$0 = null;
        PcmSample stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        PcmSample stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        VorbisSample var9 = null;
        String var10 = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = (param3 << 4 & 65522 | param3 >>> 12) ^ param1;
          if (param0 <= 52) {
            var10 = (String) null;
            discarded$0 = this.loadNamedMusicSample((String) null, (int[]) null, (byte) -7, (String) null);
          }
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (PcmSample) (this.decodedSamples.get(var6, 103));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param2 != null &&
            0 >= param2[0]) {
            return null;
          }
          var9 = (VorbisSample) (this.pendingMusicSamples.get(var6, 117));
          if (var9 == null) {
            var9 = VorbisSample.load(this.musicSampleArchive, param3, param1);
            if (var9 == null) {
              stackIn_14_0 = null;
              return (PcmSample) (stackIn_14_0);
            }
            this.pendingMusicSamples.put(var6, var9, (byte) -122);
          }
          var8Lifetime1 = var9.toPcmSample(param2);
          if (var8Lifetime1 == null) {
            stackIn_18_0 = null;
            return (PcmSample) (stackIn_18_0);
          }
          var9.unlink(-3846);
          this.decodedSamples.put(var6, var8Lifetime1, (byte) -114);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("bmb.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    private final PcmSample loadNamedMusicSample(String param0, int[] param1, byte param2, String param3) {
        PcmSample discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        PcmSample stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > 0) {
            var7 = (int[]) null;
            discarded$1 = this.loadSoundEffect(-78, (byte) 66, -88, (int[]) null);
          }
          var5_int = this.musicSampleArchive.getGroupId(param0, -75);
          if (var5_int < 0) {
            stackIn_4_0 = null;
            return (PcmSample) (stackIn_4_0);
          }
          var6 = this.musicSampleArchive.getFileId(true, var5_int, param3);
          if (var6 >= 0) {
            stackIn_9_0 = this.loadMusicSample((byte) 123, var6, param1, var5_int);
            return stackIn_9_0;
          }
          stackIn_7_0 = null;
          return (PcmSample) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("bmb.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void initializeClientProtocol(int param0, int param1, int param2, int param3, PlatformService param4, long param5, String param6, boolean param7, int param8, int param9, boolean param10, int param11, int param12, int param13) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            AccountNameAvailabilityReplies.field_b = new IsaacPacketBuffer(param13);
            RequestNewestBlackboxRecording.field_p = new IsaacPacketBuffer(param0);
            bia.field_d = param1;
            GetAutozoomAmountMultiply.field_p = param6;
            TextureBezierShape.field_n = param4;
            lmb.field_b = param11;
            GetBombletSprayReload.field_q = param10;
            SetNebulaProximityFadeDownshift.field_p = param8;
            GetDebrisSurvives.field_o = param5;
            PanelWidthQuery.field_c = param9;
            GetUseRectFill.field_p = param12;
            ProjectileFactory.field_a = param3;
            if (param2 < 46) {
              SoundCache.clearSharedReferences((byte) -11);
            }
            GetRespawnTime.field_o = param7;
            if (null == TextureBezierShape.field_n.randomFile) {
              return;
            }
            try {
              SetCountermeasureLauncherAimarc.field_r = new BufferedFile(TextureBezierShape.field_n.randomFile, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var15_ref;
            stackIn_12_1 = new StringBuilder().append("bmb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final PcmSample loadSoundEffect(int param0, byte param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        SoundEffect var9 = null;
        int var10 = 0;
        PcmSample var11 = null;
        PcmSample stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        PcmSample stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = (param0 << 4 & 65530 | param0 >>> 12) ^ param2;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (PcmSample) (this.decodedSamples.get(var6, 103));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_7_0 = null;
            return (PcmSample) (stackIn_7_0);
          }
          var9 = SoundEffect.load(this.soundEffectArchive, param0, param2);
          if (var9 == null) {
            return null;
          }
          var11 = var9.toPcmSample();
          var8Lifetime1 = var11;
          this.decodedSamples.put(var6, var8Lifetime1, (byte) -113);
          if (param3 != null) {
            param3[0] = param3[0] - var11.samples.length;
          }
          var10 = 3 / ((param1 - 67) / 51);
          stackIn_14_0 = var8Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("bmb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final PcmSample getMusicSampleByName(String param0, String param1, byte param2) {
        RuntimeException var4 = null;
        String var5 = null;
        PcmSample stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 48) {
            var5 = (String) null;
            this.getMusicSampleByName((String) null, (String) null, (byte) 100);
          }
          stackIn_3_0 = this.loadNamedMusicSample(param0, (int[]) null, (byte) -56, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bmb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final PcmSample getMusicSample(byte param0, int param1, int[] param2) {
        PcmSample discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.musicSampleArchive.getGroupCapacity((byte) 95) == 1) {
            stackIn_3_0 = this.loadMusicSample((byte) 101, param1, param2, 0);
            return stackIn_3_0;
          }
          if (this.musicSampleArchive.getGroupFileCapacity(param1, param0 - 7069) == 1) {
            stackIn_7_0 = this.loadMusicSample((byte) 112, 0, param2, param1);
            return stackIn_7_0;
          }
          if (param0 != 127) {
            var5 = (int[]) null;
            discarded$1 = this.loadMusicSample((byte) -33, -89, (int[]) null, -16);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("bmb.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final PcmSample getSoundEffect(byte param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.soundEffectArchive.getGroupCapacity((byte) 68) == 1) {
            stackIn_2_0 = this.loadSoundEffect(0, (byte) -68, param2, param1);
            return stackIn_2_0;
          }
          if (param0 != -16) {
            field_b = (String) null;
          }
          if (this.soundEffectArchive.getGroupFileCapacity(param2, param0 ^ 6930) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.loadSoundEffect(param2, (byte) -93, 0, param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("bmb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = -76 / ((37 - param0) / 55);
        field_b = null;
    }

    SoundCache(ResourceArchive param0, ResourceArchive param1) {
        this.pendingMusicSamples = new NodeHashTable(256);
        this.decodedSamples = new NodeHashTable(256);
        try {
          this.soundEffectArchive = param0;
          this.musicSampleArchive = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bmb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Resizable";
    }
}
