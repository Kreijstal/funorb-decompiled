/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj {
    static aa field_a;
    static jb field_b;
    static rd field_c;

    final static String a(int param0) {
        String var1 = null;
        var1 = "";
        if (param0 >= -98) {
          return null;
        } else {
          L0: {
            if (ra.field_y != null) {
              var1 = ra.field_y.d(true);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var1.length() != 0) {
              break L1;
            } else {
              var1 = li.d(-579139480);
              break L1;
            }
          }
          L2: {
            if (0 != var1.length()) {
              break L2;
            } else {
              var1 = ib.field_b;
              break L2;
            }
          }
          return var1;
        }
    }

    final static qj[] a(String param0, kk param1, byte param2, String param3) {
        int var5 = 108 % ((-60 - param2) / 39);
        int var4 = param1.a(true, param3);
        int var6 = param1.a(param0, var4, -1);
        return jd.a(4764, var6, var4, param1);
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 0) {
            field_c = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(String param0, long param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, uf param9, boolean param10, int param11, int param12, boolean param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            L0: {
              ne.field_a = new la(param7);
              ra.field_C = new la(param4);
              ke.field_c = param6;
              dc.field_o = param0;
              ma.field_c = param2;
              kj.field_k = param11;
              db.field_Z = param12;
              rg.field_b = param5;
              gf.field_o = param9;
              uk.field_b = param3;
              if (param8) {
                break L0;
              } else {
                field_c = null;
                break L0;
              }
            }
            L1: {
              oc.field_i = param13;
              if (!param10) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            mk.field_c = stackIn_5_0 != 0;
            sb.field_a = param1;
            if (null != gf.field_o.field_p) {
              try {
                pl.field_b = new il(gf.field_o.field_p, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new aa(13, 0, 1, 0);
        field_b = new jb();
    }
}
