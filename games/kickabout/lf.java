/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static String field_c;
    static String field_b;
    private int[] field_a;

    final static int a(byte param0, int param1) {
        if (param0 > -55) {
          return 67;
        }
        if (ia.field_c) {
          param1 = -param1 + 1344;
        }
        return go.a(param1, (byte) -56);
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 82 / ((54 - param1) / 32);
          stackIn_3_0 = (null != tr.a(param0, (byte) 40));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("lf.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 94) {
          lf.a((byte) -22, 76);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        nb.field_i = qa.h(-117);
        wd.field_l = new se();
        if (param0 < -59) {
          bl.a(true, true, (byte) -72);
          return;
        }
        lf.a(-98);
        bl.a(true, true, (byte) -72);
    }

    lf(int[] param0) {
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
          while (param0.length + (param0.length >> 1) >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.field_a[1 + (var4 + var4)] != -1) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("lf.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Kickabout.field_G;
        var3 = -1 + (this.field_a.length >> 1);
        if (param1 < -37) {
          var4 = param0 & var3;
          while (true) {
            var5 = this.field_a[var4 + (var4 + 1)];
            if (-1 == var5) {
              return -1;
            }
            if (param0 == this.field_a[var4 + var4]) {
              return var5;
            }
            var4 = var4 + 1 & var3;
          }
        }
        lf.a(-22);
        var4Lifetime1 = param0 & var3;
        while (true) {
          var5Lifetime1 = this.field_a[var4Lifetime1 + (var4Lifetime1 + 1)];
          if (-1 == var5Lifetime1) {
            return -1;
          }
          if (param0 == this.field_a[var4Lifetime1 + var4Lifetime1]) {
            return var5Lifetime1;
          }
          var4Lifetime1 = var4Lifetime1 + 1 & var3;
        }
    }

    static {
    }
}
