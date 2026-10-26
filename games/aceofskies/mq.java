/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends IntrusiveNode {
    static eg field_h;
    bo field_j;
    GraphicsRenderer field_f;
    static Object field_e;
    static st field_g;
    static String field_i;

    final static sn[] a(byte param0, int[] param1) {
        int stackIn_7_0 = 0;
        String stackIn_19_2 = null;
        int var4Lifetime1;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          boolean stackIn_4_0 = !(param1[-1 + param1.length] != 0);
          boolean var2_int = stackIn_4_0;
          if (!var2_int) {
            stackIn_7_0 = 1 + param1.length;
          } else {
            stackIn_7_0 = param1.length;
          }
          sn[] var3 = new sn[stackIn_7_0];
          int var4 = 0;
          if (param0 != 122) {
            mq.a((byte) -13, 105, -5, 91, 36);
          }
          for (var4Lifetime1 = 0; param1.length > var4Lifetime1; var4Lifetime1++) {
            var3[var4Lifetime1] = new sn(param1[var4Lifetime1], 2);
          }
          if (var4Lifetime1 < var3.length) {
            var3[var4Lifetime1] = new sn(0, 2);
          }
          sn[] stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var2;
          StringBuilder stackIn_18_1 = new StringBuilder().append("mq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 == 20370) {
          field_i = null;
          field_e = null;
          field_h = null;
          return;
        }
        field_e = (Object) null;
        field_i = null;
        field_e = null;
        field_h = null;
    }

    final static int a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        int var5 = param3 & 15;
        int stackIn_3_0 = (8 <= var5) ? param4 : param1;
        int var6 = stackIn_3_0;
        int var8 = -45 / ((-12 - param0) / 50);
        if (var5 < 4) {
          int var7 = param4;
          stackIn_7_0 = (0 != (var5 & 2)) ? (-var7) : (var7);
          stackIn_10_1 = ((1 & var5) != 0) ? (-var6) : (var6);
          return stackIn_7_0 + stackIn_10_1;
        }
        if (var5 == 12) {
          int stackIn_14_0 = param1;
          int var7Lifetime1 = stackIn_14_0;
          stackIn_17_0 = (0 != (var5 & 2)) ? (-var7Lifetime1) : (var7Lifetime1);
          stackIn_20_1 = ((1 & var5) != 0) ? (-var6) : (var6);
          return stackIn_17_0 + stackIn_20_1;
        }
        if (var5 == 14) {
          int var7Lifetime2 = param1;
          stackIn_34_0 = (0 != (var5 & 2)) ? (-var7Lifetime2) : (var7Lifetime2);
          stackIn_37_1 = ((1 & var5) != 0) ? (-var6) : (var6);
          return stackIn_34_0 + stackIn_37_1;
        }
        int stackIn_24_0 = param2;
        int var7Lifetime3 = stackIn_24_0;
        stackIn_27_0 = (0 != (var5 & 2)) ? (-var7Lifetime3) : (var7Lifetime3);
        stackIn_30_1 = ((1 & var5) != 0) ? (-var6) : (var6);
        return stackIn_27_0 + stackIn_30_1;
    }

    mq(GraphicsRenderer param0, bo param1) {
        try {
          this.field_f = param0;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "mq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new eg();
        field_i = "Continue";
        field_g = new st();
    }
}
