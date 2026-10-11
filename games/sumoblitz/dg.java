/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends ie {
    private static int[] field_B;
    private jn field_z;

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_w != null) {
          this.field_w.a((pk) (this), param1, 5592405, true, param0);
        }
        if (param2 >= -35) {
          this.field_z = (jn) null;
        }
        cb var5 = new cb(this.field_z);
        pk var6 = (pk) (var5.a((byte) -119));
        while (var6 != null) {
          var6.a(this.field_r + param0, param1 + this.field_v, (byte) -105, param3);
          var6 = (pk) (var5.c((byte) 87));
        }
    }

    final void h(int param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 >= -63) {
          this.h(45);
        }
        cb var2 = new cb(this.field_z);
        rg var3 = (rg) (var2.b((byte) -80));
        while (var3 != null) {
          if (var3.g(-28778)) {
            var3.b(false);
          }
          var3 = (rg) (var2.b(0));
        }
        this.field_y = (pk) ((Object) this.e((byte) 54));
    }

    final void e(boolean param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
          return;
        }
        cb var2 = new cb(this.field_z);
        rg var3 = (rg) (var2.b((byte) -80));
        while (var3 != null) {
          if (var3.h(0)) {
            var3.b(false);
          }
          var3 = (rg) (var2.b(0));
        }
    }

    public static void g(int param0) {
        if (param0 != 128) {
          dg.g(-75);
        }
        field_B = null;
    }

    final rg e(byte param0) {
        cb var2;
        rg var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = new cb(this.field_z);
        var3 = (rg) (var2.b((byte) -80));
        if (param0 != 54) {
          this.field_z = (jn) null;
        }
        while (var3 != null) {
          if (var3.field_D) {
            return var3;
          }
          var3 = (rg) (var2.b(param0 - 54));
        }
        return null;
    }

    public dg() {
        super(0, 0, lj.field_b, cv.field_O, (mh) null, (qm) null);
        this.field_z = new jn();
    }

    final pk f(int param0) {
        cb var2;
        rg var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 16777216) {
          field_B = (int[]) null;
        }
        var2 = new cb(this.field_z);
        var3 = (rg) (var2.b((byte) -80));
        while (var3 != null) {
          if (var3.field_D) {
            return var3.f(36);
          }
          var3 = (rg) (var2.b(0));
        }
        return null;
    }

    final void a(byte param0, pk param1) {
        rg var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param1 instanceof rg)) {
            throw new IllegalArgumentException();
          }
          var3 = (rg) (param1);
          this.field_z.a(var3, -10295);
          var3.field_D = true;
          var3.a((pk) (this), (byte) 61);
          if (param0 <= 90) {
            this.field_z = (jn) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("dg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var5 = Sumoblitz.field_L ? 1 : 0;
        int var4 = 67 / ((35 - param0) / 49);
        cb var2 = new cb(this.field_z);
        rg var3 = (rg) (var2.b((byte) -80));
        while (var3 != null) {
          var3.field_D = false;
          var3 = (rg) (var2.b(0));
        }
        this.field_y = null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime2Lifetime1;
        field_B = new int[128];
        for (var0 = 0; 64 > var0; var0++) {
          var1 = 192 * var0 * var0 / 4096;
          var2 = var0 * var0 * (var0 * var0) * 128 / 16777216;
          var3 = var0 * var0 * var0 * 255 / 262144;
          field_B[var0] = var3 + ((var2 << 8) + (var1 << 16));
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 64; var0Lifetime1++) {
          var1Lifetime1 = 96 * var0Lifetime1 * var0Lifetime1 / 4096;
          var2Lifetime1 = 32 * var0Lifetime1 * var0Lifetime1 * var0Lifetime1 / 262144;
          var3Lifetime1 = var0Lifetime1 * var0Lifetime1 * 128 / 4096;
          field_B[-var0Lifetime1 + 127] = (var2Lifetime1 << 8) + (var1Lifetime1 << 16) + var3Lifetime1;
        }
        var0Lifetime2 = 16711935 & field_B[63];
        var1Lifetime2 = field_B[63] & 65280;
        for (var2Lifetime2 = 0; var2Lifetime2 < 2; var2Lifetime2++) {
          var3Lifetime2 = field_B[64 + var2Lifetime2];
          var4 = -(256 * var2Lifetime2 / 2) + 256;
          var5 = 16711935 & var3Lifetime2;
          var6 = 65280 & var3Lifetime2;
          var5 = var5 * (256 - var4);
          var6 = var6 * (256 - var4);
          var5 = var5 + var0Lifetime2 * var4;
          var6 = var6 + var1Lifetime2 * var4;
          var3Lifetime2Lifetime1 = (16711680 & var6 | -16711936 & var5) >>> 8;
          field_B[64 + var2Lifetime2] = var3Lifetime2Lifetime1;
        }
    }
}
