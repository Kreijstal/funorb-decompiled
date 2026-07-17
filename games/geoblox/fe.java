/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fe {
    static int field_d;
    static rh field_a;
    static int field_k;
    private static ck field_h;
    static rf field_e;
    static na field_j;
    static int field_f;
    private java.util.zip.Inflater field_i;
    static boolean field_b;
    static int field_g;
    static float field_c;

    public static void c() {
        field_h = null;
        int var1 = 0;
        field_j = null;
        field_e = null;
        field_a = null;
    }

    final void a(int param0, qc param1, byte[] param2) {
        try {
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
                  if (param1.field_j[param1.field_f] != 31) {
                    break L1;
                  } else {
                    if (-117 != param1.field_j[1 + param1.field_f]) {
                      break L1;
                    } else {
                      L2: {
                        if (((fe) this).field_i != null) {
                          break L2;
                        } else {
                          ((fe) this).field_i = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          L4: {
                            ((fe) this).field_i.setInput(param1.field_j, param1.field_f - -10, param1.field_j.length - 8 - (param1.field_f + 10));
                            if (param0 == -1) {
                              break L4;
                            } else {
                              ck[] discarded$4 = fe.a(76);
                              break L4;
                            }
                          }
                          int discarded$5 = ((fe) this).field_i.inflate(param2);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((fe) this).field_i.reset();
                        throw new RuntimeException("");
                      }
                      ((fe) this).field_i.reset();
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
                stackOut_13_0 = (RuntimeException) runtimeException;
                stackOut_13_1 = new StringBuilder().append("fe.D(").append(param0).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b() {
        return qe.field_a;
    }

    final static ck[] a(int param0) {
        if (param0 != -1) {
          field_c = -1.1302366256713867f;
          return new ck[]{pj.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, wh.field_t, qj.field_a, fk.field_B, am.field_d, bd.field_c, va.field_f, field_h};
        } else {
          return new ck[]{pj.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, wh.field_t, qj.field_a, fk.field_B, am.field_d, bd.field_c, va.field_f, field_h};
        }
    }

    public fe() {
        this(-1, 1000000, 1000000);
    }

    final static nd a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        nd var7 = null;
        int var8 = 0;
        nd stackIn_5_0 = null;
        nd stackIn_9_0 = null;
        nd stackIn_12_0 = null;
        nd stackIn_18_0 = null;
        nd stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_8_0 = null;
        nd stackOut_20_0 = null;
        nd stackOut_17_0 = null;
        nd stackOut_11_0 = null;
        nd stackOut_4_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (255 < var2_int) {
                stackOut_8_0 = hk.field_x;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                var3 = uj.a('.', true, param0);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      int discarded$2 = -97;
                      stackOut_20_0 = mj.a(var3[-1 + var3.length]);
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = jk.a(255, var6);
                      if (var7 != null) {
                        stackOut_17_0 = (nd) var7;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  stackOut_11_0 = pj.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            } else {
              stackOut_4_0 = pj.field_f;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("fe.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 0 + 41);
        }
        return stackIn_21_0;
    }

    private fe(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_f = 7;
        field_h = new ck(15, 0, 1, 0);
    }
}
