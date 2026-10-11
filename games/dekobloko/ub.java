/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_f;
    static String field_e;
    static int[] field_d;
    static String field_b;
    static int field_a;
    static String field_c;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          var3_int = 0;
          var4 = fc.field_a;
          while (rk.field_P.length > var3_int) {
            var5 = k.field_g[var3_int];
            if (var5 >= 0) {
              var6 = si.a(false, rk.field_P[var3_int], true);
              var7 = qk.field_d - (var6 >> 1);
              var4 = var4 + qk.field_m;
              if (gi.a(17, param2, param0, var6 + (mb.field_c << 1), var4, (pa.field_Y << 1) + cc.field_a, var7 - mb.field_c)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (qk.field_m + ((pa.field_Y << 1) + cc.field_a));
            } else {
              var4 = var4 + ke.field_d;
            }
            var3_int++;
          }
          if (param1 == -81) {
            stackIn_18_0 = -1;
            return stackIn_18_0;
          }
          stackIn_16_0 = -50;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "ub.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        if (jh.field_h) {
          hk.d(hk.field_c, hk.field_h, hk.field_g - hk.field_c, hk.field_b - hk.field_h);
          ie.field_c.a(1141039778, false);
          if (param0 != 54) {
            ub.a(-56, (byte) 45, 35);
            return;
          }
          return;
        }
        if (param0 == 54) {
          return;
        }
        ub.a(-56, (byte) 45, 35);
    }

    final static sb a(int param0, int param1, int param2, int param3) {
        sb var4 = new sb();
        if (param3 > 95) {
          var4.field_q = new int[param0];
          var4.field_r = param2;
          ef.field_S.a(var4, 2777);
          oi.a(-102, param1, var4);
          return var4;
        }
        field_f = (String) null;
        var4.field_q = new int[param0];
        var4.field_r = param2;
        ef.field_S.a(var4, 2777);
        oi.a(-102, param1, var4);
        return var4;
    }

    public static void b(byte param0) {
        if (param0 <= -17) {
          field_f = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_e = (String) null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_e = "Player";
        field_d = new int[36];
        field_a = 0;
        field_b = "Ready...";
    }
}
