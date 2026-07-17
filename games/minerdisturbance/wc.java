/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc implements uj {
    static boolean field_b;
    static ea[][] field_c;
    static int[] field_a;
    static String field_d;

    final static boolean b() {
        int var1 = 36;
        return !wm.field_f.a(0) ? true : false;
    }

    public final void a(boolean param0) {
        if (param0) {
            field_b = true;
        }
        tb.field_a = 3;
        ha.field_e = 0;
    }

    final static ea[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = MinerDisturbance.field_ab;
        ea[] var1 = new ea[sc.field_d];
        for (var2 = 0; sc.field_d > var2; var2++) {
            var3 = ng.field_e[var2] * qk.field_b[var2];
            var4 = db.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = af.field_p[c.a((int) var4[var6], 255)];
            }
            var1[var2] = new ea(pf.field_c, wd.field_a, bg.field_d[var2], oc.field_e[var2], qk.field_b[var2], ng.field_e[var2], var5);
        }
        if (param0 > -27) {
            ea[] discarded$0 = wc.a(-122);
        }
        ec.a((byte) 96);
        return var1;
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (af.field_u >= 10) {
                if (fe.j(-63)) {
                  if (fh.field_b != 0) {
                    mf.a(-752960408, param1);
                    break L1;
                  } else {
                    g.a(false, -47, param2);
                    int discarded$14 = 310;
                    int discarded$15 = 0;
                    int discarded$16 = 0;
                    cl.a(param1);
                    break L1;
                  }
                } else {
                  eh.d();
                  pd.a(10853, 320, 240);
                  int discarded$17 = 310;
                  int discarded$18 = 0;
                  int discarded$19 = 0;
                  cl.a(param1);
                  break L1;
                }
              } else {
                L2: {
                  var3_int = 0;
                  if (!bh.field_cb) {
                    break L2;
                  } else {
                    bh.field_cb = false;
                    var3_int = 1;
                    break L2;
                  }
                }
                int discarded$20 = -105;
                MinerDisturbance.a(qm.field_j, (byte) 36, k.g(-22962), var3_int != 0, te.a());
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("wc.F(").append(240).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    public final String a(byte param0) {
        int var2 = 98 % ((param0 - -33) / 62);
        return "Clear All Fluid";
    }

    final static void c() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1_int = mg.field_e[0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= mg.field_e.length) {
                break L0;
              } else {
                var3 = mg.field_e[var2];
                ai.a(ta.field_d, var2 << 4, ta.field_d, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "wc.H(" + -29 + 41);
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static boolean b(boolean param0) {
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_c = new ea[2][];
        field_b = false;
        field_d = "This pre-dug shaft is a must-have for the lazy miner. Simply take the shortest route to the bottom of the volcano and beat your friends to the loot.";
    }
}
