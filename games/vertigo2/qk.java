/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends wh {
    static String field_H;
    static String field_G;

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_H = null;
        field_G = null;
    }

    public qk() {
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
          return;
        }
        cl.field_c.a(0, param0);
    }

    final int[][] b(int param0, int param1) {
        int var8 = 0;
        int var9 = 0;
        int var10 = Vertigo2.field_L ? 1 : 0;
        int[][] var13 = this.field_v.a(param1, param0 ^ 3778);
        int[][] var12 = var13;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (!this.field_v.field_c) {
          if (param0 != -3780) {
            field_G = (String) null;
            return var3;
          }
          return var3;
        }
        if (!this.g(param0 ^ -27930)) {
          if (param0 == -3780) {
            return var3;
          }
          field_G = (String) null;
          return var3;
        }
        int[] var4 = var13[0];
        int[] var5 = var13[1];
        int[] var6 = var13[2];
        int var7 = param1 % this.field_C * this.field_C;
        for (var8 = 0; we.field_M > var8; var8++) {
          var9 = this.field_y[var7 + var8 % this.field_z];
          var6[var8] = b.a(var9, 255) << 4;
          var5[var8] = b.a(65280, var9) >> 4;
          var4[var8] = b.a(var9, 16711680) >> 12;
        }
        if (param0 == -3780) {
          return var3;
        }
        field_G = (String) null;
        return var3;
    }

    final static void d(int param0, int param1, int param2) {
        mi var3 = null;
        mi var3Lifetime1;
        if (param2 == 18964) {
          var3 = uh.field_Wb;
          var3.j(param1, 122);
          var3.f(3, 122);
          var3.f(9, 107);
          var3.d(param0, param2 ^ -19683);
          return;
        }
        qk.b(true);
        var3Lifetime1 = uh.field_Wb;
        var3Lifetime1.j(param1, 122);
        var3Lifetime1.f(3, 122);
        var3Lifetime1.f(9, 107);
        var3Lifetime1.d(param0, param2 ^ -19683);
    }

    static {
        field_H = "Connection restored.";
        field_G = "Show all game chat";
    }
}
