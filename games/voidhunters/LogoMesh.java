/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoMesh {
    private boolean boundsValid;
    int minY;
    short[] field_K;
    int[] field_l;
    short[] field_i;
    short faceCount;
    int[] field_g;
    short[] faceVertexA;
    short field_L;
    short[] field_I;
    short[] field_n;
    int[] field_C;
    int minZ;
    int maxZ;
    int[] field_e;
    short[] field_m;
    int[] field_H;
    short[] vertexZ;
    int[] field_t;
    short[] field_b;
    short[] faceVertexC;
    short[] field_v;
    int[] field_x;
    int[] field_h;
    short[] vertexY;
    static String field_M;
    short[] faceVertexB;
    int maxX;
    byte[] field_E;
    byte field_z;
    short[] field_c;
    short vertexCount;
    short[] vertexX;
    int[] field_A;
    short[] field_f;
    int maxY;
    short[] field_k;
    int minX;
    short[] field_j;
    short[] field_G;

    public static void clearSharedReferences(int param0) {
        if (param0 < 94) {
          field_M = (String) null;
        }
        field_M = null;
    }

    final void calculateBounds(int param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = VoidHunters.field_G;
        if (this.boundsValid) {
          return;
        }
        this.boundsValid = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        if (param0 <= 75) {
          this.vertexZ = (short[]) null;
        }
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; this.vertexCount > var8; var8++) {
          var9 = this.vertexX[var8];
          var10 = this.vertexY[var8];
          if (var10 > var6) {
            var6 = var10;
          }
          if (var5 < var9) {
            var5 = var9;
          }
          if (var3 > var10) {
            var3 = var10;
          }
          var11 = this.vertexZ[var8];
          if (var2 > var9) {
            var2 = var9;
          }
          if (var11 > var7) {
            var7 = var11;
          }
          if (var11 < var4) {
            var4 = var11;
          }
        }
        this.maxX = var5;
        this.maxZ = var7;
        this.minY = var3;
        this.minZ = var4;
        this.maxY = var6;
        this.minX = var2;
    }

    final void scale(int param0, int param1, int param2, int param3, int param4) {
        int var7 = VoidHunters.field_G;
        int var6 = 0;
        if (param0 != -21227) {
          return;
        }
        while (var6 < this.vertexCount) {
          this.vertexX[var6] = (short)(param3 * this.vertexX[var6] / param4);
          this.vertexY[var6] = (short)(this.vertexY[var6] * param2 / param4);
          this.vertexZ[var6] = (short)(this.vertexZ[var6] * param1 / param4);
          var6++;
        }
        this.invalidateBounds((byte) -61);
    }

    private final void invalidateBounds(byte param0) {
        this.boundsValid = false;
        if (param0 > -21) {
          this.maxX = -74;
        }
    }

    final void translate(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int var5 = -12 / ((param0 - 49) / 52);
        for (var6 = 0; this.vertexCount > var6; var6++) {
          this.vertexX[var6] = (short)(this.vertexX[var6] + param2);
          this.vertexY[var6] = (short)(this.vertexY[var6] + param3);
          this.vertexZ[var6] = (short)(this.vertexZ[var6] + param1);
        }
        this.invalidateBounds((byte) -103);
    }

    LogoMesh() {
        this.boundsValid = false;
        this.field_z = (byte) 0;
    }

    static {
        field_M = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
