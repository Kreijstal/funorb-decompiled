/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends jh {
    static t field_D;
    static o field_F;
    static boolean field_E;

    final static void a(byte param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == vk.field_E) {
                break L0;
              } else {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (w.field_cb != ef.field_a) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (wa.field_d.field_n != 0) {
                    break L2;
                  } else {
                    if (km.b(-1) > 10000L + ak.field_k) {
                      wa.field_d.f(-44, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param0 <= -48) {
                    break L3;
                  } else {
                    field_D = null;
                    break L3;
                  }
                }
                L4: {
                  if (wa.field_d.field_n > 0) {
                    {
                      L5: {
                        vk.field_E.a(0, wa.field_d.field_j, (byte) 47, wa.field_d.field_n);
                        ak.field_k = km.b(-1);
                        break L5;
                      }
                    }
                    wa.field_d.field_n = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
            wa.field_d.field_n = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean g() {
        pm var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pm var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        var4 = Torquing.field_u;
        try {
          L0: {
            var5 = (pm) (Object) ul.field_e.b(0);
            var1 = var5;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var2 = 0;
              var3 = -60;
              L1: while (true) {
                if (var1.field_l <= var2) {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L2: {
                    if (null != var5.field_u[var2]) {
                      if (var5.field_u[var2].field_a == 0) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (null != var5.field_n[var2]) {
                      if (0 != var5.field_n[var2].field_a) {
                        break L3;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0 != 0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1_ref, "jd.M(" + -126 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final static int a(int param0) {
        if (param0 == 0) {
          if (!wa.field_f) {
            if (dg.field_h <= q.field_d) {
              if (q.field_d < dg.field_h + cf.field_e) {
                return il.field_l;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -110;
        }
    }

    public static void h() {
        field_D = null;
        field_F = null;
    }

    private jd(int param0, int param1, int param2, int param3, el param4, ca param5, gm param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((jd) this).field_C = param6;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "jd.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a() {
        q var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ni var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            var4 = (ni) (Object) vb.field_f.b(0);
            L1: while (true) {
              if (var4 == null) {
                var2 = qf.field_a.b(0);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$12 = 6;
                    int discarded$13 = 0;
                    lc.b();
                    var2 = qf.field_a.f(-24059);
                    continue L2;
                  }
                }
              } else {
                int discarded$14 = 1;
                int discarded$15 = 6;
                l.a(var4);
                var4 = (ni) (Object) vb.field_f.f(-24059);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2_ref, "jd.L(" + 1 + 44 + 6 + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        RuntimeException var7 = null;
        aj var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) 124, param4, param5);
              var8 = lp.field_d;
              if (var8 == null) {
                break L1;
              } else {
                if (((jd) this).a(param5, param2, param1, param0, 121)) {
                  if (!(((jd) this).field_t instanceof dm)) {
                    if (var8.field_t instanceof dm) {
                      ((dm) (Object) var8.field_t).a(3139, var8, (jd) this);
                      lp.field_d = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ((dm) (Object) ((jd) this).field_t).a(3139, var8, (jd) this);
                    lp.field_d = null;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param3 > 109) {
              break L0;
            } else {
              field_F = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("jd.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = false;
    }
}
