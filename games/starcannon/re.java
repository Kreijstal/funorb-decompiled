/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends rf {
    int field_p;
    static hl field_f;
    int[] field_o;
    int field_n;
    int field_h;
    int field_m;
    int field_i;
    long field_k;
    static hl field_l;
    static String field_q;
    int field_j;
    int field_g;

    public static void d(int param0) {
        field_l = null;
        field_q = null;
        field_f = null;
    }

    final static qc a(int param0, ka param1, int param2, boolean param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        qc var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_5_0 = null;
        qc stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qc stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var8 = oh.a(param5, param1, param2, param4, param0, -100);
            var6 = var8;
            if (var8 != null) {
              if (param3) {
                var7 = new qc();
                var7.field_f = var8;
                java.awt.Component discarded$2 = var7.field_f.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param4, param5);
                var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
                var7.requestFocus();
                stackOut_6_0 = (qc) var7;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (qc) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("re.C(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_7_0;
    }

    final static void a(int param0) {
        if (null == n.field_a) {
          return;
        } else {
          wf.a((java.awt.Canvas) (Object) n.field_a, false);
          if (param0 == 0) {
            n.field_a.a(nb.field_e, (byte) -63);
            n.field_a = null;
            if (kd.field_B != null) {
              kd.field_B.a(false);
              kj.field_E.requestFocus();
              return;
            } else {
              kj.field_E.requestFocus();
              return;
            }
          } else {
            return;
          }
        }
    }

    re(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((re) this).field_m = param3;
            ((re) this).field_i = param2;
            ((re) this).field_h = param1;
            int fieldTemp$0 = mg.field_h;
            mg.field_h = mg.field_h + 1;
            ((re) this).field_g = 65535 & fieldTemp$0;
            ((re) this).field_n = param0;
            ((re) this).field_o = param6;
            ((re) this).field_j = param5;
            ((re) this).field_p = param4;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "re.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
