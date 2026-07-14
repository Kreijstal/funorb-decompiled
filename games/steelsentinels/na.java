/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    int field_w;
    String field_d;
    String field_s;
    int field_e;
    int field_k;
    String field_o;
    static String field_v;
    static gk field_a;
    gh field_m;
    int[] field_l;
    int field_t;
    boolean field_g;
    static int field_b;
    static String field_c;
    long field_j;
    int field_n;
    String field_p;
    static String field_q;
    static String field_u;
    static int field_i;
    static String field_h;
    static String field_r;
    static long field_f;

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        ob var4 = null;
        int var4_int = 0;
        rn var5_ref_rn = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        kj var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var8 = SteelSentinels.field_G;
          if (param0) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          var10 = rf.field_d;
          var2 = var10.f((byte) -87);
          var3 = var10.f((byte) -80);
          if (-1 == (var2 ^ -1)) {
            var4 = (ob) (Object) ti.field_z.e(13058);
            if (var4 == null) {
              pm.m(123);
              return;
            } else {
              L2: {
                var5 = jg.field_f + -var10.field_p;
                var14 = var4.field_p;
                var13 = var14;
                var12 = var13;
                var11 = var12;
                var6 = var11;
                if (var14.length << 1948583266 < var5) {
                  var5 = var14.length << -83354878;
                  break L2;
                } else {
                  break L2;
                }
              }
              var7 = 0;
              L3: while (true) {
                if (var7 >= var5) {
                  var4.b(4);
                  break L1;
                } else {
                  var6[var7 >> -2062761950] = var6[var7 >> -2062761950] + (var10.f((byte) -54) << (ec.a(var7, 3) << -1384265784));
                  var7++;
                  continue L3;
                }
              }
            }
          } else {
            if (var2 != 1) {
              sj.a("LR1: " + ci.a((byte) 94), -102, (Throwable) null);
              pm.m(83);
              break L1;
            } else {
              var4_int = var10.f(27);
              var5_ref_rn = (rn) (Object) sn.field_r.e(13058);
              L4: while (true) {
                L5: {
                  if (var5_ref_rn == null) {
                    break L5;
                  } else {
                    L6: {
                      if (var5_ref_rn.field_p != var3) {
                        break L6;
                      } else {
                        if (var4_int == var5_ref_rn.field_x) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var5_ref_rn = (rn) (Object) sn.field_r.a((byte) -26);
                    continue L4;
                  }
                }
                if (var5_ref_rn != null) {
                  var5_ref_rn.b(4);
                  break L1;
                } else {
                  pm.m(73);
                  return;
                }
              }
            }
          }
        }
    }

    final int a(byte param0) {
        if (!((na) this).field_g) {
            // if_icmpne L28
            // if_icmplt L26
        } else {
            return 2;
        }
        if ((nb.field_G ^ -1L) == (((na) this).field_j ^ -1L)) {
            return 1;
        }
        if (param0 != 58) {
            ((na) this).field_k = 23;
        }
        if (-3 == (qc.field_P ^ -1)) {
            if (!pf.a(((na) this).field_p, param0 ^ -43)) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    final static void a(String param0, byte param1) {
        if (param1 >= -92) {
            Object var3 = null;
            na.a((String) null, (byte) -75);
        }
    }

    final static void a(byte param0, int param1, int param2) {
        if (param0 > -39) {
            field_q = null;
        }
        kj var3 = mm.field_g;
        var3.a(param1, (byte) -117);
        var3.a((byte) 120, 3);
        var3.a((byte) 110, 9);
        var3.d(param2, 47);
    }

    public static void a(int param0) {
        field_v = null;
        field_q = null;
        field_h = null;
        field_a = null;
        if (param0 != 2) {
            Object var2 = null;
            boolean discarded$0 = na.a((java.applet.Applet) null, -9);
        }
        field_r = null;
        field_c = null;
        field_u = null;
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
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
                        var7 = SteelSentinels.field_G;
                        if (!sn.field_d) {
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
                            var3 = (String) hn.a(param0, (byte) -96, "getcookies");
                            var4 = ka.a(';', false, var3);
                            var5 = param1;
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
                            if (var5 >= var4.length) {
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
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
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
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
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
                            var5++;
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
                        if (null == param0.getParameter("tuhstatbut")) {
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

    na(boolean param0) {
        ((na) this).field_p = jk.field_e;
        ((na) this).field_d = b.field_g;
        ((na) this).field_t = be.field_b;
        ((na) this).field_w = dk.field_a;
        ((na) this).field_e = gd.field_lb;
        ((na) this).field_s = uj.field_a;
        ((na) this).field_k = m.field_a;
        ((na) this).field_j = ni.field_d;
        ((na) this).field_o = bg.field_F;
        if (param0) {
            ((na) this).field_l = bc.field_ob;
        } else {
            ((na) this).field_l = null;
        }
        ((na) this).field_g = oh.field_e;
        ((na) this).field_n = t.field_k;
    }

    na(int param0, String param1, int param2, String param3, String param4) {
        ((na) this).field_n = 0;
        ((na) this).field_j = 0L;
        ((na) this).field_o = param4;
        ((na) this).field_s = param3;
        ((na) this).field_l = null;
        ((na) this).field_w = 0;
        ((na) this).field_g = true;
        ((na) this).field_p = param1;
        ((na) this).field_t = 0;
        ((na) this).field_k = param0;
        ((na) this).field_e = param2;
        ((na) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 51;
        field_v = "You are not currently logged in to the game.";
        field_c = "You are now cleared for use with the following items:";
        field_q = "Mouse over an icon for details";
        field_u = "Test Field";
        field_a = new gk(1, 1, 1);
        field_h = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_r = "RuneScape clan";
    }
}
