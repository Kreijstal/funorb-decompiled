/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh {
    private java.util.zip.Inflater field_a;
    static co field_c;
    static String field_b;

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        sb var9 = null;
        int var10 = 0;
        String stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        String stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        sb stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        String stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        sb stackOut_15_0 = null;
        sb stackOut_14_0 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_int = ia.field_e + -qn.field_o;
            qn.field_o = -(var1_int >> 1) + bq.field_d;
            ia.field_e = var1_int + qn.field_o;
            ce.field_c = -(nf.field_c >> 1) + qh.field_b;
            var2 = ce.field_c;
            var3 = 0;
            L1: while (true) {
              if (~var3 <= ~pl.field_J.length) {
                break L0;
              } else {
                L2: {
                  var4 = uf.field_e[var3];
                  if (var4 < 0) {
                    var5 = hd.field_n;
                    break L2;
                  } else {
                    if (var4 == vp.field_Gb.field_j) {
                      var5 = mj.field_k;
                      break L2;
                    } else {
                      var5 = mh.field_a;
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = pl.field_J[var3];
                  stackOut_8_0 = (String) var6;
                  stackOut_8_1 = 8192;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (var4 < 0) {
                    stackOut_10_0 = (String) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L3;
                  } else {
                    stackOut_9_0 = (String) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    break L3;
                  }
                }
                L4: {
                  var7 = jp.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0);
                  var8 = bq.field_d - (var7 >> 1);
                  if (var4 >= 0) {
                    L5: {
                      if (~vp.field_Gb.field_j != ~var4) {
                        stackOut_15_0 = uo.field_m;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = wg.field_d;
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_16_0;
                      var2 = var2 + ki.field_e;
                      if (var9 != null) {
                        var9.a(var2, dk.field_d - -(lf.field_b << 1), -1, (uf.field_a << 1) + var7, var8 + -uf.field_a);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + lf.field_b;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var4 >= 0) {
                    ie.field_G.a(var6, var8, var2 + w.field_q, var5, -1);
                    var2 = var2 + (dk.field_d + lf.field_b - -ki.field_e);
                    break L7;
                  } else {
                    lm.field_o.a(var6, var8, ab.field_b + var2, var5, -1);
                    var2 = var2 + da.field_m;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "vh.B(" + 88 + ')');
        }
    }

    final void a(int param0, byte[] param1, we param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                L1: {
                  if (31 != param2.field_k[param2.field_m]) {
                    break L1;
                  } else {
                    if (param2.field_k[param2.field_m - -1] == -117) {
                      L2: {
                        if (null != ((vh) this).field_a) {
                          break L2;
                        } else {
                          ((vh) this).field_a = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((vh) this).field_a.setInput(param2.field_k, param2.field_m + 10, param0 - param2.field_m - (10 - param2.field_k.length));
                          int discarded$2 = ((vh) this).field_a.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((vh) this).field_a.reset();
                        throw new RuntimeException("");
                      }
                      ((vh) this).field_a.reset();
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) runtimeException;
                stackOut_11_1 = new StringBuilder().append("vh.C(").append(param0).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b() {
        field_b = null;
        field_c = null;
    }

    private vh(int param0, int param1, int param2) {
    }

    public vh() {
        this(-1, 1000000, 1000000);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_b = "Acid Sunset";
    }
}
