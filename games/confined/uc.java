/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends sa {
    static String field_Z;
    static nf[] field_U;
    static nf[] field_db;
    static mn field_bb;
    static int[] field_ab;
    static String field_cb;

    final static vj a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        vj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!fb.field_a.c(17237)) {
                break L1;
              } else {
                if (param1.equals(fb.field_a.a(55))) {
                  break L1;
                } else {
                  fb.field_a = a.a(param1, -6728);
                  break L1;
                }
              }
            }
            var2_int = -64 % ((38 - param0) / 61);
            stackIn_4_0 = fb.field_a;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("uc.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final void g(int param0) {
        int var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 == 26402) {
          this.a((byte) 112, ji.field_a, 1.5);
          this.a(qg.field_k, false);
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -6) {
              return;
            } else {
              ri.a((rk) (this), 0, new mm(this.field_A, (ee) (this), this.field_S, qg.field_k[var2]));
              var2++;
              continue L0;
            }
          }
        } else {
          uc.l(103);
          this.a((byte) 112, ji.field_a, 1.5);
          this.a(qg.field_k, false);
          var2 = 0;
          L1: while (true) {
            if ((var2 ^ -1) <= -6) {
              return;
            } else {
              ri.a((rk) (this), 0, new mm(this.field_A, (ee) (this), this.field_S, qg.field_k[var2]));
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (!(!this.field_N)) {
            return;
        }
        try {
            this.a(sm.field_A, this.field_S, param4, (byte) 64, param1, param0, param3, 128);
            if (param2 >= -5) {
                this.g(118);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "uc.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    uc(hn param0, ee param1, da param2) {
        super(param0, param1, param2, 0.2, 0.03, 16.0);
        try {
            kj.a(gi.field_eb, 96, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "uc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void l(int param0) {
        field_ab = null;
        field_U = null;
        field_db = null;
        field_cb = null;
        field_Z = null;
        field_bb = null;
        if (param0 >= -124) {
            field_db = (nf[]) null;
        }
    }

    static {
        field_Z = "NORMAL";
        field_bb = new mn();
        field_cb = "Waiting for music";
    }
}
