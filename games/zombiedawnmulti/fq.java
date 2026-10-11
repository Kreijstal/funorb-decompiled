/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends ae {
    static ja field_k;
    static String field_j;
    int field_l;
    static int field_n;
    static java.awt.Image field_i;
    private int field_m;

    final void a(int param0, qd param1) {
        try {
          if (param0 != 0) {
            k var4 = (k) null;
            fq.a((k) null, (byte) 15);
          }
          param1.a((byte) -74, this.field_l, this.field_m);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_i = null;
        field_j = null;
        if (param0) {
          field_k = null;
          return;
        }
        k var2 = (k) null;
        fq.a((k) null, (byte) -34);
        field_k = null;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
          pb.field_e.c("state " + this.field_l + " in " + (-param3 + this.field_f), 5, 20, 16777215, 0);
          return;
        }
    }

    final static boolean a(int param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -79 / ((-36 - param0) / 36);
          stackIn_3_0 = (param1.h(1, 14862) == 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fq.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 126) {
            field_j = (String) null;
          }
          stackIn_5_0 = ((param2[param0 >> 5] & 1 << (param0 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fq.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, ug param2, int param3, int param4) {
        try {
          ra.field_m.a(param2, 1000000, !param0 ? true : false, param4, param1, true);
          int var5_int = 95 / ((5 - param3) / 60);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fq.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(k param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -114) {
            field_k = (ja) null;
          }
          var2_int = param0.g(31365);
          stackIn_5_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("fq.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    fq(int param0, int param1, int param2) {
        super(param0);
        this.field_m = param2;
        this.field_l = param1;
    }

    static {
        field_j = "Create a free account to start using this feature";
    }
}
