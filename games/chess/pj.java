/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pj {
    static volatile long field_g;
    static int[] field_b;
    static int field_d;
    static km[][] field_e;
    static int[] field_f;
    private java.util.zip.Inflater field_a;
    static pc field_h;
    static dd[] field_c;

    final static void b(int param0, int param1) {
        nk var2 = null;
        var2 = qn.field_U;
        var2.f(param1, param0 + 6324);
        var2.c(2, (byte) 107);
        if (param0 != -6446) {
          pj.b(27, 37);
          var2.c(4, (byte) -71);
          var2.c(jg.m(73), (byte) -88);
          return;
        } else {
          var2.c(4, (byte) -71);
          var2.c(jg.m(73), (byte) -88);
          return;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 >= 99) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L0: {
              if ((param1 ^ -1) > -2049) {
                stackOut_9_0 = hj.field_b[param1];
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = hj.field_b[4096 + -param1];
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (-6145 < (param1 ^ -1)) {
                stackOut_5_0 = -hj.field_b[-4096 + param1];
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = -hj.field_b[8192 + -param1];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return 32;
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, dm param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              ol.field_S[0] = ph.field_d.nextInt();
              ol.field_S[1] = ph.field_d.nextInt();
              mn.field_h.field_l = 0;
              ol.field_S[2] = (int)(sj.field_h >> -741378144);
              ol.field_S[3] = (int)sj.field_h;
              mn.field_h.d(ol.field_S[0], (byte) -81);
              mn.field_h.d(ol.field_S[1], (byte) -81);
              mn.field_h.d(ol.field_S[2], (byte) -81);
              mn.field_h.d(ol.field_S[3], (byte) -81);
              sa.a(mn.field_h, 109);
              mn.field_h.b(param3, param1 + 27463);
              param4.a(mn.field_h, (byte) 123);
              qn.field_U.field_l = 0;
              if (param2) {
                qn.field_U.c(18, (byte) -81);
                break L1;
              } else {
                qn.field_U.c(16, (byte) 110);
                break L1;
              }
            }
            qn.field_U.field_l = qn.field_U.field_l + 2;
            var5_int = qn.field_U.field_l;
            qn.field_U.d(gb.field_s, (byte) -81);
            qn.field_U.a(-97, qc.field_a);
            var6 = 0;
            if (param1 == -27359) {
              L2: {
                if (ln.field_Kb) {
                  var6 = var6 | 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!on.field_a) {
                  break L3;
                } else {
                  var6 = var6 | 4;
                  break L3;
                }
              }
              L4: {
                if (!param0) {
                  break L4;
                } else {
                  var6 = var6 | 8;
                  break L4;
                }
              }
              L5: {
                if (lf.field_N == null) {
                  break L5;
                } else {
                  var6 = var6 | 16;
                  break L5;
                }
              }
              L6: {
                qn.field_U.c(var6, (byte) 52);
                var7 = m.a(bh.i(81), (byte) 87);
                if (var7 == null) {
                  var7 = "";
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                qn.field_U.a(param1 ^ 27325, var7);
                if (null == lf.field_N) {
                  break L7;
                } else {
                  qn.field_U.a(true, lf.field_N);
                  break L7;
                }
              }
              lk.a(dk.field_k, mn.field_h, qn.field_U, 91, se.field_M);
              qn.field_U.d(qn.field_U.field_l - var5_int, 111);
              vh.a(-1, (byte) -42);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("pj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1, p param2) {
        try {
            int discarded$2 = 0;
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  if (31 != param2.field_o[param2.field_l]) {
                    break L1;
                  } else {
                    if (116 != (param2.field_o[param2.field_l - -1] ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (null != this.field_a) {
                          break L2;
                        } else {
                          this.field_a = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          L4: {
                            if (param1 < -19) {
                              break L4;
                            } else {
                              pj.b(106, 101);
                              break L4;
                            }
                          }
                          this.field_a.setInput(param2.field_o, param2.field_l - -10, -8 - (param2.field_l + 10 - param2.field_o.length));
                          discarded$2 = this.field_a.inflate(param0);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_a.reset();
                        throw new RuntimeException("");
                      }
                      this.field_a.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (runtimeException);
                stackOut_13_1 = new StringBuilder().append("pj.E(");
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public pj() {
        this(-1, 1000000, 1000000);
    }

    private pj(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        field_e = (km[][]) null;
        field_h = null;
        field_b = null;
        field_f = null;
        field_c = null;
        if (param0 != -6145) {
            field_f = (int[]) null;
        }
    }

    static {
        field_b = new int[]{4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096};
        field_g = 0L;
        field_d = 3;
        field_c = new dd[7];
    }
}
