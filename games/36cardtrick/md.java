/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md {
    int field_b;
    int field_c;
    int field_d;
    int field_a;

    final static boolean a(byte param0) {
        if (param0 > -6) {
            boolean discarded$0 = md.a(122, false);
            return qe.a(mk.g(-122), (byte) -98);
        }
        return qe.a(mk.g(-122), (byte) -98);
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            w var4 = null;
            w var5 = null;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_11_0 = 0;
            L0: {
              if (null == fe.field_c) {
                fe.field_c = td.field_b.a(mk.field_k, (byte) -108, ag.field_e);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 > 47) {
              if (0 == fe.field_c.field_a) {
                return false;
              } else {
                long dupTemp$2 = id.a(94);
                ua.field_E = dupTemp$2;
                uk.field_a = dupTemp$2;
                if (-2 == (fe.field_c.field_a ^ -1)) {
                  try {
                    L1: {
                      L2: {
                        cb.field_j = new jd((java.net.Socket) fe.field_c.field_e, td.field_b);
                        var4 = rd.field_j;
                        var5 = var4;
                        na.field_r.field_i = 0;
                        var5.field_i = 0;
                        if (param1) {
                          stackOut_12_0 = -2;
                          stackIn_13_0 = stackOut_12_0;
                          break L2;
                        } else {
                          stackOut_11_0 = -1;
                          stackIn_13_0 = stackOut_11_0;
                          break L2;
                        }
                      }
                      ni.field_d = stackIn_13_0;
                      hc.field_f = stackIn_13_0;
                      sb.field_a = stackIn_13_0;
                      ra.field_b = vf.field_a;
                      nf.a((pb) (Object) na.field_r, false, ag.field_d, kh.field_g, kj.field_t);
                      fe.a((byte) -36, -1);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (IOException) (Object) decompiledCaughtException;
                    ra.field_b = rk.field_fb;
                    fe.field_c = null;
                    return true;
                  }
                  fe.field_c = null;
                  return true;
                } else {
                  ra.field_b = rk.field_fb;
                  fe.field_c = null;
                  return true;
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
