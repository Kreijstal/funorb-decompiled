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
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var10 = rf.field_d;
              var2 = var10.f((byte) -87);
              var3 = var10.f((byte) -80);
              if (var2 == 0) {
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
                    if (var14.length << 2 < var5) {
                      var5 = var14.length << 2;
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
                      var6[var7 >> 2] = var6[var7 >> 2] + (var10.f((byte) -54) << (ec.a(var7, 3) << 8));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (var2 != 1) {
                  int discarded$1 = 94;
                  sj.a("LR1: " + ci.a(), -102, (Throwable) null);
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "na.B(" + true + ')');
        }
    }

    final int a(byte param0) {
        L0: {
          if (((na) this).field_g) {
            break L0;
          } else {
            L1: {
              if (((na) this).field_k != 2) {
                break L1;
              } else {
                if (0 < ((na) this).field_t) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (~nb.field_G != ~((na) this).field_j) {
              L2: {
                if (param0 == 58) {
                  break L2;
                } else {
                  ((na) this).field_k = 23;
                  break L2;
                }
              }
              if (qc.field_P != 2) {
                return 0;
              } else {
                if (pf.a(((na) this).field_p, param0 ^ -43)) {
                  return 1;
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -92) {
                break L1;
              } else {
                var3 = null;
                na.a((String) null, (byte) -75);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("na.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
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

    public static void a() {
        field_v = null;
        field_q = null;
        field_h = null;
        field_a = null;
        field_r = null;
        field_c = null;
        field_u = null;
    }

    final static boolean a(java.applet.Applet param0) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
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
                        var7 = SteelSentinels.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!sn.field_d) {
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
                            var3 = (String) hn.a(param0, (byte) -96, "getcookies");
                            var4 = ka.a(';', false, var3);
                            var5 = 0;
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
                            if (var5 >= var4.length) {
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
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
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
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
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
                            var5++;
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
                            if (null == param0.getParameter("tuhstatbut")) {
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
                        stackOut_17_1 = new StringBuilder().append("na.C(");
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param0 == null) {
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
                        throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 0 + ')');
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
        try {
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
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "na.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
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
