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
        if (param0 != 0) {
            field_l = (hl) null;
        }
    }

    final static qc a(int param0, ka param1, int param2, boolean param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        qc var7 = null;
        java.awt.Frame var8 = null;
        qc stackIn_5_0 = null;
        qc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = oh.a(param5, param1, param2, param4, param0, -100);
            var6 = var8;
            if (var8 != null) {
              if (param3) {
                var7 = new qc();
                var7.field_f = var8;
                var7.field_f.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param4, param5);
                var7.addFocusListener(var7);
                var7.requestFocus();
                stackIn_7_0 = (qc) (var7);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (qc) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6_ref);

            stackIn_10_1 = new StringBuilder().append("re.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(int param0) {
        if (null == n.field_a) {
          return;
        } else {
          wf.a(n.field_a, false);
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
        int fieldTemp$0 = 0;
        try {
            this.field_m = param3;
            this.field_i = param2;
            this.field_h = param1;
            fieldTemp$0 = mg.field_h;
            mg.field_h = mg.field_h + 1;
            this.field_g = 65535 & fieldTemp$0;
            this.field_n = param0;
            this.field_o = param6;
            this.field_j = param5;
            this.field_p = param4;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "re.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
