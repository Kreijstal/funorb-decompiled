/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SynthesizedSoundEffect {
    private SynthesizerVoice[] field_c;
    private int field_a;
    private int field_b;

    final static SynthesizedSoundEffect load(ResourceArchive param0, int param1, int param2) {
        byte[] var3 = param0.getFile(param1, param2, (byte) 35);
        if (var3 == null) {
          return null;
        }
        return new SynthesizedSoundEffect(new PacketBuffer(var3));
    }

    final PcmSample toPcmSample() {
        byte[] var1 = this.synthesize();
        return new PcmSample(22050, var1, 22050 * this.field_b / 1000, 22050 * this.field_a / 1000);
    }

    final static SynthesizedSoundEffect loadByName(ResourceArchive param0, String param1, String param2) {
        byte[] var3 = param0.getFileByName(param1, param2, 24874);
        if (var3 == null) {
          return null;
        }
        return new SynthesizedSoundEffect(new PacketBuffer(var3));
    }

    private final byte[] synthesize() {
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
            this.field_c[var2].field_r + this.field_c[var2].field_t > var1) {
            var1 = this.field_c[var2].field_r + this.field_c[var2].field_t;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_c[var4] != null) {
            var5 = this.field_c[var4].field_r * 22050 / 1000;
            var6 = this.field_c[var4].field_t * 22050 / 1000;
            var13 = this.field_c[var4].synthesize(var5, this.field_c[var4].field_r);
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

    private SynthesizedSoundEffect(PacketBuffer param0) {
        int var2 = 0;
        int var3;
        this.field_c = new SynthesizerVoice[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.readUnsignedByte(31760);
          if (var3 != 0) {
            param0.position = param0.position - 1;
            this.field_c[var2] = new SynthesizerVoice();
            this.field_c[var2].decode(param0);
          }
        }
        this.field_b = param0.readUnsignedShort(-788751192);
        this.field_a = param0.readUnsignedShort(-788751192);
    }
}
