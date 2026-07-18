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

    public static void d() {
        field_l = null;
        field_q = null;
        field_f = null;
    }

    final static qc a(int param0, ka param1, int param2, boolean param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        qc var7 = null;
        java.awt.Frame var8 = null;
        qc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        qc stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            int discarded$6 = -100;
            int discarded$7 = 0;
            var8 = oh.a(param5, param1, 0, param4);
            var6 = var8;
            if (var8 != null) {
              var7 = new qc();
              var7.field_f = var8;
              java.awt.Component discarded$8 = var7.field_f.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param4, param5);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (qc) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("re.C(").append(0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 0 + ',' + true + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0) {
        if (null == n.field_a) {
          return;
        } else {
          int discarded$6 = 0;
          wf.a((java.awt.Canvas) (Object) n.field_a);
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
            throw sd.a((Throwable) (Object) runtimeException, "re.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
