/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int field_b;
    static boolean field_c;
    static String field_a;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != -22697) {
            return true;
          }
          var3 = mq.a(param2, false);
          if (param1.indexOf(param2) == -1 &&
            param1.indexOf(var3) == -1) {
            stackIn_15_0 = (param1.startsWith(param2)) || (param1.startsWith(var3)) || (param1.endsWith(param2)) || (param1.endsWith(var3));
            return stackIn_15_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("tj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(byte param0) {
        if (param0 <= 34) {
          return true;
        }
        if (ir.field_c == this) {
          return true;
        }
        if (Vertigo2.field_E == this) {
          return true;
        }
        if (this != bm.field_I) {
          return false;
        }
        return true;
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, od param2, bs param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bs var12 = null;
        b var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oq.a(param2, -1, 4462, -1, param3.field_Wb, (int[]) null, param3, param3.field_Pb, param3.field_bc);
          un.field_Lb.a(0, true);
          un.field_Lb.a((int[]) null, 0, (byte) -79);
          un.field_Lb.c(-24634);
          var13 = un.field_Lb;
          var8 = param0;
          var9 = param6;
          var10 = param5;
          var11 = param1;
          var13.field_n.c(var11, var9, -1220, var8, var10);
          if (!param4) {
            return;
          }
          var12 = (bs) null;
          tj.a(57, -125, (od) null, (bs) null, true, 20, -118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        try {
          if (param4 > -42) {
            field_b = -104;
          }
          oj.field_O[param5] = param0;
          oj.field_M[param5] = param3;
          oj.field_I[param5] = param1;
          oj.field_F[param5] = param6;
          oj.field_H[param5] = param2;
          oj.field_Q[param5] = false;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "tj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
