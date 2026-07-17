/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class lc implements Iterable {
    static hd field_g;
    private int field_d;
    int field_c;
    private wf field_e;
    private wf field_f;
    wf[] field_a;
    static ej field_b;

    final wf a(long param0, byte param1) {
        wf var5 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        wf var4 = ((lc) this).field_a[(int)((long)(((lc) this).field_c + -1) & param0)];
        ((lc) this).field_f = var4.field_a;
        while (((lc) this).field_f != var4) {
            if (((lc) this).field_f.field_b == param0) {
                var5 = ((lc) this).field_f;
                ((lc) this).field_f = ((lc) this).field_f.field_a;
                return var5;
            }
            ((lc) this).field_f = ((lc) this).field_f.field_a;
        }
        ((lc) this).field_f = null;
        if (param1 > 87) {
            return null;
        }
        ((lc) this).field_c = -4;
        return null;
    }

    final static double a(kc param0, boolean param1, kc param2) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double stackIn_2_0 = 0.0;
        double stackIn_4_0 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_3_0 = 0.0;
        double stackOut_1_0 = 0.0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!param1) {
              var3_double = -param0.field_a + param2.field_a;
              var5 = -param0.field_b + param2.field_b;
              stackOut_3_0 = var3_double * var3_double + var5 * var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0.9309241594003604;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("lc.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            lc.a(false);
        }
        field_b = null;
    }

    final static gu a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        gu[] var3 = null;
        int var4 = 0;
        gu var5 = null;
        int var6 = 0;
        gu stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        gu stackIn_12_0 = null;
        gu stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        gu stackOut_14_0 = null;
        gu stackOut_11_0 = null;
        Object stackOut_5_0 = null;
        gu stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2 = bg.a(param1, "jagex-last-login-method", (byte) -18);
            if (var2 != null) {
              var3 = ci.d((byte) 106);
              if (param0 == 17123) {
                var4 = 0;
                L1: while (true) {
                  if (var4 >= var3.length) {
                    stackOut_14_0 = ct.field_t;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    var5 = var3[var4];
                    if (var5.a(param0 ^ 17127, var2)) {
                      stackOut_11_0 = (gu) var5;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (gu) (Object) stackIn_6_0;
              }
            } else {
              stackOut_2_0 = ct.field_t;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2_ref;
            stackOut_16_1 = new StringBuilder().append("lc.E(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    final wf b(int param0) {
        ((lc) this).field_d = param0;
        return ((lc) this).a(-71);
    }

    final static gk a(boolean param0, boolean param1, boolean param2, byte param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            fg var8 = null;
            Object stackIn_4_0 = null;
            gk stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            gk stackOut_14_0 = null;
            Object stackOut_3_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (cs.field_d.field_n == null) {
                    break L1;
                  } else {
                    eq.field_e = new gh(cs.field_d.field_n, 5200, 0);
                    cs.field_d.field_n = null;
                    var6 = (Object) (Object) new bl(255, eq.field_e, new gh(cs.field_d.field_a, 12000, 0), 2097152);
                    break L1;
                  }
                }
                if (param3 == -65) {
                  L2: {
                    if (eq.field_e != null) {
                      L3: {
                        if (wb.field_i != null) {
                          break L3;
                        } else {
                          wb.field_i = new gh[cs.field_d.field_r.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (wb.field_i[param5] != null) {
                          break L4;
                        } else {
                          wb.field_i[param5] = new gh(cs.field_d.field_r[param5], 12000, 0);
                          cs.field_d.field_r[param5] = null;
                          break L4;
                        }
                      }
                      var7 = (Object) (Object) new bl(param5, eq.field_e, wb.field_i[param5], 2097152);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    var8 = om.field_c.a((byte) -122, (bl) var6, (bl) var7, param2, param5);
                    if (!param1) {
                      break L5;
                    } else {
                      var8.c(param3 + 63);
                      break L5;
                    }
                  }
                  stackOut_14_0 = new gk((ip) (Object) var8, param0, param4);
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_3_0 = null;
                  stackIn_4_0 = stackOut_3_0;
                  return (gk) (Object) stackIn_4_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new pe((lc) this);
    }

    final wf a(int param0) {
        wf var2_ref_wf = null;
        wf var3_ref = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (((lc) this).field_d > 0) {
            if (!(((lc) this).field_e == ((lc) this).field_a[((lc) this).field_d - 1])) {
                var2_ref_wf = ((lc) this).field_e;
                ((lc) this).field_e = var2_ref_wf.field_a;
                return var2_ref_wf;
            }
        }
        int var2 = 35 / ((param0 - 55) / 60);
        do {
            if (((lc) this).field_d >= ((lc) this).field_c) {
                return null;
            }
            int fieldTemp$0 = ((lc) this).field_d;
            ((lc) this).field_d = ((lc) this).field_d + 1;
            var3_ref = ((lc) this).field_a[fieldTemp$0].field_a;
        } while (var3_ref == ((lc) this).field_a[-1 + ((lc) this).field_d]);
        ((lc) this).field_e = var3_ref.field_a;
        return var3_ref;
    }

    final void a(int param0, wf param1, long param2) {
        wf var5 = null;
        try {
            if (!(param1.field_c == null)) {
                param1.c(-125);
            }
            var5 = ((lc) this).field_a[(int)(param2 & (long)(param0 + ((lc) this).field_c))];
            param1.field_a = var5;
            param1.field_c = var5.field_c;
            param1.field_c.field_a = param1;
            param1.field_a.field_c = param1;
            param1.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "lc.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    lc(int param0) {
        int var2 = 0;
        wf var3 = null;
        ((lc) this).field_d = 0;
        ((lc) this).field_a = new wf[param0];
        ((lc) this).field_c = param0;
        for (var2 = 0; param0 > var2; var2++) {
            wf dupTemp$0 = new wf();
            var3 = dupTemp$0;
            ((lc) this).field_a[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_c = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new hd(4);
        field_b = new ej(14, 0, 4, 1);
    }
}
