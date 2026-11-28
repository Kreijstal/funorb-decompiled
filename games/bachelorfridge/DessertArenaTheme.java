/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DessertArenaTheme extends ArenaTheme {
    static long field_g;

    private final void b(byte param0) {
        this.field_a = new Sprite[4];
        Sprite var6 = new Sprite(384, 192);
        Sprite var2 = var6;
        var6.bindAsRenderTarget();
        this.field_b[0].draw(128, 64);
        this.field_b[1].draw(192, 96);
        this.field_b[12].draw(64, 96);
        this.field_a[0] = var6;
        Sprite var3 = new Sprite(384, 192);
        var3.bindAsRenderTarget();
        this.field_b[13].draw(128, 64);
        this.field_b[8].draw(192, 32);
        this.field_b[24].draw(192, 96);
        this.field_b[40].draw(128, 128);
        this.field_a[1] = var3;
        Sprite var4 = new Sprite(384, 192);
        var4.bindAsRenderTarget();
        if (param0 >= -51) {
          return;
        }
        this.field_b[6].draw(128, 64);
        this.field_b[5].draw(64, 32);
        this.field_b[16].draw(64, 96);
        this.field_b[32].draw(128, 128);
        this.field_a[3] = var4;
        Sprite var5 = new Sprite(384, 192);
        var5.bindAsRenderTarget();
        this.field_b[19].draw(128, 64);
        this.field_b[26].draw(64, 32);
        this.field_b[18].draw(192, 32);
        this.field_b[42].draw(0, 64);
        this.field_b[34].draw(256, 64);
        this.field_b[42].draw(64, 96);
        this.field_b[34].draw(192, 96);
        this.field_b[35].draw(128, 128);
        this.field_a[2] = var5;
    }

    final void b(BoardView param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        aj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        aj var10 = null;
        aj var11 = null;
        aj var12 = null;
        aj var3Lifetime1;
        aj var3Lifetime2;
        int var4Lifetime1;
        var5 = BachelorFridge.field_y;
        try {
          var3 = new aj(0, 0);
          for (var4 = 0; var4 < param0.field_a - 1; var4++) {
            var6 = param0.a(0, (byte) -103, var4);
            this.field_b[2 + (var4 % 3 + 1)].draw(var6.field_c + 128, var6.field_a);
            var7 = param0.a(param0.field_z, (byte) 121, var4);
            if (var4 > 0) {
              this.field_b[25].draw(var7.field_c, var7.field_a);
            }
            if (var4 >= 1) {
              this.field_b[42].draw(var7.field_c, var7.field_a + 64);
            } else {
              this.field_b[41].draw(var7.field_c, var7.field_a + 64);
            }
          }
          var4Lifetime1 = 0;
          while (param0.field_z - 1 > var4Lifetime1) {
            var8 = param0.a(var4Lifetime1, (byte) 108, 0);
            var3Lifetime1 = var8;
            stackIn_16_0 = var4Lifetime1;
            stackIn_16_1 = param0.field_z - 2;
            if (stackIn_16_0 < stackIn_16_1) {
              this.field_b[var4Lifetime1 % 3 + 8 + 1].draw(-128 + var8.field_c, var8.field_a);
            }
            var9 = param0.a(var4Lifetime1, (byte) 64, param0.field_a);
            if (var4Lifetime1 > 0) {
              this.field_b[17].draw(var9.field_c, var9.field_a);
            }
            if (var4Lifetime1 < 1) {
              this.field_b[33].draw(var9.field_c, var9.field_a + 64);
            } else {
              this.field_b[34].draw(var9.field_c, 64 + var9.field_a);
            }
            var4Lifetime1++;
          }
          var10 = param0.a(0, (byte) -104, 0);
          this.field_a[0].draw(-128 + var10.field_c, var10.field_a - 128);
          var11 = param0.a(0, (byte) 91, param0.field_a);
          this.field_a[3].draw(var11.field_c - 64, var11.field_a - 128 + 32);
          var3Lifetime2 = param0.a(param0.field_z, (byte) 66, param0.field_a);
          if (param1 != -13319) {
            return;
          }
          this.field_a[2].draw(-128 + var3Lifetime2.field_c, var3Lifetime2.field_a - 64);
          var12 = param0.a(param0.field_z, (byte) 122, 0);
          this.field_a[1].draw(var12.field_c - 192, 32 + var12.field_a - 128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_31_0 = var3_ref;
          stackIn_31_1 = new StringBuilder().append("pla.B(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    DessertArenaTheme(ResourceArchive param0) {
        try {
          this.field_b = RageSpecial.a(29611, "basic", "tiles_dessert", param0);
          this.b((byte) -117);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
