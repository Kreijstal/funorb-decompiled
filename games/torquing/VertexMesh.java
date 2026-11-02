/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VertexMesh {
    short[] field_F;
    static Sprite field_l;
    short[] field_a;
    short[] field_z;
    int[] field_L;
    int[] field_v;
    short[] field_q;
    int field_A;
    int[] field_N;
    short[] field_b;
    int[] field_n;
    short[] field_P;
    short field_R;
    short[] field_G;
    byte[] field_i;
    short[] field_r;
    short[] field_I;
    int field_p;
    int field_H;
    short vertexCount;
    short[] field_c;
    short[] field_s;
    int field_x;
    short[] field_O;
    short[] vertexX;
    int[] field_D;
    int[] field_w;
    int[] field_k;
    short[] field_t;
    short[] field_J;
    private boolean field_y;
    static int field_m;
    static java.awt.Image field_u;
    int field_g;
    short field_C;
    short[] field_E;
    short[] vertexY;
    int[] field_K;
    byte field_M;
    int field_e;
    int[] field_h;
    short[] vertexZ;
    static int field_o;

    final void computeBounds(int initialMinY) {
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
        var12 = Torquing.field_u;
        if (this.field_y) {
          return;
        }
        this.field_y = true;
        var2 = 32767;
        var3 = initialMinY;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.vertexCount; var8++) {
          var9 = this.vertexX[var8];
          var10 = this.vertexY[var8];
          if (var5 < var9) {
            var5 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          var11 = this.vertexZ[var8];
          if (var9 < var2) {
            var2 = var9;
          }
          if (var7 < var11) {
            var7 = var11;
          }
          if (var11 < var4) {
            var4 = var11;
          }
        }
        this.field_x = var3;
        this.field_e = var7;
        this.field_H = var6;
        this.field_g = var5;
        this.field_A = var2;
        this.field_p = var4;
    }

    final static String d(byte param0) {
        if (bh.field_a == mg.field_b) {
          return ol.field_a;
        }
        if (!qk.field_q.c(484)) {
          return qk.field_q.a((byte) -96);
        }
        if (mg.field_b == kh.field_o) {
          return qk.field_q.a((byte) -97);
        }
        if (param0 >= -58) {
          return (String) null;
        }
        return eo.field_a;
    }

    final void translate(int dz, byte obfuscationGuard, int dx, int dy) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        for (var5 = 0; this.vertexCount > var5; var5++) {
          this.vertexX[var5] = (short)(this.vertexX[var5] + dx);
          this.vertexY[var5] = (short)(this.vertexY[var5] + dy);
          this.vertexZ[var5] = (short)(this.vertexZ[var5] + dz);
        }
        if (obfuscationGuard != -6) {
          this.field_N = (int[]) null;
        }
        this.invalidateBounds((byte) 32);
    }

    private final void invalidateBounds(byte obfuscationGuard) {
        this.field_y = false;
        if (obfuscationGuard != 32) {
          VertexMesh.a((byte) -15);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        int var8 = Torquing.field_u;
        int var6 = 85 % ((param4 + 41) / 63);
        for (var7 = 0; var7 < this.vertexCount; var7++) {
          this.vertexX[var7] = (short)(param3 * this.vertexX[var7] / param0);
          this.vertexY[var7] = (short)(this.vertexY[var7] * param2 / param0);
          this.vertexZ[var7] = (short)(this.vertexZ[var7] * param1 / param0);
        }
        this.invalidateBounds((byte) 32);
    }

    final static void b(byte param0) {
        hb.field_x.c(new fm(), param0 - 72);
        if (param0 != 105) {
          field_m = 65;
        }
    }

    public static void a(byte param0) {
        if (param0 != -81) {
          VertexMesh.a((byte) -107);
        }
        field_u = null;
        field_l = null;
    }

    VertexMesh() {
        this.field_y = false;
        this.field_M = (byte) 0;
    }

    static {
        field_m = 160;
        field_o = 100;
    }
}
