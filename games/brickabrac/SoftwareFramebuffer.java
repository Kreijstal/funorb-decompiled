/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SoftwareFramebuffer {
    int[] pixels;
    int width;
    static UiComponent field_e;
    int height;
    static int field_a;
    java.awt.Image image;
    static TableNameEntry[] tableNameScratch;

    abstract void draw(int y, int x, int obfuscationGuard, java.awt.Graphics graphics);

    final static void b(byte param0) {
        if (param0 != 40) {
          return;
        }
        ef.a(param0 ^ -54);
        CacheIoWorker.a((byte) 93, om.field_oc, ef.field_b[0].canvasWidth, np.field_a, ec.field_J, MenuSelection.field_g);
    }

    final void bindRaster(byte obfuscationGuard) {
        if (obfuscationGuard < 72) {
          return;
        }
        Rasterizer2D.bind(this.pixels, this.width, this.height);
    }

    public static void a(int param0) {
        tableNameScratch = null;
        field_e = null;
        int var1 = 112 % ((param0 + 44) / 63);
    }

    final static void a(int param0, int param1, int param2, RgbSprite param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        try {
          param2 = param2 + param3.offsetX;
          param1 = param1 + param3.offsetY;
          var4_int = param1 * Rasterizer2D.width + param2;
          var5 = 0;
          var6 = param3.height;
          if (param0 > -109) {
            return;
          }
          var7 = param3.width;
          var8 = Rasterizer2D.width - var7;
          var9 = 0;
          if (Rasterizer2D.clipTop > param1) {
            var10 = -param1 + Rasterizer2D.clipTop;
            var6 = var6 - var10;
            var4_int = var4_int + var10 * Rasterizer2D.width;
            var5 = var5 + var7 * var10;
            param1 = Rasterizer2D.clipTop;
          }
          if (Rasterizer2D.clipLeft > param2) {
            var10Lifetime1 = Rasterizer2D.clipLeft - param2;
            var4_int = var4_int + var10Lifetime1;
            var5 = var5 + var10Lifetime1;
            var9 = var9 + var10Lifetime1;
            param2 = Rasterizer2D.clipLeft;
            var8 = var8 + var10Lifetime1;
            var7 = var7 - var10Lifetime1;
          }
          if (param1 + var6 > Rasterizer2D.clipBottom) {
            var6 = var6 - (-Rasterizer2D.clipBottom + (var6 + param1));
          }
          if (Rasterizer2D.clipRight < param2 + var7) {
            var10Lifetime2 = param2 + var7 - Rasterizer2D.clipRight;
            var7 = var7 - var10Lifetime2;
            var9 = var9 + var10Lifetime2;
            var8 = var8 + var10Lifetime2;
          }
          if (var7 > 0 &&
            var6 > 0) {
            TableRowSubmission.a(Rasterizer2D.pixels, var8, 0, var5, var6, var9, var7, -1, var4_int, param3.pixels);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("nb.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    abstract void initialize(java.awt.Component component, int height, boolean obfuscationGuard, int width);

    static {
        int var0 = 0;
        tableNameScratch = new TableNameEntry[255];
        for (var0 = 0; var0 < tableNameScratch.length; var0++) {
          tableNameScratch[var0] = new TableNameEntry();
        }
    }
}
