/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingScoreboardRequest extends IntrusiveNode {
    int requestedRowCount;
    int requestId;
    static PcmSample[] soundEffects;
    static String[] presetBlueprints;

    public static void clearSharedReferences(byte param0) {
        soundEffects = null;
        presetBlueprints = null;
        int var1 = 11 / ((5 - param0) / 58);
    }

    final static void showAccountStatusDialog(String param0, int param1, boolean param2) {
        try {
          RemoveEventActionFactory.field_b = true;
          CarouselConstantRequests.field_c = param2 ? true : false;
          SetPointDefenceLaserAimarc.field_o = new AccountStatusDialog(GetLagStandardDeviationIn.modalStack, GetBoostersCooldown.field_r, param0, OpenGlSprite.reconnecting, CarouselConstantRequests.field_c);
          if (param1 >= -119) {
            soundEffects = (PcmSample[]) null;
          }
          GetLagStandardDeviationIn.modalStack.pushPanel(false, SetPointDefenceLaserAimarc.field_o);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "fa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private PendingScoreboardRequest() throws Throwable {
        throw new Error();
    }

    static {
        soundEffects = new PcmSample[109];
        presetBlueprints = new String[]{"BAASAicADQESAg--BR4AHgEPAR4AD-8HIwkeAR4AD-8MJgIeAA--Aw8EEgUNDhIPDRANEQ0", "BwENAiYADQENAg0DGwQbBRsDGwUqBh8AGQEN-wcqCCoJHwANARn-CioMGw0nABsBGwIbAw0EDQUNDg0QLQ", "AwEeAQ8EIgANAQ0CHgAsAQ8EGwUN-wUNBg0HDQgNCSIAGwIeAA8BLAMNBA0GDQweAA--Dg8PDw", "BQANAycADQENAx4AGAEnAC0BDQQYBRgEDQUNBRAJIw0QDyYADQENAh4AJgAYARgEDQUtARgEDQUNEg0", "BgANAi0DHwAXAScBDQINAx4AGgENBRf-BCEAFwIX-wUfACYAFwIeAA0BGgMNBA3-ARf-Bi0IDQkuCi4LDQ"};
    }
}
