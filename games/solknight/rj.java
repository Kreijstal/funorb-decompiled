/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rj {
    static int field_c;
    static int field_b;
    static String field_a;

    public static void b(int param0) {
        if (param0 != 0) {
          rj.b(110);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final int a(int param0, long param1) {
        long var4 = this.a(117);
        if (var4 <= (long)param0) {
          return this.a(param1, true);
        }
        i.a((byte) 20, var4);
        return this.a(param1, true);
    }

    abstract void c(int param0);

    final static aa a(String param0, byte param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        aa stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param1 < 67) {
            rj.b(-118);
          }
          if (param0.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param0);
            var4_long = ti.a(var7, (byte) 44);
          } else {
            var6 = param0;
          }
          stackIn_6_0 = pb.a(param3, param2, var4_long, 0, (String) (var6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rj.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        ha.field_g = param4;
        ph.field_k = param1;
        uc.field_i = param3;
        if (param2 <= 76) {
          return;
        }
        we.field_c = param0;
    }

    abstract int a(long param0, boolean param1);

    abstract long a(int param0);

    static {
        field_a = "Confirm Email:";
    }
}
