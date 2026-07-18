/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pea {
    static fp field_c;
    static String field_f;
    private od field_d;
    private ji field_e;
    private vj field_a;
    private int field_b;

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 >= -92) {
          var2 = null;
          vb discarded$2 = pea.a((qia) null, -115);
          field_f = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          return;
        }
    }

    final od a(int param0, long param1) {
        od var4 = null;
        if (param0 == 0) {
          var4 = (od) (Object) ((pea) this).field_e.a((byte) -104, param1);
          if (var4 != null) {
            ((pea) this).field_a.a(var4, (byte) -75);
            return var4;
          } else {
            return var4;
          }
        } else {
          return null;
        }
    }

    final static vb a(qia param0, int param1) {
        vb var2 = null;
        RuntimeException var2_ref = null;
        vb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = new vb(param0, (vg) (Object) param0);
              tna.field_e.b((byte) -68, (vg) (Object) var2);
              if (param1 == 1) {
                break L1;
              } else {
                pea.a((byte) -106);
                break L1;
              }
            }
            kva.field_n.a((cg) (Object) param0);
            stackOut_2_0 = (vb) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("pea.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(od param0, byte param1, long param2) {
        od var5 = null;
        if (param1 <= 6) {
            return;
        }
        try {
            if (0 != ((pea) this).field_b) {
                ((pea) this).field_b = ((pea) this).field_b - 1;
            } else {
                var5 = ((pea) this).field_a.c((byte) 127);
                var5.p(36);
                var5.c(-7975);
                if (!(((pea) this).field_d != var5)) {
                    var5 = ((pea) this).field_a.c((byte) 124);
                    var5.p(75);
                    var5.c(-7975);
                }
            }
            ((pea) this).field_e.a(param2, 126, (vg) (Object) param0);
            ((pea) this).field_a.a(param0, (byte) -77);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    pea(int param0) {
        ((pea) this).field_d = new od();
        ((pea) this).field_a = new vj();
        ((pea) this).field_b = param0;
        int var2 = 1;
        while (param0 > var2 + var2) {
            var2 = var2 + var2;
        }
        ((pea) this).field_e = new ji(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Hide lobby chat";
        field_c = new fp();
    }
}
