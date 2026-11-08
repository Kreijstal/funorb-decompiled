/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_b;
    static gd field_c;
    static kc field_a;
    static Sprite field_e;
    static pb field_d;

    final static void a(byte param0) {
        MusicCrossfadeStream.field_n = oo.d(-9685);
        ClientException.field_b = new h();
        if (param0 > 49) {
          sc.a(true, false, true);
          return;
        }
        field_b = (String) null;
        sc.a(true, false, true);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static LoginCredentials createCredentials(boolean param0, String param1, int param2, long param3, String param4) {
        RuntimeException var6 = null;
        AlternateUsernameCredentials stackIn_6_0 = null;
        EmailLoginCredentials stackIn_8_0 = null;
        UsernameCredentials stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 0L &&
            param1 != null) {
            stackIn_8_0 = new EmailLoginCredentials(param1, param4);
            return (LoginCredentials) ((Object) stackIn_8_0);
          }
          if (param0) {
            stackIn_6_0 = new AlternateUsernameCredentials(param3, param4);
            return (LoginCredentials) ((Object) stackIn_6_0);
          }
          if (param2 >= -49) {
            field_e = (Sprite) null;
          }
          stackIn_12_0 = new UsernameCredentials(param3, param4);
          return (LoginCredentials) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ci.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_b = "Classic";
    }
}
