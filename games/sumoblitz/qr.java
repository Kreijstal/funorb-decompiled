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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_2_0 = null;
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
              var2 = new an(false);
              var2.field_h = args;
              if (param1 == 8192) {
                break L1;
              } else {
                qr.a(1, -118);
                break L1;
              }
            }
            stackOut_2_0 = (an) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("qr.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
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
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
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
              L3: {
                L4: {
                  if (var2_int >= se.field_d) {
                    break L4;
                  } else {
                    pd.field_q[param1 + var2_int] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                vk.a(ab.field_c, oc.field_f, (byte) -107, param1 + se.field_d, param1 + param1, param1, false);
                break L3;
              }
              if (se.field_d <= param1) {
                break L0;
              } else {
                se.field_d = param1;
                return;
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
        if (param0 == 17704) {
          if (jj.field_f != this) {
            if (uu.field_l != this) {
              if (this == ga.field_j) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
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
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    static {
        field_c = new jn();
        field_e = new gf();
        field_d = new int[8192];
    }
}
