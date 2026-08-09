/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh implements fo {
    int field_f;
    static byte[][] field_i;
    ce field_e;
    int field_h;
    int field_a;
    bua field_g;
    int field_c;
    int field_d;
    int field_b;

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return false;
        }
        return this.field_e.d((byte) 48);
    }

    final void a(int param0) {
        int var3;
        iq var4;
        var3 = TombRacer.field_G ? 1 : 0;
        this.field_g = new bua(1, this.field_f);
        if (-5 == (this.field_e.n((byte) 87) ^ -1)) {
          if (-34 >= (this.field_b ^ -1)) {
            if (66 <= this.field_b) {
              this.field_g.a(3, false, (byte) -98, 12);
              return;
            } else {
              this.field_g.a(3, false, (byte) 24, 11);
              return;
            }
          } else {
            this.field_g.a(3, false, (byte) -96, 10);
            return;
          }
        } else {
          if (this.field_e.n((byte) 87) != 0) {
            return;
          } else {
            if ((this.field_b ^ -1) <= -34) {
              if (-67 < (this.field_b ^ -1)) {
                this.field_g.a(3, false, (byte) 34, 4);
                if (param0 <= 27) {
                  var4 = (iq) null;
                  this.a(-82, (iq) null);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_g.a(3, false, (byte) 48, 5);
                if (param0 <= 27) {
                  var4 = (iq) null;
                  this.a(-82, (iq) null);
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_g.a(3, false, (byte) 94, 3);
              if (param0 <= 27) {
                var4 = (iq) null;
                this.a(-82, (iq) null);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -71 % ((-17 - param0) / 49);
        field_i = (byte[][]) null;
    }

    public final void a(int param0, iq param1) {
        try {
            gqa.a(this.field_a, -83584144, this.c((byte) 123), this.b((byte) 122), this.field_g.b((byte) 74), this.e((byte) -88));
            if (param0 < 103) {
                this.f(-75);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eh.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          this.d((byte) 85);
          return this.field_e.c((byte) 112) + this.field_c + this.field_e.i(1024);
        } else {
          return this.field_e.c((byte) 112) + this.field_c + this.field_e.i(1024);
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            iq var3 = (iq) null;
            this.a(-33, (iq) null);
        }
    }

    public final int b(byte param0) {
        int var2 = 116 % ((-23 - param0) / 53);
        return this.field_e.b((byte) -89) + this.field_d + this.field_e.k(-13019);
    }

    public final int e(byte param0) {
        if (param0 < -86) {
          if ((this.field_e.n((byte) 87) ^ -1) == -2) {
            return this.field_e.e((byte) -121);
          } else {
            return this.field_e.e((byte) -88) - 655360;
          }
        } else {
          return 121;
        }
    }

    static {
        field_i = new byte[1000][];
    }
}
