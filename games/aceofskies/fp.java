/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fp extends wf {
    int field_e;
    static int field_g;
    int field_f;

    final static boolean a(byte param0, boolean param1) {
        try {
            int var2 = 0;
            IOException var3 = null;
            dl var4 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (null == gr.field_b) {
                gr.field_b = ii.field_j.a(2, ca.field_g, sg.field_b);
                break L0;
              } else {
                break L0;
              }
            }
            if (gr.field_b.field_a == 0) {
              return false;
            } else {
              var2 = 72 / ((-10 - param0) / 56);
              long dupTemp$2 = kh.a(-114);
              co.field_e = dupTemp$2;
              ff.field_b = dupTemp$2;
              if (gr.field_b.field_a == 1) {
                try {
                  L1: {
                    L2: {
                      ft.field_l = new vf((java.net.Socket) gr.field_b.field_f, ii.field_j);
                      var4 = nm.field_c;
                      q.field_p.field_g = 0;
                      var4.field_g = 0;
                      if (!param1) {
                        stackOut_10_0 = -1;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = -2;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    ga.field_l = stackIn_11_0;
                    kg.field_b = stackIn_11_0;
                    hi.field_w = stackIn_11_0;
                    ca.field_f = qa.field_b;
                    tr.a((rb) (Object) q.field_p, ut.field_a, id.field_d, ko.field_f, 0);
                    fr.a(-34, -1);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (IOException) (Object) decompiledCaughtException;
                  ca.field_f = pj.field_f;
                  gr.field_b = null;
                  return true;
                }
                gr.field_b = null;
                return true;
              } else {
                ca.field_f = pj.field_f;
                gr.field_b = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 < 21) {
          field_g = -99;
          qk.a((byte) -92);
          vp.a(param4, param1, param3, param2);
          return;
        } else {
          qk.a((byte) -92);
          vp.a(param4, param1, param3, param2);
          return;
        }
    }

    private fp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
