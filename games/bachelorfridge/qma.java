/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qma extends pu {
    private static String field_z;

    final static vr a(boolean param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            fp var8 = null;
            vr stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            vr stackOut_11_0 = null;
            try {
              L0: {
                var6 = null;
                var7 = null;
                if (null != mh.field_l.field_h) {
                  f.field_a = new v(mh.field_l.field_h, 5200, 0);
                  mh.field_l.field_h = null;
                  var6 = (Object) (Object) new ta(255, f.field_a, new v(mh.field_l.field_n, 12000, 0), 2097152);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (f.field_a == null) {
                  break L1;
                } else {
                  L2: {
                    if (null != fr.field_m) {
                      break L2;
                    } else {
                      fr.field_m = new v[mh.field_l.field_v.length];
                      break L2;
                    }
                  }
                  L3: {
                    if (null == fr.field_m[param5]) {
                      fr.field_m[param5] = new v(mh.field_l.field_v[param5], 12000, 0);
                      mh.field_l.field_v[param5] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var7 = (Object) (Object) new ta(param5, f.field_a, fr.field_m[param5], 2097152);
                  break L1;
                }
              }
              var8 = ga.field_c.a(false, param5, (ta) var7, (ta) var6, 64);
              stackOut_11_0 = new vr((tja) (Object) var8, param0, param3);
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Object) (Object) decompiledCaughtException;
              throw pe.a((Throwable) var6, field_z + param0 + ',' + 2097152 + ',' + false + ',' + param3 + ',' + false + ',' + param5 + ')');
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
        field_z = "qma.A(";
    }
}
