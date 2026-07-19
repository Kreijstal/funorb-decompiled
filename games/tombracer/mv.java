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
        int var3 = 0;
        tba var4 = null;
        int var6 = 0;
        tba var7 = null;
        tba var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 8 % ((param0 - -43) / 59);
        if (this.field_e != this.field_b) {
          if (1 != this.field_e) {
            var4 = this.field_f[param1];
            var8 = var4;
            if (var4 != null) {
              this.field_d = false;
              if (var6 != 0) {
                L0: {
                  this.field_d = true;
                  if (this.field_c < this.field_e) {
                    break L0;
                  } else {
                    var7 = (tba) ((Object) this.field_g.b(3));
                    var4 = new tba(param1, var7.field_j);
                    this.field_f[var7.field_h] = null;
                    var7.p(69);
                    break L0;
                  }
                }
                var4 = var8;
                var4 = new tba(param1, this.field_c);
                this.field_c = this.field_c + 1;
                var4 = var8;
                this.field_f[param1] = var4;
                this.field_g.a((byte) 103, (vg) (var4));
                return this.field_a[var4.field_j];
              } else {
                var4 = var8;
                this.field_g.a((byte) 103, (vg) (var4));
                return this.field_a[var4.field_j];
              }
            } else {
              L1: {
                L2: {
                  var4 = var8;
                  this.field_d = true;
                  if (this.field_c < this.field_e) {
                    break L2;
                  } else {
                    var8 = (tba) ((Object) this.field_g.b(3));
                    var4 = new tba(param1, var8.field_j);
                    this.field_f[var8.field_h] = null;
                    var8.p(69);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = new tba(param1, this.field_c);
                this.field_c = this.field_c + 1;
                break L1;
              }
              this.field_f[param1] = var4;
              var4 = var8;
              this.field_g.a((byte) 103, (vg) (var4));
              return this.field_a[var4.field_j];
            }
          } else {
            L3: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (param1 == this.field_h) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            ((mv) (this)).field_d = stackIn_9_1 != 0;
            this.field_h = param1;
            return this.field_a[0];
          }
        } else {
          L4: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (this.field_f[param1] != null) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L4;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L4;
            }
          }
          ((mv) (this)).field_d = stackIn_4_1 != 0;
          this.field_f[param1] = nea.field_a;
          return this.field_a[param1];
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_e) {
            this.field_a = (int[][]) null;
            this.field_f = null;
            this.field_g.d(8);
            this.field_g = null;
            if (!param0) {
              return;
            } else {
              this.a(true);
              return;
            }
          } else {
            this.field_a[var2] = null;
            var2++;
            if (var3 != 0) {
              if (param0) {
                this.a(true);
                return;
              } else {
                return;
              }
            } else {
              if (var3 == 0) {
                continue L0;
              } else {
                this.field_a = (int[][]) null;
                this.field_f = null;
                this.field_g.d(8);
                this.field_g = null;
                if (!param0) {
                  return;
                } else {
                  this.a(true);
                  return;
                }
              }
            }
          }
        }
    }

    final int[][] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackOut_6_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_e != this.field_b) {
          throw new RuntimeException("Can only retrieve a full image cache");
        } else {
          var2 = param0;
          L0: while (true) {
            if (var2 < this.field_e) {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var3 == 0) {
                ((mv) (this)).field_f[var2] = nea.field_a;
                var2++;
                continue L0;
              } else {
                return ((mv) (this)).field_a;
              }
            } else {
              return this.field_a;
            }
          }
        }
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
