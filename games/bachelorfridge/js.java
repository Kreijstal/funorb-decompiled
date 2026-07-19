/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js {
    private int field_a;
    private bw[] field_b;
    private bw field_c;
    private int field_e;
    private bw field_d;

    final bw c(int param0) {
        int fieldTemp$4 = 0;
        bw discarded$5 = null;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        bw var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == -21446) {
          L0: {
            if (this.field_a <= 0) {
              break L0;
            } else {
              if (this.field_d == this.field_b[-1 + this.field_a]) {
                break L0;
              } else {
                var2 = this.field_d;
                this.field_d = var2.field_b;
                return var2;
              }
            }
          }
          L1: while (true) {
            if (this.field_a < this.field_e) {
              fieldTemp$4 = this.field_a;
              this.field_a = this.field_a + 1;
              var2 = this.field_b[fieldTemp$4].field_b;
              if (this.field_b[this.field_a - 1] != var2) {
                this.field_d = var2.field_b;
                return var2;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          discarded$5 = this.a(false, -79L);
          if (this.field_a > 0) {
            if (this.field_d == this.field_b[-1 + this.field_a]) {
              L2: while (true) {
                if (this.field_a < this.field_e) {
                  fieldTemp$6 = this.field_a;
                  this.field_a = this.field_a + 1;
                  var2 = this.field_b[fieldTemp$6].field_b;
                  if (this.field_b[this.field_a - 1] != var2) {
                    this.field_d = var2.field_b;
                    return var2;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var2 = this.field_d;
              this.field_d = var2.field_b;
              return var2;
            }
          } else {
            L3: while (true) {
              if (this.field_a < this.field_e) {
                fieldTemp$7 = this.field_a;
                this.field_a = this.field_a + 1;
                var2 = this.field_b[fieldTemp$7].field_b;
                if (this.field_b[this.field_a - 1] != var2) {
                  this.field_d = var2.field_b;
                  return var2;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final void a(long param0, byte param1, bw param2) {
        bw var5 = null;
        try {
            if (!(null == param2.field_e)) {
                param2.a(false);
            }
            var5 = this.field_b[(int)((long)(-1 + this.field_e) & param0)];
            param2.field_b = var5;
            param2.field_e = var5.field_e;
            param2.field_e.field_b = param2;
            param2.field_b.field_e = param2;
            param2.field_c = param0;
            int var6 = 41 / ((param1 - 13) / 45);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "js.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final bw a(boolean param0, long param1) {
        bw var4 = null;
        bw var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        if (param0) {
          var4 = this.field_b[(int)(param1 & (long)(this.field_e + -1))];
          this.field_c = var4.field_b;
          L0: while (true) {
            if (var4 != this.field_c) {
              if (this.field_c.field_c != param1) {
                this.field_c = this.field_c.field_b;
                continue L0;
              } else {
                var5 = this.field_c;
                this.field_c = this.field_c.field_b;
                return var5;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        } else {
          js.a(93);
          var4 = this.field_b[(int)(param1 & (long)(this.field_e + -1))];
          this.field_c = var4.field_b;
          L1: while (true) {
            if (var4 != this.field_c) {
              if (this.field_c.field_c != param1) {
                this.field_c = this.field_c.field_b;
                continue L1;
              } else {
                var5 = this.field_c;
                this.field_c = this.field_c.field_b;
                return var5;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        }
    }

    final bw b(int param0) {
        bw discarded$0 = null;
        this.field_a = 0;
        if (param0 != -13023) {
            discarded$0 = this.b(45);
            return this.c(-21446);
        }
        return this.c(-21446);
    }

    final static void a(int param0) {
        jea.field_c = new ofa(qaa.field_d, mda.field_c, sm.field_s, qs.field_m, nr.field_v, dla.field_k);
        int var1 = -49 % ((param0 - 46) / 59);
    }

    js(int param0) {
        int var2 = 0;
        bw dupTemp$0 = null;
        bw var3 = null;
        this.field_a = 0;
        this.field_b = new bw[param0];
        this.field_e = param0;
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new bw();
            var3 = dupTemp$0;
            this.field_b[var2] = dupTemp$0;
            var3.field_e = var3;
            var3.field_b = var3;
        }
    }

    static {
    }
}
