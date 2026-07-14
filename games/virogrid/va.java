/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class va {
    static String field_c;
    static int field_b;
    static String field_d;
    static char[] field_e;
    static String field_f;
    static String field_a;

    final static eh a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            gl var6 = null;
            IOException var6_ref = null;
            gl var7 = null;
            oa var8 = null;
            eh stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            eh stackOut_16_0 = null;
            try {
              L0: {
                var6 = null;
                var7 = null;
                if (null != ii.field_a.field_c) {
                  dj.field_l = new nh(ii.field_a.field_c, 5200, 0);
                  ii.field_a.field_c = null;
                  var6 = new gl(255, dj.field_l, new nh(ii.field_a.field_j, 12000, 0), 2097152);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param3 <= -56) {
                  break L1;
                } else {
                  field_f = null;
                  break L1;
                }
              }
              L2: {
                if (dj.field_l != null) {
                  L3: {
                    if (ij.field_n == null) {
                      ij.field_n = new nh[ii.field_a.field_i.length];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (ij.field_n[param2] != null) {
                      break L4;
                    } else {
                      ij.field_n[param2] = new nh(ii.field_a.field_i[param2], 12000, 0);
                      ii.field_a.field_i[param2] = null;
                      break L4;
                    }
                  }
                  var7 = new gl(param2, dj.field_l, ij.field_n[param2], 2097152);
                  break L2;
                } else {
                  break L2;
                }
              }
              L5: {
                var8 = ql.field_q.a(72, param2, param1, var6, var7);
                if (param5) {
                  var8.a(true);
                  break L5;
                } else {
                  break L5;
                }
              }
              stackOut_16_0 = new eh((ba) (Object) var8, param4, param0);
              stackIn_17_0 = stackOut_16_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_17_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_c = null;
        if (param0 > -42) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    final static void a(boolean param0) {
        tk.field_b = new qh();
        fi.field_t.b((fi) (Object) tk.field_b, (byte) -53);
        if (param0) {
            field_d = null;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        ek.a(param0, param1, var3, 0, var2);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has declined the invitation.";
        field_f = "Confirm Password: ";
        field_e = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_a = "Game options changed (<%0>)";
    }
}
