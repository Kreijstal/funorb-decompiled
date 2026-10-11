/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    private vj field_n;
    private int field_c;
    private boolean field_q;
    static boolean field_h;
    private boolean field_b;
    static je field_m;
    private int field_g;
    private int field_o;
    private boolean field_d;
    private int field_p;
    private int field_f;
    static int field_l;
    private ModelMesh field_e;
    static kl field_j;
    private int field_k;
    static int[] field_a;
    private int field_i;
    static int[] field_r;

    private final void a(byte param0) {
        int var2 = 0;
        wp var3 = null;
        wp var3Lifetime1;
        int var2Lifetime1;
        if (param0 >= 20) {
          var2 = this.field_n.field_i >> 16;
          var3 = we.a(var2, true);
          io.a(var3, (byte) -34);
          return;
        }
        field_m = (je) null;
        var2Lifetime1 = this.field_n.field_i >> 16;
        var3Lifetime1 = we.a(var2Lifetime1, true);
        io.a(var3Lifetime1, (byte) -34);
    }

    final void b(int param0) {
        int var2;
        if (!this.field_b) {
          return;
        }
        var2 = this.field_n.a(-105) ? 1 : 0;
        if (param0 != -19812) {
          this.field_p = -51;
        }
        if (var2 != 0) {
          this.a((byte) -125, this.field_k);
        }
        if (!this.field_n.field_c) {
          return;
        }
        if (3 == this.field_o &&
          this.field_n.field_m == je.field_K[this.field_c][0]) {
          dh.a(this.field_c, 4, 32);
        }
        if (this.field_o != 4) {
          return;
        }
        if (this.field_n.field_m != je.field_K[this.field_c][1]) {
          return;
        }
        dh.a(this.field_c, 7, 32);
        return;
    }

    final void a(boolean param0) {
        if (!param0) {
          this.field_q = true;
          this.field_d = false;
          return;
        }
        this.field_d = false;
    }

    final void a(int param0, int param1) {
        this.field_c = param1;
        if (SpellAreaSelection.field_k[this.field_c] == null) {
          this.field_c = 24;
        }
        this.field_e = (ModelMesh) (SpellAreaSelection.field_k[this.field_c][param0]);
        this.field_q = nh.field_D[this.field_c];
    }

    final void e(byte param0) {
        ModelMesh var23 = null;
        ModelMesh var24_ref = null;
        ModelMesh var25 = null;
        ModelMesh var19 = null;
        ModelMesh var20_ref = null;
        ModelMesh var21 = null;
        ModelMesh var22_ref = null;
        ModelMesh var18_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var18 = null;
        Object var20 = null;
        Object var22 = null;
        Object var24 = null;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (this.field_d) {
          return;
        }
        if (param0 >= 92) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          var5 = th.a(this.field_p, 1, 2048);
          var6 = 1024;
          var7 = 2048;
          var8 = 12;
          var9 = th.a(this.field_f - var7 / var8 + var7, 1, 2048);
          var10 = 0;
          var11 = (!this.field_q ? 300 : 400) - this.field_f * 2;
          var12 = -400;
          if (this.field_b) {
            var22_ref = (ModelMesh) (this.field_n.a(var2 != 0, true, var3 != 0, this.field_e));
            var23 = var22_ref;
            var22_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
            tm.a();
            tm.c(this.field_i, this.field_g);
            var23.a(var4, var5, var6, var9, var10, var11, var12);
          } else {
            tm.a();
            tm.c(this.field_i, this.field_g);
            var24_ref = (ModelMesh) (this.field_e.a(var2 != 0, false, var3 != 0));
            var25 = var24_ref;
            var24_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
            var25.a(var4, var5, var6, var9, var10, var11, var12);
          }
          return;
        }
        field_l = 22;
        var2Lifetime1 = 0;
        var3Lifetime1 = 0;
        var4Lifetime1 = 0;
        var5Lifetime1 = th.a(this.field_p, 1, 2048);
        var6Lifetime1 = 1024;
        var7Lifetime1 = 2048;
        var8Lifetime1 = 12;
        var9Lifetime1 = th.a(this.field_f - var7Lifetime1 / var8Lifetime1 + var7Lifetime1, 1, 2048);
        var10Lifetime1 = 0;
        var11Lifetime1 = (!this.field_q ? 300 : 400) - this.field_f * 2;
        var12Lifetime1 = -400;
        if (this.field_b) {
          var18_ref = (ModelMesh) (this.field_n.a(var2Lifetime1 != 0, true, var3Lifetime1 != 0, this.field_e));
          var19 = var18_ref;
          var18_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
          tm.a();
          tm.c(this.field_i, this.field_g);
          var19.a(var4Lifetime1, var5Lifetime1, var6Lifetime1, var9Lifetime1, var10Lifetime1, var11Lifetime1, var12Lifetime1);
        } else {
          tm.a();
          tm.c(this.field_i, this.field_g);
          var20_ref = (ModelMesh) (this.field_e.a(var2Lifetime1 != 0, false, var3Lifetime1 != 0));
          var21 = var20_ref;
          var20_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
          var21.a(var4Lifetime1, var5Lifetime1, var6Lifetime1, var9Lifetime1, var10Lifetime1, var11Lifetime1, var12Lifetime1);
        }
    }

    private final void a(byte param0, int param1) {
        int var3;
        qb var4;
        int var5;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.field_b) {
          return;
        }
        this.field_k = param1;
        var3 = sf.field_P[this.field_c];
        var4 = ck.field_e[var3][this.field_k];
        var5 = 81 % ((param0 + 53) / 59);
        this.field_n.a(-1, var4);
        this.a((byte) 122);
        var6 = this.field_o;
        if (var6 == 1) {
          dh.a(this.field_c, 0, 32);
          return;
        }
        if (2 == var6) {
          dh.a(this.field_c, 0, 32);
          return;
        }
        if (var6 == 3) {
          dh.a(this.field_c, 3, 32);
          return;
        }
        if (var6 == 5) {
          dh.a(this.field_c, 6, 32);
          return;
        }
        if (var6 == 6) {
          dh.a(this.field_c, 2, 32);
          dh.a(this.field_c, 1, 32);
          return;
        }
        if (var6 != 7) {
          return;
        }
        dh.a(this.field_c, 5, 32);
        dh.a(this.field_c, 2, 32);
        return;
    }

    final void a(int param0) {
        int var2 = 34 % ((param0 - 45) / 36);
        this.field_b = true;
    }

    final void a(int param0, int param1, byte param2) {
        this.field_o = param1;
        this.a((byte) -114, param0);
        if (param2 < 43) {
          this.a(-118);
        }
    }

    public static void b(byte param0) {
        if (param0 != 40) {
          return;
        }
        field_a = null;
        field_j = null;
        field_r = null;
        field_m = null;
    }

    final static je d(byte param0) {
        if (param0 < 69) {
          sh.b((byte) 50);
          return MapTile.field_f.field_Jb;
        }
        return MapTile.field_f.field_Jb;
    }

    private final void c(byte param0) {
        if (param0 != -79) {
          return;
        }
        this.field_d = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param4;
        this.field_i = param5;
        if (param3 == -29001) {
          this.field_g = param2;
          this.field_f = param0;
          return;
        }
        this.field_f = 36;
        this.field_g = param2;
        this.field_f = param0;
    }

    sh() {
        this.field_n = new vj(1);
        this.a(0, 0);
        this.a(-28);
        this.a(0, 0, (byte) 115);
        this.a(0, 1, so.field_b.field_g >> 1, -29001, 0, so.field_b.field_a >> 1);
        this.c((byte) -79);
    }

    static {
        field_l = 360;
        field_a = new int[256];
        field_r = new int[]{8};
    }
}
