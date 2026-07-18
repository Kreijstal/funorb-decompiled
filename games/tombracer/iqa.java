/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iqa {
    static ila field_c;
    ei field_b;
    long field_f;
    java.awt.Canvas field_a;
    private soa field_e;
    ha field_d;
    static String field_g;

    final soa a(byte param0) {
        if (param0 >= -12) {
          return null;
        } else {
          L0: {
            if (null == ((iqa) this).field_e) {
              ((iqa) this).field_e = new soa();
              break L0;
            } else {
              break L0;
            }
          }
          ((iqa) this).field_e.a(127, (iqa) this);
          return ((iqa) this).field_e;
        }
    }

    public static void a(int param0) {
        field_g = null;
        int var1 = 0;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        jta.a(param3, true);
        vha.a(param2, (byte) 95, param3, param1);
        int var4 = 24;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (pka.field_b > -param4 + param3) {
          nfa.a(0, param4, param2, param3, param1);
          if (param0 == 30237) {
            return;
          } else {
            iqa.a(114, -54, -16, -30, -116);
            return;
          }
        } else {
          if (param3 + param4 > ss.field_c) {
            nfa.a(0, param4, param2, param3, param1);
            if (param0 != 30237) {
              iqa.a(114, -54, -16, -30, -116);
              return;
            } else {
              return;
            }
          } else {
            if (gca.field_d > param1 + -param4) {
              nfa.a(0, param4, param2, param3, param1);
              if (param0 != 30237) {
                iqa.a(114, -54, -16, -30, -116);
                return;
              } else {
                return;
              }
            } else {
              if (param1 - -param4 > hc.field_h) {
                nfa.a(0, param4, param2, param3, param1);
                if (param0 != 30237) {
                  iqa.a(114, -54, -16, -30, -116);
                  return;
                } else {
                  return;
                }
              } else {
                bq.a(param1, param3, param2, (byte) -13, param4);
                if (param0 == 30237) {
                  return;
                } else {
                  iqa.a(114, -54, -16, -30, -116);
                  return;
                }
              }
            }
          }
        }
    }

    iqa(ha param0, ei param1, java.awt.Canvas param2) {
        try {
            ((iqa) this).field_a = param2;
            ((iqa) this).field_d = param0;
            ((iqa) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "iqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Age:";
        field_c = new ila();
    }
}
