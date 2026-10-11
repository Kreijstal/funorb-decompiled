/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa implements ca {
    private int field_f;
    static String[] field_g;
    private se field_b;
    static String field_i;
    private int field_a;
    static String[] field_d;
    static int[] field_e;
    static String field_h;
    static String[] field_c;

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = DungeonAssault.field_K;
        try {
          if (!param1.field_u &&
            !param1.a((byte) 127)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          if (param0 != 34) {
            oa.a((byte) -52);
          }
          this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_w + "</u>", param1.field_q + param2, param1.field_v + param3, param1.field_x, param1.field_s, var6_int, -1, this.field_a, this.field_f, this.field_b.field_H + this.field_b.field_E);
          if (param1.a((byte) 20)) {
            var7 = this.field_b.b(param1.field_w);
            var8 = this.field_b.field_E + this.field_b.field_H;
            var9 = param2 + param1.field_q;
            var10 = param1.field_v + param3;
            if (this.field_a != 2) {
              if (1 == this.field_a) {
                var9 = var9 + (param1.field_x - var7 >> 1);
              }
            } else {
              var9 = var9 + (-var7 + param1.field_x);
            }
            if (2 != this.field_f) {
              if (1 == this.field_f) {
                var10 = var10 + (-var8 + param1.field_s >> 1);
              }
            } else {
              var10 = var10 + (-var8 + param1.field_s);
            }
            in.a(-2 + var9, var8, var7 + 4, 2 + var10, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("oa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_i = null;
        field_e = null;
        field_h = null;
        int var1 = 65 / ((param0 - 1) / 60);
        field_d = null;
        field_c = null;
    }

    public oa() {
        this.field_b = lp.field_C;
        this.field_a = 1;
        this.field_f = 1;
    }

    oa(se param0, int param1, int param2) {
        try {
          this.field_b = param0;
          this.field_f = param2;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new String[]{"Gift of the Trees", "The <%0> channels the power of the great forests that were once her home to double the <%sneak> of a raider in the next room. (Single use)"};
        field_e = new int[]{5, 4};
        field_i = "Ranger of the North";
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_h = "Confirm changes?";
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
