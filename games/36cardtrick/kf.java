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
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_33_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            pb var2 = null;
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
                        stackIn_14_0 = ma.a(2, -1);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L4: {
                    if (2 != ed.field_c) {
                      break L4;
                    } else {
                      tf.field_r = new jd((java.net.Socket) (d.field_a.field_e), bi.field_b);
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
                          stackIn_29_0 = ma.a(2, -2);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L5;
                        }
                      } else {
                        var1_int = tf.field_r.a(0);
                        if (-1 != (var1_int ^ -1)) {
                          stackIn_24_0 = ma.a(2, var1_int);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          ed.field_c = ed.field_c + 1;
                          break L5;
                        }
                      }
                    }
                  }
                  if (4 == ed.field_c) {
                    dg.field_H.a(tf.field_r, ii.field_d, false);
                    d.field_a = null;
                    tf.field_r = null;
                    ed.field_c = 0;
                    stackIn_33_0 = 0;
                    decompiledRegionSelector0 = 3;
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
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_24_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_29_0;
                  } else {
                    return stackIn_33_0;
                  }
                }
              }
            } else {
              if (0 != (dg.field_H.field_l ^ -1)) {
                if (-2 == dg.field_H.field_l) {
                  return 4;
                } else {
                  return 1;
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
          var1 = wc.field_B;
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
              field_j = (String) null;
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 == 0) {
              break L2;
            } else {
              field_j = (String) null;
              break L2;
            }
          }
          return;
        }
    }

    final static ic a(qk param0, int param1, int param2, int param3, qk param4) {
        RuntimeException var5 = null;
        ic stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ic stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              if (tc.a(param2, param3, 25479, param0)) {
                stackIn_7_0 = pa.a(param4.a(param2, (byte) -115, param3), -1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ic) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("kf.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ic) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void b(byte param0) {
        field_j = null;
        if (param0 <= 104) {
            field_j = (String) null;
        }
    }

    kf(long param0, int param1, byte[] param2) {
        try {
            this.field_h = param1;
            this.field_i = param2;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "kf.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Waiting for graphics";
    }
}
