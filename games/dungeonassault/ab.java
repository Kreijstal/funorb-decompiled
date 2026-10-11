/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static String field_b;
    static long field_a;
    static int field_c;
    static String[] field_d;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        rj var3 = null;
        int var1_intLifetime1;
        var2 = DungeonAssault.field_K;
        try {
          if (id.field_l != null &&
            fc.field_d == uo.field_f.length - 1) {
            if (id.field_l != bl.field_l) {
              h.field_f = mf.a(16744448, id.field_l.field_x, 8, id.field_l.field_q, (byte) -124);
              bl.field_l = id.field_l;
            }
            var1_int = 32 - mo.field_a % 50 << 3;
            if (0 < var1_int) {
              h.field_f.b(id.field_l.field_t, id.field_l.field_i, var1_int);
            }
          }
          if (param0 != 0) {
            return;
          }
          dh.a(32, vf.field_w, wi.field_kb, qc.field_w);
          gf.a(ib.field_a);
          gf.e(vf.field_w, qc.field_w, vf.field_w + 200, wi.field_kb + qc.field_w + 3);
          if (-1 == ce.field_p) {
            bo.a(param0 ^ 5, gk.field_L, qc.field_w, vf.field_w);
          } else {
            if (!bl.field_k) {
              var1_intLifetime1 = fa.a((byte) 8, 0, -(20 + ui.field_a));
              if (gk.field_L == null) {
                var1_intLifetime1 = 0;
              }
              bo.a(5, jn.field_l, var1_intLifetime1 + qc.field_w, vf.field_w);
              bo.a(param0 ^ 5, gk.field_L, 20 + (qc.field_w + var1_intLifetime1 + ui.field_a), vf.field_w);
            } else {
              var1_intLifetime1 = fa.a((byte) -37, -(20 + hc.field_b), 0);
              if (null == gk.field_L) {
                var1_intLifetime1 = 0;
              }
              bo.a(param0 ^ 5, gk.field_L, var1_intLifetime1 + qc.field_w, vf.field_w);
              bo.a(5, jn.field_l, 20 + qc.field_w - (-var1_intLifetime1 - hc.field_b), vf.field_w);
            }
          }
          gf.b(ib.field_a);
          var3 = (rj) (pp.field_K.e(param0 ^ -24172));
          while (var3 != null) {
            var3.d(0);
            var3 = (rj) (pp.field_K.a(4));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "ab.B(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = DungeonAssault.field_K;
        try {
          if (param0 != -776726687) {
            ab.b(-127);
          }
          var3_int = 0;
          var4 = jm.field_c;
          while (go.field_A.length > var3_int) {
            var5 = to.field_c[var3_int];
            if (var5 >= 0) {
              var6 = og.a(true, go.field_A[var3_int], param0 ^ 776707894);
              var4 = var4 + ci.field_j;
              var7 = vo.field_r - (var6 >> 1);
              if (ec.a(var4, mj.field_g + (h.field_q << 1), param1, (oh.field_t << 1) + var6, -oh.field_t + var7, param2, 100)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (mj.field_g + ci.field_j + (h.field_q << 1));
            } else {
              var4 = var4 + ag.field_a;
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "ab.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 1781937827) {
          field_c = 85;
          field_b = null;
          field_d = null;
          return;
        }
        field_b = null;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte param0) {
        if (param0 != -97) {
          field_c = -77;
          return kc.field_U;
        }
        return kc.field_U;
    }

    static {
        field_b = "Steal gold: ";
        field_c = 0;
        field_d = new String[]{"Miner Disturbance", "Dr. Phlogiston Saves the Earth", "Crazy Crystals", "Hostile Spawn", "Pixelate", "Sol Knight", "Stellar Shard", "Wizard Run", "Arcanists", "Zombie Dawn"};
    }
}
