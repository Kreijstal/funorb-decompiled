/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_a;
    static bd field_d;
    static int field_c;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 719371458) {
          field_d = (bd) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        m.field_q = param5;
        qh.field_e = param3;
        ni.field_f = param6;
        qg.field_n = param4;
        if (-param2 + qh.field_e > -param1 + qg.field_n) {
          stackIn_3_0 = -param1 + qg.field_n;
        } else {
          stackIn_3_0 = qh.field_e - param2;
        }
        v.field_g = stackIn_3_0;
        if (m.field_q + param1 <= param2 + ni.field_f) {
          stackIn_6_0 = param2 + ni.field_f;
        } else {
          stackIn_6_0 = m.field_q + param1;
        }
        cn.field_r = stackIn_6_0;
        if (qg.field_n + param1 <= param2 + qh.field_e) {
          stackIn_9_0 = param2 + qh.field_e;
        } else {
          stackIn_9_0 = param1 + qg.field_n;
        }
        bn.field_p = stackIn_9_0;
        if (-param1 + m.field_q >= ni.field_f - param2) {
          stackIn_12_0 = -param2 + ni.field_f;
        } else {
          stackIn_12_0 = m.field_q - param1;
        }
        pk.field_m = stackIn_12_0;
        if (si.field_j << 2 > v.field_g) {
          if (si.field_j << 2 > bn.field_p) {
            bn.field_p = si.field_j << 2;
          }
          v.field_g = si.field_j << 2;
        }
        if (bn.field_p > si.field_a << 2) {
          bn.field_p = si.field_a << 2;
          if (v.field_g > si.field_a << 2) {
            v.field_g = si.field_a << 2;
          }
        }
        if (si.field_b << 2 > pk.field_m) {
          if (cn.field_r < si.field_b << 2) {
            cn.field_r = si.field_b << 2;
          }
          pk.field_m = si.field_b << 2;
        }
        if (param0 != -19104) {
          return;
        }
        if (cn.field_r > si.field_l << 2) {
          if (si.field_l << 2 < pk.field_m) {
            pk.field_m = si.field_l << 2;
          }
          cn.field_r = si.field_l << 2;
        }
    }

    final static void a(int param0, ic param1, int param2) {
        en var3 = null;
        try {
          var3 = s.field_b;
          var3.i(19319, param0);
          if (param2 != 746037954) {
            rl.a(40);
          }
          var3.d(103, 5);
          var3.d(122, 0);
          var3.a((byte) -118, param1.field_j);
          var3.d(param2 - 746037849, param1.field_q);
          var3.d(80, param1.field_h);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "rl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, gb param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        ic var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2884) {
            var5 = (ic) null;
            rl.a(79, (ic) null, 36);
          }
          var6 = param1.a(false, param3, param2);
          var4 = var6;
          if (var6 == null) {
            return false;
          }
          jh.a(-26869, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("rl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Use the function<nbsp>keys or ctrl<nbsp>+<nbsp>number to<nbsp>select your secondary weapon, or right-click on the weapon in your HUD.";
        field_c = 0;
    }
}
