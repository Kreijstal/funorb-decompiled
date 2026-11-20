/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwarePolygonRasterizer {
    private static int activeStart;
    private static int activeEnd;
    private static int[] edges;
    private static int spanEndX;
    private static int edgeDataLength;
    private static int spanStartX;
    private static int scanlineY;
    private static int spanCursor;

    private final static void sortActiveEdgesByX(int param0, int param1) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        while (param1 >= param0 + 8) {
          var2 = 1;
          for (var3 = param0 + 4; var3 < param1; var3 += 4) {
            var4 = edges[var3 - 4];
            var5 = edges[var3];
            if (var4 > var5) {
              var2 = 0;
              edges[var3 - 4] = var5;
              edges[var3] = var4;
              var4 = edges[var3 - 2];
              edges[var3 - 2] = edges[var3 + 2];
              edges[var3 + 2] = var4;
              var4 = edges[var3 - 1];
              edges[var3 - 1] = edges[var3 + 3];
              edges[var3 + 3] = var4;
            }
          }
          if (var2 != 0) {
            return;
          }
          param1 -= 4;
        }
        return;
    }

    final static void fillPolygon(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var6 = (int[]) null;
        int[] var5 = (int[]) null;
        SoftwarePolygonRasterizer.fillPolygon(param0, param1, param2, param3, param4, (int[]) null, (int[]) null);
    }

    private final static void drawSpans(int param0, int param1, int[] param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        SoftwarePolygonRasterizer.prepareEdges();
        while (SoftwarePolygonRasterizer.nextSpan()) {
          var4 = spanStartX;
          var5 = spanEndX;
          var6 = scanlineY;
          if (param2 != null) {
            var7 = var6 - SoftwareRasterizer2D.clipTop;
            if (var4 < param2[var7] + SoftwareRasterizer2D.clipLeft) {
              var4 = param2[var7] + SoftwareRasterizer2D.clipLeft;
            }
            if (var5 > param2[var7] + param3[var7] + SoftwareRasterizer2D.clipLeft) {
              var5 = param2[var7] + param3[var7] + SoftwareRasterizer2D.clipLeft;
            }
          }
          SoftwareRasterizer2D.drawHorizontalLineAlpha(var4, var6, var5 - var4, param0, param1);
        }
    }

    private final static void clearEdges() {
        edgeDataLength = 0;
    }

    public static void clearSharedReferences() {
        edges = null;
    }

    private final static void prepareEdges() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var2 = 0;
        if (edgeDataLength < 0) {
          spanCursor = 0;
          activeEnd = 0;
          activeStart = 0;
          scanlineY = 2147483646;
          return;
        }
        SoftwarePolygonRasterizer.sortEdgesByStartY(0, edgeDataLength);
        int var0 = edges[1];
        if (var0 < SoftwareRasterizer2D.clipTop) {
          var0 = SoftwareRasterizer2D.clipTop;
        }
        int var1 = 0;
        for (var2 = 0; var2 < edgeDataLength; var2 += 4) {
          var3 = edges[var2 + 1];
          if (var0 < var3) {
            break;
          }
          var4 = edges[var2];
          var5 = edges[var2 + 2];
          var6 = edges[var2 + 3];
          var7 = (var5 - var4 << 16) / (var6 - var3);
          var8 = (var4 << 16) + 32768;
          edges[var2] = var8 + (var0 - var3) * var7;
          edges[var2 + 2] = var7;
        }
        activeStart = var1;
        activeEnd = var2;
        spanCursor = var2;
        scanlineY = var0 - 1;
    }

    private final static void sortEdgesByStartY(int param0, int param1) {
        int var7 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        if (param1 <= param0 + 4) {
          return;
        }
        var2 = param0;
        var3 = edges[var2];
        var4 = edges[var2 + 1];
        var5 = edges[var2 + 2];
        var6 = edges[var2 + 3];
        for (var7 = param0 + 4; var7 < param1; var7 += 4) {
          var8 = edges[var7 + 1];
          if (var8 < var4) {
            edges[var2] = edges[var7];
            edges[var2 + 1] = var8;
            edges[var2 + 2] = edges[var7 + 2];
            edges[var2 + 3] = edges[var7 + 3];
            var2 += 4;
            edges[var7] = edges[var2];
            edges[var7 + 1] = edges[var2 + 1];
            edges[var7 + 2] = edges[var2 + 2];
            edges[var7 + 3] = edges[var2 + 3];
          }
        }
        edges[var2] = var3;
        edges[var2 + 1] = var4;
        edges[var2 + 2] = var5;
        edges[var2 + 3] = var6;
        SoftwarePolygonRasterizer.sortEdgesByStartY(param0, var2);
        SoftwarePolygonRasterizer.sortEdgesByStartY(var2 + 4, param1);
    }

    private final static void fillPolygon(int[] param0, int param1, int param2, int param3, int param4, int[] param5, int[] param6) {
        if (param5 != null &&
          SoftwareRasterizer2D.clipBottom - SoftwareRasterizer2D.clipTop != param5.length) {
          throw new IllegalStateException();
        }
        SoftwarePolygonRasterizer.clearEdges();
        SoftwarePolygonRasterizer.appendPolygonEdges(param0, param1, param2);
        SoftwarePolygonRasterizer.drawSpans(param3, param4, param5, param6);
    }

    private final static boolean nextSpan() {
        int var0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var4Lifetime1;
        int var5Lifetime1;
        var0 = activeEnd;
        var1 = spanCursor;
        var2 = scanlineY;
        while (true) {
          if (var1 < var0) {
            spanStartX = edges[var1] >> 16;
            spanEndX = edges[var1 + 4] >> 16;
            edges[var1] = edges[var1] + edges[var1 + 2];
            edges[var1 + 4] = edges[var1 + 4] + edges[var1 + 6];
            var1 += 8;
            spanCursor = var1;
            return true;
          }
          var2++;
          scanlineY = var2;
          if (var2 >= SoftwareRasterizer2D.clipBottom) {
            return false;
          }
          var3 = activeStart;
          while (var0 < edgeDataLength) {
            var4 = edges[var0 + 1];
            if (var2 >= var4) {
              var5 = edges[var0];
              var6 = edges[var0 + 2];
              var7 = edges[var0 + 3];
              var8 = (var6 - var5 << 16) / (var7 - var4);
              var9 = (var5 << 16) + 32768;
              edges[var0] = var9;
              edges[var0 + 2] = var8;
              var0 += 4;
              continue;
            }
            break;
          }
          var10 = var3;
          var4Lifetime1 = var10;
          while (var10 < var0) {
            var5Lifetime1 = edges[var10 + 3];
            if (var2 >= var5Lifetime1) {
              edges[var10] = edges[var3];
              edges[var10 + 1] = edges[var3 + 1];
              edges[var10 + 2] = edges[var3 + 2];
              edges[var10 + 3] = edges[var3 + 3];
              var3 += 4;
            }
            var10 += 4;
          }
          if (var3 == edgeDataLength) {
            edgeDataLength = 0;
            return false;
          }
          SoftwarePolygonRasterizer.sortActiveEdgesByX(var3, var0);
          activeStart = var3;
          activeEnd = var0;
          var1 = var3;
        }
    }

    private final static void appendPolygonEdges(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        int[] var4_ref_int__;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        var3 = edgeDataLength + (param2 << 1);
        if (edges == null ||
          !(edges.length >= var3)) {
          var4_ref_int__ = new int[var3];
          for (var5 = 0; var5 < edgeDataLength; var5++) {
            var4_ref_int__[var5] = edges[var5];
          }
          edges = var4_ref_int__;
        }
        param2 = param2 + param1;
        var4 = param2 - 2;
        var8 = param1;
        var5Lifetime1 = var8;
        while (var8 < param2) {
          var6 = param0[var4 + 1];
          var7 = param0[var8 + 1];
          if (var6 >= var7) {
            if (var7 < var6) {
              fieldTemp$0 = edgeDataLength;
              edgeDataLength = edgeDataLength + 1;
              edges[fieldTemp$0] = param0[var8];
              fieldTemp$1 = edgeDataLength;
              edgeDataLength = edgeDataLength + 1;
              edges[fieldTemp$1] = var7;
              fieldTemp$2 = edgeDataLength;
              edgeDataLength = edgeDataLength + 1;
              edges[fieldTemp$2] = param0[var4];
              fieldTemp$3 = edgeDataLength;
              edgeDataLength = edgeDataLength + 1;
              edges[fieldTemp$3] = var6;
            }
          } else {
            fieldTemp$4 = edgeDataLength;
            edgeDataLength = edgeDataLength + 1;
            edges[fieldTemp$4] = param0[var4];
            fieldTemp$5 = edgeDataLength;
            edgeDataLength = edgeDataLength + 1;
            edges[fieldTemp$5] = var6;
            fieldTemp$6 = edgeDataLength;
            edgeDataLength = edgeDataLength + 1;
            edges[fieldTemp$6] = param0[var8];
            fieldTemp$7 = edgeDataLength;
            edgeDataLength = edgeDataLength + 1;
            edges[fieldTemp$7] = var7;
          }
          var4 = var8;
          var8 += 2;
        }
    }
}
