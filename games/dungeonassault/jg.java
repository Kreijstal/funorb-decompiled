/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static ef field_a;
    static String field_d;
    static cn[] field_c;
    static String field_b;
    static String field_e;

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 94) {
            field_d = (String) null;
          }
          stackIn_3_0 = ug.a(false, -44, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param1 = param1 & param0;
        if (param1 >= 4096) {
          return param1 >= 6144 ? jb.field_Tb[param1 - 6144] : -jb.field_Tb[-param1 + 6144];
        }
        return param1 < 2048 ? jb.field_Tb[2048 - param1] : -jb.field_Tb[param1 - 2048];
    }

    final static ba[] b(byte param0) {
        if (param0 == 24) {
          return new ba[]{ba.field_e, gg.field_c, rl.field_j};
        }
        field_a = (ef) null;
        return new ba[]{ba.field_e, gg.field_c, rl.field_j};
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          return false;
        }
        if (param1 > hj.field_S) {
          return false;
        }
        if (hj.field_S >= param3 + param1) {
          return false;
        }
        if (param4 > eh.field_h) {
          return false;
        }
        if (param2 + param4 > eh.field_h) {
          return true;
        }
        return false;
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 < -61) {
          field_e = null;
          field_a = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        jg.a(48, (CharSequence) null);
        field_e = null;
        field_a = null;
    }

    static {
        field_a = new ef();
        field_d = "Cancel";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_e = "Discard";
    }
}
