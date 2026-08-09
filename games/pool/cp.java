/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static int[] field_d;
    static di field_a;
    static ao field_c;
    static String field_b;

    final static boolean a(byte param0) {
        if (param0 > 72) {
          if (fq.m(0)) {
            if ((eo.field_Tb & 8) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = (String) null;
          if (fq.m(0)) {
            if ((eo.field_Tb & 8) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -83) {
                break L1;
              } else {
                var4 = (byte[]) null;
                cp.a((byte[]) null, (byte) 105, 91);
                break L1;
              }
            }
            stackIn_3_0 = ii.a(param0, param2, 0, 154302664);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cp.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
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
