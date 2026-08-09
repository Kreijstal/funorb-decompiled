/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    private int field_d;
    private hl field_c;
    private hl[] field_a;
    private int field_e;
    private hl field_b;

    final hl a(byte param0, long param1) {
        hl var4;
        hl var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (param0 >= 111) {
          var4 = this.field_a[(int)(param1 & (long)(this.field_d + -1))];
          this.field_b = var4.field_h;
          L0: while (true) {
            if (var4 != this.field_b) {
              if ((this.field_b.field_f ^ -1L) == (param1 ^ -1L)) {
                var5 = this.field_b;
                this.field_b = this.field_b.field_h;
                return var5;
              } else {
                this.field_b = this.field_b.field_h;
                continue L0;
              }
            } else {
              this.field_b = null;
              return null;
            }
          }
        } else {
          return (hl) null;
        }
    }

    final void a(hl param0, long param1, boolean param2) {
        hl var5 = null;
        if (param0.field_a != null) {
            param0.d(0);
        }
        if (param2) {
            return;
        }
        try {
            var5 = this.field_a[(int)((long)(this.field_d - 1) & param1)];
            param0.field_a = var5.field_a;
            param0.field_h = var5;
            param0.field_a.field_h = param0;
            param0.field_f = param1;
            param0.field_h.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "og.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 != 44) {
            return;
        }
        sm.field_c.a((n) (new pk()), (byte) 87);
    }

    final hl a(int param0) {
        this.field_e = param0;
        return this.b(-1);
    }

    final hl b(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int var3;
        hl var4;
        hl var5;
        hl var6;
        hl var9;
        var3 = HoldTheLine.field_D;
        if (0 < this.field_e) {
          if (this.field_a[-1 + this.field_e] == this.field_c) {
            L0: while (true) {
              if (this.field_d <= this.field_e) {
                if (param0 == -1) {
                  return null;
                } else {
                  this.field_d = -105;
                  return null;
                }
              } else {
                fieldTemp$3 = this.field_e;
                this.field_e = this.field_e + 1;
                var4 = this.field_a[fieldTemp$3].field_h;
                var6 = var4;
                if (var4 != this.field_a[-1 + this.field_e]) {
                  this.field_c = var6.field_h;
                  return var6;
                } else {
                  continue L0;
                }
              }
            }
          } else {
            var9 = this.field_c;
            this.field_c = var9.field_h;
            return var9;
          }
        } else {
          L1: while (true) {
            if (this.field_d <= this.field_e) {
              if (param0 == -1) {
                return null;
              } else {
                this.field_d = -105;
                return null;
              }
            } else {
              fieldTemp$4 = this.field_e;
              this.field_e = this.field_e + 1;
              var4 = this.field_a[fieldTemp$4].field_h;
              var5 = var4;
              if (var4 != this.field_a[-1 + this.field_e]) {
                this.field_c = var5.field_h;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    og(int param0) {
        hl dupTemp$1 = null;
        int var2;
        hl var3;
        this.field_e = 0;
        this.field_a = new hl[param0];
        this.field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$1 = new hl();
            var3 = dupTemp$1;
            this.field_a[var2] = dupTemp$1;
            var3.field_h = var3;
            var3.field_a = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
