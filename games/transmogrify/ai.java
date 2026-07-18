/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static byte[][] field_e;
    static q field_a;
    static String field_d;
    static int field_c;
    static ti[] field_b;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            oa var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_34_0 = 0;
            if (-5 >= oh.field_h.field_p) {
              if (0 == oh.field_h.field_k) {
                return 3;
              } else {
                if (oh.field_h.field_k != -2) {
                  return 1;
                } else {
                  return 4;
                }
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (0 == cl.field_A) {
                      wj.field_j = qi.field_a.a(60, nf.field_i, c.field_b);
                      cl.field_A = cl.field_A + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (cl.field_A != 1) {
                      break L2;
                    } else {
                      if (wj.field_j.field_c == 2) {
                        stackOut_15_0 = og.a(2, -1);
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        if (1 == wj.field_j.field_c) {
                          cl.field_A = cl.field_A + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (cl.field_A != 2) {
                      break L3;
                    } else {
                      re.field_y = new gj((java.net.Socket) wj.field_j.field_g, qi.field_a);
                      var2 = new oa(13);
                      qb.a(116, of.field_c, var2, uh.field_f, tl.field_c);
                      var2.f(6389, 15);
                      var2.a(-109, dk.field_h);
                      re.field_y.a((byte) 9, var2.field_g, 13, 0);
                      cl.field_A = cl.field_A + 1;
                      ob.field_G = 30000L + lk.a(0);
                      break L3;
                    }
                  }
                  L4: {
                    if (cl.field_A != 3) {
                      break L4;
                    } else {
                      if (re.field_y.a((byte) -125) <= 0) {
                        if (ob.field_G < lk.a(0)) {
                          stackOut_31_0 = og.a(2, -2);
                          stackIn_32_0 = stackOut_31_0;
                          return stackIn_32_0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = re.field_y.c(1);
                        if (var1_int != 0) {
                          stackOut_26_0 = og.a(2, var1_int);
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        } else {
                          cl.field_A = cl.field_A + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  if (4 != cl.field_A) {
                    stackOut_36_0 = -1;
                    stackIn_37_0 = stackOut_36_0;
                    break L0;
                  } else {
                    oh.field_h.a(ck.field_A, (Object) (Object) re.field_y, 20);
                    re.field_y = null;
                    cl.field_A = 0;
                    wj.field_j = null;
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    return stackIn_35_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return og.a(2, -3);
              }
              return stackIn_37_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    final static void b(int param0) {
        String var1 = null;
        int var2 = 0;
        if (lb.field_d) {
          var2 = 33 / ((-70 - param0) / 55);
          if (null != wg.field_d) {
            wg.field_d.r(77);
            var1 = lb.a(true);
            ok.field_a = new ff(var1, (String) null, true, false, false);
            ci.field_f.b((qg) (Object) l.field_d, (byte) -71);
            l.field_d.b(-122, (qg) (Object) ok.field_a);
            l.field_d.p(27830);
            return;
          } else {
            var1 = lb.a(true);
            ok.field_a = new ff(var1, (String) null, true, false, false);
            ci.field_f.b((qg) (Object) l.field_d, (byte) -71);
            l.field_d.b(-122, (qg) (Object) ok.field_a);
            l.field_d.p(27830);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new byte[250][];
        field_a = new q();
    }
}
