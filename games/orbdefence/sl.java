/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends sf {
    static int field_ab;
    static String field_Z;

    final static void a(int param0, hj param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          if (0 == ((param1.field_p | (param1.field_k | param1.field_o) | param1.field_u) & 3)) {
            return;
          }
          var2_int = param1.field_o + (param1.field_p & 3);
          var3 = param1.field_k + (param1.field_u & 3);
          var2_int = 4 - ((var2_int & 3) - var2_int);
          var3 = var3 + (-(var3 & 3) + 4);
          var4 = new int[var2_int * var3];
          var5 = 0;
          var6 = (3 & param1.field_p) + var2_int * (3 & param1.field_u);
          for (var7 = 0; var7 < param1.field_k; var7++) {
            for (var8 = 0; param1.field_o > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param1.field_v[incrementValue$1];
            }
            var6 = var6 + (var2_int - param1.field_o);
          }
          if (param0 != 2408) {
            sl.d((byte) -106);
          }
          param1.field_u = param1.field_u & -4;
          param1.field_p = param1.field_p & -4;
          param1.field_k = var3;
          param1.field_o = var2_int;
          param1.field_v = var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("sl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_Z = null;
        if (param0 < 118) {
          hj var2 = (hj) null;
          sl.a(16, (hj) null);
        }
    }

    final static hj[] d(byte param0) {
        int var6 = 0;
        int var7 = 0;
        hj[] var1;
        int var2;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        hj var9;
        byte[] var10;
        int[] var11;
        byte[] var13;
        int[] var14;
        byte[] var17;
        int[] var18;
        byte[] var22;
        int[] var23;
        var8 = OrbDefence.field_D ? 1 : 0;
        var1 = new hj[ec.field_K];
        var2 = 0;
        if (param0 >= -82) {
          var9 = (hj) null;
          sl.a(16, (hj) null);
        }
        while (var2 < ec.field_K) {
          var3 = wh.field_b[var2] * m.field_a[var2];
          var22 = fl.field_a[var2];
          if (!ha.field_g[var2]) {
            var11 = new int[var3];
            var23 = var11;
            for (var6 = 0; var6 < var3; var6++) {
              var11[var6] = vc.field_g[vi.a(255, (int) var22[var6])];
            }
            var1[var2] = new hj(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var23);
          } else {
            var17 = md.field_i[var2];
            var13 = var17;
            var10 = var13;
            var5 = var10;
            var18 = new int[var3];
            var14 = var18;
            var6_ref_int__ = var14;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = ge.a(vc.field_g[vi.a(255, (int) var22[var7])], vi.a(-16777216, var17[var7] << 24));
            }
            var1[var2] = (hj) ((Object) new ra(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var18));
          }
          var2++;
        }
        md.$cfr$intArgs$a$6121ff5511c4(-127);
        return var1;
    }

    private sl() throws Throwable {
        super(0L, (sf) null);
        throw new Error();
    }

    static {
        field_ab = -1;
        field_Z = "CONGRATULATIONS!<br><br>You have managed to defeat all the Norbs thus far. To continue you must become a member!";
    }
}
