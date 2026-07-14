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
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        fn var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          if (!(param1 instanceof fn)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (fn) (Object) param1;
            param1 = var14.field_f;
            var2 = var14.field_k + " | ";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
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
              if (0 == var9) {
                break L3;
              } else {
                if (0 == var10) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (0 > var12) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 + 5, var10);
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          } else {
            if (param0 > -58) {
              return null;
            } else {
              var2 = var2 + "| " + var7;
              return var2;
            }
          }
        }
    }

    final static String a(int param0, char param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var6 = new char[param2];
        var3 = var6;
        if (param0 != 40) {
          hg.c(false);
          var4 = 0;
          L0: while (true) {
            if (param2 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (param2 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(nm param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        oo.c(param0.c(((hg) this).g(58), -20126), param0.d(((hg) this).h(102), 109), ((hg) this).field_kb, 16711680);
        var3 = 0;
        L0: while (true) {
          if (((hg) this).field_fb <= var3) {
            if (param1 <= 58) {
              String discarded$2 = hg.a(-91, '', 11);
              return;
            } else {
              return;
            }
          } else {
            var4 = param0.c(((hg) this).field_cb[var3], -20126);
            var5 = param0.d(((hg) this).field_hb[var3], 126);
            oo.e(-1 + var4, -1 + var5, 3, 3, 0);
            oo.a(var4, var5, 65280);
            var3++;
            continue L0;
          }
        }
    }

    public static void c(boolean param0) {
        field_tb = null;
        field_vb = null;
        if (!param0) {
          field_wb = null;
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
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) on.field_Z;
                    // monitorenter on.field_Z
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
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
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_sb = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        jf.field_e = ak.field_b;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    hg(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        if (-3 != (((hg) this).field_C ^ -1)) {
            if (((hg) this).field_C != -5) {
                // if_icmpne L52
            }
        }
        ((hg) this).field_fb = 21;
        ((hg) this).field_bb = 143360;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = new da();
        field_tb = "Loading sound effects";
        field_sb = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_vb = "Player";
    }
}
