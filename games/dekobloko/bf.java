/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bf extends bh {
    static w field_v;
    byte[] field_n;
    static c field_x;
    static Random field_y;
    int field_s;
    long field_p;
    static int field_r;
    static String field_q;
    static ud field_w;
    static int field_o;
    static w field_t;
    static ud field_u;

    final static void a(int param0, boolean param1, int param2, String param3, java.awt.Color param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = jh.field_b.getGraphics();
                  if (wf.field_s == null) {
                    wf.field_s = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param1) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, de.field_M, ob.field_g);
                    break L3;
                  }
                }
                L4: {
                  if (param4 != null) {
                    break L4;
                  } else {
                    param4 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == lj.field_a) {
                        lj.field_a = jh.field_b.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = lj.field_a.getGraphics();
                    var10.setColor(param4);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param0, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param0 * 3 + 2, 2, 300 + -(param0 * 3), 30);
                    var10.setFont(wf.field_s);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param3, (-(param2 * param3.length()) + 304) / 2, 22);
                    var9.drawImage(lj.field_a, de.field_M / 2 - 152, ob.field_g / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + de.field_M / 2;
                    var8 = ob.field_g / 2 - 18;
                    var9.setColor(param4);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, param0 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, var8 + 1, 301, 31);
                    var9.fillRect(2 + (var7 - -(3 * param0)), 2 + var8, 300 + -(param0 * 3), 30);
                    var9.setFont(wf.field_s);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param3, var7 - -((304 - 6 * param3.length()) / 2), 22 + var8);
                    break L7;
                  }
                }
                if (null == te.field_t) {
                  break L1;
                } else {
                  var9.setFont(wf.field_s);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(te.field_t, de.field_M / 2 - 6 * te.field_t.length() / 2, ob.field_g / 2 - 26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              jh.field_b.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5_ref);

            stackIn_20_1 = new StringBuilder().append("bf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
    }

    final static int a(byte param0, kn param1, int param2, kc param3) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == null) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param3.field_u) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param1 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1.field_x == param3.field_n) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var4_int = param1.field_s.length;
                        if (param0 == 107) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = -88;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var5 = param3.field_u[param2].length / var4_int;
                        var6 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5 <= var6) {
                            statePc = 27;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_28_0 = (param3.field_t[param2][var6] < param1.field_o ? -1 : (param3.field_t[param2][var6] == param1.field_o ? 0 : 1));
                        stackIn_14_0 = stackIn_28_0;
                        if (var8 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!k.a(param3.field_r[param2][var6], true)) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_25_0 = param3.field_u[param2][var4_int * var6 + var7];
                        stackIn_19_0 = stackIn_25_0;
                        if (var8 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 == param1.field_s[var7]) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var8 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = var6;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    try {
                        var6++;
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = -1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0;
                }
                case 29: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var4);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("bf.D(").append(param0).append(',');
                    stackIn_30_1 = stackIn_31_1;
                    if (param1 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');
                    stackIn_33_1 = stackIn_34_1;
                    if (param3 == null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_q = null;
        field_t = null;
        field_y = null;
        field_v = null;
        if (param0 >= -38) {
          return;
        } else {
          field_x = null;
          field_w = null;
          return;
        }
    }

    final static void c(byte param0) {
        gh.field_b.a(gg.field_y.field_mb - (!pd.field_a ? 0 : 44 + vh.field_e), 0, 0, 18, 0);
        int var1 = 44 / ((-28 - param0) / 43);
        kn.field_r.a(vh.field_e + 42, 0, 0, 18, -2 + gg.field_y.field_mb + -vh.field_e - 40);
        ec.field_k.a(6, 20, vh.field_e, 0, -20 + gg.field_y.field_N, gg.field_y.field_mb, 2);
    }

    final static void b(int param0, int param1) {
        uf var2;
        if (param0 != -20861) {
          return;
        } else {
          var2 = we.field_b;
          var2.f(param1, -4);
          var2.a(true, 1);
          var2.a(true, 0);
          return;
        }
    }

    final static void a(boolean param0) {
        dh.field_b = null;
        fj.field_e = param0 ? true : false;
        vb.field_U = null;
        wb.field_Qb = null;
        tg.field_g = null;
    }

    bf(long param0, int param1, byte[] param2) {
        try {
            this.field_n = param2;
            this.field_s = param1;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bf.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = new Random();
        field_q = "Invalid date";
    }
}
