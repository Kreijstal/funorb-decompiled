/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static String field_d;
    static int[][] field_c;
    static int[] field_e;
    static int field_g;
    static boolean[][][] field_b;
    static String field_a;
    static ka field_f;

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = te.field_b;
        synchronized (var1) {
          sj.field_L = sj.field_L + 1;
          wh.field_e = jc.field_h;
          kc.field_u = bj.field_c;
          ph.field_d = qb.field_g;
          ek.field_P = ua.field_c;
          ua.field_c = false;
          vb.field_n = e.field_o;
          ik.field_a = aa.field_a;
          if (param0 != 30210) {
            cb.a(71, 118, (byte) -25, 29);
          }
          ci.field_m = ll.field_g;
          e.field_o = 0;
        }
    }

    public static void b(int param0) {
        field_c = (int[][]) null;
        field_b = (boolean[][][]) null;
        field_e = null;
        if (param0 == -9386) {
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        qe var9 = null;
        qe var10 = null;
        qe var11 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var4 = null;
          var5 = -1;
          if (ea.field_g.length <= lh.field_s) {
            lh.field_s = -1;
          }
          if (lh.field_s > 0) {
            var4 = ea.field_g[lh.field_s];
          }
          if (param2 <= 87) {
            field_f = (ka) null;
          }
          if (var4 != null) {
            var5 = ue.a(((qe) (var4)).field_o, param3, ((qe) (var4)).field_H, param1, (byte) 79);
          }
          for (var7 = 0; ea.field_g.length > var7; var7++) {
            if (null != ea.field_g[var7]) {
              var10 = ea.field_g[var7];
              var4 = var10;
              if (4 == var10.field_F) {
                var6 = ue.a(var10.field_o, param3, var10.field_H, param1, (byte) 79);
                if (var6 >= 0 &&
                  var5 > var6 &&
                  0 < var5) {
                  var5 = var6;
                  lh.field_s = var10.field_y;
                }
              }
            }
          }
          if (lh.field_s < 0) {
            sd.a(126);
            return;
          }
          if (!hc.field_Q) {
            if (ea.field_g.length <= lh.field_s) {
              sd.a(121);
              return;
            }
            var9 = ea.field_g[lh.field_s];
            var11 = var9;
            if (var11 != null &&
              var11.field_F == 4) {
              uc.a(var11.field_y, var11.field_o, var11.field_H, param1, 1, var11.field_V, param3, dg.field_T[var9.field_F], true, param0);
              return;
            }
            sd.a(122);
            return;
          }
          if (!hc.field_Q) {
            return;
          }
          if (ea.field_g.length <= lh.field_s) {
            sd.a(123);
            return;
          }
          var4 = ea.field_g[lh.field_s];
          if (var4 != null &&
            ((qe) (var4)).field_F == 4) {
            dg.a(((qe) (var4)).field_o, dg.field_T[((qe) (var4)).field_F], ((qe) (var4)).field_V, 1, param0, ((qe) (var4)).field_y, ((qe) (var4)).field_H, param1, (byte) -72, param3);
            if (nj.field_g == 0) {
              sd.a(121);
            }
            return;
          }
          sd.a(122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) (var4), "cb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = new boolean[][][]{new boolean[][]{new boolean[]{false, true, true, true, true, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, true, true, true, true, false}, new boolean[]{false, true, true, true, true}, new boolean[]{true, true, true, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, true, true, true}, new boolean[]{false}}, new boolean[][]{new boolean[]{true, true, true, true, true, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{true, true, false, true, true, true}, new boolean[]{false}, new boolean[]{false, false, false, true, true, true}}};
        field_d = "Members";
        field_g = -1;
        field_a = "Waiting for sound effects";
        field_f = null;
    }
}
