/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    private int field_h;
    static int[] field_k;
    private lh field_i;
    private int field_e;
    static String field_c;
    static fh field_b;
    private lh[] field_g;
    static String field_f;
    static String field_d;
    private lh field_a;
    static int field_j;

    final lh b(byte param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int var3;
        lh var4;
        lh var5;
        lh var8;
        var3 = fleas.field_A ? 1 : 0;
        if (-1 > (this.field_e ^ -1)) {
          if (this.field_a == this.field_g[this.field_e + -1]) {
            L0: while (true) {
              if (this.field_e >= this.field_h) {
                if (param0 > 89) {
                  return null;
                } else {
                  this.field_h = 63;
                  return null;
                }
              } else {
                fieldTemp$3 = this.field_e;
                this.field_e = this.field_e + 1;
                var5 = this.field_g[fieldTemp$3].field_h;
                if (this.field_g[-1 + this.field_e] != var5) {
                  this.field_a = var5.field_h;
                  return var5;
                } else {
                  continue L0;
                }
              }
            }
          } else {
            var8 = this.field_a;
            this.field_a = var8.field_h;
            return var8;
          }
        } else {
          L1: while (true) {
            if (this.field_e >= this.field_h) {
              if (param0 > 89) {
                return null;
              } else {
                this.field_h = 63;
                return null;
              }
            } else {
              fieldTemp$4 = this.field_e;
              this.field_e = this.field_e + 1;
              var4 = this.field_g[fieldTemp$4].field_h;
              if (this.field_g[-1 + this.field_e] != var4) {
                this.field_a = var4.field_h;
                return var4;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    final static wh[] a(byte param0) {
        if (param0 != -116) {
          field_j = 101;
          return new wh[]{ml.field_F, wd.field_b, bf.field_a};
        } else {
          return new wh[]{ml.field_F, wd.field_b, bf.field_a};
        }
    }

    public static void c(byte param0) {
        if (param0 < 69) {
          field_b = (fh) null;
          field_d = null;
          field_b = null;
          field_k = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_k = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final lh a(boolean param0) {
        this.field_e = 0;
        if (!param0) {
            return (lh) null;
        }
        return this.b((byte) 102);
    }

    final lh a(long param0, int param1) {
        lh var4;
        lh var5;
        int var6;
        var6 = fleas.field_A ? 1 : 0;
        var4 = this.field_g[(int)((long)(-1 + this.field_h) & param0)];
        if (param1 == -1110) {
          this.field_i = var4.field_h;
          L0: while (true) {
            if (this.field_i != var4) {
              if (this.field_i.field_c != param0) {
                this.field_i = this.field_i.field_h;
                continue L0;
              } else {
                var5 = this.field_i;
                this.field_i = this.field_i.field_h;
                return var5;
              }
            } else {
              this.field_i = null;
              return null;
            }
          }
        } else {
          hc.c((byte) 98);
          this.field_i = var4.field_h;
          L1: while (true) {
            if (this.field_i != var4) {
              if (this.field_i.field_c != param0) {
                this.field_i = this.field_i.field_h;
                continue L1;
              } else {
                var5 = this.field_i;
                this.field_i = this.field_i.field_h;
                return var5;
              }
            } else {
              this.field_i = null;
              return null;
            }
          }
        }
    }

    hc(int param0) {
        lh dupTemp$1 = null;
        int var2;
        lh var3;
        this.field_e = 0;
        this.field_g = new lh[param0];
        this.field_h = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$1 = new lh();
            var3 = dupTemp$1;
            this.field_g[var2] = dupTemp$1;
            var3.field_h = var3;
            var3.field_a = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final void a(lh param0, boolean param1, long param2) {
        lh var5 = null;
        try {
            if (!(param0.field_a == null)) {
                param0.c(-1);
            }
            if (!param1) {
                this.a((lh) null, true, 11L);
            }
            var5 = this.field_g[(int)(param2 & (long)(this.field_h + -1))];
            param0.field_h = var5;
            param0.field_a = var5.field_a;
            param0.field_a.field_h = param0;
            param0.field_h.field_a = param0;
            param0.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "hc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "<%0>Bomb:<%1> when hit by a flea, the bomb explodes, destroying itself and the eight surrounding tiles. No fleas are harmed.";
        field_f = "There are three different types of tile you can place to help the fleas escape:";
        field_b = new fh(9, 0, 4, 1);
        field_j = -1;
    }
}
