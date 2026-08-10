/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ud {
    static ih field_b;
    static boolean field_c;
    static String field_a;

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        dd[] var10;
        dd[] var11_ref_dd__;
        int var11;
        int var12;
        dd var13;
        int var14;
        int var15;
        var15 = fleas.field_A ? 1 : 0;
        var9 = param3 + (param4 + param7);
        var10 = new dd[]{new dd(var9, var9), new dd(param1, var9), new dd(var9, var9), new dd(var9, param1), new dd(64, 64), new dd(var9, param1), new dd(var9, var9), new dd(param1, var9), new dd(var9, var9)};
        var11_ref_dd__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_dd__.length <= var12) {
            var10 = var11_ref_dd__;
            var11 = 0;
            L1: while (true) {
              if (var11 >= param3) {
                L2: {
                  var11 = 0;
                  if (param2 == 4715) {
                    break L2;
                  } else {
                    ud.a((byte) 104);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (param3 <= var11) {
                    var11 = 0;
                    L4: while (true) {
                      if (param1 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param1 >> -722328895) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < param7) {
                                var10[1].field_B[(-var12 + (var9 - 1)) * param1 - -var11] = param6;
                                var10[3].field_B[var11 * var9 + -1 + (var9 - var12)] = param6;
                                var10[7].field_B[var11 + param1 * var12] = param6;
                                var10[5].field_B[var11 * var9 + var12] = param6;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param3 <= var12) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_B[(var9 + (-var12 - 1)) * param1 + var11] = param5;
                            var10[5].field_B[var9 * var11 - (-var9 + 1 + var12)] = param5;
                            var10[1].field_B[param1 * var12 - -var11] = param8;
                            var10[3].field_B[var11 * var9 - -var12] = param8;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L3;
                      } else {
                        var10[0].field_B[var12 + var9 * var11] = param8;
                        var10[0].field_B[var12 * var9 + var11] = param8;
                        if ((var12 ^ -1) > (-var11 + var9 ^ -1)) {
                          var10[2].field_B[var9 * var11 + var12] = param8;
                          var10[6].field_B[var9 * var12 + var11] = param8;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 < var9) {
                    var10[6].field_B[var12 + var9 * (var9 - (var11 - -1))] = param5;
                    var10[8].field_B[var9 * (var9 - var11 + -1) - -var12] = param5;
                    var10[2].field_B[var12 * var9 - var11 - (1 + -var9)] = param5;
                    var10[8].field_B[-var11 + var9 - 1 + var12 * var9] = param5;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L1;
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
                var13.field_B[var14] = param0;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 85) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            ce stackIn_13_0;
            java.net.URL stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            StringBuilder stackIn_13_4;
            ce stackIn_14_0;
            java.net.URL stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            StringBuilder stackIn_14_4;
            String stackIn_14_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            od var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param1 == null) {
                    break L1;
                  } else {
                    var3 = ii.a(41, param1);
                    break L1;
                  }
                }
                L2: {
                  if (param0 != null) {
                    L3: {
                      if (param1 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                sk.a(param2 ^ param2, var3);
                var7 = tj.a(":", var3, "%3a", (byte) -66);
                var8 = tj.a("@", var7, "%40", (byte) -66);
                var9 = tj.a("&", var8, "%26", (byte) -66);
                var10 = tj.a("#", var9, "%23", (byte) -66);
                if (tb.field_d == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackIn_13_0 = fg.field_i;

                    stackIn_13_1 = null;

                    stackIn_13_2 = null;

                    stackIn_13_3 = tb.field_d.getCodeBase();

                    stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(rc.field_a).append("&u=");

                    if (s.field_b == null) {
                      stackIn_14_0 = (ce) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = "" + of.field_c;
                      break L4;
                    } else {
                      stackIn_14_0 = (ce) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = s.field_b;
                      break L4;
                    }
                  }
                  var4 = ((ce) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + ce.field_r + "&v2=" + ce.field_n + "&e=" + var10), -34);
                  L5: while (true) {
                    if (0 != var4.field_b) {
                      L6: {
                        if ((var4.field_b ^ -1) != -2) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) (var4.field_e);
                          var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
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
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1560) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            stackIn_3_0 = tc.a((byte) 82, param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ud.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fa var7 = null;
        fa var8 = null;
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
            var3 = -15 % ((-48 - param0) / 60);
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
          throw pf.a((Throwable) ((Object) var1), "ud.C(" + param0 + ')');
        }
    }

    static {
        field_c = false;
        field_a = "Connection lost. <%0>";
    }
}
