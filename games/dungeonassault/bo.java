/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends ok {
    static eh field_Lb;
    String field_Nb;
    static String field_Mb;
    String field_Hb;
    static cn field_Kb;
    static wm field_Jb;
    int field_Ib;
    static String[] field_Gb;

    final static void a(int param0, gn param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
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
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 == null) {
              return;
            } else {
              L1: {
                var4_int = param2;
                if (null != param1.field_b) {
                  int discarded$2 = ne.field_c.a(param1.field_b, param3 + 3, var4_int, 194, 0, 0, -1, 1, 0, ne.field_c.field_H);
                  var4_int = var4_int + param1.field_g;
                  var4_int += 7;
                  gf.b(param3, var4_int, 200, 0);
                  var4_int += 5;
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = jn.a(param1.field_f, new int[1], -65, (se) (Object) la.field_b);
              var4_int = var4_int + (5 + la.field_b.field_H);
              var6 = var5;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var6.length) {
                  break L0;
                } else {
                  var8 = var6[var7];
                  la.field_b.b(var8, param3 - -3, var4_int, 0, -1);
                  var4_int = var4_int + la.field_b.field_H;
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("bo.D(").append(5).append(',');
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
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    bo() {
        super(0L, (ok) null);
    }

    final static void h() {
        int var1 = 0;
        if (ec.field_k == null) {
          id.field_i = mk.a(3, (byte) 34);
          mi.field_e = mk.a(4, (byte) 34);
          int discarded$19 = 1;
          int discarded$20 = 0;
          int discarded$21 = 0;
          hj.field_Z = bg.a(true, 9);
          np.field_A = mk.a(10, (byte) 34);
          int discarded$22 = 1;
          int discarded$23 = 0;
          int discarded$24 = 0;
          kf.field_p = bg.a(true, 11);
          int discarded$25 = 1;
          int discarded$26 = 0;
          int discarded$27 = 0;
          sb.field_a = bg.a(true, 12);
          ia.field_W = mk.a(13, (byte) 34);
          ll.field_r = mk.a(14, (byte) 34);
          tl.field_k = mk.a(15, (byte) 34);
          bl.field_t = mk.a(16, (byte) 34);
          be.field_s = new wk(75);
          var1 = 17;
          be.field_s.a(sa.field_w, "basic", qk.field_c, uc.field_I, -108);
          be.field_s.a(sa.field_w, "lobby", qk.field_c, uc.field_I, -110);
          be.field_s.a(sa.field_w, "lobby", qk.field_c, gh.field_c, -83);
          be.field_s.a(qk.field_c, 237, sa.field_w, hj.field_Z);
          be.field_s.a(qk.field_c, 237, sa.field_w, sb.field_a);
          be.field_s.a(uc.field_L, 237, nb.field_b, kf.field_p);
          be.field_s.a(mp.field_c, "roman20", rf.field_L, uc.field_I, -109);
          be.field_s.a(mp.field_c, "roman20", rf.field_L, gh.field_c, -101);
          be.field_s.a(mp.field_c, "roman12", rf.field_L, uc.field_I, -93);
          be.field_s.a(mp.field_c, "roman12", rf.field_L, gh.field_c, -128);
          be.field_s.a(rf.field_L, 237, mp.field_c, np.field_A);
          be.field_s.a(wo.field_h, 237, rl.field_k, ia.field_W);
          be.field_s.a(wo.field_h, 237, rl.field_k, ll.field_r);
          be.field_s.a(id.field_f, 237, dg.field_P, tl.field_k);
          be.field_s.a(id.field_f, 237, dg.field_P, bl.field_t);
          be.field_s.a(fg.field_m, 237, kj.field_m, id.field_i);
          be.field_s.a(fg.field_m, 237, kj.field_m, mi.field_e);
          return;
        } else {
          int discarded$28 = 0;
          ec.a(ec.field_k);
          ec.field_k = null;
          nf.d(0);
          id.field_i = mk.a(3, (byte) 34);
          mi.field_e = mk.a(4, (byte) 34);
          int discarded$29 = 1;
          int discarded$30 = 0;
          int discarded$31 = 0;
          hj.field_Z = bg.a(true, 9);
          np.field_A = mk.a(10, (byte) 34);
          int discarded$32 = 1;
          int discarded$33 = 0;
          int discarded$34 = 0;
          kf.field_p = bg.a(true, 11);
          int discarded$35 = 1;
          int discarded$36 = 0;
          int discarded$37 = 0;
          sb.field_a = bg.a(true, 12);
          ia.field_W = mk.a(13, (byte) 34);
          ll.field_r = mk.a(14, (byte) 34);
          tl.field_k = mk.a(15, (byte) 34);
          bl.field_t = mk.a(16, (byte) 34);
          be.field_s = new wk(75);
          var1 = 17;
          be.field_s.a(sa.field_w, "basic", qk.field_c, uc.field_I, -108);
          be.field_s.a(sa.field_w, "lobby", qk.field_c, uc.field_I, -110);
          be.field_s.a(sa.field_w, "lobby", qk.field_c, gh.field_c, -83);
          be.field_s.a(qk.field_c, 237, sa.field_w, hj.field_Z);
          be.field_s.a(qk.field_c, 237, sa.field_w, sb.field_a);
          be.field_s.a(uc.field_L, 237, nb.field_b, kf.field_p);
          be.field_s.a(mp.field_c, "roman20", rf.field_L, uc.field_I, -109);
          be.field_s.a(mp.field_c, "roman20", rf.field_L, gh.field_c, -101);
          be.field_s.a(mp.field_c, "roman12", rf.field_L, uc.field_I, -93);
          be.field_s.a(mp.field_c, "roman12", rf.field_L, gh.field_c, -128);
          be.field_s.a(rf.field_L, 237, mp.field_c, np.field_A);
          be.field_s.a(wo.field_h, 237, rl.field_k, ia.field_W);
          be.field_s.a(wo.field_h, 237, rl.field_k, ll.field_r);
          be.field_s.a(id.field_f, 237, dg.field_P, tl.field_k);
          be.field_s.a(id.field_f, 237, dg.field_P, bl.field_t);
          be.field_s.a(fg.field_m, 237, kj.field_m, id.field_i);
          be.field_s.a(fg.field_m, 237, kj.field_m, mi.field_e);
          return;
        }
    }

    public static void c() {
        field_Lb = null;
        field_Mb = null;
        field_Kb = null;
        field_Gb = null;
        field_Jb = null;
    }

    final static void g() {
        mc.a((byte) 86, 8, gb.field_e);
        int discarded$6 = 0;
        if (!ve.a()) {
            mc.a((byte) 37, 1, in.field_B);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = "Zealot";
        field_Gb = new String[]{"Harden Raider", "The <%0> imbues another raider with the resilience of oak, doubling their <%defence> in the next room. (Single use)"};
    }
}
