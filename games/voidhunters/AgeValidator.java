/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextFieldValidator {
    static boolean field_g;
    static String field_h;
    static ShipBody field_i;
    static int field_f;

    final ValidationState validateValue(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!SetPointDefenceLaserAimarc.a(var4, param1 ^ 16394)) {
            stackIn_2_0 = SetArmageddonLength.invalidInput;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = NebulaFieldFactory.parseDecimalInt(-73, var5);
          if (var3_int > 0 &&
            var3_int <= 130) {
            if (param1 != 16384) {
              AgeValidator.configureReverb(-0.8688769340515137f, 0.8470385074615479f, 1.5502856969833374f, 23, 0.4921734631061554f, 0.5438073873519897f, -1.1896488666534424f);
            }
            stackIn_11_0 = GetShipPersistence.validInput;
            return stackIn_11_0;
          }
          stackIn_7_0 = SetArmageddonLength.invalidInput;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("wgb.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 <= 64) {
          AgeValidator.clearSharedReferences(53);
          field_i = null;
          field_h = null;
          return;
        }
        field_i = null;
        field_h = null;
    }

    AgeValidator(UiTextField param0) {
        super(param0);
    }

    final String getValueValidationMessage(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.validateValue(param0, 16384) != SetArmageddonLength.invalidInput) {
            return null;
          }
          stackIn_6_0 = SetSniperCannonProjectiles.field_p;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wgb.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void configureReverb(float param0, float param1, float param2, int param3, float param4, float param5, float param6) {
        if (FloatNoiseSliceGenerator.field_b == null) {
          FloatNoiseSliceGenerator.field_b = new ReverbPcmStream(MaskedPasswordTextStyle.effectsMixer);
          LobbyGameContextMenuBuilder.effectsOutput.setStream(FloatNoiseSliceGenerator.field_b);
          FloatNoiseSliceGenerator.field_b.setInputGain(param0);
          FloatNoiseSliceGenerator.field_b.setFeedback(param4);
          FloatNoiseSliceGenerator.field_b.setDampingTime(param2);
          if (param3 != -131) {
            field_h = (String) null;
            FloatNoiseSliceGenerator.field_b.setWetGain(param5);
            FloatNoiseSliceGenerator.field_b.setDryGain(param1);
            FloatNoiseSliceGenerator.field_b.setStereoWidth(param6);
            return;
          }
          FloatNoiseSliceGenerator.field_b.setWetGain(param5);
          FloatNoiseSliceGenerator.field_b.setDryGain(param1);
          FloatNoiseSliceGenerator.field_b.setStereoWidth(param6);
          return;
        }
        FloatNoiseSliceGenerator.field_b.setInputGain(param0);
        FloatNoiseSliceGenerator.field_b.setFeedback(param4);
        FloatNoiseSliceGenerator.field_b.setDampingTime(param2);
        if (param3 == -131) {
          FloatNoiseSliceGenerator.field_b.setWetGain(param5);
          FloatNoiseSliceGenerator.field_b.setDryGain(param1);
          FloatNoiseSliceGenerator.field_b.setStereoWidth(param6);
          return;
        }
        field_h = (String) null;
        FloatNoiseSliceGenerator.field_b.setWetGain(param5);
        FloatNoiseSliceGenerator.field_b.setDryGain(param1);
        FloatNoiseSliceGenerator.field_b.setStereoWidth(param6);
    }

    static {
        field_h = "Butterfly chassis";
        field_g = false;
        field_i = null;
    }
}
