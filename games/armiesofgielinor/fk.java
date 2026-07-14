/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk implements kh {
    static String field_a;
    static String field_g;
    static String field_f;
    private gh field_c;
    static int field_b;
    static int[][] field_d;
    static String field_e;

    public static void a(boolean param0) {
        field_g = null;
        field_e = null;
        field_a = null;
        field_d = null;
        if (!param0) {
            field_f = null;
        }
        field_f = null;
    }

    final static wk[] a(String param0, byte param1, kl param2, String param3) {
        if (param1 > -123) {
            Object var6 = null;
            byte[] discarded$0 = fk.a(false, (String) null);
        }
        int var4 = param2.a(param3, 110);
        int var5 = param2.a((byte) -72, var4, param0);
        return cb.a(false, param2, var4, var5);
    }

    final static og a(es param0, int param1) throws ef {
        og var4 = null;
        og var5 = null;
        og var6 = null;
        if (param1 < -7) {
          L0: {
            var4 = param0.a((byte) 13);
            if (iu.field_x == var4.field_q) {
              break L0;
            } else {
              if (hf.field_h == var4.field_q) {
                break L0;
              } else {
                if (var4.field_q == gg.field_G) {
                  break L0;
                } else {
                  if (var4.field_q != gb.field_z) {
                    if (rn.field_c != var4.field_q) {
                      throw new ef(var4.field_s);
                    } else {
                      if (param0.a(126)) {
                        throw new ef(var4.field_s);
                      } else {
                        var5 = param0.a((byte) 13);
                        if (mo.field_j != var5.field_q) {
                          throw new ef(var5.field_s);
                        } else {
                          var4.field_k = new at();
                          L1: while (true) {
                            if (param0.a(127)) {
                              throw new ef(var4.field_s);
                            } else {
                              if (param0.a((byte) 13).field_q != gm.field_d) {
                                param0.field_a = param0.field_a - 1;
                                var4.field_k.a((byte) -119, (tc) (Object) fk.a(param0, -32));
                                if (param0.a(127)) {
                                  throw new ef(var4.field_s);
                                } else {
                                  var6 = param0.a((byte) 13);
                                  if (gm.field_d != var6.field_q) {
                                    if (var6.field_q != sb.field_d) {
                                      throw new ef(var6.field_s);
                                    } else {
                                      continue L1;
                                    }
                                  } else {
                                    return var4;
                                  }
                                }
                              } else {
                                return var4;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          return var4;
        } else {
          return null;
        }
    }

    fk(gh param0) {
        ((fk) this).field_c = param0;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        Object var11 = null;
        L0: {
          if (param2 <= -79) {
            break L0;
          } else {
            var11 = null;
            String discarded$1 = fk.a((byte) -28, (java.applet.Applet) null, (String) null);
            break L0;
          }
        }
        L1: {
          var6 = param1 - -param0.field_B;
          var7 = param4 - -param0.field_p;
          qq.a(param0.field_l, var6, param0.field_w, -127, var7);
          if (!param0.a(false)) {
            break L1;
          } else {
            na.c(-4 + param0.field_l, 2 + var6, -67, param0.field_w + -4, 2 + var7);
            break L1;
          }
        }
        L2: {
          qn.f(var6, var7, var6 - -param0.field_l - 2, param0.field_w + var7);
          var8 = ((fk) this).field_c.field_O.j(-6508);
          if (var8 == null) {
            break L2;
          } else {
            var9 = var8.toString();
            ((fk) this).field_c.field_K.b(var9, 2 + var6, -1 + var7 + (param0.field_w + ((fk) this).field_c.field_K.field_H >> -408892703), 10000536, -1);
            if (!((fk) this).field_c.a(false)) {
              break L2;
            } else {
              if (var9.startsWith(((fk) this).field_c.field_I)) {
                var10 = ((fk) this).field_c.field_K.a(((fk) this).field_c.field_I);
                qn.b(var6 - -2, 2 + var7, var10, -4 + param0.field_w, 2188450, 100);
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        qn.a();
    }

    final static byte[] a(boolean param0, String param1) {
        if (param0) {
            return null;
        }
        return sb.field_e.a(param1, 74, "");
    }

    final static bq[] a(int param0, bv param1) {
        int var2 = 0;
        int var3 = 0;
        bq[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        bq var6 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param1.g(114, 8);
        if (var2 <= 0) {
          var3 = param1.g(55, param0);
          var4 = new bq[var3];
          var5 = 0;
          L0: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (vq.a(param1, -2)) {
                var6 = new bq();
                int discarded$6 = param1.g(60, 24);
                int discarded$7 = param1.g(-107, 24);
                var6.field_e = param1.g(-115, 24);
                int discarded$8 = param1.g(param0 + -127, 9);
                int discarded$9 = param1.g(-105, 12);
                int discarded$10 = param1.g(44, 12);
                int discarded$11 = param1.g(125, 12);
                var4[var5] = var6;
                var5++;
                continue L0;
              } else {
                var6_int = param1.g(82, cu.a(3, var5 - 1));
                var4[var5] = var4[var6_int];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static String a(byte param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Object stackOut_2_0 = null;
            String stackOut_8_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) lj.a("getcookies", (byte) -105, param1);
                            if (param0 >= 76) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var4 = dj.a(97, ';', var3);
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
                            if (var4.length <= var5) {
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
                            if ((var6 ^ -1) > -1) {
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
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
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
                            stackOut_8_0 = var4[var5].substring(var6 - -1).trim();
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
                        return (String) (Object) stackIn_9_0;
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
                        var3_ref = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        return null;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This game has been updated! Please reload this page.";
        field_g = "Players";
        field_a = "No";
        field_d = new int[][]{new int[8], new int[8], new int[8], new int[8], new int[8], new int[8], new int[8], new int[8]};
        field_e = "Find opponent";
    }
}
