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
            ((rk) this).field_c = null;
            var2 = ((rk) this).field_c.field_a;
            if (!(((rk) this).field_c != var2)) {
                ((rk) this).field_b = null;
                return null;
            }
            ((rk) this).field_b = var2.field_a;
            return var2;
        }
        var2 = ((rk) this).field_c.field_a;
        if (!(((rk) this).field_c != var2)) {
            ((rk) this).field_b = null;
            return null;
        }
        ((rk) this).field_b = var2.field_a;
        return var2;
    }

    final void b(int param0, rf param1) {
        if (param0 > 55) {
          if (param1.field_d != null) {
            param1.b(4);
            param1.field_d = ((rk) this).field_c.field_d;
            param1.field_a = ((rk) this).field_c;
            param1.field_d.field_a = param1;
            param1.field_a.field_d = param1;
            return;
          } else {
            param1.field_d = ((rk) this).field_c.field_d;
            param1.field_a = ((rk) this).field_c;
            param1.field_d.field_a = param1;
            param1.field_a.field_d = param1;
            return;
          }
        } else {
          rf discarded$1 = ((rk) this).c(-56);
          if (param1.field_d == null) {
            param1.field_d = ((rk) this).field_c.field_d;
            param1.field_a = ((rk) this).field_c;
            param1.field_d.field_a = param1;
            param1.field_a.field_d = param1;
            return;
          } else {
            param1.b(4);
            param1.field_d = ((rk) this).field_c.field_d;
            param1.field_a = ((rk) this).field_c;
            param1.field_d.field_a = param1;
            param1.field_a.field_d = param1;
            return;
          }
        }
    }

    final void a(int param0, rf param1) {
        L0: {
          if (param1.field_d != null) {
            param1.b(4);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_d = ((rk) this).field_c;
        param1.field_a = ((rk) this).field_c.field_a;
        param1.field_d.field_a = param1;
        if (param0 >= -44) {
          rf discarded$2 = ((rk) this).a(63);
          param1.field_a.field_d = param1;
          return;
        } else {
          param1.field_a.field_d = param1;
          return;
        }
    }

    final rf d(int param0) {
        rf var2 = null;
        int var3 = 0;
        var3 = 63 % ((param0 - -5) / 45);
        var2 = ((rk) this).field_c.field_d;
        if (((rk) this).field_c == var2) {
          return null;
        } else {
          var2.b(4);
          return var2;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            rf discarded$10 = ((rk) this).a((byte) -75);
            if (((rk) this).field_c != ((rk) this).field_c.field_a) {
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
            if (((rk) this).field_c != ((rk) this).field_c.field_a) {
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
            var3 = ((rk) this).field_c.field_a;
            if (((rk) this).field_c != var3) {
              var3.b(4);
              continue L0;
            } else {
              ((rk) this).field_b = null;
              return;
            }
          }
        } else {
          field_a = -8;
          L1: while (true) {
            var4 = ((rk) this).field_c.field_a;
            if (((rk) this).field_c != var4) {
              var4.b(4);
              continue L1;
            } else {
              ((rk) this).field_b = null;
              return;
            }
          }
        }
    }

    final rf a(int param0) {
        rf var2 = null;
        if (param0 != -16913) {
            Object var3 = null;
            ((rk) this).a(40, (rf) null);
            var2 = ((rk) this).field_b;
            if (!(var2 != ((rk) this).field_c)) {
                ((rk) this).field_b = null;
                return null;
            }
            ((rk) this).field_b = var2.field_a;
            return var2;
        }
        var2 = ((rk) this).field_b;
        if (!(var2 != ((rk) this).field_c)) {
            ((rk) this).field_b = null;
            return null;
        }
        ((rk) this).field_b = var2.field_a;
        return var2;
    }

    final rf a(byte param0) {
        rf var2 = null;
        if (param0 == 39) {
          var2 = ((rk) this).field_c.field_a;
          if (var2 == ((rk) this).field_c) {
            return null;
          } else {
            var2.b(param0 + -35);
            return var2;
          }
        } else {
          rf discarded$2 = ((rk) this).d(-75);
          var2 = ((rk) this).field_c.field_a;
          if (var2 == ((rk) this).field_c) {
            return null;
          } else {
            var2.b(param0 + -35);
            return var2;
          }
        }
    }

    public rk() {
        ((rk) this).field_c = new rf();
        ((rk) this).field_c.field_d = ((rk) this).field_c;
        ((rk) this).field_c.field_a = ((rk) this).field_c;
    }

    static {
    }
}
