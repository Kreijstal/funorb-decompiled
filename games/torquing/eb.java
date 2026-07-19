/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    private q field_g;
    private int field_d;
    static String field_c;
    static String field_h;
    private q field_a;
    private int field_e;
    static int field_f;
    private q[] field_b;

    final static void a(int param0) {
        if (param0 > -57) {
            return;
        }
        if (!kb.field_h) {
            throw new IllegalStateException();
        }
        r.field_c = true;
        cb.a(true, 73);
        op.field_i = 0;
    }

    final q c(byte param0) {
        this.field_e = 0;
        if (param0 >= -118) {
            return (q) null;
        }
        return this.b((byte) -120);
    }

    final void a(boolean param0, long param1, q param2) {
        q var5 = null;
        q discarded$0 = null;
        try {
            if (!(param2.field_h == null)) {
                param2.f(0);
            }
            var5 = this.field_b[(int)(param1 & (long)(this.field_d + -1))];
            if (param0) {
                discarded$0 = this.b((byte) -2);
            }
            param2.field_e = var5;
            param2.field_h = var5.field_h;
            param2.field_h.field_e = param2;
            param2.field_e.field_h = param2;
            param2.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "eb.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final q a(long param0, byte param1) {
        q var4 = null;
        q var5 = null;
        int var6 = 0;
        var6 = Torquing.field_u;
        if (param1 > 80) {
          var4 = this.field_b[(int)((long)(-1 + this.field_d) & param0)];
          this.field_g = var4.field_e;
          L0: while (true) {
            if (this.field_g != var4) {
              if (this.field_g.field_f == param0) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_e;
                return var5;
              } else {
                this.field_g = this.field_g.field_e;
                continue L0;
              }
            } else {
              this.field_g = null;
              return null;
            }
          }
        } else {
          field_c = (String) null;
          var4 = this.field_b[(int)((long)(-1 + this.field_d) & param0)];
          this.field_g = var4.field_e;
          L1: while (true) {
            if (this.field_g != var4) {
              if (this.field_g.field_f == param0) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_e;
                return var5;
              } else {
                this.field_g = this.field_g.field_e;
                continue L1;
              }
            } else {
              this.field_g = null;
              return null;
            }
          }
        }
    }

    final q b(byte param0) {
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        q var2_ref_q = null;
        int var2 = 0;
        int var4 = 0;
        q var5 = null;
        q var6 = null;
        var4 = Torquing.field_u;
        if (0 >= this.field_e) {
          var2 = 33 % ((-56 - param0) / 49);
          L0: while (true) {
            if (this.field_d > this.field_e) {
              fieldTemp$7 = this.field_e;
              this.field_e = this.field_e + 1;
              var6 = this.field_b[fieldTemp$7].field_e;
              if (this.field_b[-1 + this.field_e] != var6) {
                this.field_a = var6.field_e;
                return var6;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          if (this.field_a == this.field_b[-1 + this.field_e]) {
            var2 = 33 % ((-56 - param0) / 49);
            L1: while (true) {
              if (this.field_d > this.field_e) {
                fieldTemp$8 = this.field_e;
                this.field_e = this.field_e + 1;
                var5 = this.field_b[fieldTemp$8].field_e;
                if (this.field_b[-1 + this.field_e] != var5) {
                  this.field_a = var5.field_e;
                  return var5;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            var2_ref_q = this.field_a;
            this.field_a = var2_ref_q.field_e;
            return var2_ref_q;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_h = null;
        if (param0 != -31) {
            eb.a((byte) -21);
        }
    }

    eb(int param0) {
        int var2 = 0;
        q dupTemp$0 = null;
        q var3 = null;
        this.field_e = 0;
        this.field_b = new q[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new q();
            var3 = dupTemp$0;
            this.field_b[var2] = dupTemp$0;
            var3.field_e = var3;
            var3.field_h = var3;
        }
    }

    static {
        field_c = null;
        field_h = "Connection timed out. Please try using a different server.";
        field_f = -1;
    }
}
