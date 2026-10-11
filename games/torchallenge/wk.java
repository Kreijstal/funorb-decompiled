/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends ic {
    static int field_G;
    static int field_F;

    final static void a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (da.field_c != null) {
            da.field_c.o(77);
          }
          kb.field_O = new fg(param2, param0, false, true, true);
          bg.field_K.c(0, kb.field_O);
          if (param1 < -27) {
            return;
          }
          var4 = (String) null;
          wk.a((String) null, -113, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("wk.S(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static ef a(String[] args, int param1) {
        ef var2 = null;
        RuntimeException var2_ref = null;
        ef stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ef(false);
          if (param1 != -1) {
            wk.c(false);
          }
          var2.field_b = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("wk.P(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        uk var9 = null;
        try {
          int var8 = 16 / ((param1 + 29) / 39);
          super.a(param0, (byte) -124, param2, param3, param4, param5);
          var9 = gl.field_b;
          if (var9 != null &&
            this.a(param5, param4, param0, -29991, param3)) {
            if (this.field_k instanceof f) {
              ((f) (this.field_k)).a(var9, this, false);
              gl.field_b = null;
              return;
            }
            if (!(var9.field_k instanceof f)) {
              return;
            }
            ((f) (var9.field_k)).a(var9, this, false);
            gl.field_b = null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "wk.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(boolean param0) {
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ka var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        int var12 = 0;
        ka var13 = null;
        ka var14 = null;
        ka var15 = null;
        ka var16 = null;
        ka var7Lifetime1;
        ka var7Lifetime2;
        ka var7Lifetime3;
        ka var7Lifetime4;
        ka var7Lifetime5;
        ka var15Lifetime1;
        ka var15Lifetime2;
        int var1_intLifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var6 = 8;
          if (null == ql.field_l) {
            ql.field_l = new int[2];
            var3 = e.b((byte) 57, 3);
            var4 = e.b((byte) 57, 2);
            var8 = -1;
            ql.field_l[0] = var3;
            for (var9 = 0; var9 < 3; var9++) {
              if (~var3 != ~var9) {
                var8++;
              }
              if (var8 != var4) {
                continue;
              }
              var4 = var9;
              break;
            }
            ql.field_l[1] = var4;
          }
          stackIn_14_0 = (null != vj.field_d) ? 0 : 1;
          var8Lifetime1 = stackIn_14_0;
          if (var8Lifetime1 == 0) {
            var12 = 0;
            var9Lifetime1 = var12;
            while (vj.field_d.length > var12) {
              if (vj.field_d[var12] == null) {
                var8Lifetime1 = 1;
              }
              var12++;
            }
          }
          if (var8Lifetime1 != 0) {
            e.a((byte) -99, var6);
          }
          var3Lifetime1 = ql.field_l[0];
          var13 = vj.field_d[var3Lifetime1];
          var15 = var13;
          var7 = var15;
          var15Lifetime1 = var13;
          var7Lifetime1 = var15Lifetime1;
          var7Lifetime2 = var13;
          var5 = dg.field_M[var3Lifetime1][0][2];
          var2 = dg.field_M[var3Lifetime1][0][1];
          var1_int = dg.field_M[var3Lifetime1][0][0];
          if (var5 < 0) {
            cg.field_g.d();
            qg.b();
            var13.d(0, 0);
            la.field_f.a(117);
            var7Lifetime2 = cg.field_g;
          }
          var7Lifetime2.b(var1_int - var6, -var6 + var2, 256);
          var14 = we.field_m[1 + var3Lifetime1];
          var7Lifetime3 = var14;
          if (var5 >= 0) {
            var14.g(var1_int, var2);
          } else {
            var14.d(var1_int, var2);
          }
          var4Lifetime1 = ql.field_l[1];
          var2Lifetime1 = dg.field_M[var4Lifetime1][1][1];
          var1_intLifetime1 = dg.field_M[var4Lifetime1][1][0];
          var15Lifetime2 = vj.field_d[var4Lifetime1];
          var7Lifetime4 = var15Lifetime2;
          var5Lifetime1 = dg.field_M[var4Lifetime1][1][2];
          if (var5Lifetime1 < 0) {
            cg.field_g.d();
            qg.b();
            var15Lifetime2.d(0, 0);
            la.field_f.a(126);
            var7Lifetime4 = cg.field_g;
          }
          var7Lifetime4.b(-var6 + var1_intLifetime1, -var6 + var2Lifetime1, 256);
          var16 = we.field_m[var4Lifetime1 + 1];
          var7Lifetime5 = var16;
          if (!param0) {
            var11 = (String[]) null;
            wk.a((String[]) null, -30);
          }
          if (var5Lifetime1 >= 0) {
            var16.g(var1_intLifetime1, var2Lifetime1);
          } else {
            var16.d(var1_intLifetime1, var2Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "wk.R(" + param0 + ')');
        }
    }

    private wk(int param0, int param1, int param2, int param3, j param4, gg param5, ee param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_A = param6;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "wk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = 0;
    }
}
