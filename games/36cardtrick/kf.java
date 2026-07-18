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
            int stackIn_11_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_29_0 = 0;
            if (dg.field_H.field_b < 4) {
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
                    if (ed.field_c != 1) {
                      break L2;
                    } else {
                      if (d.field_a.field_a != 2) {
                        if (1 != d.field_a.field_a) {
                          break L2;
                        } else {
                          ed.field_c = ed.field_c + 1;
                          break L2;
                        }
                      } else {
                        stackOut_10_0 = ma.a(2, -1);
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0;
                      }
                    }
                  }
                  L3: {
                    if (2 != ed.field_c) {
                      break L3;
                    } else {
                      tf.field_r = new jd((java.net.Socket) d.field_a.field_e, bi.field_b);
                      var2 = new pb(13);
                      nf.a(var2, false, cc.field_c, eh.field_l, pf.field_h);
                      var2.b(-9469, 15);
                      var2.a(-246, oj.field_d);
                      tf.field_r.a(0, (byte) -89, 13, var2.field_g);
                      ed.field_c = ed.field_c + 1;
                      lc.field_b = id.a(70) + 30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (ed.field_c != 3) {
                      break L4;
                    } else {
                      if (tf.field_r.b(-108) <= 0) {
                        if (~id.a(120) < ~lc.field_b) {
                          stackOut_25_0 = ma.a(2, -2);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = tf.field_r.a(0);
                        if (var1_int != 0) {
                          stackOut_20_0 = ma.a(2, var1_int);
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          ed.field_c = ed.field_c + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  if (4 == ed.field_c) {
                    dg.field_H.a((Object) (Object) tf.field_r, ii.field_d, false);
                    d.field_a = null;
                    tf.field_r = null;
                    ed.field_c = 0;
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
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
              return stackIn_30_0;
            } else {
              if (dg.field_H.field_l != -1) {
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
          field_j = null;
          return;
        } else {
          field_j = null;
          return;
        }
    }

    final static ic a(qk param0, int param1, int param2, int param3, qk param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        ic stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (tc.a(param2, param3, 25479, param0)) {
              stackOut_5_0 = pa.a(param4.a(param2, (byte) -115, param3), -1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ic) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("kf.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(0).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void b(byte param0) {
        field_j = null;
    }

    kf(long param0, int param1, byte[] param2) {
        try {
            ((kf) this).field_h = param1;
            ((kf) this).field_i = param2;
            ((kf) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "kf.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Waiting for graphics";
    }
}
