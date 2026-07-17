/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends jl {
    static boolean field_y;
    private int field_w;
    static String field_s;
    static String field_u;
    static int field_x;
    cm[] field_t;
    private byte[][] field_v;

    public static void e() {
        field_s = null;
        field_u = null;
    }

    final boolean g(byte param0) {
        int var2 = 0;
        int var3_int = 0;
        mn var3 = null;
        int var4 = 0;
        kg var6_ref_kg = null;
        int var6 = 0;
        int var7 = 0;
        kg var8 = null;
        int var9 = 0;
        Object var10 = null;
        ij var11 = null;
        int var12 = 0;
        int var13 = 0;
        int[] var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        byte[] var29 = null;
        var12 = Confined.field_J ? 1 : 0;
        if (((sg) this).field_t != null) {
          return true;
        } else {
          L0: {
            if (((sg) this).field_v == null) {
              if (rn.field_f.a(((sg) this).field_w, 0)) {
                var26 = rn.field_f.a((byte) -112, ((sg) this).field_w);
                ((sg) this).field_v = new byte[var26.length][];
                var3_int = 0;
                L1: while (true) {
                  if (var26.length <= var3_int) {
                    break L0;
                  } else {
                    ((sg) this).field_v[var3_int] = rn.field_f.a((byte) -2, ((sg) this).field_w, var26[var3_int]);
                    var3_int++;
                    continue L1;
                  }
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          var2 = 1;
          var4 = -111 / ((-14 - param0) / 63);
          var13 = 0;
          var3_int = var13;
          L2: while (true) {
            if (var13 >= ((sg) this).field_v.length) {
              if (var2 != 0) {
                var3 = new mn();
                var4 = rn.field_f.d(((sg) this).field_w, (byte) -121);
                ((sg) this).field_t = new cm[var4];
                var28 = rn.field_f.a((byte) -115, ((sg) this).field_w);
                var6 = 0;
                L3: while (true) {
                  if (var6 >= var28.length) {
                    ((sg) this).field_v = null;
                    return true;
                  } else {
                    var29 = ((sg) this).field_v[var6];
                    var8 = new kg(var29);
                    var8.field_n = 1;
                    var9 = var8.a((byte) 25);
                    var10 = null;
                    var11 = (ij) (Object) var3.a(47);
                    L4: while (true) {
                      L5: {
                        if (var11 == null) {
                          break L5;
                        } else {
                          if (var9 != var11.field_v) {
                            var11 = (ij) (Object) var3.d(2123);
                            continue L4;
                          } else {
                            var10 = (Object) (Object) var11;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var10 == null) {
                          var10 = (Object) (Object) new ij(var9, un.field_a.c(var9, (byte) 125));
                          var3.a((rk) var10, (byte) -112);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((sg) this).field_t[var28[var6]] = new cm(var29, (ij) var10);
                      var6++;
                      continue L3;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              var27 = ((sg) this).field_v[var13];
              var6_ref_kg = new kg(var27);
              var6_ref_kg.field_n = 1;
              var7 = var6_ref_kg.a((byte) 25);
              var2 = var2 != 0 & un.field_a.a(var7, (byte) -37) ? 1 : 0;
              var13++;
              continue L2;
            }
          }
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            int var4 = 0;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int stackOut_2_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Confined.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!jc.field_g) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = 1;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            var2 = "tuhstatbut";
                            var4 = 0;
                            var3 = (String) kf.a(114, "getcookies", param1);
                            var5 = ij.a(0, ';', var3);
                            var6 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 13;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var2)) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = 1;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        try {
                            var6++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var2_ref = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (null == param1.getParameter("tuhstatbut")) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_17_0 = (RuntimeException) var2_ref2;
                        stackOut_17_1 = new StringBuilder().append("sg.E(").append(-111).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw sd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
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

    final static void f(byte param0) {
        if (param0 < 85) {
            field_y = true;
        }
        if (lc.field_J == null) {
            if (qn.field_v.field_h <= 0) {
            } else {
                if (!pa.field_c) {
                    lc.field_J = new bj(0, 65535, qn.field_v.field_B.field_yb + bd.field_h, qn.field_v.field_J.field_o + we.field_g, -qn.field_v.field_h + d.field_a, rc.field_i, new int[1]);
                } else {
                    lc.field_J = new bj(1, 65534, bd.field_h - -qn.field_v.field_B.field_yb, we.field_g - -qn.field_v.field_J.field_o, -qn.field_v.field_h + d.field_a, rc.field_i, new int[1]);
                }
                int discarded$2 = 1;
                if (!tj.a()) {
                    int discarded$3 = 3;
                    int discarded$4 = -1;
                    r.a(lc.field_J);
                }
                rg.field_K = true;
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((sg) this).field_t[param2].a(param3, param0);
        if (param1 != 61) {
            ((sg) this).a(-114, 7, -56, 63);
        }
    }

    sg(int param0) {
        ((sg) this).field_w = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "You can <col=FFFFFF>press any arrow key</col> to return to keyboard control.";
        field_s = "Friends can be added in multiplayer<nbsp>games";
    }
}
