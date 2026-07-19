/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ri {
    static String[] field_b;
    static ue field_c;
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -15552) {
            return;
        }
        field_b = null;
    }

    final static ue a(boolean param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            t var8 = null;
            ue stackIn_11_0 = null;
            ue stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ue stackOut_14_0 = null;
            ue stackOut_10_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (ij.field_f.field_e == null) {
                    break L1;
                  } else {
                    ne.field_l = new td(ij.field_f.field_e, 5200, 0);
                    ij.field_f.field_e = null;
                    var6 = new uf(255, ne.field_l, new td(ij.field_f.field_t, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (null != ne.field_l) {
                    L3: {
                      if (fe.field_J != null) {
                        break L3;
                      } else {
                        fe.field_J = new td[ij.field_f.field_q.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (fe.field_J[param3] != null) {
                        break L4;
                      } else {
                        fe.field_J[param3] = new td(ij.field_f.field_q[param3], 12000, 0);
                        ij.field_f.field_q[param3] = null;
                        break L4;
                      }
                    }
                    var7 = new uf(param3, ne.field_l, fe.field_J[param3], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param0) {
                  L5: {
                    var8 = bl.field_b.a(param4, -72, (uf) (var7), param3, (uf) (var6));
                    if (!param1) {
                      break L5;
                    } else {
                      var8.a(-126);
                      break L5;
                    }
                  }
                  stackOut_14_0 = new ue(var8, param5, param2);
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_10_0 = (ue) null;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_11_0;
            } else {
              return stackIn_15_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        we.field_i = se.field_p.a(-104);
        if (param0 != 12000) {
          field_b = (String[]) null;
          var2 = (CharSequence) ((Object) we.field_i);
          ba.field_e = ni.a(param0 + -11877, var2);
          return;
        } else {
          var3 = (CharSequence) ((Object) we.field_i);
          ba.field_e = ni.a(param0 + -11877, var3);
          return;
        }
    }

    static {
        field_a = new int[8192];
    }
}
