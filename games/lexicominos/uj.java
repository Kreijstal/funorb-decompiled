/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class uj implements rd {
    static jb[] field_a;
    private int field_b;
    static int[][] field_f;
    static aj field_c;
    private le field_d;
    private int field_e;

    public static void a() {
        field_a = null;
        field_c = null;
        field_f = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            int var2_int = 25 % ((param0 - 3) / 42);
            if (!(11 != ta.field_g)) {
                int discarded$0 = 95;
                ee.b();
            }
            int discarded$1 = 1;
            de.a(fh.field_i, tl.field_g, pb.field_j);
            int discarded$2 = -128;
            int discarded$3 = 0;
            lj.a(0, param1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "uj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ei var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ab stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            java.net.URL stackIn_11_4 = null;
            StringBuilder stackIn_11_5 = null;
            ab stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            ab stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            String stackIn_13_6 = null;
            Throwable decompiledCaughtException = null;
            ab stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            java.net.URL stackOut_10_4 = null;
            StringBuilder stackOut_10_5 = null;
            ab stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            ab stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            String stackOut_11_6 = null;
            var6 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param1 == null) {
                    break L1;
                  } else {
                    var3_ref = ik.a(-64, param1);
                    break L1;
                  }
                }
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param1 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  }
                }
                int discarded$2 = 1;
                oe.a(var3_ref);
                var7 = tb.a(":", var3_ref, true, "%3a");
                var8 = tb.a("@", var7, true, "%40");
                var9 = tb.a("&", var8, true, "%26");
                var10 = tb.a("#", var9, true, "%23");
                if (null == tg.field_i) {
                  return;
                } else {
                  L4: {
                    stackOut_10_0 = pk.field_n;
                    stackOut_10_1 = param2 ^ -23815;
                    stackOut_10_2 = null;
                    stackOut_10_3 = null;
                    stackOut_10_4 = tg.field_i.getCodeBase();
                    stackOut_10_5 = new StringBuilder().append("clienterror.ws?c=").append(ki.field_f).append("&u=");
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    stackIn_12_5 = stackOut_10_5;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    stackIn_11_5 = stackOut_10_5;
                    if (null != gl.field_b) {
                      stackOut_12_0 = (ab) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                      stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                      stackOut_12_6 = gl.field_b;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      stackIn_13_6 = stackOut_12_6;
                      break L4;
                    } else {
                      stackOut_11_0 = (ab) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = null;
                      stackOut_11_3 = null;
                      stackOut_11_4 = (java.net.URL) (Object) stackIn_11_4;
                      stackOut_11_5 = (StringBuilder) (Object) stackIn_11_5;
                      stackOut_11_6 = "" + d.field_a;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      stackIn_13_6 = stackOut_11_6;
                      break L4;
                    }
                  }
                  var4 = ((ab) (Object) stackIn_13_0).a(stackIn_13_1, new java.net.URL(stackIn_13_4, stackIn_13_6 + "&v1=" + ab.field_j + "&v2=" + ab.field_v + "&e=" + var10));
                  L5: while (true) {
                    if (var4.field_b != 0) {
                      L6: {
                        if (var4.field_b != param2) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_g;
                          int discarded$3 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      ge.a(param2 + -1, 1L);
                      continue L5;
                    }
                  }
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

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3.field_m) {
                  break L2;
                } else {
                  if (param3.a(18337)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            var6_int = stackIn_5_0;
            int discarded$1 = ((uj) this).field_d.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_u + "</u>", param1 + param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, var6_int, -1, ((uj) this).field_b, ((uj) this).field_e, ((uj) this).field_d.field_E + ((uj) this).field_d.field_G);
            if (param4 == -3284) {
              if (param3.a(18337)) {
                L3: {
                  var7 = ((uj) this).field_d.b(param3.field_u);
                  var8 = ((uj) this).field_d.field_G + ((uj) this).field_d.field_E;
                  var9 = param3.field_t + param1;
                  var10 = param3.field_o + param0;
                  if (((uj) this).field_b != 2) {
                    if (((uj) this).field_b == 1) {
                      var9 = var9 + (param3.field_j + -var7 >> 1);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var9 = var9 + (-var7 + param3.field_j);
                    break L3;
                  }
                }
                L4: {
                  if (((uj) this).field_e != 2) {
                    if (1 == ((uj) this).field_e) {
                      var10 = var10 + (-var8 + param3.field_v >> 1);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    var10 = var10 + (param3.field_v - var8);
                    break L4;
                  }
                }
                pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("uj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ')');
        }
    }

    public uj() {
        ((uj) this).field_b = 1;
        ((uj) this).field_d = ql.field_Q;
        ((uj) this).field_e = 1;
    }

    uj(le param0, int param1, int param2) {
        try {
            ((uj) this).field_b = param1;
            ((uj) this).field_e = param2;
            ((uj) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "uj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new aj(7, 0, 1, 1);
    }
}
