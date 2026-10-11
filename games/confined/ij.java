/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends rk {
    static String field_o;
    int[] field_n;
    int field_v;
    private boolean[] field_y;
    static e field_s;
    static String[] field_p;
    private int field_x;
    static int[] field_r;
    static pb field_t;
    private int[] field_m;
    int[][] field_w;
    static qi field_q;
    static long field_u;

    public static void b(int param0) {
        field_q = null;
        field_r = null;
        field_o = null;
        field_s = null;
        field_p = null;
        field_t = null;
        if (param0 > -29) {
          ij.a(95, -34);
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param2);
          var3_int = ga.a((byte) -89, param1, var10);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = param0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ij.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static gd a(int param0, int param1) {
        if (param0 >= -34) {
          return (gd) null;
        }
        gd var2 = new gd();
        ra.field_d.a((rk) (var2), (byte) 109);
        fm.a(115, param1);
        return var2;
    }

    ij(int param0, byte[] param1) {
        int[] array$0 = null;
        int var5 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kg var7 = null;
        kg var8 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        try {
          this.field_v = param0;
          var7 = new kg(param1);
          var8 = var7;
          this.field_x = var8.c(32);
          this.field_y = new boolean[this.field_x];
          this.field_w = new int[this.field_x][];
          this.field_n = new int[this.field_x];
          this.field_m = new int[this.field_x];
          for (var4 = 0; var4 < this.field_x; var4++) {
            this.field_n[var4] = var7.c(32);
          }
          for (var4Lifetime1 = 0; this.field_x > var4Lifetime1; var4Lifetime1++) {
            stackIn_8_0 = this.field_y;
            stackIn_8_1 = var4Lifetime1;
            stackIn_9_2 = (1 == var8.c(32));
            stackIn_8_0[stackIn_8_1] = stackIn_9_2;
          }
          for (var4Lifetime2 = 0; this.field_x > var4Lifetime2; var4Lifetime2++) {
            this.field_m[var4Lifetime2] = var7.a((byte) 25);
          }
          for (var4Lifetime3 = 0; this.field_x > var4Lifetime3; var4Lifetime3++) {
            array$0 = new int[var7.c(32)];
            this.field_w[var4Lifetime3] = array$0;
          }
          for (var4Lifetime4 = 0; var4Lifetime4 < this.field_x; var4Lifetime4++) {
            for (var5 = 0; var5 < this.field_w[var4Lifetime4].length; var5++) {
              this.field_w[var4Lifetime4][var5] = var7.c(32);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ij.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_o = "Unpacking models";
        field_p = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_s = new e(10, 2, 2, 0);
        field_q = new qi(1);
        field_u = 20000000L;
    }
}
