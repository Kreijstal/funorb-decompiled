/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends td {
    static String field_r;
    static String field_q;
    static eaa field_s;
    static boolean field_p;

    public static void b(int param0) {
        field_s = null;
        field_q = null;
        if (param0 != 0) {
            field_s = (eaa) null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    ja(int param0, aga param1) {
        super(param0, param1);
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        if (param0 < -4) {
          L0: {
            var4 = 0;
            if (param3) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param2) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param1) {
            var4++;
            return ql.field_r[var4];
          } else {
            return ql.field_r[var4];
          }
        } else {
          L2: {
            field_q = (String) null;
            var4 = 0;
            if (param3) {
              var4 += 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param2) {
              var4 += 2;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param1) {
            return ql.field_r[var4];
          } else {
            var4++;
            return ql.field_r[var4];
          }
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        vba var4 = null;
        vba stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_h.a(10, param0);
              var4 = new vba(this.field_g, new nq(var3));
              if (param1 == 3) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (vba) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ja.A(");

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_3_0);
    }

    static {
        field_r = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_q = "Win %";
        field_s = new eaa();
        field_p = true;
    }
}
