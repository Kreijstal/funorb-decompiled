/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static String field_c;
    static cm field_a;
    static String field_e;
    static String field_d;
    static String field_b;
    static String field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_f = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != 0) {
          int[] var2 = (int[]) null;
          rj.a(26, (int[]) null);
        }
    }

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ra var4_ref_ra = null;
        int var4 = 0;
        ra var5 = null;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        try {
          if (od.field_g != mh.field_a) {
            return false;
          }
          var2_long = ll.a(param0 ^ -1491051318);
          if (eh.field_d != 0 &&
            fg.field_d < 0) {
            var4_ref_ra = (ra) (am.field_F.d(9272));
            if (var4_ref_ra != null &&
              var4_ref_ra.field_o < var2_long) {
              var4_ref_ra.b((byte) 12);
              qh.field_d = var4_ref_ra.field_k.length;
              mk.field_j.field_k = 0;
              for (var5_int = 0; var5_int < qh.field_d; var5_int++) {
                mk.field_j.field_i[var5_int] = var4_ref_ra.field_k[var5_int];
              }
              wc.field_r = wf.field_n;
              wf.field_n = uc.field_r;
              uc.field_r = qk.field_b;
              qk.field_b = var4_ref_ra.field_n;
              return true;
            }
          }
          if (param0 != -1491050718) {
            field_a = (cm) null;
          }
          while (true) {
            if (fg.field_d < 0) {
              mk.field_j.field_k = 0;
              if (!vc.a(-125, 1)) {
                return false;
              }
              fg.field_d = mk.field_j.a(false);
              mk.field_j.field_k = 0;
              qh.field_d = param1[fg.field_d];
            }
            if (!cm.b((byte) -43)) {
              return false;
            }
            if (eh.field_d == 0) {
              wc.field_r = wf.field_n;
              wf.field_n = uc.field_r;
              uc.field_r = qk.field_b;
              qk.field_b = fg.field_d;
              fg.field_d = -1;
              return true;
            }
            var4 = eh.field_d;
            if (tb.field_u != 0.0) {
              var4 = (int)((double)var4 + j.field_H.nextGaussian() * tb.field_u);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new ra(var2_long + (long)var4, fg.field_d, new byte[qh.field_d]);
            for (var6 = 0; qh.field_d > var6; var6++) {
              var5.field_k[var6] = mk.field_j.field_i[var6];
            }
            am.field_F.a(var5, param0 ^ 1491066943);
            fg.field_d = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("rj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        me var4 = null;
        int var4_int = 0;
        int var5 = 0;
        vi var5_ref_vi = null;
        int[] var6 = null;
        int var8 = 0;
        int[] var9 = null;
        uc var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = Terraphoenix.field_V;
        try {
          var10 = mk.field_j;
          var2 = var10.a(-16384);
          var3 = var10.a(-16384);
          if (param0 < 72) {
            var9 = (int[]) null;
            rj.a(-113, (int[]) null);
          }
          if (0 == var2) {
            var4 = (me) (ga.field_r.d(9272));
            if (var4 == null) {
              gb.g(-17464);
              return;
            }
            var5 = qh.field_d - var10.field_k;
            var12 = var4.field_i;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5) {
              var5 = var12.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.a(-16384) << (dg.a(3, var7) << 8));
            }
            var4.b((byte) 12);
            return;
          }
          if (var2 == 1) {
            var4_int = var10.e((byte) 118);
            var5_ref_vi = (vi) (pd.field_g.d(9272));
            while (var5_ref_vi != null) {
              if (var3 != var5_ref_vi.field_l ||
                var5_ref_vi.field_s != var4_int) {
                var5_ref_vi = (vi) (pd.field_g.e((byte) -119));
                continue;
              }
              break;
            }
            if (var5_ref_vi == null) {
              gb.g(-17464);
              return;
            }
            var5_ref_vi.b((byte) 12);
            return;
          }
          bd.a((Throwable) null, "LR1: " + r.i(-15465), 67);
          gb.g(-17464);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "rj.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, me param2) {
        uc var3 = null;
        try {
          var3 = di.field_l;
          var3.k(-17410, param0);
          var3.i(2, -106);
          var3.i(0, -119);
          if (param1 >= -117) {
            field_f = (String) null;
          }
          var3.i(param2.field_j, 12);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "rj.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Exit debriefing without saving";
        field_e = "Continue";
        field_d = "Saved games can be continued from the main menu.<br>  You can only have one saved game.";
        field_a = new cm(3);
        field_f = "No route";
        field_b = "    Stairs";
    }
}
