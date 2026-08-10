/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static int[] field_b;
    static int field_a;
    static sca field_c;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        L0: {
          if ((param0 ^ -1) != -101) {
            break L0;
          } else {
            if (lt.field_b <= 0) {
              break L0;
            } else {
              fieldTemp$3 = lt.field_b - 1;
              lt.field_b = lt.field_b - 1;
              var2_ref_byte__ = ena.field_p[fieldTemp$3];
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
              fieldTemp$4 = mc.field_h - 1;
              mc.field_h = mc.field_h - 1;
              var2_ref_byte__ = rn.field_q[fieldTemp$4];
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
              fieldTemp$5 = sca.field_d - 1;
              sca.field_d = sca.field_d - 1;
              var2_ref_byte__ = ok.field_zb[fieldTemp$5];
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
                    dupTemp$6 = nga.field_g[var2] - 1;
                    arrayValue$7 = vla.field_o[var2];
                    nga.field_g[var2] = dupTemp$6;
                    var3 = arrayValue$7[dupTemp$6];
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
        try {
            bi.a(param6, false, 20, param2, param1, param5, param4, false, param0);
            if (param3 != 74) {
                sd.a(71, -102);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0, lu param1, sfa param2) {
        if (param2 == null) {
            param1.d(-1, param0 + -124);
            return;
        }
        try {
            param1.d(param2.field_f, 0);
            if (param0 != 124) {
                sd.a(62, 123);
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
