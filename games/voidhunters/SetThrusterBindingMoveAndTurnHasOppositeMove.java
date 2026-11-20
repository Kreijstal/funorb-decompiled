/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetThrusterBindingMoveAndTurnHasOppositeMove extends ConsoleCommand {
    static TextureCombineOperation field_o;
    static int field_p;

    public static void clearSharedReferences(byte param0) {
        field_o = null;
        if (param0 > -90) {
          SetThrusterBindingMoveAndTurnHasOppositeMove.getActiveCanvas((byte) 1);
        }
    }

    SetThrusterBindingMoveAndTurnHasOppositeMove(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static java.awt.Canvas getActiveCanvas(byte param0) {
        if (param0 > 62) {
          return null == EmailAvailabilityChecks.fullscreenCanvas ? GammaCorrection.canvas : (java.awt.Canvas) ((Object) EmailAvailabilityChecks.fullscreenCanvas);
        }
        field_p = 24;
        return null == EmailAvailabilityChecks.fullscreenCanvas ? GammaCorrection.canvas : (java.awt.Canvas) ((Object) EmailAvailabilityChecks.fullscreenCanvas);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.submitSettingsChange(16, 62, arguments[0].intValue(29));
          if (obfuscationGuard > -119) {
            field_o = (TextureCombineOperation) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("df.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = new TextureCombineOperation();
        field_p = 0;
    }
}
