/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    byte[] field_c;
    int field_m;
    int field_j;
    int field_n;
    int field_b;
    int field_l;
    static qm field_k;
    int field_e;
    static String field_p;
    static String field_h;
    static int field_o;
    static String field_i;
    static int field_f;
    static int field_g;
    static int field_a;
    static int field_d;

    final static dh[] a(int param0, uf param1) {
        int var2 = 0;
        int var3 = 0;
        dh[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        dh var6 = null;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        var2 = param1.a(8, (byte) 80);
        if ((var2 ^ -1) >= -1) {
          L0: {
            if (param0 > 121) {
              break L0;
            } else {
              field_i = null;
              break L0;
            }
          }
          var3 = param1.a(12, (byte) 77);
          var4 = new dh[var3];
          var5 = 0;
          L1: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (wg.a(param1, (byte) 26)) {
                var6 = new dh();
                int discarded$6 = param1.a(24, (byte) 40);
                int discarded$7 = param1.a(24, (byte) 73);
                var6.field_a = param1.a(24, (byte) 42);
                int discarded$8 = param1.a(9, (byte) 98);
                int discarded$9 = param1.a(12, (byte) 77);
                int discarded$10 = param1.a(12, (byte) 86);
                int discarded$11 = param1.a(12, (byte) 108);
                var4[var5] = var6;
                var5++;
                continue L1;
              } else {
                var6_int = param1.a(ma.a(var5 + -1, (byte) 49), (byte) 118);
                var4[var5] = var4[var6_int];
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        if (!(null != pk.field_v)) {
            pk.field_v = new qn(ah.field_c, ed.field_d);
            ah.field_c.a((byte) -107, (ce) (Object) pk.field_v);
        }
        pk.field_v.a(param1, param2, 4210752, param3);
        hk.b();
        cg.a(true, param0 + 106);
        if (param0 != 12) {
            field_k = null;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_p = null;
        field_h = null;
        if (param0) {
            Object var2 = null;
            dh[] discarded$0 = rf.a(88, (uf) null);
        }
        field_k = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (null == ik.field_f) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) ik.field_f;
                    // monitorenter ik.field_f
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        ik.field_f = null;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
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

    final static void a(int param0, java.awt.Component param1) {
        if (param0 != 12) {
            Object var3 = null;
            rf.a(29, true, 0.5555365681648254f, (String) null);
        }
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) f.field_r);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) f.field_r);
        wi.field_b = -1;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == param0) {
            var2 = qk.field_i;
        }
        if (param1 == 1) {
            var2 = wh.field_d;
        }
        if (-3 == (param1 ^ -1)) {
            var2 = wl.field_o;
        }
        return var2;
    }

    final static void a(String[] args, int param1, int param2, int param3, int param4, java.applet.Applet param5) {
        int var7 = 0;
        int var8 = client.field_A ? 1 : 0;
        wf.field_n = param5.getParameter("overxgames");
        if (!(wf.field_n != null)) {
            wf.field_n = "0";
        }
        jm.field_u = param5.getParameter("overxachievements");
        if (param3 > -22) {
            field_i = null;
        }
        if (!(jm.field_u != null)) {
            jm.field_u = "0";
        }
        String var6 = param5.getParameter("currency");
        if (var6 == null) {
            rb.field_m = 2;
        } else {
            if (!be.a((byte) 98, (CharSequence) (Object) var6)) {
                rb.field_m = 2;
            } else {
                rb.field_m = cb.a((byte) -33, (CharSequence) (Object) var6);
            }
        }
        w.field_Fb = param2;
        o.field_d = param4;
        qn.field_lb = param1;
        vi.field_z = new ck[args.length];
        for (var7 = 0; var7 < args.length; var7++) {
            vi.field_z[var7] = new ck(317, 34);
        }
        dl.field_K = args;
    }

    rf(int param0) {
        ((rf) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new qm(14, 0, 4, 1);
        field_p = "Unpacking sound effects";
        field_i = "When you match pieces, the machine transforms them into solid shapes.";
        field_h = "Show game chat from my friends";
        field_a = 2;
        field_f = 0;
    }
}
