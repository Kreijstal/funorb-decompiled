/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kla {
    private sja field_e;
    private int[] field_g;
    private ha field_f;
    private aja field_c;
    static dfa field_d;
    private sja field_a;
    static String field_b;

    private final void a(aja param0, int param1, boolean param2) {
        try {
            this.b(-117);
            if (!(this.field_c == null)) {
                this.field_f.j();
            }
            this.field_f.a(param0, param2);
            if (param1 != 4) {
                field_d = (dfa) null;
            }
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kla.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        sja var2;
        sja var3;
        if (this.field_e.field_k != this.field_c) {
          this.field_f.j();
          if (null == this.field_e.field_k) {
            this.field_c = this.field_e.field_k;
            this.field_f.KA(this.field_e.field_h, this.field_e.field_f, this.field_e.field_l, this.field_e.field_a);
            if (param0) {
              var3 = this.field_e;
              var2 = var3;
              this.field_e = this.field_e.field_e;
              var3.field_e = this.field_a;
              var3.field_k = null;
              this.field_a = var3;
              return;
            } else {
              this.b(0);
              var3 = this.field_e;
              var2 = var3;
              this.field_e = this.field_e.field_e;
              var3.field_e = this.field_a;
              var3.field_k = null;
              this.field_a = var3;
              return;
            }
          } else {
            this.field_f.a(this.field_e.field_k, true);
            this.field_c = this.field_e.field_k;
            this.field_f.KA(this.field_e.field_h, this.field_e.field_f, this.field_e.field_l, this.field_e.field_a);
            if (!param0) {
              this.b(0);
              var3 = this.field_e;
              var2 = var3;
              this.field_e = this.field_e.field_e;
              var3.field_e = this.field_a;
              var3.field_k = null;
              this.field_a = var3;
              return;
            } else {
              var3 = this.field_e;
              var2 = var3;
              this.field_e = this.field_e.field_e;
              var3.field_e = this.field_a;
              var3.field_k = null;
              this.field_a = var3;
              return;
            }
          }
        } else {
          this.field_f.KA(this.field_e.field_h, this.field_e.field_f, this.field_e.field_l, this.field_e.field_a);
          if (param0) {
            var3 = this.field_e;
            var2 = var3;
            this.field_e = this.field_e.field_e;
            var3.field_e = this.field_a;
            var3.field_k = null;
            this.field_a = var3;
            return;
          } else {
            this.b(0);
            var3 = this.field_e;
            var2 = var3;
            this.field_e = this.field_e.field_e;
            var3.field_e = this.field_a;
            var3.field_k = null;
            this.field_a = var3;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 > -3) {
            return;
        }
        this.b(-127);
        this.field_f.T(param0, param2, param1, param3);
    }

    private final void b(int param0) {
        sja var2;
        L0: {
          this.field_f.K(this.field_g);
          if (null != this.field_a) {
            var2 = this.field_a;
            this.field_a = this.field_a.field_e;
            break L0;
          } else {
            var2 = new sja();
            break L0;
          }
        }
        var2.a(this.field_g[2], this.field_e, this.field_g[3], this.field_c, 4096, this.field_g[1], this.field_g[0]);
        if (param0 >= -25) {
          return;
        } else {
          this.field_e = var2;
          return;
        }
    }

    final void a(aja param0, int param1) {
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
              this.a(param0, param1 + 4, false);
              if (param1 == 0) {
                break L1;
              } else {
                this.field_e = (sja) null;
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

            stackIn_5_1 = new StringBuilder().append("kla.D(");

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
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= 37) {
            field_d = (dfa) null;
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    kla(ha param0) {
        this.field_g = new int[4];
        this.field_c = null;
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new dfa();
        field_b = "More missile defence";
    }
}
