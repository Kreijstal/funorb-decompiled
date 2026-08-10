/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private int field_d;
    private int field_f;
    private wf[] field_e;
    private wf field_b;
    private wf field_a;
    static boolean field_c;

    final wf a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        wf var4;
        wf var5;
        wf var8;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (-1 > (this.field_f ^ -1)) {
          if (this.field_a == this.field_e[this.field_f - 1]) {
            L0: while (true) {
              if (this.field_d > this.field_f) {
                fieldTemp$2 = this.field_f;
                this.field_f = this.field_f + 1;
                var5 = this.field_e[fieldTemp$2].field_b;
                if (this.field_e[this.field_f + -1] != var5) {
                  this.field_a = var5.field_b;
                  return var5;
                } else {
                  continue L0;
                }
              } else {
                var2 = 6 % ((-26 - param0) / 58);
                return null;
              }
            }
          } else {
            var8 = this.field_a;
            this.field_a = var8.field_b;
            return var8;
          }
        } else {
          L1: while (true) {
            if (this.field_d > this.field_f) {
              fieldTemp$3 = this.field_f;
              this.field_f = this.field_f + 1;
              var4 = this.field_e[fieldTemp$3].field_b;
              if (this.field_e[this.field_f + -1] != var4) {
                this.field_a = var4.field_b;
                return var4;
              } else {
                continue L1;
              }
            } else {
              var2 = 6 % ((-26 - param0) / 58);
              return null;
            }
          }
        }
    }

    final wf a(long param0, int param1) {
        wf var4;
        wf var5;
        int var6;
        wf var7;
        var6 = Transmogrify.field_A ? 1 : 0;
        var4 = this.field_e[(int)((long)(-1 + this.field_d) & param0)];
        this.field_b = var4.field_b;
        L0: while (true) {
          if (this.field_b == var4) {
            this.field_b = null;
            if (param1 == 0) {
              return null;
            } else {
              var7 = (wf) null;
              this.a(28L, (byte) 9, (wf) null);
              return null;
            }
          } else {
            if ((this.field_b.field_c ^ -1L) != (param0 ^ -1L)) {
              this.field_b = this.field_b.field_b;
              continue L0;
            } else {
              var5 = this.field_b;
              this.field_b = this.field_b.field_b;
              return var5;
            }
          }
        }
    }

    final wf b(int param0) {
        ag var3;
        if (param0 != 1000) {
          var3 = (ag) null;
          fl.a((ag) null, 122, -2);
          this.field_f = 0;
          return this.a(71);
        } else {
          this.field_f = 0;
          return this.a(71);
        }
    }

    final void a(long param0, byte param1, wf param2) {
        wf var5 = null;
        try {
            if (!(null == param2.field_f)) {
                param2.c(5);
            }
            var5 = this.field_e[(int)(param0 & (long)(-1 + this.field_d))];
            param2.field_b = var5;
            int var6 = 70 / ((3 - param1) / 58);
            param2.field_f = var5.field_f;
            param2.field_f.field_b = param2;
            param2.field_b.field_f = param2;
            param2.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fl.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static nd a(ag param0, int param1, int param2) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -11039) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            stackIn_3_0 = new nd(param0, param2 * qh.field_p / 1000);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fl.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    fl(int param0) {
        wf dupTemp$1 = null;
        int var2;
        wf var3;
        this.field_f = 0;
        this.field_e = new wf[param0];
        this.field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$1 = new wf();
            var3 = dupTemp$1;
            this.field_e[var2] = dupTemp$1;
            var3.field_b = var3;
            var3.field_f = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
