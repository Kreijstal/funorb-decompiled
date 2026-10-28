/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleMesh {
    short[] faceVertexB;
    short[] field_v;
    static al field_y;
    short[] vertexX;
    byte[] field_n;
    short[] field_Q;
    int maxZ;
    int[] field_k;
    static String field_p;
    int[] field_H;
    short[] faceVertexA;
    int[] field_C;
    int[] field_s;
    byte field_I;
    short[] vertexZ;
    int[] field_t;
    short[] field_N;
    short[] field_m;
    int minY;
    int[] field_l;
    short[] field_c;
    short[] field_F;
    short vertexCount;
    int[] field_P;
    short[] field_w;
    short faceCount;
    short[] vertexY;
    short[] field_G;
    int maxY;
    short normalCount;
    short[] faceVertexC;
    int maxX;
    short[] faceNormalA;
    private boolean boundsValid;
    int[] field_E;
    short[] field_q;
    int minX;
    static IndexedSprite field_z;
    int minZ;
    short[] faceNormalC;
    static int field_x;
    short[] faceNormalB;
    int[] field_d;

    final void scaleVertices(int scaleZ, int divisor, int scaleY, int scaleX, int guard) {
        int var7 = EscapeVector.obfuscationControl;
        for (int var6 = 0; this.vertexCount > var6; var6++) {
          this.vertexX[var6] = (short)(this.vertexX[var6] * scaleX / divisor);
          this.vertexY[var6] = (short)(this.vertexY[var6] * scaleY / divisor);
          this.vertexZ[var6] = (short)(this.vertexZ[var6] * scaleZ / divisor);
        }
        this.invalidateBounds((byte) 77);
        int var6Lifetime1 = -28 % ((64 - guard) / 54);
    }

    final void updateBounds(byte guard) {
        int var12 = EscapeVector.obfuscationControl;
        if (this.boundsValid) {
          return;
        }
        this.boundsValid = true;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        for (int var8 = 0; var8 < this.vertexCount; var8++) {
          int var9 = this.vertexX[var8];
          int var10 = this.vertexY[var8];
          if (var5 < var9) {
            var5 = var9;
          }
          if (var3 > var10) {
            var3 = var10;
          }
          if (var6 < var10) {
            var6 = var10;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          int var11 = this.vertexZ[var8];
          if (var11 < var4) {
            var4 = var11;
          }
          if (var11 > var7) {
            var7 = var11;
          }
        }
        this.maxY = var6;
        this.maxX = var5;
        if (guard != 49) {
          return;
        }
        this.minY = var3;
        this.minX = var2;
        this.minZ = var4;
        this.maxZ = var7;
    }

    private final void invalidateBounds(byte guard) {
        this.boundsValid = false;
        if (guard != 77) {
          this.updateBounds((byte) -127);
        }
    }

    public static void releaseStatics(boolean guard) {
        field_z = null;
        field_y = null;
        if (!guard) {
          field_p = (String) null;
        }
        field_p = null;
    }

    final void translateVertices(int offsetZ, int firstVertex, int offsetX, int offsetY) {
        int var6 = EscapeVector.obfuscationControl;
        for (int var5 = firstVertex; this.vertexCount > var5; var5++) {
          this.vertexX[var5] = (short)(this.vertexX[var5] + offsetX);
          this.vertexY[var5] = (short)(this.vertexY[var5] + offsetY);
          this.vertexZ[var5] = (short)(this.vertexZ[var5] + offsetZ);
        }
        this.invalidateBounds((byte) 77);
    }

    TriangleMesh() {
        this.field_I = (byte) 0;
        this.boundsValid = false;
    }

    static {
        field_p = "The simulator is a training environment. Your objectives will be given to you at the beginning of each mission. Be prepared for anything.";
        field_y = new al();
    }
}
