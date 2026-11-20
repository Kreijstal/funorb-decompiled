/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardpointMatch {
    static int[] hintTimers;
    int distance;
    static boolean field_d;
    static String field_a;
    ShipComponent component;
    int hardpointIndex;
    static String field_c;

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        hintTimers = null;
        field_a = null;
        if (param0 != 87) {
          HardpointMatch.clearSharedReferences((byte) 17);
        }
    }

    HardpointMatch(int param0, ShipComponent param1, int param2) {
        try {
          this.distance = param2;
          this.hardpointIndex = param0;
          this.component = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "lu.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        hintTimers = new int[11];
        field_a = "WASD<br>QE<br>Left mouse button<br>Right mouse button<br>Mouse wheel or + and - keys";
        field_c = "Remove <%0> from ignore list";
    }
}
