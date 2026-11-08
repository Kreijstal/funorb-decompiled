/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEffect {
    private int field_b;
    private int field_a;
    private SynthInstrument[] field_c;

    final static SoundEffect load(Js5Archive param0, int param1, int param2) {
        byte[] var3 = param0.getFile(param1, param2, 0);
        if (var3 == null) {
          return null;
        }
        return new SoundEffect(new PacketBuffer(var3));
    }

    private final byte[] mixSamples() {
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
            this.field_c[var2].field_q + this.field_c[var2].field_g > var1) {
            var1 = this.field_c[var2].field_q + this.field_c[var2].field_g;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_c[var4] != null) {
            var5 = this.field_c[var4].field_q * 22050 / 1000;
            var6 = this.field_c[var4].field_g * 22050 / 1000;
            var13 = this.field_c[var4].synthesize(var5, this.field_c[var4].field_q);
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
        byte[] var1 = this.mixSamples();
        return new PcmSample(22050, var1, 22050 * this.field_a / 1000, 22050 * this.field_b / 1000);
    }

    private SoundEffect(PacketBuffer param0) {
        int var2 = 0;
        int var3;
        this.field_c = new SynthInstrument[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.readUnsignedByte(11132);
          if (var3 != 0) {
            param0.position = param0.position - 1;
            this.field_c[var2] = new SynthInstrument();
            this.field_c[var2].decode(param0);
          }
        }
        this.field_a = param0.readUnsignedShort((byte) 114);
        this.field_b = param0.readUnsignedShort((byte) 58);
    }
}
