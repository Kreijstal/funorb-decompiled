/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends ok {
    static String field_Jb;
    static wh field_Ib;
    static r field_Gb;
    static String[] field_Kb;
    static String field_Hb;
    static boolean field_Lb;

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != 0) {
            return false;
          }
          param0 = tg.a('_', param0, 3, "");
          var3 = sh.a((byte) -124, param2);
          stackIn_8_0 = (param0.indexOf(param2) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("gl.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_Jb = null;
        field_Ib = null;
        field_Gb = null;
        if (param0 != -105) {
          return;
        }
        field_Hb = null;
        field_Kb = null;
    }

    private gl() throws Throwable {
        super(0L, (ok) null);
        throw new Error();
    }

    static {
        field_Jb = "Continue";
        field_Lb = false;
        field_Hb = "Incapacitated";
        field_Kb = new String[]{"Glamour", "Monster <%attack> and <%defence> halved in the next room. (Single use)"};
        field_Gb = new r();
    }
}
