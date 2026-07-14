/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ug {
    int field_e;
    static String field_j;
    static int field_f;
    static int field_i;
    byte[] field_g;
    static int field_h;

    final static void f(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (mb.field_e.a((byte) -117) != null) {
          var1 = qc.field_N;
          if (var1 == 0) {
            em.field_B = em.field_B - 1;
            if (-ii.field_B + -10 + 480 >= em.field_B) {
              qc.field_N = 1;
              s.field_O = 0;
              if (param0 <= 125) {
                mk.a(99);
                return;
              } else {
                return;
              }
            } else {
              if (param0 <= 125) {
                mk.a(99);
                return;
              } else {
                return;
              }
            }
          } else {
            if (-2 == var1) {
              s.field_O = s.field_O + 1;
              if (s.field_O > 150) {
                qc.field_N = 2;
                if (param0 <= 125) {
                  mk.a(99);
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 <= 125) {
                  mk.a(99);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (-3 == var1) {
                em.field_B = em.field_B + 1;
                if (480 >= em.field_B) {
                  if (param0 <= 125) {
                    mk.a(99);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ug discarded$1 = mb.field_e.d(4011);
                  ke.b(8192);
                  if (param0 <= 125) {
                    mk.a(99);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 <= 125) {
                  mk.a(99);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param0 <= 125) {
            mk.a(99);
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 8134) {
            return;
        }
        field_j = null;
    }

    final static String e(int param0) {
        if (param0 != 0) {
            return null;
        }
        if (!(cf.field_b != ch.field_d)) {
            return ac.field_c;
        }
        return wk.field_d;
    }

    private mk() throws Throwable {
        throw new Error();
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        if ((param0 ^ -1L) < -1L) {
          if (-6582952005840035282L < (param0 ^ -1L)) {
            if (0L != param0 % 37L) {
              if (param1 != 480) {
                String discarded$5 = mk.e(-14);
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  if (0L == var4) {
                    var12 = new StringBuilder(var3);
                    L1: while (true) {
                      if (param0 == 0L) {
                        StringBuilder discarded$6 = var12.reverse();
                        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                        return var12.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = sc.field_a[(int)(-(param0 * 37L) + var7)];
                          if (var9 == 95) {
                            var10 = -1 + var12.length();
                            var9 = 160;
                            var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        StringBuilder discarded$7 = var12.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    continue L0;
                  }
                }
              } else {
                var3 = 0;
                var4 = param0;
                L3: while (true) {
                  if (0L == var4) {
                    var13 = new StringBuilder(var3);
                    L4: while (true) {
                      if (param0 == 0L) {
                        StringBuilder discarded$8 = var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L5: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = sc.field_a[(int)(-(param0 * 37L) + var7)];
                          if (var9 == 95) {
                            var10 = -1 + var13.length();
                            var9 = 160;
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        StringBuilder discarded$9 = var13.append(var9);
                        continue L4;
                      }
                    }
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    continue L3;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            Throwable throwable = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        kd.field_e = param0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = param2.getParameter("cookieprefix");
                            var5 = var3;
                            var5 = var3;
                            var4 = param2.getParameter("cookiehost");
                            var5 = var4;
                            var5 = var4;
                            var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                            if (0 != param0.length()) {
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
                            var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
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
                            mf.a(true, param2, "document.cookie=\"" + var5 + "\"");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        throwable = caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param1 != -5) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        tf.a((byte) -85, param2);
                        return;
                    }
                    case 8: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Welcome to Monkey Puzzle 2. To read these instructions in-game, press <img=4> and select 'Instructions' from the pause menu.<br><br><shad=6767667>Story<br></shad>Deep in the jungle, the great explorer, Farnsworth, is up some creek without a paddle. The waters are rising and the locals will only throw him a line if he gets rid of the monkeys from the branches above. Fortunately, he has a catapult, lots of nuts and a good eye for monkey-hide.<br><br><shad=6767667>Controls<br></shad>Use the <img=0> and <img=1> keys to aim. Press the <img=3> bar or <img=5> to fire coconuts.";
    }
}
