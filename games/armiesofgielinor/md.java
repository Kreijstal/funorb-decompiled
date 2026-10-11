/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends oj {
    static String[] field_A;
    int field_D;
    int field_z;
    int field_E;
    static at field_y;
    private int field_C;
    int field_B;
    static String field_F;

    final String a(byte param0, boolean param1) {
        if (param1) {
          System.out.println("Parasite event debug");
          System.out.println("Unit at " + this.field_D + "," + this.field_B);
          System.out.println("Takes over " + (this.field_D + this.field_E) + "," + (this.field_B + this.field_z));
          System.out.println("New owner " + this.field_C);
        }
        String var3 = "EventParasite: pos: (" + this.field_D + "," + this.field_B + "), d: (" + this.field_E + "," + this.field_z + ")+, owner: " + this.field_C;
        int var4 = 21 / ((53 - param0) / 51);
        return var3;
    }

    public static void d(byte param0) {
        field_A = null;
        field_y = null;
        field_F = null;
        if (param0 != 46) {
          field_F = (String) null;
        }
    }

    final static wk[] g(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        wk[] var1 = new wk[iw.field_n];
        for (var2 = 0; iw.field_n > var2; var2++) {
          var3 = qm.field_K[var2] * c.field_e[var2];
          var4 = vj.field_j[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = qv.field_j[rn.a(255, (int) var4[var6])];
          }
          var1[var2] = new wk(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var5);
        }
        rj.d((byte) 106);
        if (param0 >= 1) {
          return var1;
        }
        field_A = (String[]) null;
        return var1;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("md.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    md(int param0, int param1, int param2, int param3, int param4) {
        this.field_z = param3 + param1;
        this.field_C = param4;
        this.field_E = param0 + param2;
        this.field_B = param1;
        this.field_D = param0;
        this.field_m = 7;
    }

    final void a(ha param0, int param1) {
        jd var7 = null;
        jd var4 = null;
        jd var5 = null;
        try {
          var7 = param0.c(this.field_B, true, this.field_D);
          var4 = param0.c(this.field_z, true, this.field_E);
          if (var4 != null) {
            if (null != var4.field_p) {
              var4.field_p.d(-116);
            }
            var5 = var4.b(this.field_C, -1);
            if (var7 != null &&
              var7.field_p != null &&
              var5 != null) {
              var7.field_p.field_r.a(80, var5);
            }
          }
          if (var7 != null) {
            var7.d(param1 ^ 26704);
            if (var7.field_p != null) {
              var7.field_p.d(-128);
            }
            param0.field_Eb[param0.field_v * this.field_B + this.field_D].field_c = null;
          }
          if (param1 != -26661) {
            ic var6 = (ic) null;
            this.a((at) null, (byte) 109, (ic) null);
          }
          fl.a(param0, -126);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "md.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_y = new at();
        field_F = "This game option has not yet been unlocked for use.";
    }
}
