/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static nk field_f;
    private o field_b;
    static String field_d;
    static boolean field_a;
    static hj[] field_e;
    private o field_c;

    final o b(int param0) {
        o var2;
        var2 = this.field_c;
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_f;
          if (param0 != 0) {
            return (o) null;
          } else {
            return var2;
          }
        }
    }

    final int a(byte param0) {
        int var2;
        o var3;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -4) {
          return -79;
        } else {
          var2 = 0;
          var3 = this.field_b.field_f;
          L0: while (true) {
            if (var3 == this.field_b) {
              return var2;
            } else {
              var3 = var3.field_f;
              var2++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, o param1) {
        RuntimeException var3 = null;
        o var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param1.field_g) {
                param1.c(-1);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_g = this.field_b.field_g;
            param1.field_f = this.field_b;
            param1.field_g.field_f = param1;
            param1.field_f.field_g = param1;
            if (param0 < -39) {
              break L0;
            } else {
              var4 = (o) null;
              this.a(-33, (o) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("il.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        mc.field_g = param0;
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_d = null;
        if (param0 != 0) {
            field_a = false;
        }
    }

    final o c(int param0) {
        o var2;
        if (param0 == 30664) {
          var2 = this.field_b.field_f;
          if (this.field_b == var2) {
            return null;
          } else {
            var2.c(param0 ^ -30665);
            return var2;
          }
        } else {
          this.b(40);
          var2 = this.field_b.field_f;
          if (this.field_b == var2) {
            return null;
          } else {
            var2.c(param0 ^ -30665);
            return var2;
          }
        }
    }

    public il() {
        this.field_b = new o();
        this.field_b.field_g = this.field_b;
        this.field_b.field_f = this.field_b;
    }

    final o b(byte param0) {
        o var2;
        o var3;
        if (param0 == 46) {
          var2 = this.field_b.field_f;
          if (var2 == this.field_b) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_f;
            return var2;
          }
        } else {
          var3 = (o) null;
          this.a(49, (o) null);
          var2 = this.field_b.field_f;
          if (var2 == this.field_b) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_f;
            return var2;
          }
        }
    }

    static {
        field_d = "Return to game";
    }
}
