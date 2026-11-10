/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginStartHelpers {
    static String field_c;
    static String field_e;
    static boolean field_f;
    static String field_d;
    static UiComponent field_a;
    static int field_b;

    final static AccountServerResult createResultWithArgs(String[] args, int param1) {
        AccountServerResult var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        AccountServerResult stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new AccountServerResult(false);
          if (param1 >= -104) {
            var3 = (String) null;
            LoginStartHelpers.beginLoginWithCredentials(-95, false, (String) null, (String) null);
          }
          var2.field_b = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("kn.D(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static UnitStateEvent readUnitStateEvent(byte param0, CipherPacketBuffer param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        UnitStateEvent stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.readUnsignedShort((byte) 69);
          var3 = param1.readUnsignedShort((byte) 69);
          var4 = param1.readUnsignedByte(31365);
          var5 = param1.readInt(-1478490344);
          var6 = param1.readInt(-1478490344);
          var7 = param1.readInt(-1478490344);
          var8 = param1.readInt(-1478490344);
          if (param0 <= 63) {
            var10 = (String) null;
            LoginStartHelpers.beginLoginWithCredentials(-24, false, (String) null, (String) null);
          }
          var9 = param1.readInt(-1478490344);
          stackIn_3_0 = ArchiveProvider.createUnitStateEvent(var5, 47, var4, var3, var7, var2_int, var8, var9, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("kn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void beginLoginWithCredentials(int param0, boolean param1, String param2, String param3) {
        try {
          ReportAbuseDialog.field_Ib = param3;
          StatusAndMeshHelpers.field_a = param2;
          PowerupCommand.openMessageDialog(StatefulTextPainter.field_v, param1, param0 + 1549);
          if (param0 != -1431) {
            field_d = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kn.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        if (!param0) {
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        LoginStartHelpers.beginLoginWithCredentials(104, true, (String) null, (String) null);
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        field_e = "Sage";
        field_c = "Private";
        field_d = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
