/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static al field_c;
    private ri field_b;
    private ri field_e;
    static int field_d;
    static int field_a;

    final ri d(int param0) {
        ri var2 = null;
        var2 = this.field_b.field_h;
        if (var2 != this.field_b) {
          if (param0 != -31914) {
            field_d = 111;
            var2.b((byte) -109);
            return var2;
          } else {
            var2.b((byte) -109);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void c(int param0) {
        he.b((byte) 115);
        lb.field_d = true;
        wl.field_I = true;
        ci.field_f.k(param0 ^ -12743);
        if (param0 != -19317) {
          return;
        } else {
          jj.a(false, oc.field_E, param0 + 21019);
          return;
        }
    }

    final ri b(byte param0) {
        ri var2 = null;
        if (param0 > 107) {
          var2 = this.field_b.field_h;
          if (this.field_b == var2) {
            this.field_e = null;
            return null;
          } else {
            this.field_e = var2.field_h;
            return var2;
          }
        } else {
          bk.b(81);
          var2 = this.field_b.field_h;
          if (this.field_b == var2) {
            this.field_e = null;
            return null;
          } else {
            this.field_e = var2.field_h;
            return var2;
          }
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        ri var3 = null;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (param0 != 16) {
          this.field_b = (ri) null;
          var2 = 0;
          var3 = this.field_b.field_h;
          L0: while (true) {
            L1: {
              if (this.field_b == var3) {
                break L1;
              } else {
                var3 = var3.field_h;
                var2++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          var2 = 0;
          var3 = this.field_b.field_h;
          L2: while (true) {
            L3: {
              if (this.field_b == var3) {
                break L3;
              } else {
                var3 = var3.field_h;
                var2++;
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return var2;
          }
        }
    }

    public static void b(int param0) {
        if (param0 >= -81) {
            return;
        }
        field_c = null;
    }

    final ri a(int param0) {
        ri var2 = null;
        if (param0 < 80) {
            this.field_e = (ri) null;
            var2 = this.field_e;
            if (!(this.field_b != var2)) {
                this.field_e = null;
                return null;
            }
            this.field_e = var2.field_h;
            return var2;
        }
        var2 = this.field_e;
        if (!(this.field_b != var2)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_h;
        return var2;
    }

    final void a(byte param0, ri param1) {
        try {
            if (!(param1.field_g == null)) {
                param1.b((byte) -116);
            }
            if (param0 != -128) {
                field_a = 94;
            }
            param1.field_g = this.field_b.field_g;
            param1.field_h = this.field_b;
            param1.field_g.field_h = param1;
            param1.field_h.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "bk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public bk() {
        this.field_b = new ri();
        this.field_b.field_g = this.field_b;
        this.field_b.field_h = this.field_b;
    }

    static {
        field_c = new al(1);
        field_d = 50;
        field_a = 0;
    }
}
