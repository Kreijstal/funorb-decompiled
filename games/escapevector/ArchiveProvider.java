/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveProvider {
    static rf field_a;
    static Sprite[] field_b;
    static PcmSample field_d;
    static String field_c;

    public static void releaseStatics(byte guard) {
        field_b = null;
        int var1 = -26 / ((guard - 63) / 44);
        field_c = null;
        field_a = null;
        field_d = null;
    }

    abstract byte[] getEncodedGroup(byte guard, int groupId);

    abstract ArchiveIndex getIndex(int guard);

    abstract int groupProgress(int guard, int groupId);

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4) {
        Sprite[] var6 = new Sprite[9];
        Sprite[] var5 = var6;
        Sprite dupTemp$0 = of.a(param0, (byte) -87, param3);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[param2] = dupTemp$0;
        var5[0] = dupTemp$0;
        Sprite dupTemp$1 = of.a(param1, (byte) 104, param3);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param4 != 0) {
          var6[4] = of.a(param4, (byte) 97, 64);
        }
        return var5;
    }

    static {
        field_b = new Sprite[17];
        field_a = new rf();
        field_c = "Extra thrust";
    }
}
