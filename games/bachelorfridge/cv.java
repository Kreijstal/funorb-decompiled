/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class cv extends bca {
    final static void a(int param0, String param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            eh var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ht stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            ht stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            ht stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            Throwable decompiledCaughtException = null;
            ht stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            ht stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            ht stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            var6 = BachelorFridge.field_y;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 != null) {
                    var3_ref = sma.a(96, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 != null) {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  }
                }
                sl.a((byte) -86, var3_ref);
                var7 = ig.a(param0 + -19385, var3_ref, ":", "%3a");
                var8 = ig.a(-19384, var7, "@", "%40");
                var9 = ig.a(param0 + -19385, var8, "&", "%26");
                var10 = ig.a(-19384, var9, "#", "%23");
                if (jia.field_m != null) {
                  L4: {
                    stackOut_11_0 = v.field_d;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = jia.field_m.getCodeBase();
                    stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(ej.field_p).append("&u=");
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    if (null == da.field_b) {
                      stackOut_13_0 = (ht) (Object) stackIn_13_0;
                      stackOut_13_1 = null;
                      stackOut_13_2 = null;
                      stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                      stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                      stackOut_13_5 = "" + om.field_v;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      break L4;
                    } else {
                      stackOut_12_0 = (ht) (Object) stackIn_12_0;
                      stackOut_12_1 = null;
                      stackOut_12_2 = null;
                      stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                      stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                      stackOut_12_5 = da.field_b;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      break L4;
                    }
                  }
                  var4 = ((ht) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + ht.field_g + "&v2=" + ht.field_c + "&e=" + var10), param0 + 23);
                  L5: while (true) {
                    if (var4.field_f != 0) {
                      L6: {
                        if (param0 != var4.field_f) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_e;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      gda.a(false, 1L);
                      continue L5;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 28850) {
                break L1;
              } else {
                var9 = null;
                cv.a(70, (String) null, (Throwable) null);
                break L1;
              }
            }
            int incrementValue$4 = param5;
            param5++;
            hba.a(param0, param3, tj.field_b[incrementValue$4], param1 ^ 28853, param4);
            int incrementValue$5 = param2;
            param2--;
            hba.a(param0, param3, tj.field_b[incrementValue$5], param1 + -28843, param4);
            var6_int = param5;
            L2: while (true) {
              if (param2 < var6_int) {
                break L0;
              } else {
                var7 = tj.field_b[var6_int];
                var7[param4] = param0;
                var7[param3] = param0;
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var6, "cv.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        bk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 5) {
              stackOut_3_0 = new bk(param1, (cv) this);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (at) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("cv.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return (at) (Object) stackIn_4_0;
    }

    final void a(op param0, int param1) {
        try {
            ((cv) this).a(param0, (byte) -2);
            int var3_int = -4 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cv.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void d() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            int discarded$14 = 1;
            if (!rs.b()) {
              L1: {
                if (kga.field_c == null) {
                  break L1;
                } else {
                  if (kga.field_c.field_f) {
                    lga.c((byte) 112);
                    pja.field_e.a((wj) (Object) new em(pja.field_e, r.field_m), (byte) 93);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              boolean discarded$15 = pja.field_e.a(true, kh.field_q, ef.field_k, 6381);
              pja.field_e.i(0);
              L2: while (true) {
                if (!kaa.b(127)) {
                  break L0;
                } else {
                  boolean discarded$16 = pja.field_e.a(dla.field_j, (byte) 7, gf.field_k);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "cv.C(" + -1 + ')');
        }
    }

    cv(int param0, nq param1) {
        super(param0, param1);
    }

    cv(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ((cv) this).field_k = param0.e((byte) 74);
            ((cv) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (var2_int < 0) {
                break L0;
              } else {
                ((cv) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("cv.<init>(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    static {
    }
}
