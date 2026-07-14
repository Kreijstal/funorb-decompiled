/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    int field_h;
    static volatile boolean field_a;
    static a field_b;
    int field_e;
    int field_k;
    int field_d;
    int field_c;
    static long field_g;
    static ll field_f;
    static int[] field_j;
    static int field_i;

    final static void a(byte param0, boolean param1, boolean param2) {
        Object var4 = null;
        if (param0 >= -87) {
          field_i = -67;
          var4 = null;
          pg.a(param1, (byte) 121, (String) null, param2);
          return;
        } else {
          var4 = null;
          pg.a(param1, (byte) 121, (String) null, param2);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_j = null;
        field_f = null;
        if (param0 >= -16) {
            cg.a((byte) 29, true, false);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        hj[] var5 = null;
        hj var6 = null;
        var5 = jc.field_h;
        var6 = ij.a(param3 + -8137, param2, var5, param4);
        if (param3 != 41) {
          cg.a(78, -110, -63, (byte) -36, 2);
          param0 = param0 - (var6.field_s + -param2 >> 2113942113);
          param1 = param1 - (var6.field_y + -param4 >> -256842175);
          var6.a(param0, param1);
          return;
        } else {
          param0 = param0 - (var6.field_s + -param2 >> 2113942113);
          param1 = param1 - (var6.field_y + -param4 >> -256842175);
          var6.a(param0, param1);
          return;
        }
    }

    final static boolean a(int param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2113942113) {
          L0: {
            field_f = null;
            if (ra.a(param1, 85) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ra.a(param1, 85) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
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
                    var1 = (Object) (Object) ic.field_d;
                    // monitorenter ic.field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        rd.field_f = u.field_R;
                        uf.field_a = uf.field_a + 1;
                        nc.field_g = in.field_f;
                        rf.field_X = g.field_m;
                        na.field_k = sd.field_a;
                        sd.field_a = false;
                        gg.field_J = mi.field_a;
                        lb.field_x = im.field_e;
                        jb.field_U = nl.field_f;
                        mi.field_a = 0;
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
                    if (param0 != 1983) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    field_j = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_f = new ll();
        field_i = 20;
        field_j = new int[8192];
    }
}
