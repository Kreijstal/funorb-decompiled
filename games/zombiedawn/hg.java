/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hg {
    static b field_b;
    static int[] field_a;

    final static void b(int param0) {
        if (!(null == e.field_S)) {
            e.field_S.e((byte) -36);
        }
        if (!(vi.field_c == null)) {
            vi.field_c.m(-31361);
        }
        jk.b(0);
    }

    final static void a(byte param0) {
        vn var1 = null;
        vn var2 = null;
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        try {
            var1 = new vn(540, 140);
            ki.a((byte) -122, var1);
            en.c();
            bi.d();
            ej.field_x = 0;
            gk.j(30549);
            var2 = var1.e();
            int var3 = 0;
            for (var4 = 0; var4 < 15; var4++) {
                var2.h(-2, -2, 16777215);
                bi.h(4, 4, 0, 0, 540, 140);
            }
            wc.field_Pb.a();
            var1.d(0, 0);
            pa.a(-21189);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "hg.F(" + -101 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static oh a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        oh var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        oh stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        oh stackOut_14_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (null != sf.field_j) {
              if (param1 != null) {
                if (0 != param1.length()) {
                  var6 = (CharSequence) (Object) param1;
                  var2 = fm.a(var6, -47);
                  if (var2 != null) {
                    var3 = (oh) (Object) sf.field_j.a(93, (long)var2.hashCode());
                    L1: while (true) {
                      if (var3 == null) {
                        var4 = -121 % ((60 - param0) / 32);
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        break L0;
                      } else {
                        var7 = (CharSequence) (Object) var3.field_lb;
                        var4_ref_String = fm.a(var7, -124);
                        if (!var4_ref_String.equals((Object) (Object) var2)) {
                          var3 = (oh) (Object) sf.field_j.b((byte) -113);
                          continue L1;
                        } else {
                          stackOut_14_0 = (oh) var3;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0;
                        }
                      }
                    }
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (oh) (Object) stackIn_10_0;
                  }
                } else {
                  stackOut_6_0 = null;
                  stackIn_7_0 = stackOut_6_0;
                  return (oh) (Object) stackIn_7_0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2_ref;
            stackOut_19_1 = new StringBuilder().append("hg.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return (oh) (Object) stackIn_18_0;
    }

    final static vn a(int param0, int param1, dj param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        vn stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
            if (ph.a(param1, 31043, param0, param2)) {
              stackOut_5_0 = em.i((byte) 72);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (vn) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("hg.B(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + -2 + ')');
        }
        return stackIn_6_0;
    }

    final static void c(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = ZombieDawn.field_J;
            try {
              L0: {
                L1: {
                  if (null == tf.field_c) {
                    break L1;
                  } else {
                    tf.field_c.d(31239);
                    break L1;
                  }
                }
                L2: {
                  if (he.field_d != null) {
                    he.field_d.a(true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0 == 0) {
                    break L3;
                  } else {
                    hg.c(-94);
                    break L3;
                  }
                }
                L4: {
                  if (null != da.field_j) {
                    {
                      L5: {
                        da.field_j.b(463);
                        break L5;
                      }
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (lg.field_v == null) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (var1_int >= lg.field_v.length) {
                        break L7;
                      } else {
                        L9: {
                          if (lg.field_v[var1_int] == null) {
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var1_int++;
                        continue L8;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw sh.a((Throwable) (Object) var1, "hg.C(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[16];
    }
}
