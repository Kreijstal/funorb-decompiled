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
            int stackIn_16_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            oa var2 = null;
            if (-5 >= (oh.field_h.field_p ^ -1)) {
              if (0 == (oh.field_h.field_k ^ -1)) {
                return 3;
              } else {
                if ((oh.field_h.field_k ^ -1) != 1) {
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
                    if (-2 != (cl.field_A ^ -1)) {
                      break L2;
                    } else {
                      if ((wj.field_j.field_c ^ -1) == -3) {
                        stackIn_16_0 = og.a(2, -1);
                        decompiledRegionSelector0 = 0;
                        break L0;
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
                    if (cl.field_A != param0) {
                      break L3;
                    } else {
                      re.field_y = new gj((java.net.Socket) (wj.field_j.field_g), qi.field_a);
                      var2 = new oa(13);
                      qb.a(116, of.field_c, var2, uh.field_f, tl.field_c);
                      var2.f(param0 + 6387, 15);
                      var2.a(-109, dk.field_h);
                      re.field_y.a((byte) 9, var2.field_g, 13, 0);
                      cl.field_A = cl.field_A + 1;
                      ob.field_G = 30000L + lk.a(param0 ^ 2);
                      break L3;
                    }
                  }
                  L4: {
                    if ((cl.field_A ^ -1) != -4) {
                      break L4;
                    } else {
                      if (re.field_y.a((byte) -125) <= 0) {
                        if (ob.field_G < lk.a(0)) {
                          stackIn_32_0 = og.a(2, -2);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = re.field_y.c(1);
                        if (var1_int != 0) {
                          stackIn_27_0 = og.a(param0 ^ 0, var1_int);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          cl.field_A = cl.field_A + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  if (4 != cl.field_A) {
                    stackIn_37_0 = -1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    oh.field_h.a(ck.field_A, re.field_y, param0 + 18);
                    re.field_y = null;
                    cl.field_A = 0;
                    wj.field_j = null;
                    stackIn_35_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return og.a(2, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_27_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_32_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_35_0;
                    } else {
                      return stackIn_37_0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = (byte[][]) null;
        field_d = null;
        if (param0 != 67) {
          ai.a(17);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void b(int param0) {
        String var1;
        int var2;
        if (lb.field_d) {
          var2 = 33 / ((-70 - param0) / 55);
          if (null != wg.field_d) {
            wg.field_d.r(77);
            var1 = lb.a(true);
            ok.field_a = new ff(var1, (String) null, true, false, false);
            ci.field_f.b((qg) (l.field_d), (byte) -71);
            l.field_d.b(-122, ok.field_a);
            l.field_d.p(27830);
            return;
          } else {
            var1 = lb.a(true);
            ok.field_a = new ff(var1, (String) null, true, false, false);
            ci.field_f.b((qg) (l.field_d), (byte) -71);
            l.field_d.b(-122, ok.field_a);
            l.field_d.p(27830);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        field_e = new byte[250][];
        field_a = new q();
    }
}
