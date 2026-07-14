/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    private static int[] field_a;
    static cn field_g;
    static String field_c;
    static ab field_e;
    static cn[] field_d;
    static int field_b;
    static String field_f;

    final static hh a(byte param0) {
        if (param0 > 25) {
          if (null == ne.field_b) {
            ne.field_b = new hh(ta.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, ta.field_e.field_H, -1, 2147483647, true);
            return ne.field_b;
          } else {
            return ne.field_b;
          }
        } else {
          field_d = null;
          if (null != ne.field_b) {
            return ne.field_b;
          } else {
            ne.field_b = new hh(ta.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, ta.field_e.field_H, -1, 2147483647, true);
            return ne.field_b;
          }
        }
    }

    final static void a(String param0, String[] param1, int param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = DungeonAssault.field_K;
        if (param3 <= -14) {
          wd.field_d = dh.field_b;
          if (param2 != 255) {
            if (param2 >= 100) {
              if (param2 <= 105) {
                var8 = param1;
                ok.a(2, var8);
                ll.field_p = em.a(param1, 8082);
                return;
              } else {
                ll.field_p = p.a(param2, param0, -28323);
                return;
              }
            } else {
              ll.field_p = p.a(param2, param0, -28323);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = -49;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (wk.field_g >= 13) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            ll.field_p = l.a((byte) stackIn_16_0, stackIn_16_1 != 0);
            var6 = null;
            ok.a(2, (String[]) null);
            return;
          }
        } else {
          hh discarded$1 = ri.a((byte) 7);
          wd.field_d = dh.field_b;
          if (param2 != 255) {
            if (param2 >= 100) {
              if (param2 <= 105) {
                var7 = param1;
                ok.a(2, var7);
                ll.field_p = em.a(param1, 8082);
                return;
              } else {
                ll.field_p = p.a(param2, param0, -28323);
                return;
              }
            } else {
              ll.field_p = p.a(param2, param0, -28323);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = -49;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (wk.field_g >= 13) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ll.field_p = l.a((byte) stackIn_5_0, stackIn_5_1 != 0);
            var6 = null;
            ok.a(2, (String[]) null);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 < 63) {
            return;
        }
        field_d = null;
        field_g = null;
        field_e = null;
        field_c = null;
    }

    final static void a(String param0, int param1) {
        Object var3 = null;
        jn.field_c = true;
        ip.field_j = param0.trim();
        oh.field_s = 10;
        if (param1 >= -64) {
          var3 = null;
          int discarded$2 = ri.a((byte) -116, (CharSequence) null);
          jm.a(-17573);
          return;
        } else {
          jm.a(-17573);
          return;
        }
    }

    final static int a(byte param0, CharSequence param1) {
        Object var3 = null;
        if (param0 <= 10) {
          var3 = null;
          ri.a((String) null, 93);
          return mm.a(param1, true, 10, 3703);
        } else {
          return mm.a(param1, true, 10, 3703);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Raider attacks.";
        field_a = wa.b(-1);
        int[] var1 = field_a;
        var1[0] = mp.a(var1[0], 67108864);
        int[] var2 = field_a;
        var2[0] = mp.a(var2[0], 134217728);
        int[] var3 = field_a;
        var3[1] = mp.a(var3[1], 4);
        int[] var4 = field_a;
        var4[1] = mp.a(var4[1], 16);
        int[] var5 = field_a;
        var5[1] = mp.a(var5[1], 32);
        int[] var6 = field_a;
        var6[1] = mp.a(var6[1], 128);
        int[] var7 = field_a;
        var7[1] = mp.a(var7[1], 256);
        int[] var8 = field_a;
        var8[1] = mp.a(var8[1], 512);
        field_e = new ab();
    }
}
