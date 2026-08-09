/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr {
    static jn field_c;
    static ta field_a;
    static gf field_e;
    static int[] field_d;
    static ud field_b;

    final static an a(String[] args, int param1) {
        an var2 = null;
        RuntimeException var2_ref = null;
        an stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new an(false);
              var2.field_h = args;
              if (param1 == 8192) {
                break L1;
              } else {
                qr.a(1, -118);
                break L1;
              }
            }
            stackIn_3_0 = (an) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("qr.A(");

            if (args == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              vk.a(qu.field_k, kc.field_l, (byte) -107, se.field_d, param1, 0, true);
              if (param0 == 13136) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= se.field_d) {
                L3: {
                  vk.a(ab.field_c, oc.field_f, (byte) -107, param1 + se.field_d, param1 + param1, param1, false);
                  if (se.field_d <= param1) {
                    break L3;
                  } else {
                    se.field_d = param1;
                    break L3;
                  }
                }
                break L0;
              } else {
                pd.field_q[param1 + var2_int] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "qr.C(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        if (param0 == 17704) {
          L0: {
            L1: {
              if (jj.field_f == this) {
                break L1;
              } else {
                if (uu.field_l == this) {
                  break L1;
                } else {
                  if (this != ga.field_j) {
                    stackIn_8_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != 119) {
            field_e = (gf) null;
        }
        field_d = null;
    }

    static {
        field_c = new jn();
        field_e = new gf();
        field_d = new int[8192];
    }
}
