/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerRecordReadQueueEntry extends IntrusiveNode {
    static int field_d;

    private IntegerRecordReadQueueEntry() throws Throwable {
        throw new Error();
    }

    final static boolean matchesIndexBufferMask(int param0, int param1, byte param2) {
        int var3 = 50 % ((73 - param2) / 32);
        return GetPhasedEnergyBeamAimarc.matchesIndexDataMask(param0, false, param1) & MovingObjectFactory.a(param1, -1104, param0);
    }

    static {
        field_d = 32;
    }
}
