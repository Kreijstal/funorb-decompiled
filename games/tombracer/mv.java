/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mv {
    private int field_b;
    private int field_h;
    private int field_e;
    private vna field_g;
    private tba[] field_f;
    static int field_i;
    private int field_c;
    private int[][] field_a;
    boolean field_d;

    final int[] a(byte param0, int param1) {
        boolean stackIn_4_1 = false;
        boolean stackIn_9_1 = false;
        int var3;
        tba var4;
        tba var5;
        int var6;
        tba var5Lifetime1;
        tba var5Lifetime2;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 8 % ((param0 + 43) / 59);
        if (this.field_e == this.field_b) {
          stackIn_4_1 = (this.field_f[param1] == null);
          this.field_d = stackIn_4_1;
          this.field_f[param1] = nea.field_a;
          return this.field_a[param1];
        }
        if (1 == this.field_e) {
          stackIn_9_1 = (param1 != this.field_h);
          this.field_d = stackIn_9_1;
          this.field_h = param1;
          return this.field_a[0];
        }
        var4 = this.field_f[param1];
        var5 = var4;
        var5Lifetime1 = var4;
        if (var4 == null) {
          this.field_d = true;
          if (this.field_c < this.field_e) {
            var4 = new tba(param1, this.field_c);
            this.field_c = this.field_c + 1;
          } else {
            var5Lifetime2 = (tba) (this.field_g.b(3));
            var4 = new tba(param1, var5Lifetime2.field_j);
            this.field_f[var5Lifetime2.field_h] = null;
            var5Lifetime2.p(69);
          }
          this.field_f[param1] = var4;
        } else {
          this.field_d = false;
        }
        this.field_g.a((byte) 103, (vg) (var4));
        return this.field_a[var4.field_j];
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < this.field_e; var2++) {
          this.field_a[var2] = null;
        }
        this.field_a = (int[][]) null;
        this.field_f = null;
        this.field_g.d(8);
        this.field_g = null;
        if (param0) {
          this.a(true);
        }
    }

    final int[][] a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_e != this.field_b) {
          throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = param0; var2 < this.field_e; var2++) {
          this.field_f[var2] = nea.field_a;
        }
        return this.field_a;
    }

    mv(int param0, int param1, int param2) {
        this.field_h = -1;
        this.field_c = 0;
        this.field_g = new vna();
        this.field_d = false;
        this.field_e = param0;
        this.field_b = param1;
        this.field_a = new int[this.field_e][param2];
        this.field_f = new tba[this.field_b];
    }

    static {
        field_i = 35;
    }
}
