/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static int[] field_b;
    static int field_a;
    static char[] field_c;

    final static String a(int param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param0 >= 60) {
          return p.a(param0 % 60, param1, 45, param0 / 60);
        }
        String var7 = lq.field_S;
        char[] var9 = var7.toCharArray();
        char[] var8 = var9;
        char[] var4 = var8;
        if (param2 == 10) {
          var5 = var7.indexOf("mm");
          incrementValue$0 = var5;
          var5++;
          var4[incrementValue$0] = (char)(param0 >= 0 ? 48 + param0 / 10 : 45);
          incrementValue$1 = var5;
          var5++;
          var4[incrementValue$1] = (char)(param0 < 0 ? 45 : param0 % 10 + 48);
          var5Lifetime3 = var7.indexOf("ss");
          incrementValue$2 = var5Lifetime3;
          var5Lifetime3++;
          var4[incrementValue$2] = (char)(0 <= param1 ? param1 / 10 + 48 : 45);
          incrementValue$3 = var5Lifetime3;
          var5Lifetime3++;
          var4[incrementValue$3] = (char)(param1 < 0 ? 45 : param1 % 10 + 48);
          return new String(var9);
        }
        vh var6 = (vh) null;
        ek.a((vh) null, (byte) 119, -128);
        var5Lifetime1 = var7.indexOf("mm");
        int incrementValue$4 = var5Lifetime1;
        var5Lifetime1++;
        var4[incrementValue$4] = (char)(param0 >= 0 ? 48 + param0 / 10 : 45);
        int incrementValue$5 = var5Lifetime1;
        var5Lifetime1++;
        var4[incrementValue$5] = (char)(param0 < 0 ? 45 : param0 % 10 + 48);
        var5Lifetime2 = var7.indexOf("ss");
        int incrementValue$6 = var5Lifetime2;
        var5Lifetime2++;
        var4[incrementValue$6] = (char)(0 <= param1 ? param1 / 10 + 48 : 45);
        int incrementValue$7 = var5Lifetime2;
        var5Lifetime2++;
        var4[incrementValue$7] = (char)(param1 < 0 ? 45 : param1 % 10 + 48);
        return new String(var9);
    }

    final static int[] a(int param0) {
        int var1 = 53 % ((param0 - 72) / 37);
        return new int[8];
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 >= -39) {
          field_a = 27;
        }
    }

    final static void a(vh param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        aa var3 = null;
        vh var4 = null;
        vh stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -38) {
            return;
          }
          stackIn_5_0 = (vh) (param0);
          stackIn_6_1 = (param2 != -1) && ((long)param2 == param0.field_c);
          stackIn_5_0.field_Ib = stackIn_6_1;
          if (null != param0.field_T &&
            !param0.field_T.c(0)) {
            var3 = new aa(param0.field_T);
            var4 = (vh) (var3.b((byte) -92));
            while (var4 != null) {
              ek.a(var4, (byte) -69, param2);
              var4 = (vh) (var3.b(-111));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("ek.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(byte param0, boolean param1, int param2, int param3) {
        if (param0 != -88) {
          field_b = (int[]) null;
          return ph.a((byte) -115);
        }
        return ph.a((byte) -115);
    }

    static {
        field_b = new int[12];
        field_a = 14;
        field_c = new char[128];
    }
}
