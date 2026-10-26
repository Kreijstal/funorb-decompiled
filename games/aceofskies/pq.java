/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends vo {
    pq(bm param0) {
        super(param0);
    }

    final pt a(String param0, int param1) {
        String stackIn_13_2 = null;
        try {
          int stackIn_3_0 = (null != ai.a(param0, (byte) 12)) ? 0 : 1;
          int var3_int = stackIn_3_0;
          if (var3_int == 0) {
            pt stackIn_5_0 = bt.field_a;
            return stackIn_5_0;
          }
          if (param1 != 8192) {
            String var4 = (String) null;
            this.a((String) null, (byte) 9);
          }
          pt stackIn_9_0 = fd.field_a;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("pq.DA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(String param0, byte param1) {
        String stackIn_11_2 = null;
        try {
          if (this.a(param0, param1 ^ 8264) == bt.field_a) {
            String stackIn_2_0 = fd.field_e;
            return stackIn_2_0;
          }
          if (param1 == 72) {
            String stackIn_7_0 = gh.field_o;
            return stackIn_7_0;
          }
          String stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("pq.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
