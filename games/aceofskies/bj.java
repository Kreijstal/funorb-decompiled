/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    private int field_c;
    private int field_a;
    private th[] field_b;

    private final byte[] b() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
          if (this.field_b[var2] != null &&
            this.field_b[var2].field_r + this.field_b[var2].field_a > var1) {
            var1 = this.field_b[var2].field_r + this.field_b[var2].field_a;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        int var2Lifetime1 = 22050 * var1 / 1000;
        byte[] var3 = new byte[var2Lifetime1];
        for (int var4 = 0; var4 < 10; var4++) {
          if (this.field_b[var4] != null) {
            int var5 = this.field_b[var4].field_r * 22050 / 1000;
            int var6 = this.field_b[var4].field_a * 22050 / 1000;
            int[] var13 = this.field_b[var4].a(var5, this.field_b[var4].field_r);
            for (int var8 = 0; var8 < var5; var8++) {
              int var9 = var3[var8 + var6] + (var13[var8] >> 8);
              if ((var9 + 128 & -256) != 0) {
                var9 = var9 >> 31 ^ 127;
              }
              var3[var8 + var6] = (byte)var9;
            }
          }
        }
        return var3;
    }

    final static bj a(ResourceArchive param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, -10470, param2);
        if (var3 == null) {
          return null;
        }
        return new bj(new PacketBuffer(var3));
    }

    final static bj a(ResourceArchive param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, (byte) -71, param2);
        if (var3 == null) {
          return null;
        }
        return new bj(new PacketBuffer(var3));
    }

    final PcmSample a() {
        byte[] var1 = this.b();
        return new PcmSample(22050, var1, 22050 * this.field_a / 1000, 22050 * this.field_c / 1000);
    }

    private bj(PacketBuffer param0) {
        this.field_b = new th[10];
        for (int var2 = 0; var2 < 10; var2++) {
          int var3 = param0.readUnsignedByte(-92);
          if (var3 != 0) {
            param0.position = param0.position - 1;
            this.field_b[var2] = new th();
            this.field_b[var2].a(param0);
          }
        }
        this.field_a = param0.readUnsignedShort((byte) 0);
        this.field_c = param0.readUnsignedShort((byte) 0);
    }
}
