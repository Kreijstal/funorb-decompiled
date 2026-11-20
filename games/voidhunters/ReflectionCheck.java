/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheck extends IntrusiveNode {
    int id;
    int[] operationTypes;
    int operationCount;
    int[] fieldValues;
    PlatformRequest[] methodRequests;
    byte[][][] serializedArguments;
    PlatformRequest[] fieldRequests;
    int[] lookupErrors;

    final static void installKeyboardListeners(int param0, java.awt.Component param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(GetMomentOfInertiaPerpointCalcDownshift.field_q);
          param1.addFocusListener(GetMomentOfInertiaPerpointCalcDownshift.field_q);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("mv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    ReflectionCheck() {
    }

    static {
    }
}
