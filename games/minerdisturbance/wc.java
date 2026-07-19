/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc implements uj {
    static boolean field_b;
    static ea[][] field_c;
    static int[] field_a;
    static String field_d;

    final static boolean b(byte param0) {
        int var1 = -108 / ((-67 - param0) / 51);
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
        ea[] discarded$0 = null;
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
            discarded$0 = wc.a(-122);
        }
        ec.a((byte) 96);
        return var1;
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                    cl.a(param1, 0, 0, 310);
                    break L1;
                  }
                } else {
                  eh.d();
                  pd.a(10853, 320, 240);
                  cl.a(param1, 0, 0, 310);
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
                MinerDisturbance.a(qm.field_j, (byte) 36, k.g(-22962), var3_int != 0, te.a(-105));
                break L1;
              }
            }
            L3: {
              if (param0 == 240) {
                break L3;
              } else {
                field_d = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("wc.F(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    public final String a(byte param0) {
        int var2 = 98 % ((param0 - -33) / 62);
        return "Clear All Fluid";
    }

    final static void c(byte param0) {
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
                L2: {
                  if (param0 == -29) {
                    break L2;
                  } else {
                    field_a = (int[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var3 = mg.field_e[var2];
                ai.a(ta.field_d, var2 << 594636836, ta.field_d, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "wc.H(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        boolean discarded$0 = false;
        field_d = null;
        field_c = (ea[][]) null;
        if (param0 != 0) {
            discarded$0 = wc.b(false);
        }
        field_a = null;
    }

    final static boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return true;
    }

    static {
        field_a = new int[8192];
        field_c = new ea[2][];
        field_b = false;
        field_d = "This pre-dug shaft is a must-have for the lazy miner. Simply take the shortest route to the bottom of the volcano and beat your friends to the loot.";
    }
}
