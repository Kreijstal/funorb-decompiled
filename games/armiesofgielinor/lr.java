/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr {
    static iv field_a;
    private int[] field_b;

    lr(int[] param0) {
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
          while ((param0.length >> 1) + param0.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_b = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_b[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            for (var4 = var2_int - 1 & param0[var3Lifetime1]; this.field_b[var4 + (var4 + 1)] != -1; var4 = var4 + 1 & var2_int - 1) {
            }
            this.field_b[var4 + var4] = param0[var3Lifetime1];
            this.field_b[var4 + var4 + 1] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("lr.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static ru[] a(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ru[] var1 = new ru[iw.field_n];
        for (var2 = 0; var2 < iw.field_n; var2++) {
          var1[var2] = new ru(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], vj.field_j[var2], qv.field_j);
        }
        if (param0 < 102) {
          co[] var4 = (co[]) null;
          lr.a((co[]) null, (byte) -34);
        }
        rj.d((byte) 103);
        return var1;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -1 + (this.field_b.length >> 1);
        if (param1 != 1) {
          return -110;
        }
        var4 = var3 & param0;
        while (true) {
          var5 = this.field_b[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_b[var4 + var4] == param0) {
            return var5;
          }
          var4 = var3 & 1 + var4;
        }
    }

    final static void a(co[] param0, byte param1) {
        int var3 = 0;
        co[] var2 = null;
        int var4 = 0;
        co[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var5 = param0;
          var2 = var5;
          if (param1 <= 35) {
            lr.a(-11);
          }
          for (var3 = 0; var3 < var5.length; var3++) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("lr.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = null;
    }
}
