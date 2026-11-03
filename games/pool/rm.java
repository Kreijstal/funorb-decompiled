/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static boolean field_d;
    static String muChatPmFriends;
    static NineSliceFrame field_e;
    static String yes;
    static int field_b;
    static Sprite[] field_g;
    static long field_c;

    final static double[][] a(double[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        double[][] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -107 % ((param1 - 67) / 56);
          stackIn_1_0 = new double[][]{param0, new double[]{param0[0], -param0[1] + 288.0, param0[2], param0[3], 288.0 - param0[4], param0[5]}, new double[]{-param0[0] + 576.0, 288.0 - param0[1], param0[2], 576.0 - param0[3], -param0[4] + 288.0, param0[5]}, new double[]{-param0[0] + 576.0, param0[1], param0[2], -param0[3] + 576.0, param0[4], param0[5]}};
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("rm.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        muChatPmFriends = null;
        field_g = null;
        yes = null;
        field_e = null;
        if (param0 > -12) {
          rm.releaseStatics((byte) -85);
        }
    }

    static {
        muChatPmFriends = "Show private chat from my friends and opponents";
        yes = "Yes";
        field_c = 0L;
    }
}
