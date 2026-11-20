/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    boolean cleanupMarked;
    volatile boolean pending;
    boolean priority;
    static int field_m;

    abstract byte[] getData(int param0);

    abstract int getLoadPercent(byte param0);

    ArchiveRequest() {
        this.pending = true;
    }

    final static void a(int param0, int param1, long param2, boolean param3, String param4) {
        try {
          GetWaitForPlayers.field_p = param1;
          ConsoleSettingsScript.field_b = param2;
          IncrementVariableActionFactoryHolder.field_b = param4;
          SetThrusterBindingBalanceThreshold.field_o = true;
          EmailAvailabilityCheckFactory.field_a = param0;
          if (param3) {
            String var7 = (String) null;
            ArchiveRequest.a(50, -52, 121L, false, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jtb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 2560;
    }
}
