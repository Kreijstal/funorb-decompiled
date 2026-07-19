/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_d;
    static int field_a;
    rf field_c;
    private rf field_b;

    final rf c(int param0) {
        rf var2 = null;
        if (param0 != -3905) {
            this.field_c = (rf) null;
            var2 = this.field_c.field_a;
            if (!(this.field_c != var2)) {
                this.field_b = null;
                return null;
            }
            this.field_b = var2.field_a;
            return var2;
        }
        var2 = this.field_c.field_a;
        if (!(this.field_c != var2)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    final void b(int param0, rf param1) {
        rf discarded$0 = null;
        try {
            if (param0 <= 55) {
                discarded$0 = this.c(-56);
            }
            if (param1.field_d != null) {
                param1.b(4);
            }
            param1.field_d = this.field_c.field_d;
            param1.field_a = this.field_c;
            param1.field_d.field_a = param1;
            param1.field_a.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "rk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, rf param1) {
        rf discarded$0 = null;
        try {
            if (!(param1.field_d == null)) {
                param1.b(4);
            }
            param1.field_d = this.field_c;
            param1.field_a = this.field_c.field_a;
            param1.field_d.field_a = param1;
            if (param0 >= -44) {
                discarded$0 = this.a(63);
            }
            param1.field_a.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "rk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final rf d(int param0) {
        rf var2 = null;
        int var3 = 0;
        var3 = 63 % ((param0 - -5) / 45);
        var2 = this.field_c.field_d;
        if (this.field_c == var2) {
          return null;
        } else {
          var2.b(4);
          return var2;
        }
    }

    final boolean a(boolean param0) {
        rf discarded$10 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            discarded$10 = this.a((byte) -75);
            if (this.field_c != this.field_c.field_a) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_c != this.field_c.field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void b(int param0) {
        rf var3 = null;
        rf var4 = null;
        if (param0 == 23505) {
          L0: while (true) {
            var3 = this.field_c.field_a;
            if (this.field_c != var3) {
              var3.b(4);
              continue L0;
            } else {
              this.field_b = null;
              return;
            }
          }
        } else {
          field_a = -8;
          L1: while (true) {
            var4 = this.field_c.field_a;
            if (this.field_c != var4) {
              var4.b(4);
              continue L1;
            } else {
              this.field_b = null;
              return;
            }
          }
        }
    }

    final rf a(int param0) {
        rf var2 = null;
        if (param0 != -16913) {
            rf var3 = (rf) null;
            this.a(40, (rf) null);
            var2 = this.field_b;
            if (!(var2 != this.field_c)) {
                this.field_b = null;
                return null;
            }
            this.field_b = var2.field_a;
            return var2;
        }
        var2 = this.field_b;
        if (!(var2 != this.field_c)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    final rf a(byte param0) {
        rf discarded$2 = null;
        rf var2 = null;
        if (param0 == 39) {
          var2 = this.field_c.field_a;
          if (var2 == this.field_c) {
            return null;
          } else {
            var2.b(param0 + -35);
            return var2;
          }
        } else {
          discarded$2 = this.d(-75);
          var2 = this.field_c.field_a;
          if (var2 == this.field_c) {
            return null;
          } else {
            var2.b(param0 + -35);
            return var2;
          }
        }
    }

    public rk() {
        this.field_c = new rf();
        this.field_c.field_d = this.field_c;
        this.field_c.field_a = this.field_c;
    }

    static {
    }
}
