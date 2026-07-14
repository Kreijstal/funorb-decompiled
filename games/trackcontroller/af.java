/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends di {
    static String field_n;
    static kd field_o;
    private boolean field_p;
    private String field_m;

    public static void d(byte param0) {
        int var1 = -80 / ((0 - param0) / 46);
        field_n = null;
        field_o = null;
    }

    af(lb param0) {
        super(param0);
        ((af) this).field_p = false;
    }

    final ud a(int param0, String param1) {
        nj var3 = null;
        CharSequence var4 = null;
        ud stackIn_15_0 = null;
        ud stackOut_14_0 = null;
        ud stackOut_13_0 = null;
        var4 = (CharSequence) (Object) param1;
        if (!pl.a(43, var4)) {
          return ef.field_b;
        } else {
          if (param0 <= -106) {
            L0: {
              if (!param1.equals((Object) (Object) ((af) this).field_m)) {
                L1: {
                  var3 = kj.a(param1, 63);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (null == var3.field_c) {
                      ((af) this).field_m = param1;
                      ((af) this).field_p = var3.field_e;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                return tk.field_t;
              } else {
                break L0;
              }
            }
            L2: {
              if (((af) this).field_p) {
                stackOut_14_0 = TrackController.field_G;
                stackIn_15_0 = stackOut_14_0;
                break L2;
              } else {
                stackOut_13_0 = ef.field_b;
                stackIn_15_0 = stackOut_13_0;
                break L2;
              }
            }
            return stackIn_15_0;
          } else {
            return null;
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != -9) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(of.a(param0, var2, false), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3 = 0;
        L0: {
          gh.field_k = false;
          u.field_i = false;
          if (kb.field_a == null) {
            break L0;
          } else {
            if (!kb.field_a.field_E) {
              break L0;
            } else {
              L1: {
                var3 = 1;
                if (-9 != param1) {
                  break L1;
                } else {
                  L2: {
                    if (vg.field_o) {
                      param2 = vi.field_e;
                      break L2;
                    } else {
                      param2 = ba.field_d;
                      break L2;
                    }
                  }
                  param1 = 2;
                  ra.field_y.a((byte) 114, qg.field_c);
                  break L1;
                }
              }
              L3: {
                if (-11 == param1) {
                  pl.a(0);
                  var3 = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (var3 == 0) {
                if (-257 == param1) {
                  break L0;
                } else {
                  if (10 == param1) {
                    break L0;
                  } else {
                    if (vg.field_o) {
                      break L0;
                    } else {
                      ra.field_y.a((byte) 121);
                      break L0;
                    }
                  }
                }
              } else {
                if (-257 == param1) {
                  break L0;
                } else {
                  if (10 == param1) {
                    break L0;
                  } else {
                    if (vg.field_o) {
                      break L0;
                    } else {
                      ra.field_y.a((byte) 121);
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        L4: {
          if (param0 < -60) {
            break L4;
          } else {
            field_n = null;
            break L4;
          }
        }
    }

    final String a(String param0, int param1) {
        nj var4 = null;
        CharSequence var5 = (CharSequence) (Object) param0;
        String var3 = il.a(-67, var5);
        if (var3 != null) {
            return var3;
        }
        if (!(param0.equals((Object) (Object) ((af) this).field_m))) {
            var4 = kj.a(param0, 63);
            if (var4 == null) {
                return null;
            }
            if (var4.field_c != null) {
                return null;
            }
            ((af) this).field_m = param0;
            ((af) this).field_p = var4.field_e;
        }
        if (param1 != 426) {
            ((af) this).field_m = null;
        }
        if (!((af) this).field_p) {
            return ga.field_f;
        }
        return qk.field_K;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = TrackController.field_F ? 1 : 0;
                        if (wd.field_R) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        if (param0 == 9819) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        af.d((byte) 51);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) sj.a((byte) -29, "getcookies", param1);
                            var4 = te.a(var3, ';', (byte) -46);
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (param1.getParameter("tuhstatbut") == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
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

    final void a(boolean param0) {
        if (param0) {
            ((af) this).a(true);
        }
        ((af) this).field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Highscores";
        field_o = null;
    }
}
