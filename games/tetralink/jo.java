/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    private gb field_d;
    static boolean field_a;
    static ah field_f;
    private gb field_c;
    static String field_b;
    static boolean field_e;

    final int d(int param0) {
        int var4 = TetraLink.field_J;
        int var2 = param0;
        gb var3 = this.field_d.field_o;
        while (var3 != this.field_d) {
            var3 = var3.field_o;
            var2++;
        }
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        if (hn.field_M == null) {
            return false;
        }
        if (!hn.field_M.d(0)) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != 21332) {
            return;
        }
        field_b = null;
        field_f = null;
    }

    final gb a(boolean param0) {
        gb var2;
        var2 = this.field_c;
        if (this.field_d == var2) {
          this.field_c = null;
          return null;
        } else {
          if (param0) {
            field_a = true;
            this.field_c = var2.field_o;
            return var2;
          } else {
            this.field_c = var2.field_o;
            return var2;
          }
        }
    }

    final gb a(byte param0) {
        int var2;
        gb var3;
        var2 = 15 % ((param0 - 20) / 62);
        var3 = this.field_d.field_o;
        if (var3 == this.field_d) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var3.field_o;
          return var3;
        }
    }

    final gb c(int param0) {
        gb var2;
        if (param0 == -15464) {
          var2 = this.field_d.field_o;
          if (var2 == this.field_d) {
            return null;
          } else {
            var2.e(0);
            return var2;
          }
        } else {
          return (gb) null;
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              hg.field_f[param1] = param0;
              kk.field_X[param1] = new cl(param1);
              if (param2 == -13850) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jo.G(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public jo() {
        this.field_d = new gb();
        this.field_d.field_o = this.field_d;
        this.field_d.field_s = this.field_d;
    }

    final void a(gb param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_s) {
                param0.e(param1 + 0);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_s = this.field_d.field_s;
            param0.field_o = this.field_d;
            param0.field_s.field_o = param0;
            param0.field_o.field_s = param0;
            if (param1 == 0) {
              break L0;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("jo.E(");

            if (param0 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "You have not yet unlocked this option for use.";
    }
}
