/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    private di field_e;
    static String field_a;
    private di field_c;
    static int[] field_b;
    private fg field_d;

    final static void a(int param0, int param1) {
        if (param1 > -37) {
            field_a = null;
        }
        oh.field_e = 1000000000L / (long)param0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -66) {
            field_b = null;
        }
        field_b = null;
    }

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
        oa var13 = null;
        StringWriter var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        L0: {
          if (!(param1 instanceof oa)) {
            var2 = "";
            var11 = var2;
            break L0;
          } else {
            var13 = (oa) (Object) param1;
            var2 = var13.field_i + " | ";
            param1 = var13.field_c;
            break L0;
          }
        }
        L1: {
          var14 = new StringWriter();
          var4 = new PrintWriter((Writer) (Object) var14);
          param1.printStackTrace(var4);
          var4.close();
          var5 = var14.toString();
          var2 = var5;
          var11 = var5;
          if (param0 == 5) {
            break L1;
          } else {
            field_b = null;
            break L1;
          }
        }
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L2: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L3;
              } else {
                var11 = var8.substring(0, var9);
                break L3;
              }
            }
            L4: {
              var15 = var11.trim();
              var2 = var15;
              var2 = var15;
              var16 = var15.substring(var15.lastIndexOf(' ') - -1);
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf('\t') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var2 + var17;
              var2 = var18;
              var2 = var18;
              if ((var9 ^ -1) == 0) {
                break L4;
              } else {
                if (-1 == var10) {
                  break L4;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L4;
                  } else {
                    var2 = var18 + var8.substring(var12 + 5, var10);
                    break L4;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L2;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static int b(byte param0) {
        if (param0 >= -51) {
            field_b = null;
        }
        return -fk.field_Z + ah.field_i;
    }

    final static void a(pn param0, int param1) {
        int var2 = 0;
        pn var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        if (param1 > 64) {
          if (param0.field_f != null) {
            L0: {
              L1: {
                if (param0.field_m != 0) {
                  break L1;
                } else {
                  if (-1 != (param0.field_e ^ -1)) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= aa.field_e) {
                  break L0;
                } else {
                  var3 = wb.field_e[var2];
                  if ((var3.field_p ^ -1) == -3) {
                    if (param0.field_m == var3.field_m) {
                      if (param0.field_e == var3.field_e) {
                        return;
                      } else {
                        var2++;
                        continue L2;
                      }
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param0.field_d == null) {
                break L3;
              } else {
                hp.field_a = param0.field_b;
                ro.field_s = param0.field_q;
                rn.field_g = param0.field_d;
                hg.field_a = param0.field_p;
                break L3;
              }
            }
            oa.a(-114, param0);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static pn a(byte param0, boolean param1) {
        oq var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        oq var8 = null;
        ap var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_23_0 = null;
        Object stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Pool.field_O;
                    var8 = kn.field_e;
                    var2 = var8;
                    var3 = var8.g(-111);
                    if (-1 == (var3 & 128 ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    qg.field_d = stackIn_3_0 != 0;
                    um.field_d = var3 & 127;
                    df.field_e = var8.g(-105);
                    qg.field_c = var8.h(-412303328);
                    if (2 != um.field_d) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    wq.field_a = var8.d(-1034);
                    m.field_e = var8.f(98);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    m.field_e = 0;
                    wq.field_a = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((var8.g(param0 ^ 94) ^ -1) != -2) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    n.field_S = var8.j(-105);
                    if (param0 == -31) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    int discarded$1 = ee.b((byte) -81);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    lh.field_f = var8.j(param0 ^ 82);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    lh.field_f = n.field_S;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((um.field_d ^ -1) == -2) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (4 == um.field_d) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    pp.field_b = 0;
                    tp.field_g = null;
                    statePc = 19;
                    continue stateLoop;
                }
                case 17: {
                    pp.field_b = var8.d(-1034);
                    tp.field_g = var8.j(-49);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    pp.field_b = var8.d(-1034);
                    tp.field_g = var8.j(-49);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (param1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    np.field_a = s.a((ge) (Object) var8, 80, true);
                    ci.field_p = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 21: {
                    var5 = var8.d(-1034);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var9 = o.field_x.a(127, var5);
                        np.field_a = var9.e(param0 ^ -31);
                        if (lh.field_f.equals((Object) (Object) di.field_j)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = var9.field_C;
                        stackIn_25_0 = stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = null;
                        stackIn_25_0 = (int[]) (Object) stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ci.field_p = stackIn_25_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var6 = (Exception) (Object) caughtException;
                    tc.a((Throwable) (Object) var6, "CC1", param0 ^ 8564);
                    np.field_a = null;
                    ci.field_p = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    return new pn(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final sf a(byte param0, int param1) {
        byte[] var4 = null;
        sf var3 = (sf) ((ee) this).field_d.a((long)param1, true);
        if (param0 != -55) {
            return null;
        }
        if (var3 != null) {
            return var3;
        }
        if (32768 > param1) {
            var4 = ((ee) this).field_c.a(82, param1, 0);
        } else {
            var4 = ((ee) this).field_e.a(112, param1 & 32767, 0);
        }
        sf var3_ref = new sf();
        if (var4 != null) {
            var3_ref.a((byte) -123, new ge(var4));
        }
        if (32768 <= param1) {
            var3_ref.f(0);
        }
        ((ee) this).field_d.a(121, (Object) (Object) var3_ref, (long)param1);
        return var3_ref;
    }

    ee(int param0, di param1, di param2) {
        ((ee) this).field_d = new fg(64);
        ((ee) this).field_e = param2;
        ((ee) this).field_c = param1;
        if (((ee) this).field_c != null) {
            int discarded$0 = ((ee) this).field_c.a(false, 0);
        }
        if (null != ((ee) this).field_e) {
            int discarded$1 = ((ee) this).field_e.a(false, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> are all offering a rematch.";
        field_b = new int[128];
    }
}
