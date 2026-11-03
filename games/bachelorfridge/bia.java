/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bia extends IntrusiveNode {
    static ws field_i;
    static Sprite[] field_h;
    static IntrusiveDeque field_g;
    static boolean[] field_f;

    bia() {
    }

    public static void releaseStatics(int param0) {
        int var1 = 10 / ((param0 + 27) / 54);
        field_i = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    final static void a(byte param0, long param1, int param2) {
        BitPacketBuffer var4 = null;
        int var5 = 0;
        BitPacketBuffer var4Lifetime1;
        int var5Lifetime1;
        if (param0 >= 23) {
          var4 = sja.field_fb;
          var4.writeCipheredByte(param2, (byte) 116);
          var4.position = var4.position + 1;
          var5 = var4.position;
          var4.writeByte(6, 0);
          var4.writeLong(1686281208, param1);
          var4.writeLengthByte((byte) -60, var4.position - var5);
          return;
        }
        field_h = (Sprite[]) null;
        var4Lifetime1 = sja.field_fb;
        var4Lifetime1.writeCipheredByte(param2, (byte) 116);
        var4Lifetime1.position = var4Lifetime1.position + 1;
        var5Lifetime1 = var4Lifetime1.position;
        var4Lifetime1.writeByte(6, 0);
        var4Lifetime1.writeLong(1686281208, param1);
        var4Lifetime1.writeLengthByte((byte) -60, var4Lifetime1.position - var5Lifetime1);
    }

    static {
        field_i = new ws();
        field_f = new boolean[]{true, true, false, false, false, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, true, false, false, false, false, true, true, false, true, true, false};
    }
}
