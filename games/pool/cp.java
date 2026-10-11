/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static int[] field_d;
    static di field_a;
    static ao field_c;
    static String field_b;

    final static boolean a(byte param0) {
        if (param0 <= 72) {
          field_b = (String) null;
          if (!fq.m(0)) {
            return false;
          }
          if ((eo.field_Tb & 8) == 0) {
            return true;
          }
          return false;
        }
        if (!fq.m(0)) {
          return false;
        }
        if ((eo.field_Tb & 8) == 0) {
          return true;
        }
        return false;
    }

    final static void a(boolean param0) {
        db.field_Pb = rl.a((byte) -121);
        up.field_j = 0;
        if (param0) {
          field_a = (di) null;
        }
    }

    final static long a(byte[] param0, byte param1, int param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        long stackIn_3_0 = 0L;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -83) {
            var4 = (byte[]) null;
            cp.a((byte[]) null, (byte) 105, 91);
          }
          stackIn_3_0 = ii.a(param0, param2, 0, 154302664);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cp.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
        if (!param0) {
          field_c = (ao) null;
        }
    }

    static {
        field_b = "members-only content";
    }
}
