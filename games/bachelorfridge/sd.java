/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static int[] field_b;
    static int field_a;
    static sca field_c;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (lt.field_b <= 0) {
              break L0;
            } else {
              int fieldTemp$6 = lt.field_b - 1;
              lt.field_b = lt.field_b - 1;
              var2_ref_byte__ = ena.field_p[fieldTemp$6];
              ena.field_p[lt.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (mc.field_h <= 0) {
              break L1;
            } else {
              int fieldTemp$7 = mc.field_h - 1;
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
              int fieldTemp$8 = sca.field_d - 1;
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
        field_b = null;
        field_c = null;
    }

    final static void a(double param0, int param1, oha param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            bi.a(480, false, 20, param2, param1, 640, param4, false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("sd.A(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 74 + ',' + param4 + ',' + 640 + ',' + 480 + ')');
        }
    }

    final static void a(byte param0, lu param1, sfa param2) {
        if (param2 == null) {
            param1.d(-1, 0);
            return;
        }
        try {
            param1.d(param2.field_f, 0);
            param1.b(param2.field_g, -112);
            er.a(param2.field_h, 110, param1);
            param2.a(114, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sd.C(" + 124 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
