/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SquadOrderSupport {
    static String field_a;

    final static void swapSquadOrder(int param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        ManagerAction var3 = null;
        ManagerAction var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          if (!param1) {
            return;
          }
          var3 = (ManagerAction) (MusicPatchNode.field_h.last(-9033));
          while (var3 != null) {
            if (var3.actionType == 9) {
              var3.unlink((byte) -109);
              var3 = (ManagerAction) (MusicPatchNode.field_h.last(-9033));
              continue;
            }
            break;
          }
          var4 = RegistrationRequestState.field_h.createOrderSwapAction(param2, -86, param0);
          AchievementSubmission.applyAndQueueManagerAction(var4, 85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "di.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -10) {
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Leagues";
    }
}
