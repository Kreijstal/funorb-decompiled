/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static String field_d;
    static String field_a;
    static ta field_c;
    static RgbSprite[] field_e;
    static int field_b;
    private int[] field_f;

    final static boolean a(int param0, int param1) {
        if (param1 != 0) {
          field_e = (RgbSprite[]) null;
        }
        return param0 >= 2 ? true : false;
    }

    final static oh a(int param0, String[] param1) {
        oh var2 = null;
        RuntimeException var2_ref = null;
        oh stackIn_2_0 = null;
        oh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new oh(false);
          var2.field_e = param1;
          if (param0 == -2079) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (oh) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("lm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
        if (!param0) {
          lm.a(true);
        }
    }

    final static void a(int param0) {
        t.field_g = false;
        cg.field_l = false;
        bd.a(param0, true);
        ka.field_l = ej.field_P;
        ik.field_g = ej.field_P;
    }

    final static boolean a(byte param0) {
        if (param0 != -10) {
          lm.a((byte) 35);
        }
        return null != pe.field_o ? true : false;
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        if (param1 >= -68) {
          lm.a(47);
        }
        var3 = -1 + (this.field_f.length >> 1);
        var4 = var3 & param0;
        while (true) {
          var5 = this.field_f[var4 + var4 + 1];
          if (-1 == var5) {
            return -1;
          }
          if (param0 == this.field_f[var4 + var4]) {
            return var5;
          }
          var4 = var3 & var4 + 1;
        }
    }

    lm(int[] param0) {
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
          this.field_f = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_f[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            for (var4 = param0[var3Lifetime1] & -1 + var2_int; this.field_f[var4 + (var4 + 1)] != -1; var4 = var4 + 1 & var2_int - 1) {
            }
            this.field_f[var4 + var4] = param0[var3Lifetime1];
            this.field_f[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("lm.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_d = "<%0> has entered a game.";
        field_b = 4;
        field_a = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
