/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleMesh {
    int[] field_g;
    int[] field_E;
    byte field_I;
    int[] field_M;
    int maxX;
    short[] vertexY;
    int minY;
    int[] field_A;
    static int field_B;
    short[] field_i;
    short[] field_p;
    short[] field_Q;
    short[] field_v;
    int[] field_D;
    short[] field_a;
    short[] field_u;
    int[] field_e;
    short field_d;
    int[] field_J;
    short[] field_x;
    short[] field_y;
    int[] field_C;
    byte[] field_K;
    short[] field_j;
    int[] field_c;
    short[] field_P;
    short[] vertexZ;
    static java.applet.Applet field_t;
    short[] field_w;
    int minX;
    static String createSuggestions;
    private boolean boundsValid;
    short field_o;
    short[] vertexX;
    short[] field_H;
    short[] field_O;
    short[] field_r;
    int maxY;
    int maxZ;
    int minZ;
    short vertexCount;
    short[] field_z;

    private final void invalidateBounds(int param0) {
        if (param0 != 32767) {
          return;
        }
        this.boundsValid = false;
    }

    final static boolean b(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 84) {
          field_B = 96;
        }
        stackIn_6_0 = (jd.field_c != null) && (RankingsScreen.field_J.b(719));
        return stackIn_6_0;
    }

    final static void d(int param0) {
        nn.field_b = new TableScene[5];
        nn.field_b[0] = (TableScene) ((Object) new ModernTableScene());
        nn.field_b[1] = (TableScene) ((Object) new PlasmaTableScene());
        nn.field_b[2] = (TableScene) ((Object) new TikiTableScene());
        nn.field_b[3] = (TableScene) ((Object) new PolarTableScene());
        if (param0 >= -75) {
          return;
        }
        nn.field_b[4] = (TableScene) ((Object) new SpaceTableScene());
    }

    final static void a(int param0) {
        RasterSnapshot var1 = (RasterSnapshot) (AccountCreationForm.field_S.removeLast(-1));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer.setTarget(var1.pixels, var1.width, var1.height);
        SoftwareRasterizer.setClip(var1.clipLeft, var1.clipTop, var1.clipRight, var1.clipBottom);
        if (param0 <= 111) {
          field_t = (java.applet.Applet) null;
        }
        var1.pixels = null;
        cb.field_e.b((byte) -23, var1);
    }

    public static void releaseStatics(int param0) {
        if (param0 >= -11) {
          TriangleMesh.b((byte) 45);
        }
        field_t = null;
        createSuggestions = null;
    }

    final void scaleVertices(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        for (var6 = 0; var6 < this.vertexCount; var6++) {
          this.vertexX[var6] = (short)(this.vertexX[var6] * param2 / param4);
          this.vertexY[var6] = (short)(this.vertexY[var6] * param3 / param4);
          this.vertexZ[var6] = (short)(this.vertexZ[var6] * param0 / param4);
        }
        this.invalidateBounds(32767);
        if (param1 != 1) {
          this.field_e = (int[]) null;
        }
    }

    final void translateVertices(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = param0; this.vertexCount > var5; var5++) {
          this.vertexX[var5] = (short)(this.vertexX[var5] + param1);
          this.vertexY[var5] = (short)(this.vertexY[var5] + param3);
          this.vertexZ[var5] = (short)(this.vertexZ[var5] + param2);
        }
        this.invalidateBounds(32767);
    }

    final void updateBounds(byte param0) {
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
        if (this.boundsValid) {
          return;
        }
        this.boundsValid = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        if (param0 < 72) {
          this.field_P = (short[]) null;
        }
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.vertexCount; var8++) {
          var9 = this.vertexX[var8];
          var10 = this.vertexY[var8];
          if (var10 < var3) {
            var3 = var10;
          }
          if (var2 > var9) {
            var2 = var9;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          var11 = this.vertexZ[var8];
          if (var11 > var7) {
            var7 = var11;
          }
          if (var11 < var4) {
            var4 = var11;
          }
        }
        this.maxZ = var7;
        this.maxY = var6;
        this.maxX = var5;
        this.minZ = var4;
        this.minY = var3;
        this.minX = var2;
    }

    TriangleMesh() {
        this.field_I = (byte) 0;
        this.boundsValid = false;
    }

    static {
        createSuggestions = "Suggested names: ";
    }
}
