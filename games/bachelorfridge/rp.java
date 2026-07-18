/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends hfa {
    private eaa field_D;
    static eaa field_C;

    public rp() {
        super(0, 0, lb.field_v, mi.field_k, (qda) null, (pl) null);
        ((rp) this).field_D = new eaa();
    }

    final vf h(int param0) {
        rna var2 = null;
        vf var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 == 0) {
          var2 = new rna(((rp) this).field_D);
          var3 = (vf) (Object) var2.b((byte) 90);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_C) {
                return var3;
              } else {
                var3 = (vf) (Object) var2.a((byte) 0);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void i(int param0) {
        int var4 = BachelorFridge.field_y;
        rna var2 = new rna(((rp) this).field_D);
        vf var3 = (vf) (Object) var2.b((byte) 44);
        while (var3 != null) {
            if (!(!var3.a(param0 ^ -68))) {
                var3.a(false);
            }
            var3 = (vf) (Object) var2.a((byte) 0);
        }
        ((rp) this).field_A = (wj) (Object) ((rp) this).h(param0);
    }

    public static void e(byte param0) {
        if (param0 != 104) {
            field_C = null;
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
        var2 = new rna(((rp) this).field_D);
        var3 = (vf) (Object) var2.b((byte) 107);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_C) {
              return var3.g(-102);
            } else {
              var3 = (vf) (Object) var2.a((byte) 0);
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
        if (!(null == ((rp) this).field_f)) {
            ((rp) this).field_f.a(param3, (wj) this, 32679, param1, true);
        }
        rna var6 = new rna(((rp) this).field_D);
        wj var7 = (wj) (Object) var6.c((byte) 126);
        while (var7 != null) {
            var7.a((byte) -127, ((rp) this).field_v + param1, param2, param3 - -((rp) this).field_s);
            var7 = (wj) (Object) var6.d((byte) -124);
        }
    }

    final void f(byte param0) {
        int var4 = BachelorFridge.field_y;
        if (param0 != -66) {
            return;
        }
        rna var2 = new rna(((rp) this).field_D);
        vf var3 = (vf) (Object) var2.b((byte) -112);
        while (var3 != null) {
            var3.field_C = false;
            var3 = (vf) (Object) var2.a((byte) 0);
        }
        ((rp) this).field_A = null;
    }

    final void g(byte param0) {
        int var4 = BachelorFridge.field_y;
        rna var2 = new rna(((rp) this).field_D);
        if (param0 <= 126) {
            ((rp) this).field_D = null;
        }
        vf var3 = (vf) (Object) var2.b((byte) 69);
        while (var3 != null) {
            if (var3.k(-116)) {
                var3.a(false);
            }
            var3 = (vf) (Object) var2.a((byte) 0);
        }
    }

    final static void a(boolean param0, je param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            qc.a(param1, -2490);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("rp.C(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final void a(wj param0, byte param1) {
        if (!(param0 instanceof vf)) {
            throw new IllegalArgumentException();
        }
        vf var3 = (vf) (Object) param0;
        ((rp) this).field_D.a(-38, (bw) (Object) var3);
        var3.field_C = true;
        if (param1 <= 53) {
            return;
        }
        try {
            boolean discarded$0 = var3.a((wj) this, -94);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rp.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new eaa();
    }
}
