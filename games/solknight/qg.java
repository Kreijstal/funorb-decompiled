/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static int[] field_c;
    private int[] field_d;
    static int field_a;

    public static void a(boolean param0) {
        if (param0) {
          field_c = (int[]) null;
        }
        field_c = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = -1 + (this.field_d.length >> 1);
        var4 = var3 & param1;
        if (param0 != 0) {
          return -32;
        }
        while (true) {
          var5 = this.field_d[var4 + var4 + 1];
          if (var5 == -1) {
            return -1;
          }
          if (param1 == this.field_d[var4 + var4]) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    final static void a(hf param0, byte param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var4Lifetime1;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            SolKnight.field_K[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < al.field_p; var2_intLifetime1++) {
            if (kc.field_K[var2_intLifetime1].field_i == param0.field_i) {
              dupTemp$3 = kc.field_K[var2_intLifetime1].a(1910696752);
              SolKnight.field_K[dupTemp$3] = SolKnight.field_K[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(1910696752);
          SolKnight.field_K[dupTemp$0] = SolKnight.field_K[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < al.field_p; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (kc.field_K[var3].field_i == param0.field_i) {
              var4 = kc.field_K[var3].a(1910696752);
              if (i.field_K < SolKnight.field_K[var4]) {
                SolKnight.field_K[var4] = SolKnight.field_K[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              kc.field_K[incrementValue$2] = kc.field_K[var3];
            }
          }
          var4Lifetime1 = -52 / ((param1 + 2) / 59);
          al.field_p = var2_intLifetime2;
          fieldTemp$1 = al.field_p;
          al.field_p = al.field_p + 1;
          kc.field_K[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("qg.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    qg(int[] param0) {
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
          this.field_d = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_d[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (-1 != this.field_d[var4 + var4 + 1]) {
              var4 = var2_int - 1 & 1 + var4;
            }
            this.field_d[var4 + var4] = param0[var3Lifetime1];
            this.field_d[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qg.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = "Create";
        field_a = -1;
    }
}
