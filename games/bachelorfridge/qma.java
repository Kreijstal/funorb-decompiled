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
            vr stackIn_5_0 = null;
            vr stackIn_16_0 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            vr stackOut_15_0 = null;
            vr stackOut_4_0 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var6 = null;
                      var7 = null;
                      if (null != mh.field_l.field_h) {
                        f.field_a = new v(mh.field_l.field_h, 5200, 0);
                        mh.field_l.field_h = null;
                        var6 = new ta(255, f.field_a, new v(mh.field_l.field_n, 12000, 0), 2097152);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (param1 == 2097152) {
                      L3: {
                        if (f.field_a == null) {
                          break L3;
                        } else {
                          L4: {
                            if (null != fr.field_m) {
                              break L4;
                            } else {
                              fr.field_m = new v[mh.field_l.field_v.length];
                              break L4;
                            }
                          }
                          L5: {
                            if (null == fr.field_m[param5]) {
                              fr.field_m[param5] = new v(mh.field_l.field_v[param5], 12000, 0);
                              mh.field_l.field_v[param5] = null;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var7 = new ta(param5, f.field_a, fr.field_m[param5], 2097152);
                          break L3;
                        }
                      }
                      L6: {
                        var8 = ga.field_c.a(param2, param5, (ta) (var7), (ta) (var6), 64);
                        if (!param4) {
                          break L6;
                        } else {
                          var8.a((byte) 90);
                          break L6;
                        }
                      }
                      stackOut_15_0 = new vr(var8, param0, param3);
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackOut_4_0 = (vr) null;
                      stackIn_5_0 = stackOut_4_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException(((IOException) (var6)).toString());
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              throw pe.a((Throwable) (var6), field_z + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_5_0;
            } else {
              return stackIn_16_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_z = "qma.A(";
    }
}
