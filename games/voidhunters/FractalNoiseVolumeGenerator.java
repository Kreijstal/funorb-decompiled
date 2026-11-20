/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class FractalNoiseVolumeGenerator extends PerlinNoiseVolumeGenerator {
    private int accumulatedValue;
    private int outputIndex;
    static String field_m;
    private byte[] output;
    private int[] octaveAmplitudes;

    final void accumulateOctave(int param0, int param1, int param2) {
        int var4 = -50 / ((-53 - param0) / 48);
        this.accumulatedValue = this.accumulatedValue + (param2 * this.octaveAmplitudes[param1] >> 12);
    }

    final static void reportClientError(Throwable param0, String param1, int param2) {
        try {
          PlatformService stackIn_13_0;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          StringBuilder stackIn_13_4;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          String stackIn_14_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformRequest var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = VoidHunters.field_G;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = GetMachineGunProjectileDamage.a(true, param0);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            pa.a(var3, 3);
            var7 = sh.a("%3a", ":", var3, param2 + param2);
            var8 = sh.a("%40", "@", var7, param2 + 0);
            var9 = sh.a("%26", "&", var8, 0);
            var10 = sh.a("%23", "#", var9, param2 + 0);
            if (null == SetMachineGunAimspeed.field_p) {
              return;
            }
            stackIn_13_0 = MissionList.field_b;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = SetMachineGunAimspeed.field_p.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(Under13AccountNoticePanel.field_y).append("&u=");
            if (null != LegacyOpenGlUnlitEffect.field_d) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = LegacyOpenGlUnlitEffect.field_d;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + UiComboBoxList.field_C;
            }
            var4 = ((PlatformService) (Object) stackIn_13_0).openUrlStream(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(PlatformService.javaVendor).append("&v2=").append(PlatformService.javaVersion).append("&e=").append(var10).toString()), 108);
            while (var4.status == 0) {
              BufferedFile.sleep(120, 1L);
            }
            if (var4.status == 1) {
              var5 = (DataInputStream) (var4.result);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void writeSample(int param0, int param1, byte param2) {
        int fieldTemp$0 = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.output[fieldTemp$0] = (byte)((dla.andBits((int) param2, 255) >> 1) + 127);
        if (param0 != 1111320769) {
          this.accumulateOctave(-23, -5, 87);
        }
    }

    final void finishSample(int param0) {
        int fieldTemp$0 = 0;
        this.accumulatedValue = Math.abs(this.accumulatedValue);
        if (this.accumulatedValue >= 4096) {
          this.accumulatedValue = 4095;
          fieldTemp$0 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeSample(1111320769, fieldTemp$0, (byte)(this.accumulatedValue >> 4));
          if (param0 != 1424903724) {
            return;
          }
          this.accumulatedValue = 0;
          return;
        }
        int fieldTemp$1 = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.writeSample(1111320769, fieldTemp$1, (byte)(this.accumulatedValue >> 4));
        if (param0 != 1424903724) {
          return;
        }
        this.accumulatedValue = 0;
    }

    final void resetGeneration(boolean param0) {
        this.accumulatedValue = 0;
        if (!param0) {
          return;
        }
        this.outputIndex = 0;
    }

    FractalNoiseVolumeGenerator(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        this.octaveAmplitudes = new int[this.octaveCount];
        for (var7 = 0; var7 < this.octaveCount; var7++) {
          this.octaveAmplitudes[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          FractalNoiseVolumeGenerator.clearSharedReferences(false);
          field_m = null;
          return;
        }
        field_m = null;
    }

    static {
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
