/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends uf {
    static bg[] field_l;
    int[] field_i;
    static int field_o;
    static int field_k;
    static String field_h;
    static int[] field_m;
    int field_j;
    static String field_n;

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeKeyListener(th.field_g);
          param0.removeFocusListener(th.field_g);
          dj.field_e = -1;
          if (param1 < 110) {
            String var3 = (String) null;
            me.a(54, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "me.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 70 % ((param0 - 34) / 55);
          var3 = (CharSequence) ((Object) param1);
          stackIn_1_0 = jj.field_e.equals(hm.a((byte) 6, var3));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("me.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_h = null;
        if (param0) {
          field_m = null;
          field_n = null;
          return;
        }
        field_k = -102;
        field_m = null;
        field_n = null;
    }

    private me() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Waiting for sound effects";
        field_n = "Save Game";
    }
}
