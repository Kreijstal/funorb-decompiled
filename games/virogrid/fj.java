/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String field_c;
    static String field_a;
    static p field_b;

    final static void a(byte param0, int param1, int param2) {
        if (ke.field_r == null ||
          !(ke.field_r.length >= param2)) {
          ke.field_r = new int[2 * param2];
        }
        if (null == wh.field_c ||
          !(param2 <= wh.field_c.length)) {
          wh.field_c = new int[2 * param2];
        }
        if (null == vc.field_jb ||
          !(vc.field_jb.length >= param2)) {
          vc.field_jb = new int[param2 * 2];
        }
        if (tg.field_A == null ||
          !(param2 <= tg.field_A.length)) {
          tg.field_A = new int[param2 * 2];
        }
        if (kf.field_j == null ||
          !(param2 <= kf.field_j.length)) {
          kf.field_j = new int[2 * param2];
        }
        if (vl.field_i == null ||
          !(param2 <= vl.field_i.length)) {
          vl.field_i = new int[2 * param2];
        }
        if (param0 <= 116) {
          field_c = (String) null;
        }
        if (null == lk.field_Tb ||
          !(lk.field_Tb.length >= param1 + param2)) {
          lk.field_Tb = new int[2 * (param2 + param1)];
        }
        if (null == jg.field_b ||
          !(param2 <= jg.field_b.length)) {
          jg.field_b = new boolean[param2 * 2];
        }
        dj.field_c = -2147483648;
        ka.field_m = 0;
        ka.field_k = 2147483647;
        rk.field_e = 2147483647;
        bl.field_F = -2147483648;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 > -47) {
          field_a = (String) null;
        }
        field_b = null;
    }

    final static tf[] a(hg param0, int param1) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        tf[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        tf[] var4 = null;
        tf var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param0.c((byte) -78, 8);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (tf[]) (stackIn_3_0);
          }
          var3 = param0.c((byte) -78, 12);
          var4 = new tf[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (tk.a(param1 - 8, param0)) {
              var6 = new tf();
              param0.c((byte) -78, 24);
              param0.c((byte) -78, 24);
              var6.field_b = param0.c((byte) -78, 24);
              param0.c((byte) -78, 9);
              param0.c((byte) -78, 12);
              param0.c((byte) -78, 12);
              param0.c((byte) -78, 12);
              var4[var5] = var6;
            } else {
              var6_int = param0.c((byte) -78, rc.a(-1 + var5, 4));
              var4[var5] = var4[var6_int];
            }
          }
          if (param1 != 9) {
            fj.a((byte) 38);
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("fj.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Lobby";
        field_b = new p();
    }
}
