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

    public static void e(byte param0) {
        if (param0 <= 38) {
            field_x = 64;
        }
        field_s = null;
        field_u = null;
    }

    final boolean g(byte param0) {
        int var2 = 0;
        int var3_int = 0;
        mn var3 = null;
        int var4 = 0;
        kg var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        kg var8 = null;
        int var9 = 0;
        ij var10 = null;
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
                            var10 = var11;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var10 == null) {
                          var10 = new ij(var9, un.field_a.c(var9, (byte) 125));
                          var3.a((rk) (Object) var10, (byte) -112);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((sg) this).field_t[var28[var6]] = new cm(var29, var10);
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
              var6_ref = new kg(var27);
              var6_ref.field_n = 1;
              var7 = var6_ref.a((byte) 25);
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
            String var3 = null;
            int var4 = 0;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_7_0 = 0;
            int stackIn_14_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Confined.field_J ? 1 : 0;
                        if (!jc.field_g) {
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
                        try {
                            var2 = "tuhstatbut";
                            var4 = -38 % ((18 - param0) / 56);
                            var3 = (String) kf.a(114, "getcookies", param1);
                            var5 = ij.a(0, ';', var3);
                            var6 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 11;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if ((var7 ^ -1) > -1) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var2)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            var6++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2_ref = caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
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
                if (!tj.a(true)) {
                    r.a(lc.field_J, -1, 3);
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
