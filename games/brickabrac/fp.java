/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends lh {
    static int field_x;
    static mh field_u;
    static int field_z;
    static StringBuilder field_A;
    static String field_w;
    static pe[] field_y;
    static mh field_v;
    static RgbSprite field_B;

    final static RgbSprite a(int param0, int param1, String param2, boolean param3) {
        int var11 = 0;
        int var12 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite var6 = null;
        RgbSprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var13 = 0;
        RgbSprite stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = ma.field_O.c(param2) + 2;
          var5 = ma.field_O.field_N;
          var6 = new RgbSprite(var4_int, var5);
          var6.bindRasterTarget();
          ma.field_O.b(param2, var4_int / param0, 2 + ma.field_O.field_F, 0, -1);
          kc.field_q.a((byte) 124);
          var7 = new RgbSprite(var4_int * param1, var5 * param1);
          var7.bindRasterTarget();
          var6.a(0, 0, param1 * var4_int, param1 * var5);
          gp.a(var5 * param1, 0, param1 * var4_int, param0 ^ 2, 0);
          kc.field_q.a((byte) 126);
          if (param3) {
            var8 = var7.width;
            var9 = 2 + ma.field_O.field_B * param1;
            var10 = new int[var8 * var9];
            for (var11 = 0; var9 > var11; var11++) {
              for (var12 = 0; var12 < var8; var12++) {
                var10[var8 * var11 + var12] = var7.pixels[(var11 + var7.height - var9) * var7.width + (0 + var12)];
              }
            }
            var7.pixels = var10;
            var7.offsetY = var7.offsetY + var9 / 2;
            var7.offsetX = var7.offsetX + 0;
            var7.width = var8;
            var7.height = var9;
          }
          stackIn_11_0 = var7;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("fp.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (Rasterizer2D.width >= param2 + param1) {
          return param2;
        }
        if (param0 >= ~(-param1 + (param2 + param3))) {
          return param2 + param3 - param1;
        }
        return Rasterizer2D.width - param1;
    }

    fp() {
        super(14, 180, 460, 155, 35, be.field_o);
    }

    final void drawScreen(byte obfuscationGuard) {
        super.drawScreen((byte) -119);
        if (obfuscationGuard > -14) {
          return;
        }
        al.a(this.field_a, 19);
        this.g(68);
        this.a(0);
    }

    public static void c(boolean param0) {
        field_B = null;
        field_u = null;
        field_y = null;
        field_v = null;
        if (param0) {
          return;
        }
        field_A = null;
        field_w = null;
    }

    static {
        field_w = "This game has started.";
        field_y = null;
        field_A = new StringBuilder(80);
    }
}
