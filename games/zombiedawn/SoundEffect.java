/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEffect {
    private int field_a;
    private int field_b;
    private SynthInstrument[] field_c;

    private final byte[] mix() {
        int var4 = 0;
        int var8 = 0;
        int var1;
        int var2;
        byte[] var3;
        int var5;
        int var6;
        int var9;
        int[] var13;
        int var2Lifetime1;
        var1 = 0;
        for (var2 = 0; var2 < 10; var2++) {
          if (this.field_c[var2] != null &&
            this.field_c[var2].field_y + this.field_c[var2].field_b > var1) {
            var1 = this.field_c[var2].field_y + this.field_c[var2].field_b;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_c[var4] != null) {
            var5 = this.field_c[var4].field_y * 22050 / 1000;
            var6 = this.field_c[var4].field_b * 22050 / 1000;
            var13 = this.field_c[var4].synthesize(var5, this.field_c[var4].field_y);
            for (var8 = 0; var8 < var5; var8++) {
              var9 = var3[var8 + var6] + (var13[var8] >> 8);
              if ((var9 + 128 & -256) != 0) {
                var9 = var9 >> 31 ^ 127;
              }
              var3[var8 + var6] = (byte)var9;
            }
          }
        }
        return var3;
    }

    final PcmSample toPcmSample() {
        byte[] var1 = this.mix();
        return new PcmSample(22050, var1, 22050 * this.field_a / 1000, 22050 * this.field_b / 1000);
    }

    final static SoundEffect load(Js5Archive param0, String param1, String param2) {
        byte[] var3 = param0.getFileByName(param2, -115, param1);
        if (var3 == null) {
          return null;
        }
        return new SoundEffect(new PacketBuffer(var3));
    }

    private SoundEffect(PacketBuffer param0) {
        int var2 = 0;
        int var3;
        this.field_c = new SynthInstrument[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.readUnsignedByte((byte) -119);
          if (var3 != 0) {
            param0.position = param0.position - 1;
            this.field_c[var2] = new SynthInstrument();
            this.field_c[var2].decode(param0);
          }
        }
        this.field_a = param0.readUnsignedShort(2);
        this.field_b = param0.readUnsignedShort(2);
    }

    final static SoundEffect load(Js5Archive param0, int param1, int param2) {
        byte[] var3 = param0.getFile((byte) 51, param1, param2);
        if (var3 == null) {
          return null;
        }
        return new SoundEffect(new PacketBuffer(var3));
    }
}
