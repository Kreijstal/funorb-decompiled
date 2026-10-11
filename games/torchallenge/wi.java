/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_b;
    static byte[] field_c;
    static ka[] field_d;
    private int[] field_e;
    static int[] field_a;

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 1) {
          field_c = (byte[]) null;
        }
        field_d = null;
    }

    final static ji a(int param0, int param1, int[] param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        ji var9 = null;
        RuntimeException var9_ref = null;
        int[] var10 = null;
        ji stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new ji(param4, param7, param5, param6, param1, param0, param2);
          if (param3 != 77) {
            var10 = (int[]) null;
            wi.a(85, 87, (int[]) null, (byte) -123, -94, 96, 7, -66, 33);
          }
          wf.field_g.a(var9, param3 - 188);
          ul.a(-18261, var9, param8);
          stackIn_3_0 = var9;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("wi.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static ef a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        ef stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qc.field_i == eh.field_p) {
            stackIn_2_0 = null;
            return (ef) (stackIn_2_0);
          }
          if (param1 <= 90) {
            wi.a(2);
          }
          if (hf.field_b == eh.field_p &&
            param0.equals(ta.field_zb)) {
            eh.field_p = mg.field_c;
            stackIn_11_0 = gf.field_w;
            return stackIn_11_0;
          }
          ta.field_zb = param0;
          eh.field_p = qc.field_i;
          gf.field_w = null;
          stackIn_9_0 = null;
          return (ef) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wi.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          return true;
        }
        return ib.a(88, gi.b(param0 ^ 12476));
    }

    wi(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= param0.length + (param0.length >> 1)) {
            var2_int = var2_int << 1;
          }
          this.field_e = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_e[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = var2_int - 1 & param0[var3Lifetime1];
            while (this.field_e[var4 + var4 + 1] != -1) {
              var4 = var2_int - 1 & 1 + var4;
            }
            this.field_e[var4 + var4] = param0[var3Lifetime1];
            this.field_e[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("wi.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static String b(int param0) {
        if (param0 != 1) {
          field_a = (int[]) null;
        }
        if (sj.field_R) {
          return null;
        }
        if (bk.field_p < cf.field_a) {
          return null;
        }
        if (!(cf.field_a + ef.field_e <= bk.field_p)) {
          return ie.field_g;
        }
        return null;
    }

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = TorChallenge.field_F ? 1 : 0;
        var4 = -97 % ((21 - param0) / 60);
        var3 = (this.field_e.length >> 1) - 1;
        var5 = var3 & param1;
        while (true) {
          var6 = this.field_e[var5 - (-var5 - 1)];
          if (-1 == var6) {
            return -1;
          }
          if (param1 == this.field_e[var5 + var5]) {
            return var6;
          }
          var5 = 1 + var5 & var3;
        }
    }

    static {
        field_c = new byte[520];
        field_b = "members-only content";
    }
}
