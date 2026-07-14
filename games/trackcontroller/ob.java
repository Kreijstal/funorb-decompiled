/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends gb {
    static String field_v;
    static String field_o;
    static bc field_u;
    int[] field_r;
    static char[] field_q;
    private int[][] field_t;
    private String[] field_s;
    static String field_w;
    static String field_x;
    private int[] field_p;

    private final void a(be param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aa var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TrackController.field_F ? 1 : 0;
          if ((param1 ^ -1) == -2) {
            ((ob) this).field_s = te.a(param0.g(0), '<', (byte) -94);
            break L0;
          } else {
            if (2 != param1) {
              if (-4 == (param1 ^ -1)) {
                var4 = param0.h(16383);
                ((ob) this).field_p = new int[var4];
                ((ob) this).field_t = new int[var4][];
                var5 = 0;
                L1: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    var6 = param0.d((byte) -79);
                    var7 = dk.a(var6, (byte) 25);
                    if (var7 != null) {
                      ((ob) this).field_p[var5] = var6;
                      ((ob) this).field_t[var5] = new int[var7.field_b];
                      var8 = 0;
                      L2: while (true) {
                        if (var7.field_b > var8) {
                          ((ob) this).field_t[var5][var8] = param0.d((byte) -78);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              } else {
                if ((param1 ^ -1) != -5) {
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var4 = param0.h(16383);
              ((ob) this).field_r = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  ((ob) this).field_r[var5] = param0.d((byte) -66);
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
        L4: {
          if (!param2) {
            break L4;
          } else {
            ob.h(-53);
            break L4;
          }
        }
    }

    public static void c(byte param0) {
        field_x = null;
        field_w = null;
        field_u = null;
        field_o = null;
        if (param0 != -68) {
            field_q = null;
        }
        field_q = null;
        field_v = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        wd.field_R = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        if (param0 != 209) {
            field_w = null;
        }
        dh.a(var3, var4, param1, var2, 1000);
    }

    final String a(byte param0) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 != 2) {
            String discarded$0 = ((ob) this).a((byte) 10);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((ob) this).field_s == null) {
            return "";
        }
        StringBuilder discarded$1 = var5.append(((ob) this).field_s[0]);
        for (var3 = 1; var3 < ((ob) this).field_s.length; var3++) {
            StringBuilder discarded$2 = var2.append("...");
            StringBuilder discarded$3 = var5.append(((ob) this).field_s[var3]);
        }
        return var2.toString();
    }

    final void a(boolean param0, be param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        L1: while (true) {
          var3 = param1.h(16383);
          if (-1 != (var3 ^ -1)) {
            this.a(param1, var3, false);
            continue L1;
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, int param1, float param2, String param3) {
        if (param1 != 209) {
            return;
        }
        if (null == ib.field_e) {
            ib.field_e = new rk(gl.field_E, tk.field_r);
            gl.field_E.d((byte) -97, (al) (Object) ib.field_e);
        }
        ib.field_e.a(param3, (byte) 88, param0, param2);
        ll.a();
        lh.a(true, 66);
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        if (param0 != 32768) {
            field_u = null;
        }
        if (!(null == ((ob) this).field_r)) {
            for (var2 = 0; var2 < ((ob) this).field_r.length; var2++) {
                ((ob) this).field_r[var2] = ok.a(((ob) this).field_r[var2], 32768);
            }
        }
    }

    final static ve a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        ve var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = TrackController.field_F ? 1 : 0;
        if (null != ag.field_d) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var2 = -100 % ((-10 - param0) / 50);
              var7 = (CharSequence) (Object) param1;
              var3 = r.a(var7, -11133);
              if (var3 != null) {
                var4 = (ve) (Object) ag.field_d.a(-1, (long)var3.hashCode());
                L0: while (true) {
                  if (var4 != null) {
                    var8 = (CharSequence) (Object) var4.field_jb;
                    var5 = r.a(var8, -11133);
                    if (!var5.equals((Object) (Object) var3)) {
                      var4 = (ve) (Object) ag.field_d.a(-1);
                      continue L0;
                    } else {
                      return var4;
                    }
                  } else {
                    return null;
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
        } else {
          return null;
        }
    }

    final static boolean g(int param0) {
        if (param0 != -26998) {
            return false;
        }
        ka.field_a = true;
        rk.field_eb = qg.a(false) - -15000L;
        return rl.field_N == 11 ? true : false;
    }

    final static void h(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TrackController.field_F ? 1 : 0;
                    if (param0 == 16473) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    boolean discarded$3 = ob.g(-53);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) cj.field_o;
                    // monitorenter cj.field_o
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        mb.field_f = mb.field_f + 1;
                        lj.field_d = fc.field_d;
                        if (-1 >= (mg.field_f ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2 >= 112) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ni.field_m[var2] = false;
                        var2++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        mg.field_f = hb.field_f;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (hb.field_f == mg.field_f) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2 = md.field_b[hb.field_f];
                        hb.field_f = hb.field_f - -1 & 127;
                        if ((var2 ^ -1) > -1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ni.field_m[var2] = true;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ni.field_m[var2 ^ -1] = false;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fc.field_d = ri.field_V;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte param0, CharSequence param1) {
        if (param0 != 100) {
            return null;
        }
        String var2 = ue.a(vh.a((byte) -127, param1), (byte) 76);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    ob() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Please check if address is correct";
        field_o = "Level value <%0> + Time bonus <%1> = <%2>";
        field_x = "You have 1 unread message!";
        field_q = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_w = "Waiting for music";
    }
}
