/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fr {
    String field_f;
    static char field_e;
    String[] field_c;
    boolean field_b;
    boolean field_d;
    int field_a;

    final static void a(float param0, float param1, int param2, float param3, float param4, int param5, byte[] param6, int param7, int param8, float param9, int param10, int param11, ai param12) {
        int var13_int = 0;
        RuntimeException var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var13_int = 0;
            L1: while (true) {
              if (param5 <= var13_int) {
                break L0;
              } else {
                qh.a(2, param12, param10, param0, param9, param4, param1, param11, param5, param6, param3, var13_int, param8, param7);
                param11 = param11 + param7 * param8;
                var13_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var13;
            stackOut_4_1 = new StringBuilder().append("fr.C(").append(param0).append(44).append(param1).append(44).append(0).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param6 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param12 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          gq.field_e = gq.field_e + 1;
          us.a(2069944240);
          ef.field_m = ef.field_m + 1;
          int discarded$4 = -128;
          er.a();
          return;
        } else {
          ef.field_m = ef.field_m + 1;
          int discarded$5 = -128;
          er.a();
          return;
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == ft.field_l) {
                break L0;
              } else {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (ca.field_f != wq.field_e) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (param0 < -12) {
                    break L2;
                  } else {
                    fr.a(36, 96);
                    break L2;
                  }
                }
                L3: {
                  if (q.field_p.field_g != 0) {
                    break L3;
                  } else {
                    if (10000L + co.field_e < kh.a(-64)) {
                      q.field_p.g(44, param1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (0 >= q.field_p.field_g) {
                    break L4;
                  } else {
                    {
                      L5: {
                        ft.field_l.a(q.field_p.field_g, 0, 76, q.field_p.field_f);
                        co.field_e = kh.a(-84);
                        break L5;
                      }
                    }
                    q.field_p.field_g = 0;
                    break L4;
                  }
                }
                return;
              }
            }
            q.field_p.field_g = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fr(boolean param0) {
        ((fr) this).field_b = param0 ? true : false;
    }

    static {
    }
}
