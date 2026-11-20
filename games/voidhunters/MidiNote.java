/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MidiNote extends IntrusiveNode {
    int samplesUntilUpdate;
    static QuickChatMenuWidget field_m;
    int releasePosition;
    PcmSample sample;
    MidiEnvelope envelope;
    int channel;
    int envelopePosition;
    int portamentoDelta;
    static String field_z;
    int portamentoProgress;
    int pan;
    int decayTime;
    int releaseEnvelopeIndex;
    MusicPatch patch;
    int envelopeIndex;
    int vibratoPhase;
    int retriggerPhase;
    int basePitch;
    int age;
    int key;
    PcmSampleStream stream;
    int velocityScale;
    int exclusiveGroup;

    final static int getFontMaxDescent(int param0, byte param1) {
        if (param1 != -121) {
          field_z = (String) null;
          if (!OpenGlTexture1D.field_i) {
            return DateOfBirthTextFields.getDefaultBitmapFont(param0, param1 ^ -8013).maxDescent;
          }
          return SetTorpedoEnergyUsed.getToolkitFont(param0, 300).maxDescent;
        }
        if (!OpenGlTexture1D.field_i) {
          return DateOfBirthTextFields.getDefaultBitmapFont(param0, param1 ^ -8013).maxDescent;
        }
        return SetTorpedoEnergyUsed.getToolkitFont(param0, 300).maxDescent;
    }

    final void clearVoiceReferences(int param0) {
        this.sample = null;
        if (param0 == 25804) {
          this.stream = null;
          this.envelope = null;
          this.patch = null;
          return;
        }
        field_z = (String) null;
        this.stream = null;
        this.envelope = null;
        this.patch = null;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -25815) {
          MidiNote.clearSharedReferences(-108);
          field_m = null;
          field_z = null;
          return;
        }
        field_m = null;
        field_z = null;
    }

    final static void resetFrameTiming(int param0) {
        int var1_int = 0;
        int var2 = VoidHunters.field_G;
        int var1_intLifetime1;
        try {
          GetPedrosRepairMode.field_p.reset(-103);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            SetSniperCannonFiringLeeway.field_o[var1_int] = 0L;
          }
          if (param0 != 2096) {
            field_m = (QuickChatMenuWidget) null;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            DisplayMode.field_b[var1_intLifetime1] = 0L;
          }
          SetCountermeasureLauncherAimspeed.field_p = 0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "fkb.D(" + param0 + ')');
        }
    }

    MidiNote() {
    }

    final static void writeSerializedObject(int param0, Object param1, File param2) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          FileOutputStream var3 = null;
          IOException var3_ref = null;
          RuntimeException var3_ref2 = null;
          ObjectOutputStream var4 = null;
          SecurityException var4_ref = null;
          try {
            try {
              var3 = new FileOutputStream(param2);
              var4 = new ObjectOutputStream((OutputStream) ((Object) var3));
              if (param0 <= 36) {
                return;
              }
              var4.writeObject(param1);
              var4.close();
              var3.close();
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (IOException) (Object) decompiledCaughtException;
              try {
                param2.delete();
                return;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref = (SecurityException) (Object) decompiledCaughtException;
                return;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var3_ref2;
            stackIn_11_1 = new StringBuilder().append("fkb.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_z = "Remove clicked object";
    }
}
