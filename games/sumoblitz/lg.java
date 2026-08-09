/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends qt {
    static qp[][][] field_d;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        if (param1 > -11) {
          L0: {
            field_c = 52;
            if (544 != (param0 & 544)) {
              stackIn_11_0 = 0;
              break L0;
            } else {
              stackIn_11_0 = 1;
              break L0;
            }
          }
          L1: {


            if ((param0 & 24) == 0) {

              stackIn_14_1 = 0;
              break L1;
            } else {

              stackIn_14_1 = 1;
              break L1;
            }
          }
          return (stackIn_11_0 | stackIn_14_1) != 0;
        } else {
          L2: {
            if (544 != (param0 & 544)) {
              stackIn_4_0 = 0;
              break L2;
            } else {
              stackIn_4_0 = 1;
              break L2;
            }
          }
          L3: {


            if ((param0 & 24) == 0) {

              stackIn_7_1 = 0;
              break L3;
            } else {

              stackIn_7_1 = 1;
              break L3;
            }
          }
          return (stackIn_4_0 | stackIn_7_1) != 0;
        }
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              wo.a(up.field_c, 360, -5, -16777216, 3, param0, 650, 50, 1, true);
              hc.field_e.a(vq.field_D, -1, -16777216, 150, 320, 0);
              if (param1 == 22707) {
                break L1;
              } else {
                lg.a(73, 17, -78);
                break L1;
              }
            }
            var3_int = 70;
            var4 = 0;
            L2: while (true) {
              if (600 <= var3_int) {
                break L0;
              } else {
                L3: {
                  var5 = param0;
                  var6 = var3_int;
                  var7 = up.field_c;
                  wo.a(var7, 100, var6, 0, 1, var5, 200, 200, 1, true);
                  if (var4 != this.field_a) {
                    hc.field_e.a(lb.field_c[var4], -1, -16777216, 260, 100 + var3_int, 0);
                    break L3;
                  } else {
                    be.field_t.a(lb.field_c[var4], -1, -16777216, 258, -4 + (var3_int - -100), param1 ^ 22707);
                    break L3;
                  }
                }
                var3_int += 300;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("lg.I(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
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
        if (param0 <= 0) {
            field_d = (qp[][][]) null;
            var3 = (pi.field_e - 200) / 100;
            this.field_a = var2 + var3 * 2;
            if (((-70 + ko.field_p) % 300 ^ -1) >= -201) {
                if (2 <= this.field_a) {
                    this.field_a = -1;
                    if (hk.field_c == 1) {
                        if (0 == (this.field_a ^ -1)) {
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
                if (0 == (this.field_a ^ -1)) {
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
                if (!(0 == (this.field_a ^ -1))) {
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
                if (0 == (this.field_a ^ -1)) {
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
        var3 = (pi.field_e - 200) / 100;
        this.field_a = var2 + var3 * 2;
        if (((-70 + ko.field_p) % 300 ^ -1) < -201) {
            this.field_a = -1;
            if (2 <= this.field_a) {
                this.field_a = -1;
                if (hk.field_c == 1) {
                    if (0 == (this.field_a ^ -1)) {
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
                if (0 == (this.field_a ^ -1)) {
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
                if (0 == (this.field_a ^ -1)) {
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
            if (0 == (this.field_a ^ -1)) {
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
