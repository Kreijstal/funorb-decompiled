/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends IntrusiveNode {
    int field_k;
    int field_i;
    static String field_j;

    final static IntArrayRequest requestIntArray(int valueCount, byte obfuscationGuard, int requestId, int opcode) {
        IntArrayRequest var4 = new IntArrayRequest();
        var4.requestId = requestId;
        if (obfuscationGuard <= -68) {
          var4.values = new int[valueCount];
          PasswordFieldRenderer.pendingIntArrayRequests.addLast(var4, (byte) 3);
          AchievementIcon.sendIntArrayRequest(opcode, var4, 108);
          return var4;
        }
        field_j = (String) null;
        var4.values = new int[valueCount];
        PasswordFieldRenderer.pendingIntArrayRequests.addLast(var4, (byte) 3);
        AchievementIcon.sendIntArrayRequest(opcode, var4, 108);
        return var4;
    }

    private fa() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 != -102) {
          field_j = (String) null;
        }
    }

    static {
        field_j = "Waiting for levels";
    }
}
