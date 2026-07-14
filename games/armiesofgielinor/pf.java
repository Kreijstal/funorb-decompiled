/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String field_f;
    static int field_b;
    static String[] field_a;
    static int field_d;
    private String field_c;
    static String field_e;

    final static void a(byte param0) {
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!cd.c(9501)) {
          if (wq.field_a != null) {
            if (!wq.field_a.field_k) {
              return;
            } else {
              ck.b(-110);
              ee.field_v.a((kb) (Object) new ud(ee.field_v, mp.field_Mb), 0);
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$2 = ee.field_v.a(true, -6226, en.field_F, cl.field_s);
          ee.field_v.d((byte) -117);
          L0: while (true) {
            if (!jd.i((byte) 107)) {
              if (param0 < 10) {
                pf.a(29);
                return;
              } else {
                return;
              }
            } else {
              boolean discarded$3 = ee.field_v.a(rs.field_q, ui.field_i, 80);
              continue L0;
            }
          }
        }
    }

    final boolean a(byte param0, String param1) {
        if (param0 > -61) {
            field_d = 60;
            return ((pf) this).field_c.equals((Object) (Object) param1);
        }
        return ((pf) this).field_c.equals((Object) (Object) param1);
    }

    public static void b(byte param0) {
        Object var2 = null;
        field_e = null;
        if (param0 != -49) {
          var2 = null;
          Object discarded$2 = pf.a(-6, (byte[]) null, false);
          field_f = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static om a(int param0, byte param1, bv param2) {
        int var3 = 0;
        om var4 = null;
        var3 = -125 % ((param1 - -56) / 56);
        if (param0 == 0) {
          return null;
        } else {
          var4 = new om();
          no.a(param2, (uo) (Object) var4, param0, -24721);
          var4.a(true);
          return var4;
        }
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        cj var3 = null;
        Object var4 = null;
        if (param0 == 0) {
          if (param1 != null) {
            if (-137 > (param1.length ^ -1)) {
              var3 = new cj();
              ((mg) (Object) var3).a((byte) 126, param1);
              return (Object) (Object) var3;
            } else {
              if (param2) {
                return (Object) (Object) kj.a(param1, 31732);
              } else {
                return (Object) (Object) param1;
              }
            }
          } else {
            return null;
          }
        } else {
          var4 = null;
          Object discarded$5 = pf.a(113, (byte[]) null, true);
          if (param1 != null) {
            if (-137 > (param1.length ^ -1)) {
              var3 = new cj();
              ((mg) (Object) var3).a((byte) 126, param1);
              return (Object) (Object) var3;
            } else {
              if (param2) {
                return (Object) (Object) kj.a(param1, 31732);
              } else {
                return (Object) (Object) param1;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        tc.a(param1, ((pf) this).field_c, (byte) 29, "jagex-last-login-method", 31536000L);
        if (param0 != -137) {
            pf.a((byte) 95);
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -15291) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null == lf.field_q) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) lf.field_q;
                    // monitorenter lf.field_q
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        lf.field_q = null;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    pf(String param0) {
        ((pf) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Advertising websites";
        field_e = "Coat of Arms";
        field_a = new String[]{"Turn time (seconds)", "Map size", "Game length", "Map theme", "Game Type", "Trinket Limit"};
    }
}
