/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gj extends ah {
    static int field_v;
    int field_u;
    static gd field_r;
    static int[] field_w;
    static String field_s;
    static int field_t;

    public static void d(byte param0) {
        int var1 = 82 / ((param0 - 55) / 58);
        field_r = null;
        field_w = null;
        field_s = null;
    }

    final static ml a(boolean param0, String[] param1) {
        ml var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        ml stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var3 = (String[]) null;
            gj.a(false, (String[]) null);
          }
          var2 = new ml(false);
          var2.field_d = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("gj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(qe param0, int param1, boolean param2, qe param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          var4_int = param3.c((byte) 48);
          if (param1 != 0) {
            gj.d((byte) -22);
          }
          var5 = param0.c((byte) 39);
          if (param0.field_a + (double)var5 > param3.field_a - (double)var4_int &&
            param3.field_a + (double)var4_int > param0.field_a - (double)var5 &&
            param3.field_l - (double)var4_int < (double)var5 + param0.field_l &&
            param0.field_l - (double)var5 < param3.field_l + (double)var4_int) {
            if (param2) {
              return true;
            }
            if (dk.a(param3.b(640), (int)param3.field_a, (int)param3.field_l, param0.b(640), (int)param0.field_a, (int)param0.field_l)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("gj.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract boolean f(int param0);

    abstract Object e(int param0);

    gj(int param0) {
        this.field_u = param0;
    }

    static {
        field_v = 0;
        field_s = "Reload game";
    }
}
