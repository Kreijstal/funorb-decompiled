/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr extends IntrusiveNode {
    int[][] field_m;
    String[][] field_n;
    int field_r;
    int field_h;
    static int field_o;
    boolean field_q;
    int field_k;
    static IntrusiveDeque field_p;
    int field_i;
    int field_j;
    int field_l;

    final static void a(int param0, int param1, int[] param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = -param0 + 256;
          var5 = 16711935 & param3;
          PolygonSpanIterator.resetEdges();
          var6 = 65280 & param3;
          PolygonSpanIterator.appendPolygonEdges(param2, 0, param2.length);
          PolygonSpanIterator.initializeScanlines();
          while (PolygonSpanIterator.nextSpan()) {
            var7 = PolygonSpanIterator.spanLeft;
            if (SoftwareRasterizer.field_i > var7) {
              var7 = SoftwareRasterizer.field_i;
            }
            var8 = PolygonSpanIterator.spanRight;
            if (SoftwareRasterizer.field_l < var8) {
              var8 = SoftwareRasterizer.field_l;
            }
            var9 = (var7 & -8) - (7 & PolygonSpanIterator.scanlineY);
            var9 = var9 + (8 + (-8 & -var9 + var7));
            var10 = var9 + PolygonSpanIterator.scanlineY * SoftwareRasterizer.field_b;
            while (var8 > var9) {
              SoftwareRasterizer.field_h[var10] = we.intAnd(16711935, we.intAnd(16711935, SoftwareRasterizer.field_h[var10]) * var4_int + var5 * param0 >>> 8) + (we.intAnd(we.intAnd(65280, SoftwareRasterizer.field_h[var10]) * var4_int + var6 * param0, 16711680) >>> 8);
              var10 += 8;
              var9 += 8;
            }
          }
          if (param1 <= -58) {
            return;
          }
          gr.a(false, true, 50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gr.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearStatics(int param0) {
        if (param0 >= -25) {
          gr.createSolidSquare((byte) -99, 47, -15);
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static Sprite createSolidSquare(byte param0, int param1, int param2) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        Sprite var3 = new Sprite(param2, param2);
        int var4 = 0;
        if (param0 > -38) {
          field_p = (IntrusiveDeque) null;
          while (var3.field_B.length > var4) {
            var3.field_B[var4] = param1;
            var4++;
          }
          return var3;
        }
        while (var3.field_B.length > var4) {
          var3.field_B[var4] = param1;
          var4++;
        }
        return var3;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param0) {
          SoftwareRasterizer.clear();
          og.a(param2, param0);
          return;
        }
        SoftwareRasterizer.fillRectAlpha(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_k, 0, 192);
        og.a(param2, param0);
    }

    gr() {
    }

    static {
    }
}
