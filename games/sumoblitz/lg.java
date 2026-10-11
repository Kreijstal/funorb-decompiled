/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends qt {
    static qp[][][] field_d;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 <= -11) {
          return ((544 == (param0 & 544) ? 1 : 0) | ((param0 & 24) != 0 ? 1 : 0)) != 0;
        }
        field_c = 52;
        return ((544 == (param0 & 544) ? 1 : 0) | ((param0 & 24) != 0 ? 1 : 0)) != 0;
    }

    public lg() {
    }

    final void a(ha param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        ha var5 = null;
        int var6 = 0;
        hr[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          wo.a(up.field_c, 360, -5, -16777216, 3, param0, 650, 50, 1, true);
          hc.field_e.a(vq.field_D, -1, -16777216, 150, 320, 0);
          if (param1 != 22707) {
            lg.a(73, 17, -78);
          }
          var3_int = 70;
          var4 = 0;
          while (600 > var3_int) {
            var5 = param0;
            var6 = var3_int;
            var7 = up.field_c;
            wo.a(var7, 100, var6, 0, 1, var5, 200, 200, 1, true);
            if (var4 != this.field_a) {
              hc.field_e.a(lb.field_c[var4], -1, -16777216, 260, 100 + var3_int, 0);
            } else {
              be.field_t.a(lb.field_c[var4], -1, -16777216, 258, -4 + (var3_int + 100), param1 ^ 22707);
            }
            var3_int += 300;
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("lg.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 544) {
          field_c = 80;
          field_d = (qp[][][]) null;
          return;
        }
        field_d = (qp[][][]) null;
    }

    final void c(int param0) {
        int var3 = 0;
        int var2 = (-70 + ko.field_p) / 300;
        int var3Lifetime1;
        if (param0 <= 0) {
          field_d = (qp[][][]) null;
          var3 = (pi.field_e - 200) / 100;
          this.field_a = var2 + var3 * 2;
          if ((-70 + ko.field_p) % 300 <= 200) {
            if (2 <= this.field_a) {
              this.field_a = -1;
              if (hk.field_c == 1) {
                if (this.field_a == -1) {
                } else {
                  if (0 == this.field_a) {
                    ll.c(89);
                    pk.d((byte) -83);
                    this.b((byte) -127);
                  } else {
                    this.b((byte) -128);
                  }
                }
              }
              return;
            }
            if (hk.field_c != 1) {
              return;
            }
            if (this.field_a == -1) {
              return;
            }
            if (0 == this.field_a) {
              ll.c(89);
              pk.d((byte) -83);
              this.b((byte) -127);
              return;
            }
            this.b((byte) -128);
            return;
          }
          this.field_a = -1;
          if (2 > this.field_a) {
            if (hk.field_c != 1) {
              return;
            }
            if (this.field_a != -1) {
              if (0 == this.field_a) {
                ll.c(89);
                pk.d((byte) -83);
                this.b((byte) -127);
                return;
              }
              this.b((byte) -128);
              return;
            }
            return;
          }
          this.field_a = -1;
          if (hk.field_c == 1) {
            if (this.field_a == -1) {
              return;
            }
            if (0 == this.field_a) {
              ll.c(89);
              pk.d((byte) -83);
              this.b((byte) -127);
              return;
            }
            this.b((byte) -128);
            return;
          }
          return;
        }
        var3Lifetime1 = (pi.field_e - 200) / 100;
        this.field_a = var2 + var3Lifetime1 * 2;
        if ((-70 + ko.field_p) % 300 > 200) {
          this.field_a = -1;
          if (2 <= this.field_a) {
            this.field_a = -1;
            if (hk.field_c == 1) {
              if (this.field_a == -1) {
                return;
              }
              if (0 == this.field_a) {
                ll.c(89);
                pk.d((byte) -83);
                this.b((byte) -127);
                return;
              }
              this.b((byte) -128);
              return;
            }
            return;
          }
          if (hk.field_c == 1) {
            if (this.field_a == -1) {
              return;
            }
            if (0 == this.field_a) {
              ll.c(89);
              pk.d((byte) -83);
              this.b((byte) -127);
              return;
            }
            this.b((byte) -128);
            return;
          }
          return;
        }
        if (2 <= this.field_a) {
          this.field_a = -1;
          if (hk.field_c == 1) {
            if (this.field_a == -1) {
              return;
            }
            if (0 == this.field_a) {
              ll.c(89);
              pk.d((byte) -83);
              this.b((byte) -127);
              return;
            }
            this.b((byte) -128);
            return;
          }
          return;
        }
        if (hk.field_c == 1) {
          if (this.field_a == -1) {
            return;
          }
          if (0 == this.field_a) {
            ll.c(89);
            pk.d((byte) -83);
            this.b((byte) -127);
            return;
          }
          this.b((byte) -128);
          return;
        }
    }

    static {
        field_d = new qp[6][3][];
        field_c = 0;
    }
}
