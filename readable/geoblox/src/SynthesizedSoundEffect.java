/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SynthesizedSoundEffect {
    private int field_c;
    private int field_b;
    private ed[] field_a;

    final PcmSample a() {
        byte[] var1 = this.b();
        return new PcmSample(22050, var1, 22050 * this.field_c / 1000, 22050 * this.field_b / 1000);
    }

    private final byte[] b() {
        int var8 = 0;
        int var1;
        int var2;
        byte[] var3;
        int var4;
        int var5;
        int var6;
        int var9;
        int[] var13;
        var1 = 0;
        for (var2 = 0; var2 < 10; var2++) {
          if (this.field_a[var2] == null) {
            continue;
          }
          if (this.field_a[var2].field_d + this.field_a[var2].field_v <= var1) {
            continue;
          }
          var1 = this.field_a[var2].field_d + this.field_a[var2].field_v;
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2 = 22050 * var1 / 1000;
        var3 = new byte[var2];
        var4 = 0;
        while (true) {
          if (var4 >= 10) {
            return var3;
          }
          if (this.field_a[var4] == null) {
            var4++;
            continue;
          }
          var5 = this.field_a[var4].field_d * 22050 / 1000;
          var6 = this.field_a[var4].field_v * 22050 / 1000;
          var13 = this.field_a[var4].a(var5, this.field_a[var4].field_d);
          for (var8 = 0; var8 < var5; var8++) {
            var9 = var3[var8 + var6] + (var13[var8] >> 8);
            if ((var9 + 128 & -256) != 0) {
              var9 = var9 >> 31 ^ 127;
            }
            var3[var8 + var6] = (byte)var9;
          }
          var4++;
          continue;
        }
    }

    private SynthesizedSoundEffect(ByteArrayBuffer param0) {
        int var2 = 0;
        int var3;
        this.field_a = new ed[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.readUnsignedByte((byte) 34);
          if (var3 == 0) {
            continue;
          }
          param0.position = param0.position - 1;
          this.field_a[var2] = new ed();
          this.field_a[var2].a(param0);
        }
        this.field_c = param0.readUnsignedShortBE(true);
        this.field_b = param0.readUnsignedShortBE(true);
    }

    final static SynthesizedSoundEffect a(ResourceArchive param0, int param1, int param2) {
        byte[] var3 = param0.getFile(param1, -28153, param2);
        if (var3 == null) {
            return null;
        }
        return new SynthesizedSoundEffect(new ByteArrayBuffer(var3));
    }
}
