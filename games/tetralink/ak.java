/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    static hl field_a;
    static String field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        int var1 = 30 / ((param0 - -27) / 49);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            rd.a(param1, 0, var3, 0, var2_int);
            stackOut_2_0 = (byte[]) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ak.E(").append(-14074).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == wa.field_e) {
                break L0;
              } else {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (qi.field_p != li.field_a) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (param0 <= -37) {
                    break L2;
                  } else {
                    boolean discarded$4 = ak.a(69);
                    break L2;
                  }
                }
                L3: {
                  if (0 != nd.field_Lb.field_t) {
                    break L3;
                  } else {
                    if (~(rj.field_n + 10000L) > ~k.a(0)) {
                      nd.field_Lb.f(param1, (byte) -92);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (nd.field_Lb.field_t > 0) {
                    {
                      L5: {
                        wa.field_e.a(true, nd.field_Lb.field_t, nd.field_Lb.field_u, 0);
                        rj.field_n = k.a(0);
                        break L5;
                      }
                    }
                    nd.field_Lb.field_t = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
            nd.field_Lb.field_t = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1, float param2) {
        try {
            bn.field_a = param1;
            md.field_v = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ak.B(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 3058) {
          if (null == hd.field_s) {
            if (!vb.e(param0 + -34020)) {
              if (null == mm.field_y) {
                int discarded$8 = 66;
                if (d.c()) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_b = null;
          if (null == hd.field_s) {
            if (!vb.e(param0 + -34020)) {
              if (null == mm.field_y) {
                int discarded$9 = 66;
                if (d.c()) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
    }
}
