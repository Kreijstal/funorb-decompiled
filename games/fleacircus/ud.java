/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.URL;
import java.lang.String;

final class ud {
    static ih field_b;
    static boolean field_c;
    static String field_a;

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        dd[] var10 = null;
        dd[] var11_ref_dd__ = null;
        int var11 = 0;
        int var12 = 0;
        dd var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = fleas.field_A ? 1 : 0;
        var9 = 3;
        var10 = new dd[]{new dd(var9, var9), new dd(3, var9), new dd(var9, var9), new dd(var9, 3), new dd(64, 64), new dd(var9, 3), new dd(var9, var9), new dd(3, var9), new dd(var9, var9)};
        var11_ref_dd__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_dd__.length <= var12) {
            var10 = var11_ref_dd__;
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (1 <= var11) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_B[(-var12 + (var9 - 1)) * 3 - -var11] = 65793;
                                var10[3].field_B[var11 * var9 + -1 + (var9 - var12)] = 65793;
                                var10[7].field_B[var11 + 3 * var12] = 65793;
                                var10[5].field_B[var11 * var9 + var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 >= 1) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_B[(var9 + (-var12 - 1)) * 3 + var11] = 0;
                            var10[5].field_B[var9 * var11 - (-var9 + 1 + var12)] = 0;
                            var10[1].field_B[3 * var12 - -var11] = 0;
                            var10[3].field_B[var11 * var9 - -var12] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (~var12 <= ~var9) {
                        var11++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_B[var12 + var9 * var11] = 0;
                          var10[0].field_B[var12 * var9 + var11] = 0;
                          if (~var12 <= ~(-var11 + var9)) {
                            break L8;
                          } else {
                            var10[2].field_B[var9 * var11 + var12] = 0;
                            var10[6].field_B[var9 * var12 + var11] = 0;
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_B[var12 + var9 * (var9 - (var11 - -1))] = 0;
                    var10[8].field_B[var9 * (var9 - var11 + -1) - -var12] = 0;
                    var10[2].field_B[var12 * var9 - var11 - (1 + -var9)] = 0;
                    var10[8].field_B[-var11 + var9 - 1 + var12 * var9] = 0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_dd__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_B.length) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = 0;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            od var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ce stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            ce stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            ce stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            Throwable decompiledCaughtException = null;
            ce stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            ce stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            ce stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            var6 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param1 == null) {
                    break L1;
                  } else {
                    var3_ref = ii.a(41, param1);
                    break L1;
                  }
                }
                L2: {
                  if (param0 != null) {
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
                  } else {
                    break L2;
                  }
                }
                sk.a(param2 ^ param2, var3_ref);
                var7 = tj.a(":", var3_ref, "%3a", (byte) -66);
                var8 = tj.a("@", var7, "%40", (byte) -66);
                var9 = tj.a("&", var8, "%26", (byte) -66);
                var10 = tj.a("#", var9, "%23", (byte) -66);
                if (tb.field_d == null) {
                  return;
                } else {
                  L4: {
                    stackOut_11_0 = fg.field_i;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = tb.field_d.getCodeBase();
                    stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(rc.field_a).append("&u=");
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
                    if (s.field_b == null) {
                      stackOut_13_0 = (ce) (Object) stackIn_13_0;
                      stackOut_13_1 = null;
                      stackOut_13_2 = null;
                      stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                      stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                      stackOut_13_5 = "" + of.field_c;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      break L4;
                    } else {
                      stackOut_12_0 = (ce) (Object) stackIn_12_0;
                      stackOut_12_1 = null;
                      stackOut_12_2 = null;
                      stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                      stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                      stackOut_12_5 = s.field_b;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      break L4;
                    }
                  }
                  var4 = ((ce) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + ce.field_r + "&v2=" + ce.field_n + "&e=" + var10), -34);
                  L5: while (true) {
                    if (0 != var4.field_b) {
                      L6: {
                        if (var4.field_b != 1) {
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
                      vh.a(1L, param2 + -100);
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

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = tc.a((byte) 82, param1, false);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ud.A(").append(1560).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fa var7 = null;
        fa var8 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = tl.field_p;
              var8 = var7;
              sd.field_f = var8.b(pa.field_i[12]);
              var2 = var8.b(pa.field_i[13]);
              if (var2 > sd.field_f) {
                sd.field_f = var2;
                break L1;
              } else {
                break L1;
              }
            }
            h.field_g = new dd[b.field_d.length];
            ua.field_tb = new dd[b.field_d.length];
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= h.field_g.length) {
                gj.field_A = new rk(320, 420, gl.field_m, qa.field_l, bb.field_H, lh.field_b);
                gj.field_A.field_t = fl.field_f;
                gj.field_A.field_y = 1;
                gj.field_A.field_z = -1;
                ca.field_L = new mf(3, 1560);
                mg.field_b = new mf(6, 165);
                fb.field_a = new mf(3, 4715);
                cm.field_i = new mf(3, 1560);
                mf.field_e = new mf(6, 165);
                th.field_z = new mf(3, 4715);
                var3 = 0;
                L3: while (true) {
                  if (ca.field_L.field_d.length <= var3) {
                    break L0;
                  } else {
                    ca.field_L.field_d[var3] = var3 * 65536;
                    cm.field_i.field_d[var3] = var3 * 65536;
                    fb.field_a.field_d[var3] = 65792 * var3;
                    th.field_z.field_d[var3] = 65792 * var3;
                    var3++;
                    continue L3;
                  }
                }
              } else {
                h.field_g[var4] = je.field_O[db.a((byte) -115, new Random(), je.field_O.length)];
                L4: while (true) {
                  L5: {
                    if (null == ua.field_tb[var4]) {
                      break L5;
                    } else {
                      if (ua.field_tb[var4] != h.field_g[var4]) {
                        var4++;
                        continue L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ua.field_tb[var4] = je.field_O[db.a((byte) -115, new Random(), je.field_O.length)];
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "ud.C(" + 47 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = "Connection lost. <%0>";
    }
}
