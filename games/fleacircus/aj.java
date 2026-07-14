/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends pa {
    static dd[] field_t;
    static String field_x;
    private int[] field_u;
    private int[][] field_s;
    private String[] field_y;
    static long field_w;
    static dd field_v;
    static int field_q;
    int[] field_z;
    static String field_r;

    private final void a(ni param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fh var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        if (param2 == 4) {
          L0: {
            if ((param1 ^ -1) != -2) {
              if (param1 == 2) {
                var4 = param0.e(false);
                ((aj) this).field_z = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    ((aj) this).field_z[var5] = param0.d((byte) -122);
                    var5++;
                    continue L1;
                  }
                }
              } else {
                if (param1 == 3) {
                  var4 = param0.e(false);
                  ((aj) this).field_s = new int[var4][];
                  ((aj) this).field_u = new int[var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var4 <= var5) {
                      break L0;
                    } else {
                      var6 = param0.d((byte) -75);
                      var7 = ql.a(param2 ^ -22467, var6);
                      if (var7 != null) {
                        ((aj) this).field_u[var5] = var6;
                        ((aj) this).field_s[var5] = new int[var7.field_c];
                        var8 = 0;
                        L3: while (true) {
                          if (var7.field_c > var8) {
                            ((aj) this).field_s[var5][var8] = param0.d((byte) -73);
                            var8++;
                            continue L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if (param1 == 4) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              ((aj) this).field_y = m.a('<', 123, param0.h(0));
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 != 0) {
            return;
        }
        ea.a(120, (java.awt.Component) (Object) param1);
        il.a(false, (java.awt.Component) (Object) param1);
        if (null != ui.field_pb) {
            ui.field_pb.a(0, (java.awt.Component) (Object) param1);
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (!(((aj) this).field_y != null)) {
            return "";
        }
        if (param0 < 74) {
            Object var5 = null;
            ve discarded$0 = aj.a((String) null, 106);
        }
        StringBuilder discarded$1 = var6.append(((aj) this).field_y[0]);
        for (var3 = 1; ((aj) this).field_y.length > var3; var3++) {
            StringBuilder discarded$2 = var2.append("...");
            StringBuilder discarded$3 = var6.append(((aj) this).field_y[var3]);
        }
        return var2.toString();
    }

    final static void a(byte param0, Object param1, ce param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        if (param2.field_a == null) {
          return;
        } else {
          L0: {
            if (param0 == -60) {
              break L0;
            } else {
              field_x = null;
              break L0;
            }
          }
          var3_int = 0;
          L1: while (true) {
            L2: {
              if (-51 >= (var3_int ^ -1)) {
                break L2;
              } else {
                if (null == param2.field_a.peekEvent()) {
                  break L2;
                } else {
                  vh.a(1L, 49);
                  var3_int++;
                  continue L1;
                }
              }
            }
            try {
              L3: {
                if (param1 != null) {
                  param2.field_a.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                  break L3;
                } else {
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) sg.field_i;
                    // monitorenter sg.field_i
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        kc.field_f = lk.field_J;
                        m.field_a = m.field_a + 1;
                        ag.field_f = gd.field_a;
                        kc.field_b = vf.field_p;
                        pl.field_c = ag.field_a;
                        ag.field_a = false;
                        jk.field_r = vk.field_O;
                        pb.field_d = fb.field_b;
                        ob.field_e = th.field_s;
                        vk.field_O = 0;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var2;
                }
                case 5: {
                    if (param0 == 28003) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_x = null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(ni param0, int param1) {
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        if (param1 != 4) {
            return;
        }
        while (true) {
            var3 = param0.e(false);
            if (-1 == (var3 ^ -1)) {
                break;
            }
            this.a(param0, var3, 4);
        }
    }

    final static String a(CharSequence[] param0, int param1, byte param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = fleas.field_A ? 1 : 0;
        if (-1 != (param3 ^ -1)) {
          if (1 == param3) {
            var10 = param0[param1];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            L0: {
              var4 = param1 + param3;
              if (param2 < -75) {
                break L0;
              } else {
                field_w = -65L;
                break L0;
              }
            }
            var5 = 0;
            var6_int = param1;
            L1: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param1;
                L2: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param0[var7];
                    if (var8 != null) {
                      StringBuilder discarded$2 = var6.append(var8);
                      var7++;
                      continue L2;
                    } else {
                      StringBuilder discarded$3 = var6.append("null");
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param0[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L1;
                } else {
                  var5 += 4;
                  var6_int++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_r = null;
        field_x = null;
        int var1 = 34 % ((-22 - param0) / 33);
        field_v = null;
    }

    final static ve a(String param0, int param1) {
        if (uc.field_c.a(-48)) {
            if (!(param0.equals((Object) (Object) uc.field_c.c(param1 + -16954)))) {
                uc.field_c = pk.a((byte) 68, param0);
            }
        }
        if (param1 != -1) {
            Object var3 = null;
            aj.a((byte) -26, (Object) null, (ce) null);
        }
        return uc.field_c;
    }

    aj() {
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        if (null != ((aj) this).field_z) {
            for (var2 = 0; ((aj) this).field_z.length > var2; var2++) {
                ((aj) this).field_z[var2] = ne.a(((aj) this).field_z[var2], 32768);
            }
        }
        if (param0 != 0) {
            aj.g(-113);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_r = "Email address is unavailable";
    }
}
