/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveSource {
    static ToolkitSprite[] field_a;

    final static void a(int param0, int param1) {
        BitPacketBuffer var2 = ql.field_k;
        var2.writeCipheredOpcode(param0, -2988);
        var2.writeByte(1, 0);
        var2.writeByte(0, 0);
        if (param1 < -51) {
          return;
        }
        field_a = (ToolkitSprite[]) null;
    }

    abstract dla getIndex(boolean param0);

    abstract int getGroupProgress(int param0, int param1);

    abstract byte[] getPackedGroup(int param0, byte param1);

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 85) {
          ArchiveSource.a(102, -17);
        }
    }

    static {
    }
}
