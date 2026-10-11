/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static String[] field_c;
    static int[][][] field_d;
    static int field_a;
    static String field_e;
    static long field_b;

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (ee.field_o <= 0) {
          if (d.p(-110)) {
            var2 = 0;
            if (param1 != -27055) {
              ik.a(false);
            }
            if (tf.field_h != null) {
              return;
            }
            if (lc.field_j) {
              gj.a(param1 ^ 27054, var2, param0);
            }
            return;
          }
          var2 = 1;
        } else {
          if (tf.field_h == null) {
            gi.field_d = dd.a(0, sh.field_u, param1 + 27137, 640, 0, 480);
          } else {
            gi.field_d = tf.field_h.a((byte) -88);
            nb.a(2, true);
          }
          if (null == gi.field_d) {
            var2 = 3;
          } else {
            lk.a(gi.field_d, false);
            var2 = 2;
          }
        }
        if (param1 != -27055) {
          ik.a(false);
        }
        if (tf.field_h != null) {
          return;
        }
        if (lc.field_j) {
          gj.a(param1 ^ 27054, var2, param0);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = (int[][][]) null;
        field_e = null;
        if (param0) {
          return;
        }
        ik.a(true);
    }

    final static int a(byte param0, boolean param1) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          kk.field_i = kk.field_i + 65536;
          if (param0 != 76) {
            field_b = 6L;
          }
          while (65536 <= fj.a(1870096848, kk.field_i, eh.field_o)) {
            ub.field_h = ub.field_h + 1;
            kk.field_i = kk.field_i - eh.field_o;
          }
          var2_int = -1;
          if (gi.field_f == null) {
            if (null != ak.field_i) {
              var2_int = ak.field_i.length;
            }
          } else {
            var2_int = gi.field_f.length;
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (eh.field_m > ll.field_d) {
              ll.field_d = ll.field_d + 1;
              if (ll.field_d > eh.field_k && (null == gi.field_f ||
                gi.field_f[oi.field_j] == null)) {
                ll.field_d = ll.field_d - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ll.field_d >= eh.field_m &&
                  null == gi.field_f[(oi.field_j + 1) % var2_int]) {
                  ll.field_d = ll.field_d - 1;
                }
              }
            }
            if (ll.field_d >= eh.field_m) {
              p.field_b = oi.field_j;
              if (bh.field_r) {
                oi.field_j = oi.field_j + 1;
                if (var2_int <= oi.field_j) {
                  oi.field_j = oi.field_j - var2_int;
                }
              } else {
                oi.field_j = oi.field_j - 1;
                if (oi.field_j < 0) {
                  oi.field_j = oi.field_j + var2_int;
                }
              }
              ll.field_d = ll.field_d - eh.field_m;
            }
            if (ll.field_d > eh.field_k) {
              bh.field_r = true;
            }
          }
          if (le.field_e != null) {
            var3 = -(le.field_e.field_v / 2) + 357;
            var4 = 0;
            if (vb.field_n != 0 &&
              var3 < ci.field_m &&
              le.field_e.field_x + var3 > ci.field_m) {
              if (field_a > 269 - le.field_e.field_u &&
                field_a < 269) {
                bh.field_r = false;
                var4 = 1;
                ll.field_d = eh.field_m;
              }
              if (586 < field_a &&
                586 + le.field_e.field_u > field_a) {
                var4 = 1;
                bh.field_r = true;
                ll.field_d = eh.field_m;
              }
            }
            if (var4 == 0 &&
              ll.field_d > eh.field_k &&
              ph.field_d > var3 &&
              ph.field_d < var3 + le.field_e.field_x) {
              if (-le.field_e.field_u + 269 < kc.field_u &&
                269 > kc.field_u) {
                ll.field_d = eh.field_k;
              }
              if (kc.field_u > 586 &&
                586 + le.field_e.field_u > kc.field_u) {
                ll.field_d = eh.field_k;
              }
            }
          }
          if (param1) {
            of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
            if (of.field_c.c((byte) 49)) {
              if (of.field_c.field_j == 0) {
                stackIn_58_0 = 3;
                return stackIn_58_0;
              }
              if (1 == of.field_c.field_j) {
                stackIn_61_0 = 2;
                return stackIn_61_0;
              }
            }
            while (kj.e((byte) -44)) {
              of.field_c.a(0, 0);
              if (of.field_c.c((byte) 79)) {
                if (of.field_c.field_j == 0) {
                  stackIn_69_0 = 3;
                  return stackIn_69_0;
                }
                if (1 == of.field_c.field_j) {
                  stackIn_73_0 = 1;
                  return stackIn_73_0;
                }
              }
              if (13 != b.field_J) {
                continue;
              }
              stackIn_77_0 = 1;
              return stackIn_77_0;
            }
          }
          stackIn_79_0 = 0;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "ik.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_d = new int[][][]{new int[][]{new int[]{6, 6, 6}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}}, new int[][]{new int[]{6, 6, 6}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}}, new int[][]{new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}}, new int[][]{new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}}, new int[][]{new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}}, new int[][]{new int[]{8, 8, 8}, new int[]{18, 18, 18}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}}, new int[][]{new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{18, 18, 18}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}}, new int[][]{new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}}};
        field_a = 0;
        field_c = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = "Previous";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$b925f3f4834c(int param0, boolean param1) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          kk.field_i = kk.field_i + 65536;
          if (param0 != 76) {
            field_b = 6L;
          }
          while (65536 <= fj.a(1870096848, kk.field_i, eh.field_o)) {
            ub.field_h = ub.field_h + 1;
            kk.field_i = kk.field_i - eh.field_o;
          }
          var2_int = -1;
          if (gi.field_f == null) {
            if (null != ak.field_i) {
              var2_int = ak.field_i.length;
            }
          } else {
            var2_int = gi.field_f.length;
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (eh.field_m > ll.field_d) {
              ll.field_d = ll.field_d + 1;
              if (ll.field_d > eh.field_k && (null == gi.field_f ||
                gi.field_f[oi.field_j] == null)) {
                ll.field_d = ll.field_d - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ll.field_d >= eh.field_m &&
                  null == gi.field_f[(oi.field_j + 1) % var2_int]) {
                  ll.field_d = ll.field_d - 1;
                }
              }
            }
            if (ll.field_d >= eh.field_m) {
              p.field_b = oi.field_j;
              if (bh.field_r) {
                oi.field_j = oi.field_j + 1;
                if (var2_int <= oi.field_j) {
                  oi.field_j = oi.field_j - var2_int;
                }
              } else {
                oi.field_j = oi.field_j - 1;
                if (oi.field_j < 0) {
                  oi.field_j = oi.field_j + var2_int;
                }
              }
              ll.field_d = ll.field_d - eh.field_m;
            }
            if (ll.field_d > eh.field_k) {
              bh.field_r = true;
            }
          }
          if (le.field_e != null) {
            var3 = -(le.field_e.field_v / 2) + 357;
            var4 = 0;
            if (vb.field_n != 0 &&
              var3 < ci.field_m &&
              le.field_e.field_x + var3 > ci.field_m) {
              if (field_a > 269 - le.field_e.field_u &&
                field_a < 269) {
                bh.field_r = false;
                var4 = 1;
                ll.field_d = eh.field_m;
              }
              if (586 < field_a &&
                586 + le.field_e.field_u > field_a) {
                var4 = 1;
                bh.field_r = true;
                ll.field_d = eh.field_m;
              }
            }
            if (var4 == 0 &&
              ll.field_d > eh.field_k &&
              ph.field_d > var3 &&
              ph.field_d < var3 + le.field_e.field_x) {
              if (-le.field_e.field_u + 269 < kc.field_u &&
                269 > kc.field_u) {
                ll.field_d = eh.field_k;
              }
              if (kc.field_u > 586 &&
                586 + le.field_e.field_u > kc.field_u) {
                ll.field_d = eh.field_k;
              }
            }
          }
          if (param1) {
            of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
            if (of.field_c.c((byte) 49)) {
              if (of.field_c.field_j == 0) {
                stackIn_58_0 = 3;
                return stackIn_58_0;
              }
              if (1 == of.field_c.field_j) {
                stackIn_61_0 = 2;
                return stackIn_61_0;
              }
            }
            while (kj.e((byte) -44)) {
              of.field_c.a(0, 0);
              if (of.field_c.c((byte) 79)) {
                if (of.field_c.field_j == 0) {
                  stackIn_69_0 = 3;
                  return stackIn_69_0;
                }
                if (1 == of.field_c.field_j) {
                  stackIn_73_0 = 1;
                  return stackIn_73_0;
                }
              }
              if (13 != b.field_J) {
                continue;
              }
              stackIn_77_0 = 1;
              return stackIn_77_0;
            }
          }
          stackIn_79_0 = 0;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "ik.C(" + param0 + ',' + param1 + ')');
        }
    }
}
