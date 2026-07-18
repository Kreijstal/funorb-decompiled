/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends kj {
    static cf field_i;
    private boolean field_f;
    static kv field_g;
    static String field_h;

    final static void a(int param0, nc param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        pf var7 = null;
        pf var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var7 = sja.field_fb;
            var8 = var7;
            var8.c(param0, (byte) 109);
            var8.field_g = var8.field_g + 1;
            var4 = var8.field_g;
            var8.d(1, 0);
            var8.b(param1.field_j, -116);
            var8.b(param1.field_k, -125);
            var8.b(param1.field_f, -113);
            var8.e(param1.field_h, -1615464796);
            var8.e(param1.field_l, -1615464796);
            var8.e(param1.field_i, -1615464796);
            var8.e(param1.field_g, -1615464796);
            var8.d(param1.field_m.length, 0);
            var5 = 0;
            L1: while (true) {
              if (param1.field_m.length <= var5) {
                int discarded$1 = var8.a(var4, 19);
                var8.b((byte) -108, -var4 + var8.field_g);
                break L0;
              } else {
                var7.e(param1.field_m[var5], -1615464796);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("qn.J(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + -8692 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != -26450) {
            qn.a(-121, -48, 112, 111, 108, 25);
            ((qn) this).field_f = true;
            return;
        }
        ((qn) this).field_f = true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = cr.a(an.field_q, param2, ha.field_n, 0);
              var7 = cr.a(an.field_q, param5, ha.field_n, 0);
              if (param4 > 28) {
                break L1;
              } else {
                qn.c((byte) -62);
                break L1;
              }
            }
            var8 = cr.a(eo.field_l, param0, pw.field_x, 0);
            var9 = cr.a(eo.field_l, param1, pw.field_x, 0);
            var10 = var6_int;
            L2: while (true) {
              if (var10 > var7) {
                break L0;
              } else {
                hba.a(param3, var8, tj.field_b[var10], 7, var9);
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var6, "qn.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        rla.field_k.e(param2 + 25, 10 + param0);
        if (param1 != 0) {
            ((qn) this).field_f = true;
        }
    }

    qn(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final boolean b(int param0) {
        if (param0 <= 21) {
            field_i = null;
            return ((qn) this).field_f;
        }
        return ((qn) this).field_f;
    }

    public static void c(byte param0) {
        field_i = null;
        field_h = null;
        field_g = null;
        if (param0 < 105) {
            qn.a(61, -31, 58, -104, 0, -124);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            field_g = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new cf();
        field_h = "Try changing the following settings:  ";
    }
}
