/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends hfa {
    private eaa field_D;
    static eaa field_C;

    public rp() {
        super(0, 0, lb.field_v, mi.field_k, (qda) null, (pl) null);
        this.field_D = new eaa();
    }

    final vf h(int param0) {
        rna var2 = null;
        vf var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 == 0) {
          var2 = new rna(this.field_D);
          var3 = (vf) ((Object) var2.b((byte) 90));
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_C) {
                return var3;
              } else {
                var3 = (vf) ((Object) var2.a((byte) 0));
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (vf) null;
        }
    }

    final void i(int param0) {
        int var4 = BachelorFridge.field_y;
        rna var2 = new rna(this.field_D);
        vf var3 = (vf) ((Object) var2.b((byte) 44));
        while (var3 != null) {
            if (!(!var3.a(param0 ^ -68))) {
                var3.a(false);
            }
            var3 = (vf) ((Object) var2.a((byte) 0));
        }
        this.field_A = (wj) ((Object) this.h(param0));
    }

    public static void e(byte param0) {
        if (param0 != 104) {
            field_C = (eaa) null;
        }
        field_C = null;
    }

    final wj d(byte param0) {
        rna var2 = null;
        vf var3 = null;
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param0 >= 38) {
            break L0;
          } else {
            rp.e((byte) -80);
            break L0;
          }
        }
        var2 = new rna(this.field_D);
        var3 = (vf) ((Object) var2.b((byte) 107));
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_C) {
              return var3.g(-102);
            } else {
              var3 = (vf) ((Object) var2.a((byte) 0));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var8 = BachelorFridge.field_y;
        int var5 = 70 / ((param0 - -20) / 54);
        if (!(null == this.field_f)) {
            this.field_f.a(param3, (wj) (this), 32679, param1, true);
        }
        rna var6 = new rna(this.field_D);
        wj var7 = (wj) ((Object) var6.c((byte) 126));
        while (var7 != null) {
            var7.a((byte) -127, this.field_v + param1, param2, param3 - -this.field_s);
            var7 = (wj) ((Object) var6.d((byte) -124));
        }
    }

    final void f(byte param0) {
        int var4 = BachelorFridge.field_y;
        if (param0 != -66) {
            return;
        }
        rna var2 = new rna(this.field_D);
        vf var3 = (vf) ((Object) var2.b((byte) -112));
        while (var3 != null) {
            var3.field_C = false;
            var3 = (vf) ((Object) var2.a((byte) 0));
        }
        this.field_A = null;
    }

    final void g(byte param0) {
        int var4 = BachelorFridge.field_y;
        rna var2 = new rna(this.field_D);
        if (param0 <= 126) {
            this.field_D = (eaa) null;
        }
        vf var3 = (vf) ((Object) var2.b((byte) 69));
        while (var3 != null) {
            if (var3.k(-116)) {
                var3.a(false);
            }
            var3 = (vf) ((Object) var2.a((byte) 0));
        }
    }

    final static void a(boolean param0, je param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              qc.a(param1, -2490);
              if (param0) {
                break L1;
              } else {
                field_C = (eaa) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("rp.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(wj param0, byte param1) {
        boolean discarded$0 = false;
        if (!(param0 instanceof vf)) {
            throw new IllegalArgumentException();
        }
        vf var3 = (vf) ((Object) param0);
        this.field_D.a(-38, var3);
        var3.field_C = true;
        if (param1 <= 53) {
            return;
        }
        try {
            discarded$0 = var3.a((wj) (this), -94);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "rp.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_C = new eaa();
    }
}
