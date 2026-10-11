/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static String field_a;
    static String field_b;

    final static void a(rm param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -19729) {
            return;
          }
          if (param2 + param0.field_f < param0.field_M.length) {
            return;
          }
          var3_int = (param0.field_f + param2) * 3 / 2;
          var10 = new int[var3_int];
          var7 = var10;
          var4 = var7;
          var11 = new int[var3_int];
          var8 = var11;
          var5 = var8;
          var12 = new int[var3_int];
          var9 = var12;
          var6 = var9;
          dk.a(param0.field_M, 0, var10, 0, param0.field_f);
          dk.a(param0.field_B, 0, var11, 0, param0.field_f);
          dk.a(param0.field_E, 0, var12, 0, param0.field_f);
          param0.field_E = var6;
          param0.field_B = var5;
          param0.field_M = var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("cd.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -11) {
          field_a = (String) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(String param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hk.a(true, param0)) {
            return false;
          }
          if (fm.a((byte) -111, param0)) {
            return false;
          }
          if (va.b(param0, 25326)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          var3_int = 89 / ((param1 - 59) / 33);
          if (tm.a(true, param0, param2)) {
            return false;
          }
          if (rh.a(true, param2, param0)) {
            return false;
          }
          if (!vk.a(param2, 4096, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("cd.D(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param0 > -100) {
          cd.a((byte) 111);
          return be.field_l[param1 & 2047];
        }
        return be.field_l[param1 & 2047];
    }

    static {
        field_a = "Play free version";
        field_b = "Fullscreen";
    }
}
