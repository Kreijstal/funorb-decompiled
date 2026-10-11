/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends q {
    int field_r;
    int field_m;
    static String field_s;
    int field_o;
    static String field_t;
    long field_l;
    int field_p;
    int field_j;
    int[] field_k;
    int field_n;
    int field_q;

    final static void a(int param0, hi param1) {
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
        var5 = Torquing.field_u;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            oc.field_b[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < kb.field_b; var2_intLifetime1++) {
            if (hi.field_j[var2_intLifetime1].field_f == param1.field_f) {
              dupTemp$3 = hi.field_j[var2_intLifetime1].a((byte) -72);
              oc.field_b[dupTemp$3] = oc.field_b[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.a((byte) -72);
          oc.field_b[dupTemp$0] = oc.field_b[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; kb.field_b > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (~param1.field_f == ~hi.field_j[var3].field_f) {
              var4 = hi.field_j[var3].a((byte) -72);
              if (kl.field_r < oc.field_b[var4]) {
                oc.field_b[var4] = oc.field_b[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              hi.field_j[incrementValue$2] = hi.field_j[var3];
            }
          }
          if (param0 != 10842) {
            field_s = (String) null;
          }
          kb.field_b = var2_intLifetime2;
          fieldTemp$1 = kb.field_b;
          kb.field_b = kb.field_b + 1;
          hi.field_j[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("wc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var5 = Torquing.field_u;
        try {
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = -var3 + ((var3 << 5) + ka.a(false, param1.charAt(var4)));
          }
          var4Lifetime1 = -59 % ((-3 - param0) / 47);
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("wc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_s = null;
        if (param0 != 0) {
          wc.a(47);
        }
        field_t = null;
    }

    final static boolean a(boolean param0, int param1) {
        if ((fa.field_b & 1 << param1) != 0) {
          return true;
        }
        if (m.field_w[param1] == -1) {
          return true;
        }
        if (param0) {
          wc.a(false, -49);
        }
        if (!ia.a(-22426, m.field_w[param1])) {
          return false;
        }
        return true;
    }

    final static void a(qp param0, byte param1, int param2) {
        try {
          tl.field_p.a((byte) 54, param0);
          if (param1 != 99) {
            field_s = (String) null;
          }
          l.a(param2, param0, 1);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "wc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    wc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_m = param1;
          this.field_k = param6;
          this.field_r = param3;
          this.field_p = param2;
          this.field_j = param5;
          this.field_o = param4;
          fieldTemp$0 = cq.field_u;
          cq.field_u = cq.field_u + 1;
          this.field_q = 65535 & fieldTemp$0;
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "wc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Names can only contain letters, numbers, spaces and underscores";
        field_t = "From only <%0>/month";
    }
}
