/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hg extends gm {
    static da field_wb;
    static int field_rb;
    static String field_tb;
    static int field_ub;
    static String field_sb;
    static String field_vb;

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        fn var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        L0: {
          L1: {
            var13 = ZombieDawnMulti.field_E ? 1 : 0;
            if (!(param1 instanceof fn)) {
              break L1;
            } else {
              var14 = (fn) ((Object) param1);
              param1 = var14.field_f;
              var2 = var14.field_k + " | ";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          break L0;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L2: while (true) {
          L3: {
            L4: {
              var8 = var6.readLine();
              var11 = var8;
              var2 = var11;
              var11 = var8;
              if (var8 != null) {
                break L4;
              } else {
                if (var13 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (var9 == -1) {
                  break L6;
                } else {
                  var11 = var8.substring(0, var9);
                  if (var13 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              var11 = var8;
              var2 = var11;
              var2 = var11;
              break L5;
            }
            L7: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') - -1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              var2 = var19;
              if (0 == (var9 ^ -1)) {
                break L7;
              } else {
                if (0 == (var10 ^ -1)) {
                  break L7;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (0 > var12) {
                    break L7;
                  } else {
                    var2 = var19 + var8.substring(var12 + 5, var10);
                    break L7;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            if (var13 == 0) {
              continue L2;
            } else {
              break L3;
            }
          }
          if (param0 > -58) {
            return (String) null;
          } else {
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static String a(int param0, char param1, int param2) {
        char[] var3;
        int var4;
        int var5;
        char[] var6;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var6 = new char[param2];
        var3 = var6;
        if (param0 != 40) {
          hg.c(false);
          var4 = 0;
          L0: while (true) {
            L1: {
              if (param2 <= var4) {
                break L1;
              } else {
                var6[var4] = param1;
                var4++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return new String(var6);
          }
        } else {
          var4 = 0;
          L2: while (true) {
            L3: {
              if (param2 <= var4) {
                break L3;
              } else {
                var6[var4] = param1;
                var4++;
                if (var5 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return new String(var6);
          }
        }
    }

    final void a(nm param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        oo.c(param0.c(this.g(58), -20126), param0.d(this.h(102), 109), this.field_kb, 16711680);
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_fb <= var3_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = param0.c(this.field_cb[var3_int], -20126);
                        var5 = param0.d(this.field_hb[var3_int], 126);
                        oo.e(-1 + var4, -1 + var5, 3, 3, 0);
                        oo.a(var4, var5, 65280);
                        var3_int++;
                        if (var6 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 > 58) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        hg.a(-91, '', 11);
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var3);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("hg.J(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(boolean param0) {
        field_tb = null;
        field_vb = null;
        if (!param0) {
          field_wb = (da) null;
          field_sb = null;
          field_wb = null;
          return;
        } else {
          field_sb = null;
          field_wb = null;
          return;
        }
    }

    final static void h(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = on.field_Z;
        synchronized (var1) {
          L0: {
            L1: {
              pq.field_f = hh.field_e;
              gi.field_m = gi.field_m + 1;
              bd.field_g = pb.field_a;
              bo.field_d = da.field_e;
              wc.field_J = vj.field_m;
              vj.field_m = false;
              kd.field_b = s.field_f;
              vb.field_f = de.field_g;
              ka.field_t = s.field_b;
              s.field_f = 0;
              if (param0 < -82) {
                break L1;
              } else {
                field_sb = (String) null;
                break L1;
              }
            }
            jf.field_e = ak.field_b;
            break L0;
          }
        }
    }

    hg(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        if (-3 == (this.field_C ^ -1) || (this.field_C ^ -1) == -5 || -7 == (this.field_C ^ -1)) {
            this.field_fb = 21;
            this.field_bb = 143360;
        }
    }

    static {
        field_wb = new da();
        field_tb = "Loading sound effects";
        field_sb = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_vb = "Player";
    }
}
