/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb {
    static int[] field_c;
    static byte[][] field_b;
    static pj field_a;

    final static boolean a(int param0, boolean param1) {
        try {
            long dupTemp$0 = 0L;
            int stackIn_10_0 = 0;
            Throwable decompiledCaughtException = null;
            int var2 = 0;
            hb var2_ref_hb = null;
            IOException var2_ref_IOException = null;
            L0: {
              if (null == qg.field_a) {
                qg.field_a = pj.field_g.a(di.field_d, 0, cg.field_g);
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 == (qg.field_a.field_g ^ -1)) {
              return false;
            } else {
              dupTemp$0 = pf.a(0);
              qg.field_d = dupTemp$0;
              d.field_k = dupTemp$0;
              if (-2 != (qg.field_a.field_g ^ -1)) {
                dk.field_h = ed.field_b;
                var2 = 82 / ((param0 - -53) / 63);
                qg.field_a = null;
                return true;
              } else {
                try {
                  L1: {
                    L2: {
                      ol.field_g = new id((java.net.Socket) (qg.field_a.field_b), pj.field_g);
                      gf.field_c.field_h = 0;
                      var2_ref_hb = MonkeyPuzzle2.field_D;
                      if (!param1) {
                        stackIn_10_0 = -1;
                        break L2;
                      } else {
                        stackIn_10_0 = -2;
                        break L2;
                      }
                    }
                    bk.field_f = stackIn_10_0;
                    il.field_e = stackIn_10_0;
                    hk.field_l = stackIn_10_0;
                    dk.field_h = ii.field_r;
                    var2_ref_hb.field_h = 0;
                    qi.a(j.field_a, gf.field_c, kc.field_c, false, rl.field_a);
                    al.a((byte) -71, -1);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
                  dk.field_h = ed.field_b;
                  if (MonkeyPuzzle2.field_F) {
                    dk.field_h = ed.field_b;
                    var2 = 82 / ((param0 - -53) / 63);
                    qg.field_a = null;
                    return true;
                  } else {
                    var2 = 82 / ((param0 - -53) / 63);
                    qg.field_a = null;
                    return true;
                  }
                }
                var2 = 82 / ((param0 - -53) / 63);
                qg.field_a = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_c = (int[]) null;
            break L0;
          }
        }
        if (null == wj.field_k) {
          return;
        } else {
          var1 = wj.field_k;
          synchronized (var1) {
            L1: {
              wj.field_k = null;
              break L1;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != 8) {
            return;
        }
        field_b = (byte[][]) null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          if (null != ol.field_g) {
            if (wh.field_b != dk.field_h) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = (int[]) null;
          if (null != ol.field_g) {
            if (wh.field_b != dk.field_h) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static tb a(String param0, ad param1, int param2, ad param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param3.c(param0, (byte) -105);
              var6 = param3.a(param4, var5_int, -28459);
              if (param2 <= -66) {
                break L1;
              } else {
                cb.a(false);
                break L1;
              }
            }
            stackIn_3_0 = wl.a(param1, -26348, param3, var6, var5_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("cb.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
