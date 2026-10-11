/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ui {
    static int field_g;
    static hl field_e;
    static Boolean field_b;
    static je field_d;
    static ok field_f;
    static long[] field_c;
    static String[] field_a;

    final static boolean a(byte param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = TetraLink.field_J;
        var1 = k.a(0);
        var3 = var1 - pm.field_g;
        if (var3 > 30000L) {
          ib.field_b = 0;
          pm.field_g = var1;
          return true;
        }
        var5 = 3000;
        if (7 <= ib.field_b) {
          var5 = 12000;
        } else {
          if (ib.field_b < 5) {
            if (ib.field_b >= 3) {
              var5 = 6000;
            }
          } else {
            var5 = 9000;
          }
        }
        if ((long)var5 < var3) {
          pm.field_g = var1;
          ib.field_b = ib.field_b + 1;
          return true;
        }
        if (param0 < -24) {
          return false;
        }
        return true;
    }

    final static void a(ob param0, int param1, int param2, ob param3, int param4, int param5, int param6, ob param7, int param8, int param9) {
        byte fieldTemp$0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        ob var10 = null;
        int var10_int = 0;
        RuntimeException var10_ref = null;
        int var11 = 0;
        ob var10Lifetime1;
        ob var10Lifetime2;
        ob var10Lifetime3;
        ob var10Lifetime4;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime3;
        int var10_intLifetime4;
        int var10_intLifetime5;
        int var10_intLifetime1Lifetime1;
        int var10_intLifetime2Lifetime1;
        int var10_intLifetime3Lifetime1;
        int var10_intLifetime4Lifetime1;
        var11 = TetraLink.field_J;
        try {
          tc.field_w = param3.field_M;
          om.field_Yb = param0.field_j;
          nn.field_S = param3.field_V;
          wk.field_b = param3.field_p;
          fj.field_p = param0.field_M;
          hd.field_D = param0.field_A;
          gk.field_c = param0.field_Y;
          nh.field_Mb = param0.field_k;
          cm.field_q = param0.field_gb;
          ve.field_a = param0.field_kb;
          ch.field_s = param3.field_Y;
          ic.field_c = param3.field_t;
          ga.field_b = param0.field_hb;
          gb.field_r = param3.field_I;
          am.field_b = param0.field_t;
          kj.field_d = param0.field_p;
          db.field_f = param3.field_A;
          bg.field_f = param3.field_k;
          gd.field_Zb = param0.field_V;
          li.field_m = param0.field_I;
          ja.field_l = param3.field_kb;
          mc.field_m = param3.field_hb;
          rk.field_b = param3.field_j;
          bd.field_a = param3.field_gb;
          bn.a(param4, param2, param7.field_kb, param8, param9, param7.field_V, (kc) null, param7.field_ob, param7.field_M, param5, param7.field_E, param7.field_gb, param7.field_t, 118, param1, param7.field_Y, param7.field_I, param7.field_j, param7.field_hb, param7.field_k, param7.field_p, param7.field_ib, (byte[]) null, param7.field_A);
          param3.field_V = nn.field_S;
          param3.field_ib = k.field_e;
          param3.field_j = rk.field_b;
          param3.field_A = db.field_f;
          param3.field_I = gb.field_r;
          param3.field_k = bg.field_f;
          param3.field_kb = ja.field_l;
          param3.field_nb = ea.field_e;
          param3.field_t = ic.field_c;
          param3.field_gb = bd.field_a;
          param3.field_ob = fh.field_g;
          param3.field_M = tc.field_w;
          param3.field_Y = ch.field_s;
          param3.field_p = wk.field_b;
          param3.field_E = hb.field_d;
          param3.field_hb = mc.field_m;
          param0.field_A = hd.field_D;
          param0.field_kb = ve.field_a;
          param0.field_Y = gk.field_c;
          param0.field_ib = mf.field_u;
          if (param6 != 100) {
            return;
          }
          param0.field_I = li.field_m;
          param0.field_k = nh.field_Mb;
          param0.field_gb = cm.field_q;
          param0.field_ob = le.field_Xb;
          param0.field_t = am.field_b;
          param0.field_E = bm.field_p;
          param0.field_M = fj.field_p;
          param0.field_p = kj.field_d;
          param0.field_j = om.field_Yb;
          param0.field_hb = ga.field_b;
          param0.field_nb = d.field_b;
          param0.field_V = gd.field_Zb;
          if (null != param7.field_U) {
            if (param3.field_U == null ||
              !(param3.field_ob <= param3.field_U.length)) {
              param3.field_U = new byte[100 + param3.field_ob];
            }
            if (null == param0.field_U ||
              !(param0.field_ob <= param0.field_U.length)) {
              param0.field_U = new byte[param0.field_ob + 100];
            }
            for (var10_int = 0; param3.field_ob > var10_int; var10_int++) {
              param3.field_U[var10_int] = param7.field_U[rl.field_c[var10_int]];
            }
            for (var10_intLifetime5 = 0; param0.field_ob > var10_intLifetime5; var10_intLifetime5++) {
              param0.field_U[var10_intLifetime5] = param7.field_U[gm.field_b[var10_intLifetime5]];
            }
          } else {
            param0.field_U = null;
            var10 = param3;
            var10.field_U = null;
            fieldTemp$0 = param7.field_K;
            param0.field_K = param7.field_K;
            param3.field_K = fieldTemp$0;
          }
          if (param7.field_eb != null) {
            if (param3.field_eb == null ||
              !(param3.field_ob <= param3.field_eb.length)) {
              param3.field_eb = new byte[100 + param3.field_ob];
            }
            if (null == param0.field_eb ||
              !(param0.field_ob <= param0.field_eb.length)) {
              param0.field_eb = new byte[100 + param0.field_ob];
            }
            for (var10_intLifetime1 = 0; var10_intLifetime1 < param3.field_ob; var10_intLifetime1++) {
              param3.field_eb[var10_intLifetime1] = param7.field_eb[rl.field_c[var10_intLifetime1]];
            }
            for (var10_intLifetime1Lifetime1 = 0; param0.field_ob > var10_intLifetime1Lifetime1; var10_intLifetime1Lifetime1++) {
              param0.field_eb[var10_intLifetime1Lifetime1] = param7.field_eb[gm.field_b[var10_intLifetime1Lifetime1]];
            }
          } else {
            var10Lifetime1 = param3;
            param0.field_eb = null;
            var10Lifetime1.field_eb = null;
          }
          if (null != param7.field_u) {
            if (param3.field_u == null ||
              !(param3.field_ob <= param3.field_u.length)) {
              param3.field_u = new byte[100 + param3.field_ob];
            }
            if (param0.field_u == null ||
              !(param0.field_u.length >= param0.field_ob)) {
              param0.field_u = new byte[100 + param0.field_ob];
            }
            for (var10_intLifetime2 = 0; var10_intLifetime2 < param3.field_ob; var10_intLifetime2++) {
              param3.field_u[var10_intLifetime2] = param7.field_u[rl.field_c[var10_intLifetime2]];
            }
            for (var10_intLifetime2Lifetime1 = 0; param0.field_ob > var10_intLifetime2Lifetime1; var10_intLifetime2Lifetime1++) {
              param0.field_u[var10_intLifetime2Lifetime1] = param7.field_u[gm.field_b[var10_intLifetime2Lifetime1]];
            }
          } else {
            param0.field_u = null;
            var10Lifetime2 = param3;
            var10Lifetime2.field_u = null;
          }
          if (param7.field_r != null) {
            if (null == param3.field_r ||
              !(param3.field_r.length >= param3.field_ob)) {
              param3.field_r = new short[100 + param3.field_ob];
            }
            if (param0.field_r == null ||
              !(param0.field_r.length >= param0.field_ob)) {
              param0.field_r = new short[100 + param0.field_ob];
            }
            for (var10_intLifetime3 = 0; param3.field_ob > var10_intLifetime3; var10_intLifetime3++) {
              param3.field_r[var10_intLifetime3] = param7.field_r[rl.field_c[var10_intLifetime3]];
            }
            for (var10_intLifetime3Lifetime1 = 0; param0.field_ob > var10_intLifetime3Lifetime1; var10_intLifetime3Lifetime1++) {
              param0.field_r[var10_intLifetime3Lifetime1] = param7.field_r[gm.field_b[var10_intLifetime3Lifetime1]];
            }
          } else {
            param0.field_r = null;
            var10Lifetime3 = param3;
            var10Lifetime3.field_r = null;
          }
          if (null != param7.field_J) {
            if (null == param3.field_J ||
              !(param3.field_J.length >= param3.field_ob)) {
              param3.field_J = new short[param3.field_ob + 100];
            }
            if (null == param0.field_J ||
              !(param0.field_J.length >= param0.field_ob)) {
              param0.field_J = new short[param0.field_ob + 100];
            }
            for (var10_intLifetime4 = 0; var10_intLifetime4 < param3.field_ob; var10_intLifetime4++) {
              param3.field_J[var10_intLifetime4] = param7.field_J[rl.field_c[var10_intLifetime4]];
            }
            for (var10_intLifetime4Lifetime1 = 0; param0.field_ob > var10_intLifetime4Lifetime1; var10_intLifetime4Lifetime1++) {
              param0.field_J[var10_intLifetime4Lifetime1] = param7.field_J[gm.field_b[var10_intLifetime4Lifetime1]];
            }
            return;
          }
          var10Lifetime4 = param3;
          param0.field_J = null;
          var10Lifetime4.field_J = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_86_0 = var10_ref;
          stackIn_86_1 = new StringBuilder().append("ui.D(");
          if (param0 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_86_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 12000) {
          return;
        }
        field_e = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 1692) {
          return 27;
        }
        return l.a(rb.field_Mb, (byte) 118, param0);
    }

    static {
        field_f = new ok();
        field_c = new long[32];
        field_a = new String[]{"Link Newcomer", "Link Challenger", "Victory on the Grid", "Attunement to the Grid", "Mastery of the Grid", "Link Duality", "PentaLink", "Ghosts in the Machine"};
    }
}
