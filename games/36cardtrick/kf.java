/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kf extends qb {
    long field_g;
    int field_h;
    byte[] field_i;
    static String field_j;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            pb var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_32_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_31_0 = 0;
            if (-5 < (dg.field_H.field_b ^ -1)) {
              try {
                L0: {
                  L1: {
                    if (ed.field_c != 0) {
                      break L1;
                    } else {
                      d.field_a = bi.field_b.a(al.field_c, (byte) -122, ak.field_O);
                      ed.field_c = ed.field_c + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (param0 > 58) {
                      break L2;
                    } else {
                      kf.b((byte) 115);
                      break L2;
                    }
                  }
                  L3: {
                    if ((ed.field_c ^ -1) != -2) {
                      break L3;
                    } else {
                      if (-3 != (d.field_a.field_a ^ -1)) {
                        if (1 != d.field_a.field_a) {
                          break L3;
                        } else {
                          ed.field_c = ed.field_c + 1;
                          break L3;
                        }
                      } else {
                        stackOut_12_0 = ma.a(2, -1);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    }
                  }
                  L4: {
                    if (2 != ed.field_c) {
                      break L4;
                    } else {
                      tf.field_r = new jd((java.net.Socket) d.field_a.field_e, bi.field_b);
                      var2 = new pb(13);
                      nf.a(var2, false, cc.field_c, eh.field_l, pf.field_h);
                      var2.b(-9469, 15);
                      var2.a(-246, oj.field_d);
                      tf.field_r.a(0, (byte) -89, 13, var2.field_g);
                      ed.field_c = ed.field_c + 1;
                      lc.field_b = id.a(70) + 30000L;
                      break L4;
                    }
                  }
                  L5: {
                    if ((ed.field_c ^ -1) != -4) {
                      break L5;
                    } else {
                      if (-1 <= (tf.field_r.b(-108) ^ -1)) {
                        if ((id.a(120) ^ -1L) < (lc.field_b ^ -1L)) {
                          stackOut_27_0 = ma.a(2, -2);
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        } else {
                          break L5;
                        }
                      } else {
                        var1_int = tf.field_r.a(0);
                        if (-1 != (var1_int ^ -1)) {
                          stackOut_22_0 = ma.a(2, var1_int);
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          ed.field_c = ed.field_c + 1;
                          break L5;
                        }
                      }
                    }
                  }
                  if (4 == ed.field_c) {
                    dg.field_H.a((Object) (Object) tf.field_r, ii.field_d, false);
                    d.field_a = null;
                    tf.field_r = null;
                    ed.field_c = 0;
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ma.a(2, -3);
              }
              return stackIn_32_0;
            } else {
              if (0 != (dg.field_H.field_l ^ -1)) {
                if (-2 != dg.field_H.field_l) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null != wc.field_B) {
          var1 = (Object) (Object) wc.field_B;
          synchronized (var1) {
            L0: {
              wc.field_B = null;
              break L0;
            }
          }
          L1: {
            if (param0 == 0) {
              break L1;
            } else {
              field_j = null;
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 == 0) {
              break L2;
            } else {
              field_j = null;
              break L2;
            }
          }
          return;
        }
    }

    final static ic a(qk param0, int param1, int param2, int param3, qk param4) {
        if (param1 == 0) {
          if (!tc.a(param2, param3, 25479, param0)) {
            return null;
          } else {
            return pa.a(param4.a(param2, (byte) -115, param3), -1);
          }
        } else {
          return null;
        }
    }

    public static void b(byte param0) {
        field_j = null;
        if (param0 <= 104) {
            field_j = null;
        }
    }

    kf(long param0, int param1, byte[] param2) {
        ((kf) this).field_h = param1;
        ((kf) this).field_i = param2;
        ((kf) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Waiting for graphics";
    }
}
