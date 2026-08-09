/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_b;
    static hr field_d;
    static hr[] field_c;
    ms field_e;
    private ms field_a;

    final ms a(int param0) {
        ms var2;
        var2 = this.field_e.field_g;
        if (this.field_e == var2) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var2.field_g;
          if (param0 != 9) {
            this.a((byte) 19);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final ms d(byte param0) {
        ms var2;
        if (param0 == 18) {
          var2 = this.field_a;
          if (var2 == this.field_e) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_b;
            return var2;
          }
        } else {
          this.b((byte) -83);
          var2 = this.field_a;
          if (var2 == this.field_e) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_b;
            return var2;
          }
        }
    }

    final void a(ms param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_g == null) {
                break L1;
              } else {
                param0.b(false);
                break L1;
              }
            }
            param0.field_g = this.field_e;
            param0.field_b = this.field_e.field_b;
            param0.field_g.field_b = param0;
            param0.field_b.field_g = param0;
            if (param1 == -10295) {
              break L0;
            } else {
              this.field_a = (ms) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jn.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final ms d(int param0) {
        ms var2;
        var2 = this.field_a;
        if (var2 != this.field_e) {
          if (param0 != 9) {
            this.d((byte) 68);
            this.field_a = var2.field_g;
            return var2;
          } else {
            this.field_a = var2.field_g;
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -65) {
          L0: {
            this.e(-106);
            if (this.field_e.field_b != this.field_e) {
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
            if (this.field_e.field_b != this.field_e) {
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

    final void a(ms param0, byte param1) {
        if (!(param0.field_g == null)) {
            param0.b(false);
        }
        param0.field_b = this.field_e;
        param0.field_g = this.field_e.field_g;
        param0.field_g.field_b = param0;
        if (param1 != 39) {
            return;
        }
        try {
            param0.field_b.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ms b(byte param0) {
        ms var2;
        if (param0 < -98) {
          var2 = this.field_e.field_g;
          if (this.field_e == var2) {
            return null;
          } else {
            var2.b(false);
            return var2;
          }
        } else {
          return (ms) null;
        }
    }

    final ms c(int param0) {
        ms var2;
        ms var3;
        var2 = this.field_e.field_b;
        if (var2 != this.field_e) {
          if (param0 != 9) {
            var3 = (ms) null;
            this.a((ms) null, (byte) 81);
            var2.b(false);
            return var2;
          } else {
            var2.b(false);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void c(byte param0) {
        field_d = null;
        if (param0 != 117) {
            field_b = 93;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final ms b(int param0) {
        ms var2;
        int var3;
        var3 = 64 % ((5 - param0) / 61);
        var2 = this.field_e.field_b;
        if (this.field_e == var2) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var2.field_b;
          return var2;
        }
    }

    final void e(int param0) {
        ms var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          var2 = this.field_e.field_b;
          if (this.field_e == var2) {
            if (param0 < 114) {
              field_d = (hr) null;
              this.field_a = null;
              return;
            } else {
              this.field_a = null;
              return;
            }
          } else {
            var2.b(false);
            continue L0;
          }
        }
    }

    public jn() {
        this.field_e = new ms();
        this.field_e.field_g = this.field_e;
        this.field_e.field_b = this.field_e;
    }

    static {
        field_b = 9;
    }
}
