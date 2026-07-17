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

    final static eh a(int param0, boolean param1, int param2, int param3) {
        try {
            Object var6 = null;
            Object var7 = null;
            oa var8 = null;
            eh stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            eh stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null != ii.field_a.field_c) {
                    dj.field_l = new nh(ii.field_a.field_c, 5200, 0);
                    ii.field_a.field_c = null;
                    var6 = (Object) (Object) new gl(255, dj.field_l, new nh(ii.field_a.field_j, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param3 <= -56) {
                    break L2;
                  } else {
                    field_f = null;
                    break L2;
                  }
                }
                L3: {
                  if (dj.field_l != null) {
                    L4: {
                      if (ij.field_n == null) {
                        ij.field_n = new nh[ii.field_a.field_i.length];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (ij.field_n[param2] != null) {
                        break L5;
                      } else {
                        ij.field_n[param2] = new nh(ii.field_a.field_i[param2], 12000, 0);
                        ii.field_a.field_i[param2] = null;
                        break L5;
                      }
                    }
                    var7 = (Object) (Object) new gl(param2, dj.field_l, ij.field_n[param2], 2097152);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = ql.field_q.a(72, param2, false, (gl) var6, (gl) var7);
                stackOut_13_0 = new eh((ba) (Object) var8, true, 1);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_14_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_e = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static void a(boolean param0) {
        tk.field_b = new qh();
        fi.field_t.b((fi) (Object) tk.field_b, (byte) -53);
    }

    final static byte[] a(byte[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
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
            var2_int = param0.length;
            var3 = new byte[var2_int];
            ek.a(param0, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("va.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has declined the invitation.";
        field_f = "Confirm Password: ";
        field_e = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_a = "Game options changed (<%0>)";
    }
}
