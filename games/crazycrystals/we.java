/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends jb {
    int field_k;
    int field_f;
    static int field_h;
    static String field_l;
    int field_i;
    int field_g;
    int field_m;
    int field_j;

    public static void a(int param0) {
        if (param0 != -22523) {
          field_h = 88;
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static dl[] a(String param0, String param1, db param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        db var6 = null;
        dl[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            var6 = (db) null;
            we.a((String) null, (String) null, (db) null, true);
          }
          var4_int = param2.a(param1, -1);
          var5 = param2.a(-2862, param0, var4_int);
          stackIn_6_0 = jo.a(!param3, var4_int, param2, var5);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("we.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            field_h = 17;
          }
          stackIn_3_0 = ge.field_b.a(7693, param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("we.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static db a(boolean param0, byte param1, boolean param2, boolean param3, int param4) {
        if (param1 > -38) {
          return (db) null;
        }
        return qk.a(param4, 112, param0, param3, false, !param2 ? 0 : 1);
    }

    we(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_k = param5;
        this.field_i = param3;
        this.field_m = param2;
        this.field_j = param0;
        this.field_f = param4;
        this.field_g = param1;
    }

    static {
        field_l = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
