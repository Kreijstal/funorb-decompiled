/*
 * Decompiled by CFR-JS 0.4.0.
 */
class il extends aa {
    private long field_a;
    static va field_c;
    static String field_d;
    static int[] field_e;
    private String field_b;

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6054) {
            il.c(10);
          }
          stackIn_3_0 = v.a(param1 - 6138, param0, 10, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("il.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    wb a(int param0) {
        if (param0 <= 30) {
          gb var3 = (gb) null;
          this.a(-115, (gb) null);
          return qb.field_L;
        }
        return qb.field_L;
    }

    final static boolean b(int param0) {
        if (param0 != 507) {
          il.b(-102);
          return lh.field_l;
        }
        return lh.field_l;
    }

    final void a(int param0, gb param1) {
        try {
          param1.a(this.field_a, (byte) 89);
          param1.a(111, this.field_b);
          if (param0 != -12518) {
            gb var4 = (gb) null;
            this.a(-37, (gb) null);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "il.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 2113536) {
          return;
        }
        field_c = null;
        field_d = null;
        field_e = null;
    }

    il(long param0, String param1) {
        try {
          this.field_a = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "il.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[]{64, 8256, 16416, 2113536, 4202496, 4194368, 4194304, 4210752};
        field_d = "Connection timed out. Please try using a different server.";
    }
}
