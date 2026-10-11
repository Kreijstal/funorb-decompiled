/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    static int field_a;
    static int field_c;
    static String[][] field_d;
    static String field_g;
    private int[] field_h;
    static String field_b;
    static String field_i;
    static int field_e;
    static int field_f;

    final static void a(String param0, int param1, int param2, int param3, String param4) {
        if (param3 != 24092) {
          return;
        }
        try {
          nf.field_d.field_qb = param0;
          nf.field_d.field_K = nf.field_d.field_K + rh.field_y.field_K;
          nf.field_d.field_cb = param4;
          nf.field_d.field_N = param2;
          rh.field_y.field_D = rh.field_y.field_D + rh.field_y.field_K;
          rh.field_y.field_K = param1;
          nf.field_d.field_K = nf.field_d.field_K - rh.field_y.field_K;
          rh.field_y.field_D = rh.field_y.field_D - rh.field_y.field_K;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ap.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        var3 = -1 + (this.field_h.length >> 1);
        var4 = param0 & var3;
        if (param1 != -67) {
          return 123;
        }
        while (true) {
          var5 = this.field_h[var4 + var4 + 1];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_h[var4 + var4] == param0) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    final static tf[] a(int param0, int param1, int param2, int param3, int param4) {
        tf[] var6 = new tf[9];
        tf[] var5 = var6;
        tf dupTemp$0 = cl.a(param4, param3, (byte) -108);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        tf dupTemp$1 = cl.a(param4, param0, (byte) -116);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[param2] = dupTemp$1;
        if (param1 == 0) {
          return var5;
        }
        var6[4] = cl.a(64, param1, (byte) -50);
        return var5;
    }

    ap(int[] param0) {
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
          this.field_h = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_h[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = -1 + var2_int & param0[var3Lifetime1];
            while (this.field_h[1 + (var4 + var4)] != -1) {
              var4 = var2_int - 1 & var4 + 1;
            }
            this.field_h[var4 + var4] = param0[var3Lifetime1];
            this.field_h[var4 + var4 + 1] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ap.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 11924) {
          return;
        }
        field_d = (String[][]) null;
        field_i = null;
        field_g = null;
        field_b = null;
    }

    static {
        field_c = 70;
        field_a = field_c << 2;
        field_d = new String[][]{new String[]{"Pieces fall slowly onto a small grid", "Pieces fall onto a medium grid", "Pieces fall quickly onto a large grid"}, new String[]{"Race to complete 5 pictures", "Race to complete 10 pictures", "Race to complete 20 pictures"}};
        field_g = "Concluded";
        field_e = 65;
        field_b = "Show lobby chat from my friends";
        field_i = "Solicitation";
    }
}
