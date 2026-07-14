/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ge implements Runnable {
    private int field_a;
    private InputStream field_b;
    private int field_i;
    private int field_k;
    private ab field_d;
    private byte[] field_f;
    private java.net.Socket field_g;
    private ei field_c;
    private boolean field_l;
    private OutputStream field_h;
    private boolean field_j;
    static String field_e;

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        if (((ge) this).field_l) {
            return;
        }
        while (0 < param2) {
            var5 = ((ge) this).field_b.read(param0, param3, param2);
            if (-1 <= (var5 ^ -1)) {
                throw new EOFException();
            }
            param3 = param3 + var5;
            param2 = param2 - var5;
        }
        if (param1 != -109) {
            field_e = null;
        }
    }

    protected final void finalize() {
        ((ge) this).b(58);
    }

    ge(java.net.Socket param0, ab param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -59) {
            field_e = null;
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        f var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        th var13 = null;
        int var14 = 0;
        int var15 = 0;
        th var16 = null;
        int[][] var20 = null;
        L0: {
          var12 = Lexicominos.field_L ? 1 : 0;
          var13 = ig.field_a;
          var16 = var13;
          var2 = var16.d(true);
          if (param0 > 105) {
            break L0;
          } else {
            ge.f(-123);
            break L0;
          }
        }
        var3 = (f) (Object) dj.field_c.a(true);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var3.field_k == var2) {
                break L2;
              } else {
                var3 = (f) (Object) dj.field_c.f(2);
                continue L1;
              }
            }
          }
          if (var3 == null) {
            ck.b((byte) -47);
            return;
          } else {
            L3: {
              var4 = var16.d(true);
              if (var4 != 0) {
                var5 = var3.field_j;
                ph.field_a[0] = og.field_c;
                var6_int = 1;
                L4: while (true) {
                  if (var4 <= var6_int) {
                    fb.a((byte) -107, var5, var4);
                    var6_int = 0;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        bh.b((byte) 83, var5);
                        var6 = new String[2][var5];
                        var20 = new int[2][4 * var5];
                        var8 = pf.field_o;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var8 <= var9) {
                            var14 = 0;
                            var9 = var14;
                            var15 = 0;
                            var10 = var15;
                            L7: while (true) {
                              if (var8 <= var14) {
                                break L3;
                              } else {
                                var11 = ff.field_a[var5 + var14];
                                var6[1][var15] = ph.field_a[var11];
                                var20[1][var15 * 4] = we.field_g[var11];
                                var20[1][1 + 4 * var15] = l.field_D[var11];
                                var20[1][2 + 4 * var15] = oc.field_a[var11];
                                var20[1][var15 * 4 - -3] = hl.field_N[var11];
                                if (md.a(ph.field_a[var11], -101)) {
                                  if (0 == hl.field_N[var11] + oc.field_a[var11] + l.field_D[var11]) {
                                    var6[1][var15] = null;
                                    var15--;
                                    var15++;
                                    var14++;
                                    continue L7;
                                  } else {
                                    var15++;
                                    var14++;
                                    continue L7;
                                  }
                                } else {
                                  var15++;
                                  var14++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = ff.field_a[var9];
                            var6[0][var10] = ph.field_a[var11];
                            var20[0][4 * var10] = we.field_g[var11];
                            var20[0][1 + 4 * var10] = l.field_D[var11];
                            var20[0][2 + var10 * 4] = oc.field_a[var11];
                            var20[0][var10 * 4 + 3] = hl.field_N[var11];
                            if (md.a(ph.field_a[var11], -113)) {
                              if (-1 == (oc.field_a[var11] + (l.field_D[var11] - -hl.field_N[var11]) ^ -1)) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L6;
                              } else {
                                var10++;
                                var9++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        lh.a((wf) (Object) var16, -95);
                        if (var6_int == 0) {
                          ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                          var6_int++;
                          continue L5;
                        } else {
                          ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    ph.field_a[var6_int] = var13.c(false);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.b((byte) -127);
            return;
          }
        }
    }

    final static void a(byte param0, int param1, wf param2, ab param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            pd var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = Lexicominos.field_L ? 1 : 0;
              var18 = new pd();
              var18.field_p = param2.d(true);
              var18.field_j = param2.d((byte) 19);
              var18.field_n = new int[var18.field_p];
              var18.field_h = new int[var18.field_p];
              if (param0 <= -120) {
                break L0;
              } else {
                ge.a((byte) -107);
                break L0;
              }
            }
            var18.field_i = new ei[var18.field_p];
            var18.field_k = new ei[var18.field_p];
            var18.field_m = new int[var18.field_p];
            var18.field_o = new byte[var18.field_p][][];
            var5 = 0;
            L1: while (true) {
              if (var18.field_p <= var5) {
                var6_ref4 = decompiledCaughtException;
                var18.field_n[var5] = -5;
                var5++;
              } else {
                try {
                  L2: {
                    L3: {
                      var6_int = param2.d(true);
                      if (0 == var6_int) {
                        break L3;
                      } else {
                        if (1 == var6_int) {
                          break L3;
                        } else {
                          if (-3 != (var6_int ^ -1)) {
                            L4: {
                              if (-4 == var6_int) {
                                break L4;
                              } else {
                                if (-5 == var6_int) {
                                  break L4;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                            }
                            var20 = param2.c(false);
                            var8 = param2.c(false);
                            var9 = param2.d(true);
                            var10 = new String[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var23 = new byte[var9][];
                                  var22 = var23;
                                  var21 = var22;
                                  var19 = var21;
                                  var11 = var19;
                                  if (var6_int == 3) {
                                    var12_int = 0;
                                    L7: while (true) {
                                      if (var12_int >= var9) {
                                        break L6;
                                      } else {
                                        var13 = param2.d((byte) 19);
                                        var11[var12_int] = new byte[var13];
                                        param2.a(116, var13, 0, var23[var12_int]);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                                var18.field_m[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L8: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_i[var5] = param3.a(var8, qf.a(-4174, var20), var12, (byte) 113);
                                    var18.field_o[var5] = var23;
                                    break L2;
                                  } else {
                                    var12[var17] = qf.a(-4174, var10[var17]);
                                    var17++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var10[var11_int] = param2.c(false);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L9: {
                      var16 = param2.c(false);
                      var7 = var16;
                      var15 = param2.c(false);
                      var8 = var15;
                      var9 = 0;
                      if (var6_int == 1) {
                        var9 = param2.d((byte) 19);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var18.field_m[var5] = var6_int;
                    var18.field_h[var5] = var9;
                    var18.field_k[var5] = param3.a(var15, 2, qf.a(-4174, var16));
                    var5++;
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_n[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_n[var5] = -4;
                  var5++;
                }
                continue L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(int param0) throws IOException {
        if (!(!((ge) this).field_l)) {
            return 0;
        }
        if (param0 != -6448) {
            ((ge) this).field_k = 100;
        }
        return ((ge) this).field_b.available();
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 0) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(gf.a(3, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((ge) this).field_k == ((ge) this).field_i) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (!((ge) this).field_l) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = ((ge) this).field_k;
                            if (((ge) this).field_k <= ((ge) this).field_i) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((ge) this).field_a + -((ge) this).field_k;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = ((ge) this).field_i + -((ge) this).field_k;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (0 >= var1_int) {
                                statePc = 1;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((ge) this).field_h.write(((ge) this).field_f, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 28);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ge) this).field_j = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((ge) this).field_k = (((ge) this).field_k + var1_int) % ((ge) this).field_a;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((ge) this).field_k != ((ge) this).field_i) {
                                statePc = 1;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 28);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((ge) this).field_h.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 28);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ge) this).field_j = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (null == ((ge) this).field_b) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 25 : 28);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((ge) this).field_b.close();
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 25 : 28);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (((ge) this).field_h == null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 25 : 28);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((ge) this).field_h.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 25 : 28);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (null == ((ge) this).field_g) {
                                statePc = 26;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 25 : 28);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((ge) this).field_g.close();
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 25 : 28);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((ge) this).field_f = null;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        uj.a((String) null, (Throwable) (Object) var1_ref, 1);
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        int var1 = hc.f(-1980);
        if (param0 < 55) {
            field_e = null;
        }
        int var2 = eb.d((byte) -6);
        ki.field_a.a(rf.field_c + -id.field_v, (id.field_v << 291208897) + var2, var1 - -(wh.field_f << -2129819103), me.field_v - wh.field_f, -1160208572);
        hi.b(0);
    }

    final int e(int param0) throws IOException {
        if (param0 != 291208897) {
            return -65;
        }
        if (!(!((ge) this).field_l)) {
            return 0;
        }
        return ((ge) this).field_b.read();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Lexicominos.field_L ? 1 : 0;
                    if (((ge) this).field_l) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (!((ge) this).field_j) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((ge) this).field_j = false;
                    throw new IOException();
                }
                case 5: {
                    var5 = 120 / ((param2 - -44) / 56);
                    if (null != ((ge) this).field_f) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((ge) this).field_f = new byte[((ge) this).field_a];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var6 = this;
                    // monitorenter this
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        var7 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1 <= var7) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((ge) this).field_f[((ge) this).field_i] = param0[param3 + var7];
                        ((ge) this).field_i = (((ge) this).field_i - -1) % ((ge) this).field_a;
                        if (((ge) this).field_i != (((ge) this).field_a + (((ge) this).field_k - 100)) % ((ge) this).field_a) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((ge) this).field_c == null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((ge) this).field_c = ((ge) this).field_d.a((Runnable) this, false, 3);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.notifyAll();
                        // monitorexit var6
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    if (var8 instanceof RuntimeException) throw (RuntimeException) var8;
                    if (var8 instanceof Error) throw (Error) var8;
                    throw (IOException) (Object) var8;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (((ge) this).field_l) {
            return;
        }
        if (param0 <= 13) {
            ((ge) this).field_d = null;
        }
        Object var2 = this;
        // monitorenter this
        ((ge) this).field_l = true;
        this.notifyAll();
        // monitorexit var2
        if (!(((ge) this).field_c == null)) {
            while (-1 == (((ge) this).field_c.field_b ^ -1)) {
                ge.a(0, 1L);
            }
            if (!(1 != ((ge) this).field_c.field_b)) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((ge) this).field_c.field_g).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((ge) this).field_c = null;
    }

    final void a(int param0) throws IOException {
        if (((ge) this).field_l) {
            return;
        }
        if (param0 != 0) {
            return;
        }
        if (!(!((ge) this).field_j)) {
            ((ge) this).field_j = false;
            throw new IOException();
        }
    }

    final static void a(int param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if ((long)param0 == param1 % 10L) {
            wa.a((byte) 5, -1L + param1);
            wa.a((byte) 5, 1L);
        } else {
            wa.a((byte) 5, param1);
        }
    }

    private ge(java.net.Socket param0, ab param1, int param2) throws IOException {
        ((ge) this).field_k = 0;
        ((ge) this).field_i = 0;
        ((ge) this).field_l = false;
        ((ge) this).field_j = false;
        ((ge) this).field_g = param0;
        ((ge) this).field_d = param1;
        ((ge) this).field_g.setSoTimeout(30000);
        ((ge) this).field_g.setTcpNoDelay(true);
        ((ge) this).field_b = ((ge) this).field_g.getInputStream();
        ((ge) this).field_h = ((ge) this).field_g.getOutputStream();
        ((ge) this).field_a = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
