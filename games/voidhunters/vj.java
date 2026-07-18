/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends rqa {
    static llb field_q;
    static String field_o;
    static String field_p;

    vj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void e(int param0) {
        if (uh.field_p == jl.field_q.field_b) {
          if (param0 > ~tb.field_b) {
            L0: {
              tb.field_b = tb.field_b - 1;
              if (tb.field_b > 0) {
                cs.b((byte) -31);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (tb.field_b > 0) {
                cs.b((byte) -31);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          kga.field_o = kga.field_o + (jl.field_q.field_b - uh.field_p);
          uh.field_p = jl.field_q.field_b;
          if (param0 <= ~tb.field_b) {
            L2: {
              if (tb.field_b > 0) {
                cs.b((byte) -31);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              tb.field_b = tb.field_b - 1;
              if (tb.field_b > 0) {
                cs.b((byte) -31);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              if (param1 <= -119) {
                break L1;
              } else {
                vj.e(-68);
                break L1;
              }
            }
            si.a(227, 62, param0[0].a(12));
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vj.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a() {
        field_o = null;
        field_q = null;
        int var1 = 29;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Fighter bay";
        field_p = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
