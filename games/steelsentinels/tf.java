/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static StringBuilder field_g;
    static gh field_a;
    static boolean field_b;
    static String field_f;
    static int field_c;
    static wk field_e;
    static String[] field_d;

    final static void a(na param0, byte param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = SteelSentinels.field_G;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            uf.field_a[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < uc.field_a; var2_intLifetime1++) {
            if (param0.field_k == ph.field_e[var2_intLifetime1].field_k) {
              dupTemp$3 = ph.field_e[var2_intLifetime1].a((byte) 58);
              uf.field_a[dupTemp$3] = uf.field_a[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a((byte) 58);
          uf.field_a[dupTemp$0] = uf.field_a[dupTemp$0] + 1;
          if (param1 >= -103) {
            return;
          }
          var2_intLifetime2 = 0;
          for (var3 = 0; uc.field_a > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (ph.field_e[var3].field_k == param0.field_k) {
              var4 = ph.field_e[var3].a((byte) 58);
              if (cj.field_h < uf.field_a[var4]) {
                uf.field_a[var4] = uf.field_a[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              ph.field_e[incrementValue$2] = ph.field_e[var3];
            }
          }
          uc.field_a = var2_intLifetime2;
          fieldTemp$1 = uc.field_a;
          uc.field_a = uc.field_a + 1;
          ph.field_e[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("tf.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (null != qf.field_e) {
          pb.f(pb.field_i, pb.field_l, -pb.field_i + pb.field_b, pb.field_d - pb.field_l);
          qf.field_e.a(param1, (byte) 127);
        }
        if (param0 != 0) {
          field_a = (gh) null;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != 26) {
          return;
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final static boolean a(int param0, char param1) {
        if (param1 >= 32 &&
          param1 <= 126) {
          return true;
        }
        if (param0 != 2459) {
          return false;
        }
        if (param1 >= 160 &&
          param1 <= 255) {
          return true;
        }
        if (param1 != 8364 &&
          338 != param1 &&
          8212 != param1 &&
          param1 != 339 &&
          param1 != 376) {
          return false;
        }
        return true;
    }

    static {
        field_g = new StringBuilder(80);
        field_f = "Loading music";
        field_d = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
