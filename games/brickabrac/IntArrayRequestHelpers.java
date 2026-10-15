/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntArrayRequestHelpers extends IntrusiveNode {
    int field_k;
    int field_i;
    static String waitingForLevelsText;

    final static IntArrayRequest requestIntArray(int valueCount, byte obfuscationGuard, int requestId, int opcode) {
        IntArrayRequest var4 = new IntArrayRequest();
        var4.requestId = requestId;
        if (obfuscationGuard <= -68) {
          var4.values = new int[valueCount];
          PasswordFieldRenderer.pendingIntArrayRequests.addLast(var4, (byte) 3);
          AchievementIcon.sendIntArrayRequest(opcode, var4, 108);
          return var4;
        }
        waitingForLevelsText = (String) null;
        var4.values = new int[valueCount];
        PasswordFieldRenderer.pendingIntArrayRequests.addLast(var4, (byte) 3);
        AchievementIcon.sendIntArrayRequest(opcode, var4, 108);
        return var4;
    }

    private IntArrayRequestHelpers() throws Throwable {
        throw new Error();
    }

    public static void clearWaitingForLevelsText(byte obfuscationGuard) {
        waitingForLevelsText = null;
        if (obfuscationGuard != -102) {
          waitingForLevelsText = (String) null;
        }
    }

    static {
        waitingForLevelsText = "Waiting for levels";
    }
}
