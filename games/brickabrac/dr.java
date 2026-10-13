/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr {
    private qq[] field_b;
    private int field_c;
    private int field_a;

    final static dr a(mf param0, int param1, int param2) {
        byte[] var3 = param0.a(param2, param1, 4);
        if (var3 == null) {
          return null;
        }
        return new dr(new PacketBuffer(var3));
    }

    final PcmSound a() {
        byte[] var1 = this.b();
        return new PcmSound(22050, var1, 22050 * this.field_c / 1000, 22050 * this.field_a / 1000);
    }

    private final byte[] b() {
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
          if (this.field_b[var2] != null &&
            this.field_b[var2].field_j + this.field_b[var2].field_g > var1) {
            var1 = this.field_b[var2].field_j + this.field_b[var2].field_g;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        var2Lifetime1 = 22050 * var1 / 1000;
        var3 = new byte[var2Lifetime1];
        for (var4 = 0; var4 < 10; var4++) {
          if (this.field_b[var4] != null) {
            var5 = this.field_b[var4].field_j * 22050 / 1000;
            var6 = this.field_b[var4].field_g * 22050 / 1000;
            var13 = this.field_b[var4].a(var5, this.field_b[var4].field_j);
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

    private dr(PacketBuffer param0) {
        int var2 = 0;
        int var3;
        this.field_b = new qq[10];
        for (var2 = 0; var2 < 10; var2++) {
          var3 = param0.readUnsignedByte(255);
          if (var3 != 0) {
            param0.position = param0.position - 1;
            this.field_b[var2] = new qq();
            this.field_b[var2].a(param0);
          }
        }
        this.field_c = param0.readUnsignedShort(65280);
        this.field_a = param0.readUnsignedShort(65280);
    }
}
