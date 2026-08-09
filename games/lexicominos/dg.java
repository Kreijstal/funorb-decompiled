/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dg {
    final static String a(boolean param0) {
        if (param0) {
            dg.a(false);
            if (bk.field_c == ca.field_i) {
                return ce.field_d;
            }
            if (!(ee.field_c != ca.field_i)) {
                return ef.field_b;
            }
            if (!(qa.field_c.b(12))) {
                return ef.field_b;
            }
            return dd.field_d;
        }
        if (bk.field_c == ca.field_i) {
            return ce.field_d;
        }
        if (!(ee.field_c != ca.field_i)) {
            return ef.field_b;
        }
        if (!(qa.field_c.b(12))) {
            return ef.field_b;
        }
        return dd.field_d;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
            long dupTemp$1 = 0L;
            IOException var2 = null;
            th var4 = null;
            th var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            if (param1) {
              L0: {
                if (null != al.field_H) {
                  break L0;
                } else {
                  al.field_H = vl.field_a.a(nj.field_a, (byte) -58, ol.field_n);
                  break L0;
                }
              }
              if (0 == al.field_H.field_b) {
                return false;
              } else {
                dupTemp$1 = rf.c(0);
                p.field_c = dupTemp$1;
                ta.field_e = dupTemp$1;
                if ((al.field_H.field_b ^ -1) != -2) {
                  uf.field_m = rh.field_r;
                  al.field_H = null;
                  return true;
                } else {
                  try {
                    L1: {
                      L2: {
                        jc.field_b = new ge((java.net.Socket) (al.field_H.field_g), vl.field_a);
                        var4 = ig.field_a;
                        var5 = var4;
                        ed.field_q.field_h = 0;
                        if (!param0) {
                          stackIn_11_0 = -1;
                          break L2;
                        } else {
                          stackIn_11_0 = -2;
                          break L2;
                        }
                      }
                      vh.field_b = stackIn_11_0;
                      df.field_a = stackIn_11_0;
                      wl.field_i = stackIn_11_0;
                      var5.field_h = 0;
                      uf.field_m = ae.field_E;
                      la.a((byte) -48, ig.field_b, ed.field_q, ua.field_a, bl.field_b);
                      kc.a(-1, -1);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (IOException) (Object) decompiledCaughtException;
                    uf.field_m = rh.field_r;
                    if (Lexicominos.field_L) {
                      uf.field_m = rh.field_r;
                      al.field_H = null;
                      return true;
                    } else {
                      al.field_H = null;
                      return true;
                    }
                  }
                  al.field_H = null;
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

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        db var1 = null;
        db var2 = null;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = new db(540, 140);
                        de.a(var1, 6);
                        k.b();
                        lf.a();
                        mc.field_k = 0;
                        rg.b(0);
                        var2 = var1.c();
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 >= 15) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2.c(-2, -2, 16777215);
                        lf.d(4, 4, 0, 0, 540, 140);
                        var3++;
                        if (var4 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        t.field_a.b();
                        var1.f(0, 0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 19681) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        pd.a(-22949);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) runtimeException), "dg.C(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(int param0) {
        if (param0 == -2) {
          if (he.field_h != this) {
            if (this != ug.field_q) {
              if (gg.field_b == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
    }
}
