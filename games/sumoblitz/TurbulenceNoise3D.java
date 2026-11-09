/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class TurbulenceNoise3D extends FixedPointPerlinNoise3D {
    private int outputIndex;
    private int accumulatedQ12;
    static String soundText;
    private byte[] samples;
    static ToolkitSprite[] field_k;
    private int[] octaveWeightsQ12;
    static String warningText;
    static String createText;

    public static void releaseStatics(boolean param0) {
        warningText = null;
        createText = null;
        field_k = null;
        if (!param0) {
          return;
        }
        soundText = null;
    }

    final void resetOutput(int guard) {
        this.outputIndex = 0;
        this.accumulatedQ12 = 0;
        if (guard <= -7) {
          return;
        }
        IntrusiveDeque var3 = (IntrusiveDeque) null;
        TurbulenceNoise3D.a(-47, -118, 3, (IntrusiveDeque) null, 110, (byte) -26);
    }

    TurbulenceNoise3D(int noiseSeed, int octaves, int xPeriod, int yPeriod, int zPeriod, float persistence) {
        super(noiseSeed, octaves, xPeriod, yPeriod, zPeriod);
        int var7 = 0;
        this.octaveWeightsQ12 = new int[this.octaveCount];
        for (var7 = 0; var7 < this.octaveCount; var7++) {
          this.octaveWeightsQ12[var7] = (short)(int)(4096.0 * Math.pow((double)persistence, (double)var7));
        }
    }

    final static void a(int param0, int param1, int param2, IntrusiveDeque param3, int param4, byte param5) {
        float[] dupTemp$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        IntrusiveDeque var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var8Lifetime1;
        float[] var8Lifetime2;
        float[] var8Lifetime1Lifetime1;
        int var7Lifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          stackIn_4_0 = (1 != ul.field_f) ? 0 : 1;
          var6_int = stackIn_4_0;
          var7 = 0;
          if (param5 != 94) {
            var10 = (IntrusiveDeque) null;
            TurbulenceNoise3D.a(-96, 96, -59, (IntrusiveDeque) null, -77, (byte) 95);
          }
          while (true) {
            stackIn_9_0 = (var6_int != 0) ? 20 : 40;
            if (stackIn_9_0 > var7) {
              var8 = new float[]{0.0f, (float)(-(1 + ExpandingRingEffect.nextRandomInt(param1, HardwareGraphicsHeap.field_o, (byte) -96)))};
              var14 = kt.a((byte) -27, var8, (float)(0.0 + (double)(2048.0f / (float)var7) * 0.017453292519943295));
              var13 = var14;
              var11 = var13;
              var8Lifetime2 = var11;
              param3.addLast((IntrusiveNode) (new SlowBurstParticle(128, param0, param2, param4, (int)var14[0] << 8, (int)var14[1] << 8, 0)), (byte) 39);
              var7++;
              continue;
            }
            break;
          }
          var7Lifetime1 = 0;
          while (true) {
            stackIn_15_0 = (var6_int != 0) ? 50 : 100;
            if (stackIn_15_0 <= var7Lifetime1) {
              return;
            }
            var8Lifetime1 = new float[]{0.0f, (float)(-(ExpandingRingEffect.nextRandomInt(param1, HardwareGraphicsHeap.field_o, (byte) -96) + 1))};
            dupTemp$0 = kt.a((byte) -126, var8Lifetime1, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7Lifetime1) + 0.0));
            var12 = dupTemp$0;
            var8Lifetime1Lifetime1 = dupTemp$0;
            param3.addLast((IntrusiveNode) (new SlowBurstParticle(128, param0, param2, param4, (int)var12[0] << 8, (int)var12[1] << 8, 1)), (byte) 39);
            var7Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("ff.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void writeVoxel(int index, byte value, int bias) {
        int fieldTemp$0 = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.samples[fieldTemp$0] = (byte)(127 + eb.bitwiseAnd(bias, value >> 1));
    }

    final void accumulateOctave(int octave, int guard, int valueQ12) {
        this.accumulatedQ12 = this.accumulatedQ12 + (this.octaveWeightsQ12[octave] * valueQ12 >> 12);
        if (guard == 1157) {
          return;
        }
        IntrusiveDeque var5 = (IntrusiveDeque) null;
        TurbulenceNoise3D.a(66, 11, -7, (IntrusiveDeque) null, 98, (byte) -106);
    }

    final void finishVoxel(boolean guard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        this.accumulatedQ12 = Math.abs(this.accumulatedQ12);
        if (guard) {
          TurbulenceNoise3D.releaseStatics(false);
          if (this.accumulatedQ12 < 4096) {
            fieldTemp$0 = this.outputIndex;
            this.outputIndex = this.outputIndex + 1;
            this.writeVoxel(fieldTemp$0, (byte)(this.accumulatedQ12 >> 4), 127);
            this.accumulatedQ12 = 0;
            return;
          }
          this.accumulatedQ12 = 4095;
          fieldTemp$1 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeVoxel(fieldTemp$1, (byte)(this.accumulatedQ12 >> 4), 127);
          this.accumulatedQ12 = 0;
          return;
        }
        if (this.accumulatedQ12 >= 4096) {
          this.accumulatedQ12 = 4095;
          fieldTemp$2 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeVoxel(fieldTemp$2, (byte)(this.accumulatedQ12 >> 4), 127);
          this.accumulatedQ12 = 0;
          return;
        }
        int fieldTemp$3 = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.writeVoxel(fieldTemp$3, (byte)(this.accumulatedQ12 >> 4), 127);
        this.accumulatedQ12 = 0;
    }

    final static void loadGameSoundEffects(byte guard, ResourceArchive archive) {
        try {
          OpenGlCubeTexture.field_l[0] = eb.field_b.getSoundEffectByName(0, "fence_hum_bg_loop");
          OpenGlCubeTexture.field_l[2] = eb.field_b.getSoundEffectByName(0, "landmine_red_flash");
          OpenGlCubeTexture.field_l[3] = eb.field_b.getSoundEffectByName(0, "landmine_blow");
          OpenGlCubeTexture.field_l[4] = eb.field_b.getSoundEffectByName(0, "spike_trap_hum_bg_loop");
          OpenGlCubeTexture.field_l[5] = eb.field_b.getSoundEffectByName(0, "teleport_short");
          OpenGlCubeTexture.field_l[6] = eb.field_b.getSoundEffectByName(0, "accelerator_pad_1");
          OpenGlCubeTexture.field_l[7] = eb.field_b.getSoundEffectByName(0, "accelerator_pad_2");
          OpenGlCubeTexture.field_l[8] = eb.field_b.getSoundEffectByName(0, "accelerator_pad_3");
          OpenGlCubeTexture.field_l[9] = eb.field_b.getSoundEffectByName(0, "accelerator_pad_4");
          OpenGlCubeTexture.field_l[11] = eb.field_b.getSoundEffectByName(0, "attractor_pulse_loop");
          OpenGlCubeTexture.field_l[12] = eb.field_b.getSoundEffectByName(0, "repeller_pulse_loop");
          ImageProducerRasterBuffer.field_n[0] = PcmSampleStream.createAtRatePercent(OpenGlCubeTexture.field_l[4], 100, 96);
          ImageProducerRasterBuffer.field_n[1] = PcmSampleStream.createAtRatePercent(OpenGlCubeTexture.field_l[11], 100, 96);
          ImageProducerRasterBuffer.field_n[2] = PcmSampleStream.createAtRatePercent(OpenGlCubeTexture.field_l[12], 100, 96);
          OpenGlCubeTexture.field_l[17] = eb.field_b.getSoundEffectByName(0, "menu_mouseover");
          OpenGlCubeTexture.field_l[18] = eb.field_b.getSoundEffectByName(0, "multiplier_upgrade");
          OpenGlCubeTexture.field_l[19] = eb.field_b.getSoundEffectByName(0, "npc_bomb_charge_and_explode1");
          OpenGlCubeTexture.field_l[20] = eb.field_b.getSoundEffectByName(0, "npc_bomb_charge_and_explode2");
          OpenGlCubeTexture.field_l[21] = eb.field_b.getSoundEffectByName(0, "npc_bomb_charge_and_explode3");
          OpenGlCubeTexture.field_l[27] = eb.field_b.getSoundEffectByName(0, "player_pick_up");
          OpenGlCubeTexture.field_l[28] = eb.field_b.getSoundEffectByName(0, "player_release_super_charge_attack");
          OpenGlCubeTexture.field_l[29] = eb.field_b.getSoundEffectByName(0, "player_super_charge_attack");
          OpenGlCubeTexture.field_l[30] = eb.field_b.getSoundEffectByName(0, "player_death_pulse");
          OpenGlCubeTexture.field_l[33] = eb.field_b.getSoundEffectByName(0, "player_super_charge_deny");
          OpenGlCubeTexture.field_l[32] = eb.field_b.getSoundEffectByName(0, "big_targeting_laser");
          OpenGlCubeTexture.field_l[34] = eb.field_b.getSoundEffectByName(0, "firework_particles1");
          OpenGlCubeTexture.field_l[35] = eb.field_b.getSoundEffectByName(0, "firework_particles2");
          OpenGlCubeTexture.field_l[36] = eb.field_b.getSoundEffectByName(0, "firework_particles3");
          OpenGlCubeTexture.field_l[37] = eb.field_b.getSoundEffectByName(0, "firework_particles4");
          if (guard > -42) {
            IntrusiveDeque var3 = (IntrusiveDeque) null;
            TurbulenceNoise3D.a(98, 120, 16, (IntrusiveDeque) null, 107, (byte) 5);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ff.R(" + guard + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    static {
        soundText = "Sound: ";
        warningText = "Warning!";
        createText = "Create";
    }
}
