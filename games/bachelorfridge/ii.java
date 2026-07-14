/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ii extends cj {
    nq field_l;
    int field_k;
    static eaa field_m;

    public static void b(int param0) {
        if (param0 != -225) {
            ii.b(-121);
            field_m = null;
            return;
        }
        field_m = null;
    }

    void a(byte param0, lu param1) {
        if (param0 > -12) {
            Object var4 = null;
            ii.a((String) null, false, -42, (uha) null);
        }
    }

    final void a(lu param0, int param1) {
        param0.b(((ii) this).field_k, -121);
        er.a(((ii) this).field_l, param1 + 132, param0);
        if (param1 != -9) {
          ((ii) this).field_k = -23;
          ((ii) this).a((byte) -54, param0);
          return;
        } else {
          ((ii) this).a((byte) -54, param0);
          return;
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        if (param0 == 62) {
          if (-225 < (b.field_u ^ -1)) {
            var1 = b.field_u % 32;
            di.a(true, -var1 + 32 + b.field_u);
            return;
          } else {
            di.a(true, 256);
            return;
          }
        } else {
          return;
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_11_0 = 0;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_12_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 > ig.field_m.field_g) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (dma.field_b != null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return false;
                    }
                    case 4: {
                        try {
                            var2_int = dma.field_b.b(-42);
                            if (var2_int > param1) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (-ig.field_m.field_g + param0 >= var2_int) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2_int = -ig.field_m.field_g + param0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            dma.field_b.a(ig.field_m.field_g, (byte) 75, ig.field_m.field_h, var2_int);
                            pk.field_c = f.b((byte) 73);
                            ig.field_m.field_g = ig.field_m.field_g + var2_int;
                            if (param0 > ig.field_m.field_g) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            ig.field_m.field_g = 0;
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            if ((var2_int ^ -1) > -1) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (30000L >= ag.e(param1 ^ -9109)) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            vc.a((byte) -106);
                            return false;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            vc.a((byte) -106);
                            return false;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return false;
                    }
                    case 20: {
                        var2 = (IOException) (Object) caughtException;
                        vc.a((byte) -79);
                        return false;
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

    ii(int param0, int param1, lu param2) {
        this(param0, param1, qi.a(param2, (byte) 80));
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) vv.field_e);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) vv.field_e);
        int var2 = -78 / ((13 - param0) / 48);
    }

    ii(int param0, lu param1) {
        this(param0, param1.e((byte) 100), qi.a(param1, (byte) 21));
    }

    final static void a(String param0, boolean param1, int param2, uha param3) {
        int var5 = 0;
        int var6 = 0;
        ik var15 = null;
        ik var16 = null;
        String var17 = null;
        ik var18 = null;
        ik var19 = null;
        String var20 = null;
        ik var21 = null;
        ik var22 = null;
        String var23 = null;
        ik var24 = null;
        ik var25 = null;
        String var26 = null;
        ik var27 = null;
        ik var28 = null;
        String var29 = null;
        ik var30 = null;
        String var31 = null;
        ik var32 = null;
        String var33 = null;
        ik var34 = null;
        ik var35 = null;
        String var36 = null;
        ik var37 = null;
        String var38 = null;
        ik var39 = null;
        String var40 = null;
        ik var41 = null;
        mna.a(param3.f((byte) -92), (int[]) null, 0L, (String) null, (String) null, -1, -99, p.field_n, (sna) (Object) param3);
        if (param3.field_Zb) {
          if (2 == param3.field_Lb) {
            L0: {
              var28 = ms.field_u;
              var29 = lga.a(true, new String[1], bea.field_s);
              var28.field_a.a(var29, true, 10);
              ms.field_u.b(true);
              if (!param1) {
                break L0;
              } else {
                if (hja.field_i != ms.field_u.field_k) {
                  var32 = ms.field_u;
                  var33 = lga.a(true, new String[1], jh.field_k);
                  var32.field_a.a(var33, true, 15);
                  break L0;
                } else {
                  var30 = ms.field_u;
                  var31 = lga.a(true, new String[1], wl.field_wb);
                  var30.field_a.a(var31, true, 16);
                  var34 = ms.field_u;
                  if (param2 == -3) {
                    var5 = nfa.field_a;
                    var6 = jc.field_r;
                    var34.field_a.a(0, false, var5, 0, var6);
                    return;
                  } else {
                    field_m = null;
                    var5 = nfa.field_a;
                    var6 = jc.field_r;
                    var34.field_a.a(0, false, var5, 0, var6);
                    return;
                  }
                }
              }
            }
            var34 = ms.field_u;
            if (param2 != -3) {
              field_m = null;
              var5 = nfa.field_a;
              var6 = jc.field_r;
              var34.field_a.a(0, false, var5, 0, var6);
              return;
            } else {
              var5 = nfa.field_a;
              var6 = jc.field_r;
              var34.field_a.a(0, false, var5, 0, var6);
              return;
            }
          } else {
            if ((hea.field_r ^ -1) <= -3) {
              L1: {
                var35 = ms.field_u;
                var36 = lga.a(true, new String[1], bea.field_s);
                var35.field_a.a(var36, true, 10);
                ms.field_u.b(true);
                if (!param1) {
                  break L1;
                } else {
                  if (hja.field_i != ms.field_u.field_k) {
                    var39 = ms.field_u;
                    var40 = lga.a(true, new String[1], jh.field_k);
                    var39.field_a.a(var40, true, 15);
                    break L1;
                  } else {
                    var37 = ms.field_u;
                    var38 = lga.a(true, new String[1], wl.field_wb);
                    var37.field_a.a(var38, true, 16);
                    var41 = ms.field_u;
                    var15 = var41;
                    if (param2 != -3) {
                      field_m = null;
                      var5 = nfa.field_a;
                      var6 = jc.field_r;
                      var41.field_a.a(0, false, var5, 0, var6);
                      return;
                    } else {
                      var5 = nfa.field_a;
                      var6 = jc.field_r;
                      var41.field_a.a(0, false, var5, 0, var6);
                      return;
                    }
                  }
                }
              }
              var41 = ms.field_u;
              var15 = var41;
              if (param2 != -3) {
                field_m = null;
                var5 = nfa.field_a;
                var6 = jc.field_r;
                var41.field_a.a(0, false, var5, 0, var6);
                return;
              } else {
                var5 = nfa.field_a;
                var6 = jc.field_r;
                var41.field_a.a(0, false, var5, 0, var6);
                return;
              }
            } else {
              L2: {
                ms.field_u.b(true);
                if (!param1) {
                  break L2;
                } else {
                  if (hja.field_i != ms.field_u.field_k) {
                    var25 = ms.field_u;
                    var26 = lga.a(true, new String[1], jh.field_k);
                    var25.field_a.a(var26, true, 15);
                    break L2;
                  } else {
                    var22 = ms.field_u;
                    var23 = lga.a(true, new String[1], wl.field_wb);
                    var22.field_a.a(var23, true, 16);
                    var24 = ms.field_u;
                    if (param2 != -3) {
                      field_m = null;
                      var5 = nfa.field_a;
                      var6 = jc.field_r;
                      var24.field_a.a(0, false, var5, 0, var6);
                      return;
                    } else {
                      var5 = nfa.field_a;
                      var6 = jc.field_r;
                      var24.field_a.a(0, false, var5, 0, var6);
                      return;
                    }
                  }
                }
              }
              var27 = ms.field_u;
              if (param2 != -3) {
                field_m = null;
                var5 = nfa.field_a;
                var6 = jc.field_r;
                var27.field_a.a(0, false, var5, 0, var6);
                return;
              } else {
                var5 = nfa.field_a;
                var6 = jc.field_r;
                var27.field_a.a(0, false, var5, 0, var6);
                return;
              }
            }
          }
        } else {
          L3: {
            ms.field_u.b(true);
            if (!param1) {
              break L3;
            } else {
              if (hja.field_i != ms.field_u.field_k) {
                var19 = ms.field_u;
                var20 = lga.a(true, new String[1], jh.field_k);
                var19.field_a.a(var20, true, 15);
                break L3;
              } else {
                var16 = ms.field_u;
                var17 = lga.a(true, new String[1], wl.field_wb);
                var16.field_a.a(var17, true, 16);
                var18 = ms.field_u;
                if (param2 != -3) {
                  field_m = null;
                  var5 = nfa.field_a;
                  var6 = jc.field_r;
                  var18.field_a.a(0, false, var5, 0, var6);
                  return;
                } else {
                  var5 = nfa.field_a;
                  var6 = jc.field_r;
                  var18.field_a.a(0, false, var5, 0, var6);
                  return;
                }
              }
            }
          }
          var21 = ms.field_u;
          if (param2 != -3) {
            field_m = null;
            var5 = nfa.field_a;
            var6 = jc.field_r;
            var21.field_a.a(0, false, var5, 0, var6);
            return;
          } else {
            var5 = nfa.field_a;
            var6 = jc.field_r;
            var21.field_a.a(0, false, var5, 0, var6);
            return;
          }
        }
    }

    ii(int param0, int param1, nq param2) {
        super(param0);
        ((ii) this).field_k = param1;
        ((ii) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new eaa();
    }
}
