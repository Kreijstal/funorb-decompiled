/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCommandDefinition {
    int commandId;
    int definitionArgumentCount;
    static int field_e;
    static int thirdPreviousOpcode;
    static String field_a;
    static String field_d;

    final static void a(int param0) {
        gl.a(126, 4);
        if (param0 != 26566) {
          QuickChatCommandDefinition.a(-97, (String) null, (int[]) null, 72L, -125);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    QuickChatCommandDefinition(int commandId, int unusedParameter1, int unusedParameter2, int definitionArgumentCount) {
        this.definitionArgumentCount = definitionArgumentCount;
        this.commandId = commandId;
    }

    public static void a(byte param0) {
        if (param0 == -36) {
          field_a = null;
          field_d = null;
          return;
        }
        QuickChatCommandDefinition.a(97, (String) null, (int[]) null, -40L, 2);
        field_a = null;
        field_d = null;
    }

    final static boolean a(int param0, String param1, int[] param2, long param3, int param4) {
        QuickChatMenu var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!rb.a(param3, param1, -17231, param4, param2)) {
            return false;
          }
          if (param4 == 1) {
            param4 = 0;
          }
          rs.field_t = param4;
          qd.field_G = param1;
          var7 = (CharSequence) ((Object) param1);
          wm.field_b = k.a(var7, false);
          dj.field_e = param3;
          var6 = fg.a(-11, uj.field_n, param2, vs.field_g, hf.field_f);
          vs.a(256, var6);
          if (param0 > 77) {
            return true;
          }
          field_e = -67;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("me.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_e = -1;
        field_a = "You have: <%0>";
        thirdPreviousOpcode = -1;
        field_d = "Reload game";
    }
}
