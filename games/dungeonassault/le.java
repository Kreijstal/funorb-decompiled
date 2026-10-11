/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static String field_a;
    static cn field_d;
    static cn field_f;
    static String[] field_c;
    static gn[][] field_b;
    static pp field_g;
    static String field_e;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          var3 = jm.a((byte) 59, var5);
          if (param2 >= -22) {
            return true;
          }
          var6 = (CharSequence) ((Object) param1);
          var4 = jm.a((byte) 59, var6);
          if (var3 == null &&
            var4 == null) {
            return true;
          }
          if (var3 == null) {
            return false;
          }
          if (var4 == null) {
            return false;
          }
          stackIn_14_0 = var3.equals(var4);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("le.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = (gn[][]) null;
        field_d = null;
        if (param0 < 97) {
          field_b = (gn[][]) null;
        }
    }

    static {
        field_a = "<%0> of your Renown will be lost if you fail to reach the hoard room in a raid.";
        field_e = "The heavy armour of the <%0> deflects the blow!";
        field_c = new String[]{null, "There are a number of different strategies a raider can employ against a monster, displayed in the bottom-right, below the room's statistics. For now, we'll use <%advance>.<br><br><%command>Click the shield icon - <%advance> - to begin combat.</col>"};
    }
}
