/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_a;
    static String[] field_f;
    static String field_c;
    static String field_e;
    static String field_d;
    static int field_b;

    final static SaveDataRequest queueSaveDataRequest(int param0, byte[] param1, int param2) {
        SaveDataRequest var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        SaveDataRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new SaveDataRequest(param1);
          wk.field_g.addLast(22125, var3);
          dq.sendSaveDataRequest(param2, -18989, var3);
          var4 = 55 / ((param0 - 68) / 46);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("hm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final static el validateEmailAddress(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        el var5 = null;
        el stackIn_4_0 = null;
        el stackIn_7_0 = null;
        el stackIn_10_0 = null;
        el stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            0 != param1.length()) {
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = ScrollPaneWithFooter.field_Kb;
              return stackIn_7_0;
            }
            var3 = param1.substring(param0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var5 = wf.validateEmailLocalPart(false, var3);
            if (var5 == null) {
              stackIn_12_0 = jf.validateEmailDomain(var4, param0 ^ -4384);
              return stackIn_12_0;
            }
            stackIn_10_0 = var5;
            return stackIn_10_0;
          }
          stackIn_4_0 = ge.field_i;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("hm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 9) {
          return;
        }
        field_a = null;
        field_c = null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static void resetNoticeState(byte param0) {
        oo.field_f = -1;
        qg.field_b = null;
        LoadingStepTracker.field_h = false;
        CachedTextLayout.field_h = 0;
        MarkerSlider.field_V = -1;
        int var1 = -61 / ((17 - param0) / 55);
    }

    final synchronized static long monotonicMillis(int param0) {
        if (param0 != 64) {
          return 86L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 >= wa.field_h) {
          wa.field_h = var1;
          return var1 + qj.field_d;
        }
        qj.field_d = qj.field_d + (wa.field_h - var1);
        wa.field_h = var1;
        return var1 + qj.field_d;
    }

    static {
        field_f = new String[]{"The aim of the game is construct the picture on the left.", "Use the <col=ffff00>arrow keys</col> to move.<br>Hit '<col=ffff00>CTRL</col>' to rotate.", "Press '<col=ffff00>ENTER</col>' to skip the tutorial."};
        field_e = "Creating your account";
        field_c = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_d = "Create";
    }
}
