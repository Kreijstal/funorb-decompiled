/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static int[] field_b;
    static int field_a;
    static sca field_c;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if ((param0 ^ -1) != -101) {
            break L0;
          } else {
            if (lt.field_b <= 0) {
              break L0;
            } else {
              fieldTemp$6 = lt.field_b - 1;
              lt.field_b = lt.field_b - 1;
              var2_ref_byte__ = ena.field_p[fieldTemp$6];
              ena.field_p[lt.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param0 != param1) {
            break L1;
          } else {
            if ((mc.field_h ^ -1) >= -1) {
              break L1;
            } else {
              fieldTemp$7 = mc.field_h - 1;
              mc.field_h = mc.field_h - 1;
              var2_ref_byte__ = rn.field_q[fieldTemp$7];
              rn.field_q[mc.field_h] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (0 < sca.field_d) {
              fieldTemp$8 = sca.field_d - 1;
              sca.field_d = sca.field_d - 1;
              var2_ref_byte__ = ok.field_zb[fieldTemp$8];
              ok.field_zb[sca.field_d] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (vla.field_o == null) {
            break L3;
          } else {
            var2 = 0;
            L4: while (true) {
              if (var2 >= hw.field_xb.length) {
                break L3;
              } else {
                if (hw.field_xb[var2] == param0) {
                  if (nga.field_g[var2] > 0) {
                    nga.field_g[var2] = nga.field_g[var2] - 1;
                    var3 = vla.field_o[var2][nga.field_g[var2] - 1];
                    vla.field_o[var2][nga.field_g[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          }
        }
        return new byte[param0];
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(double param0, int param1, oha param2, byte param3, int param4, int param5, int param6) {
        byte[] discarded$2 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              bi.a(param6, false, 20, param2, param1, param5, param4, false, param0);
              if (param3 == 74) {
                break L1;
              } else {
                discarded$2 = sd.a(71, -102);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sd.A(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0, lu param1, sfa param2) {
        byte[] discarded$0 = null;
        if (param2 == null) {
            param1.d(-1, param0 + -124);
            return;
        }
        try {
            param1.d(param2.field_f, 0);
            if (param0 != 124) {
                discarded$0 = sd.a(62, 123);
            }
            param1.b(param2.field_g, -112);
            er.a(param2.field_h, 110, param1);
            param2.a(param0 ^ 14, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "sd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
