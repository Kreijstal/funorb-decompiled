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
        gh.field_k = false;
        u.field_i = false;
        if (kb.field_a != null) {
            if (kb.field_a.field_E) {
                var3 = 1;
                if (-9 == (param1 ^ -1)) {
                    if (!vg.field_o) {
                        param2 = ba.field_d;
                    } else {
                        param2 = vi.field_e;
                    }
                    param1 = 2;
                    ra.field_y.a((byte) 114, qg.field_c);
                }
                if (!(-11 != (param1 ^ -1))) {
                    pl.a(0);
                    var3 = 0;
                }
                if (var3 != 0) {
                    if (u.field_i) {
                        param2 = dh.a((byte) -73, new String[1], od.field_b);
                    }
                    if (pc.field_h) {
                        param2 = cb.field_a;
                    }
                    kb.field_a.a(param1, param2, -10);
                }
                if (-257 != (param1 ^ -1)) {
                    if (10 != param1) {
                        if (!vg.field_o) {
                            ra.field_y.a((byte) 121);
                        }
                    }
                }
            }
        }
        if (param0 >= -60) {
            field_n = null;
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
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            var7 = TrackController.field_F ? 1 : 0;
            if (wd.field_R) {
              return true;
            } else {
              L0: {
                if (param0 == 9819) {
                  break L0;
                } else {
                  af.d((byte) 51);
                  break L0;
                }
              }
              try {
                L1: {
                  var2 = "tuhstatbut";
                  var3 = (String) sj.a((byte) -29, "getcookies", param1);
                  var4 = te.a(var3, ';', (byte) -46);
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      break L1;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if (0 > var6) {
                          break L3;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            break L3;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0 != 0;
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (param1.getParameter("tuhstatbut") == null) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L5;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L5;
                }
              }
              return stackIn_17_0 != 0;
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
