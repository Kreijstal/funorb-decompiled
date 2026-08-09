/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    am field_b;
    static vl field_c;
    private am field_a;

    final void d(int param0) {
        am var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        L0: while (true) {
          var2 = this.field_b.field_g;
          if (this.field_b != var2) {
            var2.b(param0 + -5692);
            continue L0;
          } else {
            this.field_a = null;
            if (param0 != 5719) {
              field_c = (vl) null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final am g(int param0) {
        am var2;
        if (param0 < -2) {
          var2 = this.field_b.field_g;
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_g;
            return var2;
          }
        } else {
          this.field_a = (am) null;
          var2 = this.field_b.field_g;
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_g;
            return var2;
          }
        }
    }

    final am b(int param0) {
        am var2;
        if (param0 == -27493) {
          var2 = this.field_b.field_f;
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.b(27);
            return var2;
          }
        } else {
          return (am) null;
        }
    }

    final am b(byte param0) {
        am var2 = null;
        if (param0 != 117) {
            this.c(-99);
            var2 = this.field_b.field_f;
            if (!(this.field_b != var2)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_f;
            return var2;
        }
        var2 = this.field_b.field_f;
        if (!(this.field_b != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_f;
        return var2;
    }

    public static void f(int param0) {
        if (param0 <= 46) {
            field_c = (vl) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final am c(int param0) {
        am var2;
        var2 = this.field_b.field_g;
        if (param0 == 18120) {
          if (this.field_b == var2) {
            return null;
          } else {
            var2.b(106);
            return var2;
          }
        } else {
          return (am) null;
        }
    }

    final void a(am param0, int param1) {
        try {
            if (param0.field_f != null) {
                param0.b(123);
            }
            param0.field_g = this.field_b;
            param0.field_f = this.field_b.field_f;
            if (param1 <= 79) {
                this.field_b = (am) null;
            }
            param0.field_f.field_g = param0;
            param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -20049) {
          L0: {
            this.field_b = (am) null;
            if (this.field_b.field_g != this.field_b) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_b.field_g != this.field_b) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final am a(byte param0) {
        am var2;
        var2 = this.field_a;
        if (this.field_b != var2) {
          this.field_a = var2.field_f;
          if (param0 <= 4) {
            this.b(24);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    public vl() {
        this.field_b = new am();
        this.field_b.field_f = this.field_b;
        this.field_b.field_g = this.field_b;
    }

    final void a(byte param0, am param1) {
        try {
            if (param1.field_f != null) {
                param1.b(116);
            }
            if (param0 > -45) {
                this.field_b = (am) null;
            }
            param1.field_f = this.field_b;
            param1.field_g = this.field_b.field_g;
            param1.field_f.field_g = param1;
            param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final am a(int param0) {
        if (param0 != 12684) {
            return (am) null;
        }
        am var2 = this.field_a;
        if (!(this.field_b != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_g;
        return var2;
    }

    static {
        field_c = new vl();
    }
}
