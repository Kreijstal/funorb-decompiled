/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bt implements fo {
    private boolean field_g;
    static int field_b;
    oo field_a;
    private boolean field_f;
    private bua field_d;
    aia field_e;
    static jea[] field_c;
    static int[] field_h;

    public final int c(byte param0) {
        if (param0 <= 91) {
            return 125;
        }
        return this.field_a.c((byte) 112) - -this.field_e.f(0);
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_h = null;
        field_c = null;
    }

    public final void a(int param0, iq param1) {
        int var3_int = 0;
        int var4 = 0;
        int discarded$0 = 0;
        ka var5 = null;
        try {
            var3_int = this.field_e.d(2);
            var4 = dfa.a(-(im.a(ne.field_f[var3_int][1], ne.field_f[var3_int][0], 1) >> 1790290338) + 512, 2048, 73);
            if (param0 < 103) {
                discarded$0 = bt.a((byte) 44, -55, -63, 37);
            }
            var5 = this.field_d.b((byte) 74);
            gqa.a(var4, -83584144, this.c((byte) 120), this.b((byte) -89), var5, this.e((byte) -95));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bt.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void f(int param0) {
        L0: {
          L1: {
            if (!this.field_e.b(180)) {
              break L1;
            } else {
              L2: {
                if (!this.field_g) {
                  this.field_d.a(1, false, (byte) -85, 9);
                  this.field_d.a(6, this.field_d.c((byte) 50), 1, -1);
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_f = false;
              this.field_g = true;
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (!this.field_f) {
              this.field_d.a(1, false, (byte) 120, 8);
              this.field_d.a(7, this.field_d.c((byte) -97), 1, -1);
              break L3;
            } else {
              break L3;
            }
          }
          this.field_f = true;
          this.field_g = false;
          break L0;
        }
        if (param0 == -4366) {
          this.field_d.a(0);
          return;
        } else {
          field_h = (int[]) null;
          this.field_d.a(0);
          return;
        }
    }

    public final int b(byte param0) {
        int var2 = -13 / ((-23 - param0) / 53);
        return this.field_a.b((byte) 101) + this.field_e.a((byte) 84);
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int discarded$8 = 0;
        if (bea.field_g < param3 + param1) {
          if (param0 == -8) {
            if (-1 >= (-param1 + param3 + param2 ^ -1)) {
              return -param1 + param2 + param3;
            } else {
              return -param1 + bea.field_g;
            }
          } else {
            discarded$8 = bt.a((byte) 51, -70, 71, 100);
            if (-1 >= (-param1 + param3 + param2 ^ -1)) {
              return -param1 + param2 + param3;
            } else {
              return -param1 + bea.field_g;
            }
          }
        } else {
          return param3;
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            this.field_e = (aia) null;
            return this.field_a.d((byte) 48);
        }
        return this.field_a.d((byte) 48);
    }

    bt() {
        this.field_d = new bua(6, 4, 1);
        this.field_d.a(1, true, (byte) -102, 7);
        this.field_f = true;
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            bt.a(-6);
            return this.field_a.e((byte) -94);
        }
        return this.field_a.e((byte) -94);
    }

    static {
    }
}
