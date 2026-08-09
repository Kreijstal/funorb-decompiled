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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int var3;
        tba var4;
        tba var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 8 % ((param0 - -43) / 59);
        if (this.field_e != this.field_b) {
          if (1 != this.field_e) {
            L0: {
              var4 = this.field_f[param1];
              var5 = var4;
              var5 = var4;
              if (var4 == null) {
                L1: {
                  this.field_d = true;
                  if (this.field_c < this.field_e) {
                    var4 = new tba(param1, this.field_c);
                    this.field_c = this.field_c + 1;
                    break L1;
                  } else {
                    var5 = (tba) ((Object) this.field_g.b(3));
                    var4 = new tba(param1, var5.field_j);
                    this.field_f[var5.field_h] = null;
                    var5.p(69);
                    break L1;
                  }
                }
                this.field_f[param1] = var4;
                break L0;
              } else {
                this.field_d = false;
                break L0;
              }
            }
            this.field_g.a((byte) 103, (vg) (var4));
            return this.field_a[var4.field_j];
          } else {
            L2: {
              stackIn_8_0 = this;

              if (param1 == this.field_h) {
                stackIn_9_0 = this;
                stackIn_9_1 = 0;
                break L2;
              } else {
                stackIn_9_0 = this;
                stackIn_9_1 = 1;
                break L2;
              }
            }
            ((mv) (this)).field_d = stackIn_9_1 != 0;
            this.field_h = param1;
            return this.field_a[0];
          }
        } else {
          L3: {
            stackIn_3_0 = this;

            if (this.field_f[param1] != null) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L3;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L3;
            }
          }
          ((mv) (this)).field_d = stackIn_4_1 != 0;
          this.field_f[param1] = nea.field_a;
          return this.field_a[param1];
        }
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
        if (!(this.field_e == this.field_b)) {
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
