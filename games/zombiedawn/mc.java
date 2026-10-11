/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends pm {
    static int field_k;
    static String field_i;
    static int field_h;
    static rh field_g;
    static int field_f;
    static String field_j;

    mc(tb param0) {
        super(param0);
    }

    final rh a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rh stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        rh stackIn_8_0 = null;
        rh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            stackIn_2_0 = (rh) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = (la.a(param0, (byte) -103) != null) ? 0 : 1;
          var3_int = stackIn_6_0;
          if (var3_int != 0) {
            stackIn_10_0 = (rh) (field_g);
            return stackIn_10_0;
          }
          stackIn_8_0 = uc.field_b;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mc.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_g = (rh) null;
          }
          stackIn_5_0 = (null != hg.a(120, param0));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("mc.M(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 <= -3) {
          field_g = null;
          field_i = null;
          field_j = null;
          return;
        }
        mc.e((byte) 2);
        field_g = null;
        field_i = null;
        field_j = null;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, 2) == uc.field_b) {
            stackIn_2_0 = ge.field_d;
            return stackIn_2_0;
          }
          if (param1 < -94) {
            stackIn_7_0 = sd.field_c;
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mc.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_k = 0;
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_h = 0;
        field_j = "UK Expansion Installed";
        field_g = new rh();
    }
}
