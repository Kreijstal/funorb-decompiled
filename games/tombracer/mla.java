/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mla {
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        if (param0 < -22) {
          return ((SpriteSampleOperator.field_s == this ? 1 : 0) | (this == cha.field_d ? 1 : 0)) != 0;
        }
        return false;
    }

    final static void a(int param0, int param1) {
        BitPacketBuffer var6 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 < -83) {
          var6 = ql.field_k;
          var6.writeCipheredOpcode(param0, -2988);
          var6.position = var6.position + 1;
          var3 = var6.position;
          var6.writeByte(5, 0);
          var6.writeByte(C2SChooseRewardPacket.field_a.field_Jb, 0);
          var4 = (C2SChooseRewardPacket.field_a.field_yb << 6) + C2SChooseRewardPacket.field_a.field_cc;
          var6.writeByte(var4, 0);
          var6.writeBytes(0, C2SChooseRewardPacket.field_a.field_ac, C2SChooseRewardPacket.field_a.field_ac.length, 121);
          var6.backpatchByteLength(var6.position - var3, (byte) -97);
          return;
        }
        mla.a(-5, 33);
        BitPacketBuffer var5 = ql.field_k;
        var5.writeCipheredOpcode(param0, -2988);
        var5.position = var5.position + 1;
        var3Lifetime1 = var5.position;
        var5.writeByte(5, 0);
        var5.writeByte(C2SChooseRewardPacket.field_a.field_Jb, 0);
        var4Lifetime1 = (C2SChooseRewardPacket.field_a.field_yb << 6) + C2SChooseRewardPacket.field_a.field_cc;
        var5.writeByte(var4Lifetime1, 0);
        var5.writeBytes(0, C2SChooseRewardPacket.field_a.field_ac, C2SChooseRewardPacket.field_a.field_ac.length, 121);
        var5.backpatchByteLength(var5.position - var3Lifetime1, (byte) -97);
    }

    static {
    }
}
