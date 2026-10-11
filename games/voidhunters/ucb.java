/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ucb {
    int field_a;
    int field_b;

    ucb(int param0, int param1) {
        this.field_b = param1;
        this.field_a = param0;
    }

    final static phb[] a(String param0, int param1, String param2, asb param3) {
        phb[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        phb[] var6 = null;
        phb[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = wjb.a(param3, true, param2, param0);
          var4 = var6;
          var6[1].field_m = var6[1].field_q;
          var5 = -55 % ((13 - param1) / 38);
          var6[3].field_n = var6[3].field_p;
          var6[5].field_n = var6[5].field_p;
          var6[7].field_m = var6[7].field_q;
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ucb.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param2 != 11585) {
          return;
        }
        if (!param1) {
          kf.field_a = kf.field_a & ~param0;
          return;
        }
        kf.field_a = param0 | kf.field_a;
    }

    static {
    }
}
