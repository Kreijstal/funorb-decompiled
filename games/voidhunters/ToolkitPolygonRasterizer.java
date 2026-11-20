/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitPolygonRasterizer {
    private static int scanlineY;
    private static int edgeDataLength;
    private static int spanStartX;
    private static int activeEnd;
    private static int spanCursor;
    private static int spanEndX;
    private static int[] edges;
    private static int activeStart;

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

    final static void fillPolygon(GraphicsToolkit param0, int[] param1, int param2, int param3, int param4) {
        int[] var6 = (int[]) null;
        int[] var5 = (int[]) null;
        ToolkitPolygonRasterizer.fillPolygon(param0, param1, param2, param3, param4, (int[]) null, (int[]) null);
    }

    private final static void prepareEdges(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3 = 0;
        if (edgeDataLength < 0) {
          spanCursor = 0;
          activeEnd = 0;
          activeStart = 0;
          scanlineY = 2147483646;
          return;
        }
        ToolkitPolygonRasterizer.sortEdgesByStartY(0, edgeDataLength);
        int var1 = edges[1];
        if (var1 < param0) {
          var1 = param0;
        }
        int var2 = 0;
        for (var3 = 0; var3 < edgeDataLength; var3 += 4) {
          var4 = edges[var3 + 1];
          if (var1 < var4) {
            break;
          }
          var5 = edges[var3];
          var6 = edges[var3 + 2];
          var7 = edges[var3 + 3];
          var8 = (var6 - var5 << 16) / (var7 - var4);
          var9 = (var5 << 16) + 32768;
          edges[var3] = var9 + (var1 - var4) * var8;
          edges[var3 + 2] = var8;
        }
        activeStart = var2;
        activeEnd = var3;
        spanCursor = var3;
        scanlineY = var1 - 1;
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
        ToolkitPolygonRasterizer.sortEdgesByStartY(param0, var2);
        ToolkitPolygonRasterizer.sortEdgesByStartY(var2 + 4, param1);
    }

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

    private final static void clearEdges() {
        edgeDataLength = 0;
    }

    final static void fillPolygon(GraphicsToolkit param0, int[] param1, int param2) {
        ToolkitPolygonRasterizer.fillPolygon(param0, param1, 0, param1.length, param2, (int[]) null, (int[]) null);
    }

    private final static boolean nextSpan(int param0) {
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
        int var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var1 = activeEnd;
        var2 = spanCursor;
        var3 = scanlineY;
        while (true) {
          if (var2 < var1) {
            spanStartX = edges[var2] >> 16;
            spanEndX = edges[var2 + 4] >> 16;
            edges[var2] = edges[var2] + edges[var2 + 2];
            edges[var2 + 4] = edges[var2 + 4] + edges[var2 + 6];
            var2 += 8;
            spanCursor = var2;
            return true;
          }
          var3++;
          scanlineY = var3;
          if (var3 >= param0) {
            return false;
          }
          var4 = activeStart;
          while (var1 < edgeDataLength) {
            var5 = edges[var1 + 1];
            if (var3 >= var5) {
              var6 = edges[var1];
              var7 = edges[var1 + 2];
              var8 = edges[var1 + 3];
              var9 = (var7 - var6 << 16) / (var8 - var5);
              var10 = (var6 << 16) + 32768;
              edges[var1] = var10;
              edges[var1 + 2] = var9;
              var1 += 4;
              continue;
            }
            break;
          }
          var11 = var4;
          var5Lifetime1 = var11;
          while (var11 < var1) {
            var6Lifetime1 = edges[var11 + 3];
            if (var3 >= var6Lifetime1) {
              edges[var11] = edges[var4];
              edges[var11 + 1] = edges[var4 + 1];
              edges[var11 + 2] = edges[var4 + 2];
              edges[var11 + 3] = edges[var4 + 3];
              var4 += 4;
            }
            var11 += 4;
          }
          if (var4 == edgeDataLength) {
            edgeDataLength = 0;
            return false;
          }
          ToolkitPolygonRasterizer.sortActiveEdgesByX(var4, var1);
          activeStart = var4;
          activeEnd = var1;
          var2 = var4;
        }
    }

    private final static void fillPolygon(GraphicsToolkit param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var15;
        var15 = new int[4];
        param0.getClip(var15);
        if (param5 != null &&
          var15[3] - var15[1] != param5.length) {
          throw new IllegalStateException();
        }
        ToolkitPolygonRasterizer.clearEdges();
        ToolkitPolygonRasterizer.appendPolygonEdges(param1, param2, param3);
        ToolkitPolygonRasterizer.prepareEdges(var15[1]);
        while (ToolkitPolygonRasterizer.nextSpan(var15[3])) {
          var8 = spanStartX;
          var9 = spanEndX;
          var10 = scanlineY;
          if (param5 != null) {
            var11 = var10 - var15[1];
            if (var8 < param5[var11] + var15[0]) {
              var8 = param5[var11] + var15[0];
            }
            if (var9 > param5[var11] + param6[var11] + var15[0]) {
              var9 = param5[var11] + param6[var11] + var15[0];
            }
            if (var9 - var8 <= 0) {
              continue;
            }
          }
          param0.drawHorizontalLine(var8, var10, var9 - var8, param4, 1);
        }
    }

    public static void clearSharedReferences() {
        edges = null;
    }
}
