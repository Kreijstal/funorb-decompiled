/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ib extends jm {
    static String[] field_v;
    static int field_r;
    static aj field_q;
    static kc field_s;
    static String field_t;
    static int field_u;
    static String field_p;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        lj.field_k = param2;
        u.field_l = param1;
        tm.field_b = param3;
        if (param4 < 92) {
            return;
        }
        mh.field_H = param0;
    }

    final static void a(int param0, int param1) {
        ab var2 = he.field_e;
        var2.b((byte) -79, param0);
        var2.f(1, (byte) -92);
        var2.f(param1, (byte) -32);
    }

    ib(int param0) {
        this(ia.field_c, param0);
    }

    public static void a(boolean param0) {
        if (!param0) {
          ib.a(127, -74);
          field_p = null;
          field_q = null;
          field_s = null;
          field_t = null;
          field_v = null;
          return;
        } else {
          field_p = null;
          field_q = null;
          field_s = null;
          field_t = null;
          field_v = null;
          return;
        }
    }

    final static boolean b(boolean param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) ch.field_a;
                    // monitorenter ch.field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (gn.field_b != vk.field_u) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        vn.field_d = v.field_p[vk.field_u];
                        ed.field_Bb = qa.field_i[vk.field_u];
                        vk.field_u = 1 + vk.field_u & 127;
                        if (!param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ib.a(false, -118);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static km a(int param0, String param1) {
        if (param0 == 2) {
          if (wn.field_z.a((byte) -94)) {
            if (param1.equals((Object) (Object) wn.field_z.a(true))) {
              return wn.field_z;
            } else {
              wn.field_z = nj.a(param1, -100);
              return wn.field_z;
            }
          } else {
            return wn.field_z;
          }
        } else {
          ib.a(false, 33);
          if (!wn.field_z.a((byte) -94)) {
            return wn.field_z;
          } else {
            L0: {
              if (!param1.equals((Object) (Object) wn.field_z.a(true))) {
                wn.field_z = nj.a(param1, -100);
                break L0;
              } else {
                break L0;
              }
            }
            return wn.field_z;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        if (pm.field_b != null) {
          if (pm.field_b.c(param0, (byte) 48)) {
            pm.field_b = null;
            if (param1 != 2) {
              ib.a(41, -89);
              return;
            } else {
              return;
            }
          } else {
            if (param1 != 2) {
              ib.a(41, -89);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != 2) {
            ib.a(41, -89);
            return;
          } else {
            return;
          }
        }
    }

    ib(dj param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        if (!(!param4)) {
            kh.a(param0.field_v, param0.field_n + param2, param3 - -param0.field_j, param0.field_k, 82);
        }
        this.a(param0, param1, param2, param3, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new aj(8, 0, 4, 1);
        field_p = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_t = "Create a free Account";
    }
}
