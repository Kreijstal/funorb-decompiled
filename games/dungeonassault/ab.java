/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static String field_b;
    static long field_a;
    static int field_c;
    static String[] field_d;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        rj var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (id.field_l == null) {
                break L1;
              } else {
                if (fc.field_d != uo.field_f.length + -1) {
                  break L1;
                } else {
                  L2: {
                    if (id.field_l == bl.field_l) {
                      break L2;
                    } else {
                      h.field_f = mf.a(16744448, id.field_l.field_x, 8, id.field_l.field_q, (byte) -124);
                      bl.field_l = id.field_l;
                      break L2;
                    }
                  }
                  var1_int = 32 - mo.field_a % 50 << 3;
                  if (0 < var1_int) {
                    h.field_f.b(id.field_l.field_t, id.field_l.field_i, var1_int);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              dh.a(32, vf.field_w, wi.field_kb, qc.field_w);
              gf.a(ib.field_a);
              gf.e(vf.field_w, qc.field_w, vf.field_w + 200, wi.field_kb + qc.field_w - -3);
              if (-1 == ce.field_p) {
                bo.a(5, gk.field_L, qc.field_w, vf.field_w);
                break L3;
              } else {
                if (!bl.field_k) {
                  L4: {
                    var1_int = fa.a((byte) 8, 0, -(20 + ui.field_a));
                    if (gk.field_L == null) {
                      var1_int = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  bo.a(5, jn.field_l, var1_int + qc.field_w, vf.field_w);
                  bo.a(5, gk.field_L, 20 + (qc.field_w + var1_int + ui.field_a), vf.field_w);
                  break L3;
                } else {
                  L5: {
                    var1_int = fa.a((byte) -37, -(20 + hc.field_b), 0);
                    if (null == gk.field_L) {
                      var1_int = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  bo.a(5, gk.field_L, var1_int + qc.field_w, vf.field_w);
                  bo.a(5, jn.field_l, 20 + qc.field_w - (-var1_int - hc.field_b), vf.field_w);
                  break L3;
                }
              }
            }
            gf.b(ib.field_a);
            var3 = (rj) (Object) pp.field_K.e(-24172);
            L6: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.d(0);
                var3 = (rj) (Object) pp.field_K.a(4);
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ab.B(" + 0 + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_7_0 = 0;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var3_int = 0;
            var4 = jm.field_c;
            L1: while (true) {
              if (go.field_A.length <= var3_int) {
                stackOut_14_0 = -1;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L2: {
                  var5 = to.field_c[var3_int];
                  if (var5 >= 0) {
                    int discarded$26 = -30633;
                    var6 = og.a(true, go.field_A[var3_int]);
                    var4 = var4 + ci.field_j;
                    var7 = vo.field_r + -(var6 >> 1);
                    if (ec.a(var4, mj.field_g + (h.field_q << 1), param1, (oh.field_t << 1) + var6, -oh.field_t + var7, param2, 100)) {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      var4 = var4 + (mj.field_g + ci.field_j + (h.field_q << 1));
                      var3_int++;
                      break L2;
                    }
                  } else {
                    var4 = var4 + ag.field_a;
                    var3_int++;
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "ab.C(" + -776726687 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_15_0;
    }

    public static void b() {
        field_b = null;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a() {
        return kc.field_U;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Steal gold: ";
        field_c = 0;
        field_d = new String[]{"Miner Disturbance", "Dr. Phlogiston Saves the Earth", "Crazy Crystals", "Hostile Spawn", "Pixelate", "Sol Knight", "Stellar Shard", "Wizard Run", "Arcanists", "Zombie Dawn"};
    }
}
